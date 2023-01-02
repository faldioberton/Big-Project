package Stepdefinition;

import Directory.scroll;
import config.environment;
import objekrepository.pageLogin;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class login extends environment{

    pageLogin pageLogin = new pageLogin();
    scroll scroll = new scroll();

    public void user_in_home_page()  {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageLogin.getBtn_skip())
        );
    }
    public void user_click_skip() {
        driver.findElement(pageLogin.getBtn_skip()).click();
    }


    public void user_click_yes() {
        driver.findElement(pageLogin.getBtn_yes()).click();
    }


    public void user_swipe_horizontal() throws InterruptedException {
        scroll.swiperight(driver, 0.9, 0.3,0.1,0.3 );
    }

    public void user_found_button_sign_in() {
        driver.findElement(pageLogin.getBtn_SignIn()).isDisplayed();
    }
    public void user_click_check_box() {
        driver.findElement(pageLogin.getCheck_box()).click();
    }


    public void user_click_sign_in() {
        driver.findElement(pageLogin.getBtn_SignIn()).click();
    }

    public void user_click_sign_in_with_google_account() {
        driver.findElement(pageLogin.getBtn_googleacc()).click();
       // wait.until(
         //       ExpectedConditions.visibilityOfElementLocated(pageLogin.getAcc_1())
        //);
    }

    public void user_click_account_1_to_sign_in() {
        driver.findElement(pageLogin.getAcc_1()).click();
    }
}
