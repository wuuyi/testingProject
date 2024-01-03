package admin.Account.Supervisor;

import admin.BaseTest;
import admin.Pages.LoginPage;
import admin.Pages.SupervisorManagePage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountSupervisorBanTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    SupervisorManagePage supervisorManagePage = new SupervisorManagePage();

    @Test
    public void pSYAdminAccountSupervisorBanTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickBanSupervisor("禁用")
                .clickBanConfirm();
        Thread.sleep(1000);
        supervisorManagePage.assertMsgText("禁用成功!")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorBanTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickBanSupervisor("禁用")
                .clickBanCancel();
        Thread.sleep(1000);
        supervisorManagePage.assertBanSupervisor("禁用")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorUseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickBanSupervisor("启用")
                .clickBanConfirm();
        Thread.sleep(1000);
        supervisorManagePage.assertMsgText("启用成功!")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorUseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickBanSupervisor("启用")
                .clickBanCancel();
        Thread.sleep(1000);
        supervisorManagePage.assertBanSupervisor("启用")
                .closePage();
    }
}
