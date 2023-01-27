package Stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageTeam;
import org.openqa.selenium.support.ui.ExpectedConditions;
import config.environment;

public class team extends environment{

    pageTeam pageTeam = new pageTeam();

    @Then("user in page Company")
    public void user_in_board_company() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageTeam.getBtn_plus())
        );
    }
    @When("user open ones company")
    public void user_open_ones_company() {
                wait.until(
                        ExpectedConditions.elementToBeClickable(pageTeam.getBtn_company())
                        );
        driver.findElement(pageTeam.getBtn_company()).click();
    }
    @When("user click icon plus")
    public void user_click_icon_plus() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageTeam.getBtn_plus())
        );
        driver.findElement(pageTeam.getBtn_plus()).click();
    }
    @When("user click add new team")
    public void user_click_add_new_team() {
        driver.findElement(pageTeam.getBtn_addteam()).click();
    }
    @When("user input field_name")
    public void user_input_field__name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageTeam.getType_name())
        );
        driver.findElement(pageTeam.getType_name()).click();
        String input = "Batch 16";
        driver.findElement(pageTeam.getType_name()).sendKeys(input);
    }
    @When("user input field_description")
    public void user_input_field__description() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageTeam.getType_description())
        );
        driver.findElement(pageTeam.getType_description()).click();
        String input = "Good";
        driver.findElement(pageTeam.getType_description()).sendKeys(input);
    }
    @When("user click create button")
    public void user_click_create_button() {
        driver.findElement(pageTeam.getBtn_createbutton()).click();
    }
    @Then("user successfully create team")
    public void user_successfully_create_team() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageTeam.getSuccess_button())
        );
    }
}
