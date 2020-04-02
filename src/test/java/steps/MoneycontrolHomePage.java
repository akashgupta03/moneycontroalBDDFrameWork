package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.MoneycontrolHomepage;
import testBase.TestBase;

import static testBase.TestBase.beforeMethod;
import static testBase.TestBase.navigateTo;

public class MoneycontrolHomePage {
    MoneycontrolHomepage homepage;


    @And("^navigate  \"([^\"]*)\" url$")
    public void navigateUrl(String url) throws Throwable {
        beforeMethod();
        navigateTo(url);
    }


    @Then("^click on most active share link$")
    public void clickOnMostActiveShareLink() {
        homepage = new MoneycontrolHomepage();
        homepage.clickOnMostActiveLine();
    }

    @Then("^fetch Most Active stocks data$")
    public void fetchMostActiveStockesData() {
        homepage.printMostActiveShare();
    }


}
