package admin.Account.Counselor;

import admin.BaseTest;
import admin.Pages.CounselorManagePage;
import admin.Pages.LoginPage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountCounselorNewTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    CounselorManagePage counselorManagePage = new CounselorManagePage();

    @Test
    public void pSYAdminAccountConsultantNewFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertNameErr("请输入姓名")
                .assertPhoneErr("请输入联系电话")
                .assertIDErr("请输入身份证号")
                .assertMailErr("请输入邮箱")
                .assertSupErr("请选择要绑定的督导")
                .assertDepErr("请输入所在部门")
                .assertCounTitleErr("请输入职称")
                .assertUserNameErr("请输入用户名")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("")
                .enterPhone("12311112222")
                .enterID("");
        Thread.sleep(500);
        counselorManagePage.assertNameErr("请输入姓名")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("一")
                .enterPhone("12311112222")
                .enterID("");
        Thread.sleep(500);
        counselorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("一二三四五六七八九十一二三四五六")
                .enterPhone("1881771234")
                .enterID("");
        Thread.sleep(500);
        counselorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC05() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("张zhang")
                .enterPhone("13611818848")
                .enterID("212120199876532222")
                .enterMail("");
        Thread.sleep(500);
        counselorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertIDErr("请检查格式后正确输入")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC06() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("张#123")
                .enterPhone("13611818848")
                .enterID("2110032000071543")
                .enterMail("");
        Thread.sleep(500);
        counselorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertIDErr("请检查格式后正确输入")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC07() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("咨询师小鸽")
                .enterPhone("13611818848")
                .enterID("2110032000071543211")
                .enterMail("a23.-bc@sample.com")
                .enterDepartment("");
        Thread.sleep(500);
        counselorManagePage.assertIDErr("请检查格式后正确输入")
                .assertMailErr("请输入合法邮箱")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC08() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("咨询师小鸽")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("sei@123")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertSupErr("请选择要绑定的督导")
                .assertUserNameErr("用户名格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC09() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("密码长度五")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(2)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("abcdeabcdeabcdeabcde4321")
                .enterUserPassword("123ab")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage//.assertSupErr("请选择要绑定的督导")
                .assertPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC10() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("密码长度二十一")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("abcdeabcdeabcdeabcde4321")
                .enterUserPassword("123456789012345abcde_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertSupErr("请选择要绑定的督导")
                .assertNewPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC11() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("密码长度五")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(2)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("abcdeabcdeabcdeabcde4321")
                .enterUserPassword("123#abc")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertNewPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC12() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("重复用户名")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("dup_id_zxs")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC13() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("纯数字用户名")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("4321")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertMsgText("用户名已存在！");
                //.closePage();
        loginPage.goLoginPage()
                .enterAccount("4321")
                .enterPassword("123ab_")
                .assertNoEnter("不合法（字母开头+字母/数字，长度4-24)")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC14() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("长度三用户名")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("def")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertMsgText("用户名已存在！");
                //.closePage();
        loginPage.goLoginPage()
                .enterAccount("def")
                .enterPassword("123ab_")
                .assertNoEnter("不合法（字母开头+字母/数字，长度4-24)")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC15() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("长度二十五用户名")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("abcdeabcdeabcdeabcdeedcba")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertMsgText("用户名已存在！");
                //.closePage();
        loginPage.goLoginPage()
                .enterAccount("abcdeabcdeabcdeabcdeedcba")
                .enterPassword("123ab_")
                .assertNoEnter("不合法（字母开头+字母/数字，长度4-24)")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewFalseTC16() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("重复用户名")
                .enterPhone("13611818848")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("sei_zxs_15")
                .enterUserPassword("123456789012345abcd_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("咨一")
                .enterPhone("13611118888")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("efgh")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("AmyDuDao")
                .enterPhone("13611118888")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("abcdeabcdeabcdeabcde4321")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountConsultantNewTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        counselorManagePage.getCounselorManagePage();
        Thread.sleep(1000);
        counselorManagePage.clickNewCounselor();

        counselorManagePage.enterName("一二三四五六七八九十一二三四五")
                .enterPhone("13611118888")
                .enterID("310101199003071548")
                .enterMail("12345@sample.com")
                .addSup(1)
                .enterDepartment("ECNU")
                .enterCounTitle("高级咨询师")
                .enterUserName("sei_zxs_15")
                .enterUserPassword("123456789012345abcd_")
                .clickNewConfirm();
        Thread.sleep(500);
        counselorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

}
