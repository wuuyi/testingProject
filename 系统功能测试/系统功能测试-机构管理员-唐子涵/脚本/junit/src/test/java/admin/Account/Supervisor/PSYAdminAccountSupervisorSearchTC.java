package admin.Account.Supervisor;

import admin.BaseTest;
import admin.Pages.LoginPage;
import admin.Pages.SupervisorManagePage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountSupervisorSearchTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    SupervisorManagePage supervisorManagePage = new SupervisorManagePage();

    @Test
    public void pSYAdminAccountSupervisorSearchTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.searchSupervisor("督导");
        Thread.sleep(1000);
        supervisorManagePage.assertTable("督导")
                //.assertTotal("15")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorSearchTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.searchSupervisor("督导1号");
        Thread.sleep(1000);
        supervisorManagePage.assertFirst("督导1号")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorSearchTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.searchSupervisor("");
        Thread.sleep(1000);
        supervisorManagePage.assertTotal("20")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorSearchTrueTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.searchSupervisor("督导 1");
        Thread.sleep(1000);
        supervisorManagePage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorSearchFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.searchSupervisor("12345");
        Thread.sleep(1000);
        supervisorManagePage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorSearchFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.searchSupervisor(" 督导 ");
        Thread.sleep(1000);
        supervisorManagePage.assertNull("暂无数据")
                .closePage();
    }
}
