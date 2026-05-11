package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MiniTest{
    
    @Test
    public void simpleTest() {
        // Setup Firefox driver path - update this to your geckodriver location
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        
        // Initialize Firefox browser
        WebDriver driver = new FirefoxDriver();
        
        try {
            // Open Google
            driver.get("https://www.google.com");
            
            // Print the page title to console
            System.out.println("Successfully opened: " + driver.getTitle());
            
        } finally {
            // Close browser
            driver.quit();
        }
    }
}