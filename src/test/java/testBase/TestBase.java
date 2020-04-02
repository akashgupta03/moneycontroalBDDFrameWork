package testBase;

import driver.DriverInitializer;

import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    protected String url;


    public static void beforeMethod() throws Exception {
        driver = new DriverInitializer("chrome").init();


    }

    public static void navigateTo(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected void navigateToRefresh() {
        driver.navigate().refresh();
    }

    protected String getCurrentURl() {
        return driver.getCurrentUrl();
    }


    public void afterMethod() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }


}
