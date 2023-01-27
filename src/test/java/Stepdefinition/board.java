package Stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageBoard;
import objekrepository.pageLogin;

import org.openqa.selenium.support.ui.ExpectedConditions;
import config.environment;

public class board extends environment{

    pageBoard pageBoard = new pageBoard();

    pageLogin pageLogin = new pageLogin();

    @Then("user open ones team")
    public void user_open_ones_team() {
        driver.findElement(pageBoard.getBtn_team());
        wait.until(
                ExpectedConditions.elementToBeClickable(pageBoard.getBtn_team())
        );
        driver.findElement(pageBoard.getBtn_team()).click();
    }
    @Then("user in page Team")
    public void user_in_page_team() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBoard.getPage_team())
        );
    }
    @When("user click feature board")
    public void user_click_feature_board() {
        driver.findElement(pageBoard.getBtn_board()).click();
    }
    @Then("user in page Board")
    public void user_in_page_board() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBoard.getAdd_button())
        );
    }
    @When("user click add button")
    public void user_click_add_button() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBoard.getAdd_button())
        );
        driver.findElement(pageBoard.getAdd_button()).click();
    }
    @Then("user input field new list")
    public void user_input_field_new_list() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBoard.getField_list())
        );
        driver.findElement(pageBoard.getField_list()).click();
        String input = "Project Besar";
        driver.findElement(pageBoard.getField_list()).sendKeys(input);
    }
    @Then("user click submit")
    public void user_click_submit() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBoard.getBtn_submit())
        );
        driver.findElement(pageBoard.getBtn_submit()).click();
    }
    @Then("user successfully add board")
    public void user_successfully_add_board() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageBoard.getBtn_list())
        );
    }
}
