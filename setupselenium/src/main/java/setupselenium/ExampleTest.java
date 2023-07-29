package setupselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

       
        driver.get("http://leaftaps.com/opentaps/control/login");

        driver.manage().window().maximize();
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys("demoSalesManager");
        passwordField.sendKeys("crmsfa");

        
        WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
        loginButton.click();

        WebElement crmSfaLink = driver.findElement(By.linkText("CRM/SFA"));
        crmSfaLink.click();

        
        WebElement leadsButton = driver.findElement(By.linkText("Leads"));
        leadsButton.click();

        
        WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
        createLeadButton.click();

        WebElement companyNameField = driver.findElement(By.id("createLeadForm_companyName"));
        companyNameField.sendKeys("INFOSYS");

        WebElement firstNameField = driver.findElement(By.id("createLeadForm_firstName"));
        firstNameField.sendKeys("SRINIVASH");

        WebElement lastNameField = driver.findElement(By.id("createLeadForm_lastName"));
        lastNameField.sendKeys("J");

        WebElement firstNameLocalField = driver.findElement(By.id("createLeadForm_firstNameLocal"));
        firstNameLocalField.sendKeys("SRI");

        WebElement departmentField = driver.findElement(By.name("departmentName"));
        departmentField.sendKeys("SELENIUM");

        driver.findElement(By.id("createLeadForm_description")).sendKeys("Your Description");
        
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jsrinivash09112000@gmail.com");
        
        WebElement createButton = driver.findElement(By.name("submitButton"));
        createButton.click();

        String resultingPageTitle = driver.getTitle();
        System.out.println("Resulting Page Title: " + resultingPageTitle);

       // driver.quit();
    }
}