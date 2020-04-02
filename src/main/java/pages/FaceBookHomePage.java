package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class FaceBookHomePage extends BasePage {


    public FaceBookHomePage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "year")
    private static WebElement birthYear;


    public void clickOnBirthYearsButton() {
        waitForElementToBeDisplay(birthYear);
        jsClick(birthYear);
    }

    public static void getAllYearsFromDropdown() {
        Select years = new Select(birthYear);
        List<WebElement> year = years.getOptions();
        for (WebElement ele : year) {
            System.out.println(ele.getText());
        }

    }

    public static void verifyYearPresentOrNot(String year) {
        Boolean found;
        Select years = new Select(birthYear);
        List<WebElement> ye = years.getOptions();
        found = ye.stream().anyMatch(ele -> ele.getText().equals(year));
        System.out.println(found ? "birth years is exits" : "birth year is not exist");

    }


}
