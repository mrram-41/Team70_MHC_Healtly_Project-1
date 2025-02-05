package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PatientPage {


    public PatientPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement make_an_appointment;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement TestCase1Assertion;

    @FindBy(xpath = "//input[@placeholder='Your username']")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//li[@id='account-menu']/a/span")
    public WebElement profilBilgleriniGorme;

    @FindBy(xpath = "(//li[@id='account-menu']//a[@class='dropdown-item'])[1]")
    public WebElement settings;

    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div")
    public WebElement saveTextButonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement ikinciSignIn;



    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendRequestSubmit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement firstnameInvalidText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement lastnameInvalidText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement ssnInvalidText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement emailInvalidText;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phoneInvalidText;

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement accountMenuSigninOncesi;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SifreSonrasiSignin;








    //serhan  91-179

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement kullaniciIkonu;

    @FindBy(id = "login-item")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement userNameBox;

    @FindBy (name = "password")
    public WebElement passwordBox;

    @FindBy (xpath = "(//*[text()='Sign in'])[3]")
    public  WebElement signInButton2;

    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement myPagePatient;

    @FindBy(xpath = "//*[text()='Make an Appointment']")
    public WebElement makeAnAppointment;

    @FindBy(id = "appoDate")
    public  WebElement dateBox;

    @FindBy(xpath = "//*[text()='Appointment date can not be past date!']")
    public List<WebElement> uyariYazisi;

    @FindBy(name = "phone")
    public WebElement phoneNummer;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement sendButton;

    @FindBy(xpath = "//*[text()='19/08/22 02:00']")
    public  WebElement randevuTarihi;

    @FindBy(linkText = "My Appointments")
    public WebElement myAppointment;

    @FindBy(xpath = "//*[text()='Patient Bergmann']")
    public  WebElement kullaniciIkonu2;

    @FindBy(xpath = "//*[text()='Password']")
    public  WebElement passwordSekmesi;

    @FindBy(name = "currentPassword")
    public WebElement currentPassword;

    @FindBy(name = "newPassword")
    public WebElement newPassword;

    @FindBy(name = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy(className = "invalid-feedback")
    public List<WebElement> uyariYazisi2;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement passwordStrength;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(className = "Toastify__toast-body")
    public WebElement passwordChanged;

    @FindBy(xpath ="//*[text()='28/08/22 02:00']" )
    public WebElement dateTime;

    @FindBy(xpath = "//*[text()='220390']")
    public WebElement id;

    @FindBy(xpath ="//*[text()='28/08/22 02:00']" )
    public WebElement startDateTime;

    @FindBy(xpath ="//*[text()='UNAPPROVED']" )
    public WebElement status;



    
    
    
    
    
    
    
    //Bayram 180-249
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInAccount;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement patientUsernameAccount;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement patientPasswordAccount;
    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signInPatientAccount;
    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement patientMyPagesButton;
    @FindBy(xpath = "//*[text()='My Appointments']")
    public WebElement patientMyApponitmentButton;
    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[12]")
    public WebElement patientShowTestsButton;
    @FindBy(xpath = "//*[text()='View Results']")
    public WebElement patientViewResultsButton;
    @FindBy(xpath = "//*[text()='Default Min. Value']")
    public WebElement patientsTestDefMinValue;
    @FindBy(xpath = "//a[@class='btn btn-link btn-sm']")
    public WebElement patientResultsId;
    @FindBy(xpath = "//*[.='coco']")
    public WebElement patientResultsName;
    @FindBy(xpath = "//*[.='ölecek']")
    public WebElement patientResults;
    @FindBy(xpath = "//*[.='567']")
    public WebElement patientResultsMaxVALUE;
    @FindBy(xpath = "//*[.='205830']")
    public WebElement patientResultsTest;
    @FindBy(xpath = "//*[.='kitapkumuyor']")
    public WebElement patientResultsDescriptions;
    @FindBy(xpath = "//*[text()='20/08/22 11:19']")
    public WebElement patientResultsDate;
    @FindBy(xpath = "//*[text()='Show Invoice']")
    public WebElement patientShowInvoice;
    @FindBy(xpath = "//*[text()='Date:']")
    public WebElement invoiceDateResults;
    @FindBy(xpath = "//*[text()='567-76-5678']")
    public WebElement invoiceSSNResults;
    @FindBy(xpath = "//*[text()='Name:']")
    public WebElement invoiceName;
    @FindBy(xpath = "//*[text()='hastamed tahtamed']")
    public WebElement invoiceNameResults;
    @FindBy(xpath = "//*[text()='CASH']")
    public WebElement invoicePaymentsMethodResults;
    @FindBy(xpath = "//*[text()='1500$']")
    public WebElement invoiceTotalCostResults;
    @FindBy(xpath = "//*[text()='Make an Appointment']")
    public WebElement patientMakeAppointmentButton;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement patientAppointmentPhone;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement patientNewAppointmenSendButton;
    @FindBy(xpath = "//*[.='Appointment registration saved!']")
    public WebElement patientAppointmenttoastContainer;














    // Senturk 250-319
    
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement accountTikla;

    @FindBy(id = "login-item")
    public WebElement firstSignIn;

    @FindBy(id = "username")
    public WebElement firstUserName;

    @FindBy(name = "password")
    public WebElement firstpassword;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement SecondSignIn;

    @FindBy(xpath = "(//li[@id='entity-menu'])[1]")
    public WebElement ItemsTitleTikla;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[7]")
    public WebElement CountryTikla;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement CreateNewCountry;

    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement CountryNameGir;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SaveTikla;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement SaveTextGorunurlugu;

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement ItemsTitleGider;

    @FindBy(xpath = "//a[@href='/c-state']")
    public  WebElement StateCityTiklar;

    @FindBy(xpath = "//a[@id='jh-create-entity']/span")
    public WebElement CreateNewCity;

    @FindBy(xpath = "//input[@id='c-state-name']")
    public WebElement StateName;

    @FindBy (xpath = "//select[@id='c-state-state']")
    public  WebElement StateState;

    @FindBy(xpath = "//button[@id='save-entity']/span")
    public  WebElement SaveEntity;

    @FindBy (xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement HataYazisi;















}


