
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


public class TestSphere {





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
            //DesiredCapabilities capabillities = DesiredCapabilities.firefox(); //2


            // driver = new RemoteWebDriver(new URL("http://admin:Zasxde90@10.77.30.99:4444/wd/hub"),capabillities); //2

               baseUrl = "https://mini-ecasa/asvWebCentral/main.do#";
            // baseUrl = "https://mini-ecasa/oam/server/obrareq.cgi?wh%3DIAMSuiteAgent%20wu%3D%2FasvWebCentral%2Fmain.do%20wo%3D1%20rh%3Dhttps%3A%2F%2Fmini-ecasa%20ru%3D%252FasvWebCentral%252Fmain.do#";


            //driver.manage().window().setSize(new Dimension(800,600)); //1
            driver.manage().window().maximize(); //2
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        }

        @Test
        public void testUntitSphereAut() throws Exception {


            driver.get(baseUrl);
            System.out.println("1");
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("details-button")).click();
            //driver.findElement(By.linkText("Advanced")).click(); //details-button// proceed-link
            TimeUnit.SECONDS.sleep(2);
            System.out.println("2");
            driver.findElement(By.id("proceed-link")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("3");

            driver.findElement(By.id("username")).click();
            TimeUnit.SECONDS.sleep(4);
            System.out.println("4");
            driver.findElement(By.id("username")).clear();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("username")).sendKeys("utp_e");
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("password")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("password")).clear();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("password")).sendKeys("Qwer1234");
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//input[@value='Вход в систему']")).click();
            TimeUnit.SECONDS.sleep(2);
            /*
            driver.findElement(By.id("username")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("username")).clear();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("username")).sendKeys("utp_e");
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("password")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("password")).clear();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("password")).sendKeys("Qwer1234");
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            TimeUnit.SECONDS.sleep(2);
            */
            driver.findElement(By.xpath("//a[@id='ui-id-2']/span")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.id("ui-id-3")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("5");

            String body =  driver.findElement(By.tagName("body")).getText();
            System.out.println(body);
            TimeUnit.SECONDS.sleep(2);
            System.out.println("6");

            driver.findElement(By.tagName("body")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("7");
            //  TimeUnit.SECONDS.sleep(600);

            // String root =  driver.findElement(By.id("root")).getText();
            // System.out.println(root);
            //System.out.println("7");
            // TimeUnit.SECONDS.sleep(600);
            String page = driver.findElement(By.xpath("//*[@id='page-container']")).getText();
            // driver.findElement(By.xpath("//a[@href='https://mini-ecasa/asvWeb/utp/engineer/main.do#/process/dsv3/?processTypeName=%D0%94%D0%A1%D0%92-3']")).click();
            // driver.findElement(By.className("row-justify-center")).click();
            //driver.findElement(By.id("processList")).click();
            // driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println(page);
            System.out.println("8");

            driver.findElement(By.xpath("//*[@id='page-container']")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("9");

            driver.findElement(By.xpath("//*[@href='https://mini-ecasa/asvWeb/utp/engineer/main.do#/process/dsv3/?processTypeName=%D0%94%D0%A1%D0%92-3']")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("10");

            driver.findElement(By.cssSelector("#processList > div:nth-child(4)")).click();

            TimeUnit.SECONDS.sleep(2);
            System.out.println("7");
            // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=3 | ]]

            // driver.findElement(By.linkText("ДСВ-3")).click();
            // driver.findElement(By.partialLinkText("ДСВ-3")).click();
            // driver.findElement(By.xpath("//*[@id=\"processList\"]/div[4]/div[1]")).click();
            //  driver.findElement(By.xpath("//*[@id=\"processList\"]/div[4]/div[1]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Показать пакеты в обработке'])[4]/preceding::div[1]")).click();

            TimeUnit.SECONDS.sleep(2);
            System.out.println("8");



            driver.findElement(By.className("process-body")).click();

            TimeUnit.SECONDS.sleep(2);
            System.out.println("6");

            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ДСВ-3'])[1]/following::span[1]")).click();
            TimeUnit.SECONDS.sleep(2);


            driver.findElement(By.linkText("Система")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='за час'])[1]/following::label[1]")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сбросить'])[1]/following::button[1]")).click();
            TimeUnit.SECONDS.sleep(2);




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







