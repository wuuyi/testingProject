package admin.SelfInfo;

import admin.BaseTest;
import admin.Pages.HomePage;
import admin.Pages.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//表单不太适合爬虫

class PSYAdminSelfInfoTC extends BaseTest {

    HomePage homePage = new HomePage();

    @Test //正确执行
    public void pSYAdminSelfInfoTrueTC01() throws InterruptedException {
        homePage.getSelfInfo()
                .enterOriginPassword("pl,okm123")
                .enterNewPassword("pl,123")
                .checkNewPassword("pl,123")
                .clickModifyConfirm();
        Thread.sleep(2000);
    }


}