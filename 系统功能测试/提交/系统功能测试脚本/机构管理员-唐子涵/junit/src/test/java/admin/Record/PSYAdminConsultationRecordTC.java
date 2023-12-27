package admin.Record;

import admin.BaseTest;
import admin.Pages.ConsultationRecordPage;
import admin.Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class PSYAdminConsultationRecordTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    ConsultationRecordPage consultationRecordPage = new ConsultationRecordPage();

    @Test
    public void pSYAdminConsultationRecordCheckTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.assertTitle("咨询记录列表")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordCheckDetailTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.clickConsultRecordDetail()
                .assertTitle("咨询记录详情")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordCheckDetailExportTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.clickConsultRecordDetail();
        Thread.sleep(1000);
        consultationRecordPage.clickRecordDetailExport()
                .clickRecordDetailConfirm()
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordCheckDetailExportTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.clickConsultRecordDetail();
        Thread.sleep(1000);
        consultationRecordPage.clickRecordDetailExport()
                .clickRecordDetailCancel()
                .assertTitle("咨询记录详情")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordCheckDetailBackTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.clickConsultRecordDetail();
        Thread.sleep(1000);
        consultationRecordPage.clickRecordDetailExport()
                .clickRecordDetailCancel()
                .assertTitle("咨询记录详情")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameDateMultxDaysTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询 1");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-15","00:00:00","2021-12-18","00:00:00");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("1")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameDateAllxHoursTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-18","00:00:00","2021-12-18","23:30:00");
        Thread.sleep(1000);
        consultationRecordPage.assertTotal("1")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameDateNotExistxDaysTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("12345");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2021-12-15","00:00:00","2021-12-18","00:00:00");
        Thread.sleep(1000);
        //consultationRecordPage.assertTotal("1");
        consultationRecordPage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameDatePartlyxDaysTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("1号");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-15","00:00:00","2021-12-18","00:00:00");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByCoun("1号")
                //.assertTotal("10")
        //consultationRecordPage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameDateSpacexHoursTC05() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor(" 访 ");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2021-12-18","00:00:00","2021-12-18","23:30:00");
        Thread.sleep(1000);
        //consultationRecordPage.assertTotal("2")
        consultationRecordPage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("12345");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("2")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor(" 王 ");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("2")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("2")
                //.assertNull("暂无数据")
                .assertTableByVisitor("访")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客1号");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByVisitor("访客1号")
                //.assertTotal("20")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("");
        Thread.sleep(1000);
        consultationRecordPage.assertTotal("64")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameTrueTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("a c");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("20")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("12345");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("2")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor(" 访 ");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("2")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByCoun("咨询")
                //.assertTotal("8")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByCoun("咨询1号")
                //.assertTotal("8")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("");
        Thread.sleep(1000);
        consultationRecordPage.assertTotal("64")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordConsultantNameTrueTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询 1");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("64")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameAllxAllC06() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客1号");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByCoun("咨询1号")
                .assertTableByVisitor("访客1号")
                //.assertTotal("8")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameAllxMultTC07() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客1号");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询 1");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("8")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameAllxNotExistTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客1号");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("12345");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("8")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameAllxPartlyTC05() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客1号");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByCoun("咨询")
                .assertTableByVisitor("访客1号")
                //.assertTotal("7")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameMultxAllTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客 1");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("7")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameMultxMultTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客 1");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询 1");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("7")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameMultxNotExistTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客 1");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("12345");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("7")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameMultxPartlyTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客 1");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("7")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameNotExistxPartlyTC05() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("12345");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("7")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNamePartlyxAllTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByVisitor("访")
                .assertTableByCoun("咨询1号")
                //.assertTotal("8")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNamePartlyxMultTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询 1");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("8")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNamePartlyxNotExistTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("12345");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("8")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNamePartlyxPartlyTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByVisitor("访")
                .assertTableByCoun("咨询")
                //.assertTotal("9")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameSpacexAllTC06() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor(" 访 ");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        consultationRecordPage.assertTotal("8")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameDateAllxHoursTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-18","00:00:00","2023-12-18","23:30:00");
        Thread.sleep(1000);
        consultationRecordPage.assertTableByVisitor("访")
                //.assertTotal("16")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameDateMultxDaysTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客 1");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","00:00:00");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("16")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameDateNotExistxDaysTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("12345");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","00:00:00");
        Thread.sleep(1000);
        consultationRecordPage//.assertTotal("16")
                .assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameDatePartlyxDaysTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访客 1");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","00:00:00");
        Thread.sleep(1000);
        consultationRecordPage.assertTotal("16")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameDateSpacexHoursTC05() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-18","00:00:00","2023-12-18","00:00:00");
        Thread.sleep(1000);
        consultationRecordPage.assertTotal("5")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameDateDaysTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","00:00:00");
        consultationRecordPage.assertTotal("5")
                .assertTableByVisitor("访")
                .assertTableByCoun("咨询")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordVisitorNameConsultantNameDateHoursTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchVisitor("访");
        Thread.sleep(1000);
        consultationRecordPage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-18","00:00:00","2023-12-18","23:30:00");
        consultationRecordPage.assertTotal("2")
                .assertTableByVisitor("访")
                .assertTableByCoun("咨询1号")
                //.assertNull("暂无数据")
                .closePage();
    }



    @Test
    public void pSYAdminConsultationRecordDateDaysTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-15","00:00:00","2023-12-18","00:00:00");
        Thread.sleep(1000);
        consultationRecordPage.assertTotal("22")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordDateHoursTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.searchDate("2023-12-18","00:00:00","2023-12-18","23:30:00");
        Thread.sleep(1000);
        consultationRecordPage.assertTotal("5")
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordExportOneTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.clickExportOne();
        Thread.sleep(1000);
        consultationRecordPage.clickExportConfirm()
                //.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordExportManyTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.clickExportMany();
        Thread.sleep(1000);
        consultationRecordPage.clickExportConfirm()
                //.assertNull("暂无数据")
                .assertExportErr()
                .closePage();
    }

    @Test
    public void pSYAdminConsultationRecordExportAllTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        consultationRecordPage.getConsultRecordPage();
        Thread.sleep(1000);
        consultationRecordPage.clickExportAll();
        Thread.sleep(1000);
        consultationRecordPage.clickExportConfirm()
                //.assertNull("暂无数据")
                .assertExportErr()
                .closePage();
    }


}
