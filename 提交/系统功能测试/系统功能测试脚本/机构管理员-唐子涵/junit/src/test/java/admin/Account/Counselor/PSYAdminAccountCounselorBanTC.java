package admin.Account.Counselor;

import admin.BaseTest;
import admin.Pages.CounselorManagePage;
import admin.Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountCounselorBanTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    CounselorManagePage counselorManagePage = new CounselorManagePage();

    @Test
    public void pSYAdminAccountConsultantBanTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickBanCounselor("禁用")
                .clickBanConfirm();
        Thread.sleep(1000);
        counselorManagePage.assertMsgText("禁用成功!")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantBanTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickBanCounselor("禁用")
                .clickBanCancel();
        Thread.sleep(1000);
        counselorManagePage.assertBanCounselor("禁用")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantUseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickBanCounselor("启用")
                .clickBanConfirm();
        Thread.sleep(1000);
        counselorManagePage.assertMsgText("启用成功!")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantUseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickBanCounselor("启用")
                .clickBanCancel();
        Thread.sleep(1000);
        counselorManagePage.assertBanCounselor("启用")
                .closePage();
    }
}
