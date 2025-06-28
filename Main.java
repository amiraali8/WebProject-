package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");

        //Select Gender
        driver.findElement(By.id("gender-female")).click();

        //First & Last Name
        driver.findElement(By.xpath("//input[@name=\"FirstName\"]")).sendKeys("Amira");
        driver.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys("Ali");

        //Email
        driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("amiraali91187@gmail.com");

        //Company Name
        driver.findElement(By.cssSelector("input[name=\"Company\"]")).sendKeys("AZM");


        //Password & Confirm Pass
        driver.findElement(By.cssSelector("input[name=\"Password\"]")).sendKeys("AZM@123");
        driver.findElement(By.cssSelector("input[id=\"ConfirmPassword\"]")).sendKeys("AZM@123");

        //Click on Register Button
        driver.findElement(By.xpath("//button[@id=\"register-button\"]")).click();


        //LogOut
        driver.findElement(By.xpath(" //a[@href=\"/logout\"]")).click();

        //Login
        driver.findElement(By.xpath("//a[@href=\"/login?returnUrl=%2F\"]")).click();
        driver.findElement(By.className("email input-validation-error")).sendKeys("amiraali91187@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("AZM@123");

        driver.findElement(By.cssSelector(".button-1.login-button")).click();











    }
    }
