package objekrepository;

import org.openqa.selenium.By;

public class pageTeam {

    By btn_plus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By btn_addteam = By.xpath("//android.view.View[@content-desc=\"Add new team\"]");
    By type_name = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By type_description = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By btn_createbutton = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    By success_button = By.xpath("//android.widget.Button[@content-desc=\"Batch 16\n" +
            "Good\"]");

    public By getBtn_createbutton() {
        return btn_createbutton;
    }

    public By getBtn_addteam() {
        return btn_addteam;
    }

    public By getBtn_plus() {
        return btn_plus;
    }

    public By getType_description() {
        return type_description;
    }

    public By getType_name() {
        return type_name;
    }

    public By getSuccess_button() {
        return success_button;
    }
}
