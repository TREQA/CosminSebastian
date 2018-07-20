package com.hashMap.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DashboardPage extends PageBase {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    public void getNameWithA() throws IOException {
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        for (int i = 1; i <= 9; i++) {
            By headerLocator = By.xpath("//*[@id=\"block-menu-block-1\"]/div/ul/li[" + i + "]");
            WebElement header = driver.findElement(headerLocator);
            String headerLable = header.getText();
            System.out.println("Header " + headerLable);
            myMap.put(i, headerLable);
        }

            Set entrySet = myMap.entrySet();

            Iterator it = entrySet.iterator();

            BufferedWriter bw = null;
            FileWriter fw = null;


            String FILENAME = "/data/temp.txt";
            fw = new FileWriter(FILENAME, true);
            bw = new BufferedWriter(fw);

            while (it.hasNext()) {
                Map.Entry me = (Map.Entry) it.next();
                System.out.println("Key = " + me.getKey() + ", Value = " + me.getValue());
                if (me.getValue().toString().contains("A")) {
                    String actualValue = (String) me.getValue();

                        bw.write(actualValue);
                        bw.newLine();
                        bw.flush();



                }
            }
        }
    }






