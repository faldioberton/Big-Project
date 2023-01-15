package Stepdefinition;

import Directory.datafile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objekrepository.pageHome;
import org.openqa.selenium.support.ui.ExpectedConditions;
import config.environment;

public class home extends environment{

    pageHome pageHome = new pageHome();
    datafile datafile = new datafile();

    @Given("user in page Home")
    public void user_in_page_home() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getPage_home())
        );
    }
    @When("user click Create New Company")
    public void user_click_create_new_company() {
        driver.findElement(pageHome.getBtn_createcompany()).click();
    }
    @And("user input field name")
    public void user_input_field_name() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getField_name())
        );
        driver.findElement(pageHome.getField_name()).click();
        String companyName = "Sekolah QA";
        driver.findElement(pageHome.getField_name()).sendKeys(companyName);

    }
    @And("user input field description")
    public void user_input_field_description() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getField_desc())
        );
        driver.findElement(pageHome.getField_desc()).click();
        String Description = "Belajar";
        driver.findElement(pageHome.getField_desc()).sendKeys(Description);
    }
    @And("user click create")
    public void user_click_create() {
        driver.findElement(pageHome.getBtn_create()).click();
    }
    @Then("user successfully create company")
    public void user_successfully_create_company() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getBtn_notif())
        );
        driver.findElement(pageHome.getBtn_cancel()).click();
    }
}

