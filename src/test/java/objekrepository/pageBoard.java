package objekrepository;

import org.openqa.selenium.By;
import Directory.datafile;

public class pageBoard {
    datafile datafile = new datafile();
    By btn_board = By.xpath("//android.widget.ImageView[@content-desc=\"Board\"]");
    By field_list = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By btn_submit = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");
    By btn_list = By.xpath("//android.view.View[@content-desc=\"Project Besar\"]");
    By btn_blast = By.xpath("//android.view.View[@content-desc=\"Blast\"]");
    By btn_team = By.xpath("//android.widget.Button[contains(@content-desc,'" + datafile.getName_team()+"')]");
    By page_team = By.xpath("//android.view.View[@content-desc=\"Batch 16\"]");
    By add_button = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");


    public By getBtn_team() {
        return btn_team;
    }

    public By getBtn_board() {
        return btn_board;
    }

    public By getField_list() {
        return field_list;
    }

    public By getBtn_submit() {
        return btn_submit;
    }



    public By getBtn_blast() {
        return btn_blast;
    }

    public By getPage_team() {
        return page_team;
    }

    public By getBtn_list() {
        return btn_list;
    }

    public By getAdd_button() {
        return add_button;
    }
}
