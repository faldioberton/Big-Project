package Stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageAttach;
import org.openqa.selenium.support.ui.ExpectedConditions;
import config.environment;

public class Attach_file extends environment{

    pageAttach pageAttach = new pageAttach();
    @When("user open ones card")
    public void user_open_ones_card() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageAttach.getBtn_card())
        );
        driver.findElement(pageAttach.getBtn_card()).click();
    }
    @Then("user click Attach file")
    public void user_click_attach_file() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageAttach.getBtn_attach())
        );
        driver.findElement(pageAttach.getBtn_attach()).click();
    }
    @Then("user click Allow")
    public void user_click_allow() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageAttach.getBtn_allow())
        );
        driver.findElement(pageAttach.getBtn_allow()).click();
    }
    @Then("user click ones files")
    public void user_click_ones_files() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageAttach.getBtn_file())
        );
        driver.findElement(pageAttach.getBtn_file()).click();
    }
    @Then("user successfully attach file")
    public void user_successfully_attach_file() {
        wait.until(
                ExpectedConditions.elementToBeClickable(pageAttach.getBtn_success())
        );
        driver.findElement(pageAttach.getBtn_cancel()).click();
    }
}
