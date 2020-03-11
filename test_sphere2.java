import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class Sphere_MSK_aut {



        long  start = System.currentTimeMillis();
        private WebDriver driver;
        private java.lang.String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() throws Exception {

            start =  System.currentTimeMillis();

            driver = new ChromeDriver(); //1

            // driver = new FirefoxDriver(); //1


            //DesiredCapabilities capabillities = DesiredCapabilities.chrome(); //2
            // DesiredCapabilities capabillities = DesiredCapabilities.firefox(); //2


            // driver = new RemoteWebDriver(new URL("http://admin:Zasxde90@10.77.30.99:4444/wd/hub"),capabillities); //2

           // baseUrl = "https://mini-ecasa/asvWebCentral/main.do#";
              baseUrl = "https://mini-ecasa/oam/server/obrareq.cgi?wh%3DIAMSuiteAgent%20wu%3D%2Fmskb%2Findex%20wo%3D1%20rh%3Dhttps%3A%2F%2Fmini-ecasa%20ru%3D%252Fmskb%252Findex";


            //driver.manage().window().setSize(new Dimension(800,600)); //1
            driver.manage().window().maximize(); //2
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        }

        @Test
        public void testUntitSphereAut() throws Exception {


            driver.get(baseUrl);
            System.out.println("1");

            TimeUnit.SECONDS.sleep(2);

            //driver.get("https://mini-ecasa/oam/server/obrareq.cgi?wh%3DIAMSuiteAgent%20wu%3D%2Fmskb%2Findex%20wo%3D1%20rh%3Dhttps%3A%2F%2Fmini-ecasa%20ru%3D%252Fmskb%252Findex");
            driver.findElement(By.id("username")).click();
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys("dabramkin");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password")).sendKeys("Admin123");
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            driver.findElement(By.name("orgUnit")).click();
            new Select(driver.findElement(By.name("orgUnit"))).selectByVisibleText("034025");
            driver.findElement(By.name("orgUnit")).click();
            driver.findElement(By.xpath("//input[@value='Выбрать ТО']")).click();
            driver.findElement(By.id("linkButton-1058-btnInnerEl")).click();
            driver.findElement(By.id("ext-gen4185")).click();
            driver.findElement(By.xpath("//div[@id='boundlist-2299-listEl']/ul/li")).click();
            driver.findElement(By.id("button-2296-btnIconEl")).click();
            // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
            driver.findElement(By.id("snils")).click();
            driver.findElement(By.id("btnGetCitizen")).click();





            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='test2-2 тест 2-2'])[1]/following::button[1]")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.close();

        }

        @After
        public void tearDown() throws Exception {
            System.out.println("Test proceed = " + " " + (System.currentTimeMillis() - start)+ " "+" ms");

            driver.quit();
            java.lang.String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private boolean isAlertPresent() {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

        private java.lang.String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
                java.lang.String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }


        public void run() {
        }

        public void start() {
        }

    }



