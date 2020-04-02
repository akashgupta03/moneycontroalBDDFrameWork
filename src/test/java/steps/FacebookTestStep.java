package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.FaceBookHomePage;

import static testBase.TestBase.beforeMethod;
import static testBase.TestBase.navigateTo;

public class FacebookTestStep {

    FaceBookHomePage homePage;


    @And("^navigate to \"([^\"]*)\" url$")
    public void navigateToUrl(String url) throws Throwable {
        beforeMethod();
        navigateTo(url);

    }

    @Then("^click on birth year button$")
    public void clickOnBirthYearButton() {
        new FaceBookHomePage().clickOnBirthYearsButton();
    }

    @Then("^fetch the all the birth years$")
    public void fetchTheAllTheBirthYears() {
        new FaceBookHomePage().getAllYearsFromDropdown();
    }


    @Then("^verify the birth years \"([^\"]*)\" is present$")
    public void verifyTheBirthYearsIsPresent(String year) throws Throwable {
        new FaceBookHomePage().verifyYearPresentOrNot(year);

    }
}
