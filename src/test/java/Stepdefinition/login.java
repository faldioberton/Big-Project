package Stepdefinition;

import config.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageLogin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.MalformedURLException;

import static config.environment.driver;
import static config.environment.wait;

public class login {

    pageLogin pageLogin = new pageLogin();
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


    public void user_swipe_horizontal() {
        driver.findElement(pageLogin.getScroll_toSignIn()).click();
        //TouchAction action = new TouchAction(driver);
        //action.moveTo(10, 100);
        //action.perform();
    }


    public void user_found_button_sign_in() {
        driver.findElement(pageLogin.getBtn_SignIn()).isDisplayed();
    }


    public void user_click_sign_in() {
        driver.findElement(pageLogin.getBtn_SignIn()).click();
    }


    public void user_click_check_box() {
        driver.findElement(pageLogin.getCheck_box()).click();
    }


    public void user_click_sign_in_with_google_account() {
        driver.findElement(pageLogin.getBtn_googleacc()).click();
    }


    public void user_click_account_1_to_sign_in() {
        driver.findElement(pageLogin.getAcc_1()).click();
    }
}
