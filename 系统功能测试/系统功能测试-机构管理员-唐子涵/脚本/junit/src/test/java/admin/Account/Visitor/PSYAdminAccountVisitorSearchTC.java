package admin.Account.Visitor;

import admin.BaseTest;
import admin.Pages.LoginPage;
import admin.Pages.VisitorManagePage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountVisitorSearchTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    VisitorManagePage visitorManagePage = new VisitorManagePage();

    @Test
    public void pSYAdminAccountVisitorSearchTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.searchVisitor("访");
        Thread.sleep(1000);
        visitorManagePage.assertTotal("2")
                .assertTable("访")
                //.assertVisitor()
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorSearchTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.searchVisitor("访客abc");
        Thread.sleep(1000);
        visitorManagePage.assertFirst("访客abc")
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorSearchTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.searchVisitor("");
        Thread.sleep(1000);
        visitorManagePage.assertTotal("8")
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorSearchTrueTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.searchVisitor("a c");
        Thread.sleep(1000);
        visitorManagePage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorSearchFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.searchVisitor("12345");
        Thread.sleep(1000);
        visitorManagePage.assertNull("暂无数据")
                .closePage();
    }

    @Test
    public void pSYAdminAccountVisitorSearchFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        visitorManagePage.getVisitorManagePage();
        Thread.sleep(1000);
        visitorManagePage.searchVisitor(" 访 ");
        Thread.sleep(1000);
        visitorManagePage.assertNull("暂无数据")
                .closePage();
    }
}
