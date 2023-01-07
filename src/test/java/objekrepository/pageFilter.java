package objekrepository;

import org.openqa.selenium.By;

public class pageFilter {
    By icon_filter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]");
    By field_cardname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText[1]");


    public By getIcon_filter() {
        return icon_filter;
    }

    public By getField_cardname() {
        return field_cardname;
    }
}
