package admin.Record;

import admin.BaseTest;
import admin.Pages.DialogRecordPage;
import admin.Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class PSYAdminDialogRecordTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DialogRecordPage DialogRecordPage = new DialogRecordPage();

    @Test
    public void pSYAdminDialogRecordCheckTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.assertTitle("求助记录列表")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordCheckDetailTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.clickDialogRecordDetail();
        Thread.sleep(1000);
        DialogRecordPage.assertTitle("求助&咨询记录详情")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordCheckDetailExportTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.clickDialogRecordDetail();
        Thread.sleep(1000);
        DialogRecordPage.clickRecordDetailExport()
                .clickRecordDetailConfirm()
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordCheckDetailExportTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.clickDialogRecordDetail();
        Thread.sleep(1000);
        DialogRecordPage.clickRecordDetailExport()
                .clickRecordDetailCancel()
                .assertTitle("求助记录详情")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordCheckDetailBackTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.clickDialogRecordDetail();
        Thread.sleep(1000);
        DialogRecordPage.clickRecordDetailExport()
                .clickRecordDetailCancel()
                .assertTitle("求助记录详情")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordConsultantNameDateMultxDaysTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("咨询 1");
        Thread.sleep(1000);
        DialogRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","23:30:00");
        Thread.sleep(1000);
        DialogRecordPage//.assertTotal("1")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordConsultantNameDateAllxHoursTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        DialogRecordPage.searchDate("2023-12-15","00:00:00","2023-12-15","23:30:00");
        Thread.sleep(1000);
        DialogRecordPage.assertTotal("1")
                .assertTable("咨询师张哥")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordDialogantNameDateNotExistxDaysTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("12345");
        Thread.sleep(1000);
        DialogRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","00:00:00");
        Thread.sleep(1000);
        //DialogRecordPage.assertTotal("1");
        DialogRecordPage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordDialogantNameDatePartlyxDaysTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("访");
        Thread.sleep(1000);
        DialogRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","00:00:00");
        Thread.sleep(1000);
        DialogRecordPage.assertTotal("1")
                .assertTable("访")
                //DialogRecordPage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordConsultantNameDateSpacexHoursTC05() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor(" 访 ");
        Thread.sleep(1000);
        DialogRecordPage.searchDate("2023-12-18","00:00:00","2023-12-18","23:30:00");
        Thread.sleep(1000);
        //DialogRecordPage.assertTotal("2")
        DialogRecordPage.assertNull("暂无数据")
                .closePage();
    }


    @Test
    public void pSYAdminDialogRecordConsultantNameFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("12345");
        Thread.sleep(1000);
        DialogRecordPage//.assertTotal("2")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordConsultantNameFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor(" 访 ");
        Thread.sleep(1000);
        DialogRecordPage//.assertTotal("2")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordConsultantNameTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("咨询");
        Thread.sleep(1000);
        DialogRecordPage.assertTotal("1")
                .assertTable("咨询")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordConsultantNameTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        DialogRecordPage.assertTotal("3")
                .assertTable("咨询1号")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordConsultantNameTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("");
        Thread.sleep(1000);
        DialogRecordPage.assertTotal("8")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordConsultantNameTrueTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchCounselor("咨询 1");
        Thread.sleep(1000);
        DialogRecordPage//.assertTotal("64")
                .assertNull("暂无数据")
                .closePage();
    }
    
    @Test
    public void pSYAdminDialogRecordDateDaysTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","00:00:00");
        Thread.sleep(1000);
        DialogRecordPage.assertTotal("1")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordDateHoursTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.searchDate("2023-12-18","00:00:00","2023-12-18","23:30:00");
        Thread.sleep(1000);
        DialogRecordPage.assertTotal("4")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordExportOneTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.clickExportOne();
        Thread.sleep(1000);
        DialogRecordPage.clickExportConfirm()
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordExportManyTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.clickExportMany();
        Thread.sleep(1000);
        DialogRecordPage.clickExportConfirm()
                //.assertNull("暂无数据")
                .assertExportErr()
                .closePage();
    }

    @Test
    public void pSYAdminDialogRecordExportAllTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        DialogRecordPage.getDialogRecordPage();
        Thread.sleep(1000);
        DialogRecordPage.clickExportAll();
        Thread.sleep(1000);
        DialogRecordPage.clickExportConfirm()
                //.assertNull("暂无数据")
                .assertExportErr()
                .closePage();
    }


}
