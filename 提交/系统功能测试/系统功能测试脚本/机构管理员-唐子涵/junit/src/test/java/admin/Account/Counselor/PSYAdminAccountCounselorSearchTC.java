package admin.Account.Counselor;

import admin.BaseTest;
import admin.Pages.CounselorManagePage;
import admin.Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountCounselorSearchTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    CounselorManagePage counselorManagePage = new CounselorManagePage();

    @Test
    public void pSYAdminAccountConsultantSearchTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.searchCounselor("咨询");
        Thread.sleep(1000);
        counselorManagePage.assertTable("咨询")
                //.assertTotal("16")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantSearchTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.searchCounselor("咨询1号");
        Thread.sleep(1000);
        counselorManagePage.assertFirst("咨询1号")
                //.assertTable("咨询师张哥")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantSearchTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.searchCounselor("");
        Thread.sleep(1000);
        counselorManagePage.assertTotal("20")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantSearchTrueTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.searchCounselor("咨询 1");
        Thread.sleep(1000);
        counselorManagePage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantSearchFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.searchCounselor("12345");
        Thread.sleep(1000);
        counselorManagePage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantSearchFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.searchCounselor(" 咨询");
        Thread.sleep(1000);
        counselorManagePage.assertNull("暂无数据")
                .closePage();
    }

}
