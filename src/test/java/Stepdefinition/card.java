package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import objekrepository.pageCard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import config.environment;

public class card extends environment{

    pageCard pageCard = new pageCard();

    @And("user click add new card")
    public void user_click_add_new_card() {
        driver.findElement(pageCard.getBtn_addnewcard()).click();
    }
    @And("user input field_cardname")
    public void user_input_field__cardname() {
        driver.findElement(pageCard.getField_cardname()).click();
        String input = "Progress";
        driver.findElement(pageCard.getField_cardname()).sendKeys(input);
    }
    @And("user click button switch Private_card")
    public void user_click_button_switch_private__card() {
        driver.findElement(pageCard.getBtn_switch()).click();
    }
    @And("user click checklist")
    public void user_click_checklist() {
        driver.findElement(pageCard.getBtn_checklist()).click();
    }
    @Then("user successfully create card")
    public void user_successfully_create_card() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageCard.getBtn_successcard())
        ).isDisplayed();
    }

}
