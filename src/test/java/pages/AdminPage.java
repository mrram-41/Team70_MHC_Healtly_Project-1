package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {

    public AdminPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Arif 16- 79

    @FindBy (xpath ="//*[text()=\"CONTACT\"]" )
    public WebElement contactButton;
    @FindBy (xpath ="//*[text()=\"Contact\"]" )
    public WebElement contactYazi;
    @FindBy (xpath = "//input[@name=\"name\"]")
    public WebElement nameButonu;
    @FindBy(xpath = "//button[@id=\"register-submit\"]")
    public WebElement sendButonu;
     @FindBy(xpath ="//span[text()=\"Items&Titles\"]")
    public WebElement itemButton;
    @FindBy(xpath = "//span[text()=\"Staff\"]")
    public WebElement staffButton;
      @FindBy(xpath = "//span[text()=\"Create a new Staff\"]")
    public WebElement creatButton;
    @FindBy(xpath = "//input[@name=\"searchSSN\"]")
    public WebElement ssnSearch;














































   // Seyfullah  80-159















































































 // Ahmet 160-239















































































    // Adem 240-319















































































    // Enes 320-399















































































    //Kadir 400-450

















































//Sentürk 450-519






































































}
