package objekrepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class pageLogin {

    By btn_yes = By.xpath("//android.widget.Button[@content-desc=\"Yes!\"]");
    By btn_skip = By.xpath("//android.view.View[@content-desc=\"Skip\"]");
    By page_home = By.xpath("//android.view.View[@content-desc=\"Sick of miscoordination?\"]");
    By btn_SignIn = By.xpath("//android.widget.Button[@content-desc=\"Go to Sign In\"]");
    By logo_home = By.xpath("//android.widget.ImageView[@content-desc='logo']");
    By scroll_toSignIn = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(textContains(\"Go to Sign In\"))");

    By check_box = By.xpath("//android.widget.CheckBox[@content-desc=\"Ready to be organised?\n" +
            "Don’t show me this introduction anymore\"]/android.widget.ImageView[1]");

    By acc_1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]");

    By btn_googleacc = By.xpath("//android.widget.ImageView[@content-desc='Sign in with Google Account']");

    public By getAcc_1() {
        return acc_1;
    }

    public By getBtn_googleacc() {
        return btn_googleacc;
    }

    public By getBtn_yes() {
        return btn_yes;
    }
    public By getBtn_SignIn() {
        return btn_SignIn;
    }
    public By getPage_home() {
        return page_home;
    }
    public By getBtn_skip() {
        return btn_skip;
    }
    public By getLogo_home() {
        return logo_home;
    }
    public By getScroll_toSignIn() {
        return scroll_toSignIn;
    }
    public By getCheck_box() {
        return check_box;
    }
}
