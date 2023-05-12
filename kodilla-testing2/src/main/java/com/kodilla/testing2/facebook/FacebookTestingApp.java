package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String COOKIES = "//*[@data-testid='cookie-policy-dialog-accept-button']";
    public static final String USER = "//*[@data-testid='open-registration-form-button']";
    public static final String DAY = "//*[@id=\"day\"]";
    public static final String MONTH = "//*[@id=\"month\"]";
    public static final String YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptButton = driver.findElement(By.xpath(COOKIES));
        acceptButton.click();

        WebElement registerButton = driver.findElement(By.xpath(USER));
        registerButton.click();

        Thread.sleep(10*100);

        WebElement selectDay = driver.findElement(By.xpath(DAY));
        Select selectBoard1 = new Select(selectDay);
        selectBoard1.selectByIndex(16);

        WebElement selectMonth = driver.findElement(By.xpath(MONTH));
        Select selectBoard2 = new Select(selectMonth);
        selectBoard2.selectByIndex(6);

        WebElement selectYear = driver.findElement(By.xpath(YEAR));
        Select selectBoard3 = new Select(selectYear);
        selectBoard3.selectByIndex(25);
    }
}