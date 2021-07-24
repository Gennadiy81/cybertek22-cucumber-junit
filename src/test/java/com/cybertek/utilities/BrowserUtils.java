package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /**
     * This method accepts a List<WebElements> and returns List<String>
     *      @param webElementsList
     */


    public static List<String> getElementText(List<WebElement> webElementsList) {
        //Create placeholder List<String>
        List<String> actualAsString = new ArrayList<>();
        for (WebElement each : webElementsList) {
            actualAsString.add(each.getText());
        }
        return actualAsString;
    }


    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("");
        }
    }
}

