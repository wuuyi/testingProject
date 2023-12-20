package admin.Account.Supervisor;

import admin.BaseTest;
import admin.Pages.LoginPage;
import admin.Pages.SupervisorManagePage;
import org.junit.jupiter.api.Test;

public class PSYAdminAccountSupervisorModifyTC extends BaseTest {
    LoginPage loginPage = new LoginPage();
    SupervisorManagePage supervisorManagePage = new SupervisorManagePage();

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor();
        String originUserName = supervisorManagePage.getUserName();
        supervisorManagePage.enterUserName("abcde")
                .enterUserPassword("123abc_")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.clickModifyCancel()
                .clickModifySupervisor();

        String newUserName = supervisorManagePage.getUserName();
        supervisorManagePage.assertOriginUserName(newUserName,originUserName)
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor();
        String originUserName = supervisorManagePage.getUserName();
        supervisorManagePage.enterName("")
                .enterPhone("")
                .enterID("")
                .enterMail("")
                .enterSupTitle("")
                .enterSupNum("")
                .enterDepartment("")
                .enterUserName("")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请输入姓名")
                .assertPhoneErr("请输入联系电话")
                .assertIDErr("请输入身份证号")
                .assertMailErr("请输入邮箱")
                .assertSupTitleErr("请输入职称")
                .assertSupNumErr("请输入资质编号")
                .assertDepErr("请输入工作单位")
                .assertUserNameErr("请输入用户名")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor();
        String originUserName = supervisorManagePage.getUserName();
        supervisorManagePage.enterName("")
                .enterPhone("12311122212")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请输入姓名")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor();
        String originUserName = supervisorManagePage.getUserName();
        supervisorManagePage.enterName("一")
                .enterPhone("188177123456")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC05() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor();
        String originUserName = supervisorManagePage.getUserName();
        supervisorManagePage.enterName("一二三四五六七八九十一二三四五六")
                .enterPhone("1881771234")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertPhoneErr("格式不正确")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC06() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor();
        String originUserName = supervisorManagePage.getUserName();
        supervisorManagePage.enterName("张zhang")
                .enterID("212120199876532222")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertIDErr("请检查格式后正确输入")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC07() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor();
        String originUserName = supervisorManagePage.getUserName();
        supervisorManagePage.enterName("张#123")
                .enterID("2110032000071543")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertNameErr("请检查姓名输入是否正确")
                .assertIDErr("请检查格式后正确输入")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC08() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor()
                .enterID("2110032000071543211")
                .enterMail("a23.-bc@sample.com")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertIDErr("请检查格式后正确输入")
                .assertMailErr("请输入合法邮箱")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC09() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor()
                .enterUserPassword("abc12")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC10() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor();
        String originUserName = supervisorManagePage.getUserName();
        supervisorManagePage.enterUserPassword("123456789012345abcde_")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC11() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor()
                .enterUserPassword("123#abc")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertPasswordErr("密码只能由长度为6-20的数字、字母、下划线组成")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyFalseTC12() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor()
                .enterID("21100320010714432x")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("修改成功！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyTrueTC01() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor()
                .enterName("我是督导谢谢")
                .enterPhone("13611118887")
                .enterID("320508198308151109")
                .enterMail("dududu@126.com")
                .enterSupTitle("高级咨询师")
                .changeGrade(2)
                .enterSupNum("DD12330")
                .enterDepartment("ECNU心理系")
                .enterUserPassword("123ab_")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("修改成功！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyTrueTC02() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor()
                .enterName("督二")
                .enterUserPassword("123ab_")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("修改成功！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyTrueTC03() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor()
                .enterName("AmyDuDie")
                .enterUserPassword("123ab_")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("修改成功！")
                .closePage();
    }

    @Test
    public void pSYAdminAccountSupervisorModifyTrueTC04() throws InterruptedException {
        loginPage.login();
        Thread.sleep(2000);
        supervisorManagePage.getSupervisorManagePage();
        Thread.sleep(1000);
        supervisorManagePage.clickModifySupervisor()
                .enterName("一二三四五六七八九十一二三四六")
                .enterUserPassword("123456789012345abcd_")
                .clickModifyConfirm();
        Thread.sleep(500);
        supervisorManagePage.assertMsgText("修改成功！")
                .closePage();
    }

}
