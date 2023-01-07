package objekrepository;

import org.openqa.selenium.By;

public class pageCard {
    By btn_addnewcard = By.xpath("//android.widget.Button[@content-desc=\"Add new card\"]");
    By btn_meatballs = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
    By btn_archiveall = By.xpath("//android.view.View[@content-desc=\"Archive all cards in this list\"]");
    By btn_archiveone = By.xpath("//android.view.View[@content-desc=\"Archive this list\"]");
    By btn_setcomplete = By.xpath("//android.view.View[@content-desc=\"Set as a Complete List\"]");
    By field_cardname =By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText");
    By btn_switch = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch");
    By btn_checklist = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View");
    By btn_meatballs2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]");
    By btn_sharecard = By.xpath("//android.widget.Button[@content-desc=\"Share card link\"]");
    By btn_movecard = By.xpath("//android.widget.Button[@content-desc=\"Move card\"]");
    By btn_copycard = By.xpath("//android.widget.Button[@content-desc=\"Copy card\"]");
    By btn_archivedcard = By.xpath("//android.widget.Button[@content-desc=\"Archive card\"]");
    By btn_setcard = By.xpath("//android.widget.Button[@content-desc=\"Set card to private\"]");

    By icon_archive = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]");
    By icon_arrowdown = By.xpath("//android.widget.Button[@content-desc=\"Board\"]");
    By btn_successcard = By.xpath("//android.widget.Button[@content-desc=\"Progress\n" +
            "Show menu\"]");

    public By getBtn_addnewcard() {
        return btn_addnewcard;
    }

    public By getBtn_meatballs() {
        return btn_meatballs;
    }

    public By getBtn_archiveall() {
        return btn_archiveall;
    }

    public By getBtn_archiveone() {
        return btn_archiveone;
    }

    public By getBtn_setcomplete() {
        return btn_setcomplete;
    }

    public By getBtn_archivedcard() {
        return btn_archivedcard;
    }
    public By getBtn_checklist() {
        return btn_checklist;
    }

    public By getBtn_copycard() {
        return btn_copycard;
    }

    public By getBtn_meatballs2() {
        return btn_meatballs2;
    }

    public By getBtn_movecard() {
        return btn_movecard;
    }

    public By getBtn_setcard() {
        return btn_setcard;
    }

    public By getBtn_sharecard() {
        return btn_sharecard;
    }

    public By getBtn_switch() {
        return btn_switch;
    }

    public By getField_cardname() {
        return field_cardname;
    }

    public By getIcon_archive() {
        return icon_archive;
    }

    public By getIcon_arrowdown() {
        return icon_arrowdown;
    }



    public By getBtn_successcard() {
        return btn_successcard;
    }
}
