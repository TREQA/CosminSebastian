package com.hashMap.tests;

import com.hashMap.DriverBase;
import com.hashMap.page.DashboardPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HashMapTests extends DriverBase {

    @Test(groups = "HashMap test")
    public void test_01() throws Exception {
        WebDriver driver = getDriver();

        driver.get("https://www.reginamaria.ro/");
        driver.manage().window().maximize();

        DashboardPage dashboardPage = new DashboardPage(driver);

        dashboardPage.getNameWithA();

        driver.quit();
        }
    }

