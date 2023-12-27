package admin.Account.Supervisor;

import admin.BaseTest;
import admin.Pages.LoginPage;
import admin.Pages.SupervisorManagePage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountSupervisorNewTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    SupervisorManagePage supervisorManagePage = new SupervisorManagePage();

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请输入姓名")
                .assertPhoneErr("请输入联系电话")
                .assertMailErr("请输入邮箱")
                .assertSupTitleErr("请输入职称")
                .assertSupGradeErr("请选择督导资质")
                .assertDepErr("请输入工作单位")
                .assertUserNameErr("请输入用户名")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("")
                .enterPhone("12345678901")
                .enterID("620102200306065828")
                .enterMail("amy@163.com")
                .enterSupTitle("中级咨询师")
                .changeGrade(1)
                .enterSupNum("DD10003")
                .enterDepartment("ECNU")
                .enterUserName("null_1")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请输入姓名")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("一")
                .enterPhone("18120149879")
                .enterID("");
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("一二三四五六七八九十一二三四五六")
                .enterPhone("1812014987")
                .enterID("");
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC05() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("张zhang")
                .enterPhone("18120149879")
                .enterID("210293199872637261")
                .enterMail("");
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertIDErr("请检查格式后正确输入")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC06() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("张#123")
                .enterPhone("18120149879")
                .enterID("21100320010815432")
                .enterMail("");
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertIDErr("请检查格式后正确输入")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC07() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("张哥身份证邮箱")
                .enterPhone("18120149879")
                .enterID("620102203060658288")
                .enterMail("1337140734@com")
                .enterSupTitle("");
        Thread.sleep(500);
        supervisorManagePage.assertIDErr("请检查格式后正确输入")
                .assertMailErr("请输入合法邮箱")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC08() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("督导乐少")
                .enterPhone("13688481234")
                .enterID("110101199003077520")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("sei@123")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertUserNameErr("用户名格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC09() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("督导乐少")
                .enterPhone("13688481234")
                .enterID("110101199003077520")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("abcd")
                .enterUserPassword("abc12")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC10() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("督导乐少")
                .enterPhone("13688481234")
                .enterID("110101199003077520")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("abcdeabcdeabcdeabcde1234")
                .enterUserPassword("123456789012345abcde_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC11() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("督导乐少")
                .enterPhone("13688481234")
                .enterID("110101199003077520")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("abcdeabcdeabcdeabcde1234")
                .enterUserPassword("123#abc")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC12() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("督导乐少")
                .enterPhone("13688481234")
                .enterID("110101199003077520")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("dup_id_dd")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC13() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("纯数字用户名")
                .enterPhone("13611118888")
                .enterID("310101199003079048")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("1234555")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("用户名已存在！");
        loginPage.goLoginPage()
                .enterAccount("1234555")
                .enterPassword("123ab_")
                .assertNoEnter("不合法（字母开头+字母/数字，长度4-24)")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC14() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("长度三用户名")
                .enterPhone("13611118888")
                .enterID("310101199003079048")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("abc")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("用户名已存在！");
        loginPage.goLoginPage()
                .enterAccount("abc")
                .enterPassword("123ab_")
                .assertNoEnter("不合法（字母开头+字母/数字，长度4-24)")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC15() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("长度二十五用户名")
                .enterPhone("13611118888")
                .enterID("310101199003079048")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("abcdeabcdeabcdeabcdeabcde")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("用户名已存在！");
        loginPage.goLoginPage()
                .enterAccount("abcdeabcdeabcdeabcdeabcde")
                .enterPassword("123ab_")
                .assertNoEnter("不合法（字母开头+字母/数字，长度4-24)")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewFalseTC16() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("长度二十五用户名")
                .enterPhone("13611118888")
                .enterID("310101199003070668")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("sei_dd_du2")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("督一")
                .enterPhone("13611118888")
                .enterID("320508198308141109")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("abcd")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("AmyDuDao")
                .enterPhone("13611118888")
                .enterID("320508198308141109")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("abcdeabcdeabcdeabcde1234")
                .enterUserPassword("123ab_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorNewTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickNewSupervisor()
                .enterName("一二三四五六七八九十一二三四五")
                .enterPhone("13611118888")
                .enterID("320508198308141109")
                .enterMail("le@163.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(1)
                .enterSupNum("DD19987")
                .enterDepartment("ECNU")
                .enterUserName("sei_dd_du2")
                .enterUserPassword("123456789012345abcd_")
                .clickNewConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("用户名已存在！")
                .closePage();
    }

}
