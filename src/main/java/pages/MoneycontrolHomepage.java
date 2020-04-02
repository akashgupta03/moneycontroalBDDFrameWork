package pages;

import driver.DriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.IntStream;

public class MoneycontrolHomepage extends BasePage {

    public MoneycontrolHomepage() {
        driver = DriverProvider.getDriver();

        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "a[title='See all Most Active']")
    private WebElement mostActiveShareLink;

    @FindBy(css = "div.hist_tbl_hm>table>tbody>tr")
    private List<WebElement> mostActiveShare;

    public void clickOnMostActiveLine() {
        waitForElementTobeClickable(mostActiveShareLink);
        jsClick(mostActiveShareLink);

    }

    public void printMostActiveShare() {
        waitForListOfElementToBeDisplay(mostActiveShare);
        mostActiveShare.stream().map(row -> row.findElements(By.tagName("td"))).forEach(cells -> {
            IntStream.range(0, 6).mapToObj(cells::get).map(cell -> cell.getText() + "  ").forEach(System.out::print);
            System.out.println();
        });


    }

}

