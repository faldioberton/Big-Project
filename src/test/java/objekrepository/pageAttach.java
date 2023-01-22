package objekrepository;

import org.openqa.selenium.By;
import Directory.datafile;

public class pageAttach {
    datafile datafile = new datafile();
    By btn_card = By.xpath("//android.widget.Button[contains(@content-desc,'" + datafile.getName_card()+"')]");
    By btn_attach = By.xpath("//android.widget.Button[@content-desc=\"Attach file\"]");
    By btn_allow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    By btn_file = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
    By btn_success = By.xpath("//android.view.View[@content-desc=\"Upload attachments is success\"]");
    By btn_cancel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");



    public By getBtn_card() {
        return btn_card;
    }

    public By getBtn_cancel() {
        return btn_cancel;
    }

    public By getBtn_attach() {
        return btn_attach;
    }

    public By getBtn_allow() {
        return btn_allow;
    }

    public By getBtn_file() {
        return btn_file;
    }

    public By getBtn_success() {
        return btn_success;
    }
}
