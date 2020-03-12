import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
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


            driver.findElement(By.id("details-button")).click();
            //driver.findElement(By.linkText("Advanced")).click(); //details-button// proceed-link
            TimeUnit.SECONDS.sleep(2);
            System.out.println("2");
            driver.findElement(By.id("proceed-link")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("3");



            //driver.get("https://mini-ecasa/oam/server/obrareq.cgi?wh%3DIAMSuiteAgent%20wu%3D%2Fmskb%2Findex%20wo%3D1%20rh%3Dhttps%3A%2F%2Fmini-ecasa%20ru%3D%252Fmskb%252Findex");

            driver.findElement(By.id("username")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("username")).clear();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("username")).sendKeys("dabramkin");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("4");
            driver.findElement(By.id("password")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("password")).clear();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("password")).sendKeys("Admin123");
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            TimeUnit.SECONDS.sleep(5);
            System.out.println("5");
            driver.findElement(By.name("orgUnit")).click();
            TimeUnit.SECONDS.sleep(2);
            new Select(driver.findElement(By.name("orgUnit"))).selectByVisibleText("034025");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("6");
            driver.findElement(By.name("orgUnit")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//input[@value='Выбрать ТО']")).click();
            TimeUnit.SECONDS.sleep(10);
            System.out.println("7");




            driver.findElement(By.id("linkButton-1058-btnInnerEl")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("8");

            String originalWindow = driver.getWindowHandle();
            final Set<String> oldWindowsSet = driver.getWindowHandles();

            driver.findElement(By.id("ext-gen4185")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("9");
            driver.findElement(By.xpath("//div[@id='boundlist-2299-listEl']/ul/li")).click();
            TimeUnit.SECONDS.sleep(5);
            System.out.println("10");





            driver.findElement(By.id("button-2296-btnIconEl")).click();
            TimeUnit.SECONDS.sleep(5);
            System.out.println("11");

            String newWindow = (new WebDriverWait(driver, 10))
                    .until(new ExpectedCondition<String>() {
                               public String apply(WebDriver driver) {
                                   Set<String> newWindowsSet = driver.getWindowHandles();
                                   newWindowsSet.removeAll(oldWindowsSet);
                                   return newWindowsSet.size() > 0 ?
                                           newWindowsSet.iterator().next() : null;
                               }
                           }
                    );

            driver.switchTo().window(newWindow);

           // driver.get("https://10.0.14.112/mskt/manual-enter/new?docTypeId=1");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");

            //
            // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
           // driver.findElement(By.linkText("Общие")).click();
           // TimeUnit.SECONDS.sleep(2);
           // System.out.println("13");

            driver.findElement(By.id("snils")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("13");
            driver.findElement(By.xpath("//div[@id='general-info']/div[2]/table/tbody")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("14");
            driver.findElement(By.id("incomingNum")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("15");
            driver.findElement(By.id("incomingNum")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("16");
            driver.findElement(By.id("incomingNum")).sendKeys("034-025 14 СН 35212489");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("17");
            driver.findElement(By.id("isProactive")).click();
            driver.findElement(By.xpath("//*[@id='isProactive']")).click();
                    //By.xpath("//*[@id='isProactive']")).getText();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("18");
            driver.findElement(By.id("docDate")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("19");
            driver.findElement(By.id("csEmployee")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("20");
            driver.findElement(By.id("csEmployee")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("21");
            driver.findElement(By.id("csEmployee")).sendKeys("Сорокина");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("22");
            driver.findElement(By.id("accDate")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("23");
            driver.findElement(By.linkText("Дети")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("btnAddChild")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_snils")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_citizenship.id")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            new Select(driver.findElement(By.id("children_0_citizenship.id"))).selectByVisibleText("ГРАЖДАНИН РФ");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_citizenship.id")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_lastName")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_lastName")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_lastName")).sendKeys("Ружайло");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_name")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_name")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_name")).sendKeys("Пужайло");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthOrder")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthDate")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.country")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.country")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.country")).sendKeys("Россия");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.city")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.city")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.city")).sendKeys("Пенза");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.region")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.district")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.district")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_birthPlace.district")).sendKeys("Ленинский");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.attDocType.id")).click();

            new Select(driver.findElement(By.id("children_0_attachedDoc.attDocType.id"))).selectByVisibleText("Свидетельство о рождении");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.attDocType.id")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.issueAgency")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.issueAgency")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.issueAgency")).sendKeys("300-400");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.serial")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.serial")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.serial")).sendKeys("3344");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.number")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.number")).clear();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.number")).sendKeys("112233");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_0_attachedDoc.date")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("btnSend")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            assertEquals("Не определен сертифицируемый ребенок", closeAlertAndGetItsText());
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("btnAddChild")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_snils")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_citizenship.id")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            new Select(driver.findElement(By.id("children_1_citizenship.id"))).selectByVisibleText("ГРАЖДАНИН РФ");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_citizenship.id")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_isCertified")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_parentRelation.id")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            new Select(driver.findElement(By.id("children_1_parentRelation.id"))).selectByVisibleText("РОЖДЕНИЕ");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_parentRelation.id")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_birthOrder")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_lastName")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");
            driver.findElement(By.id("children_1_lastName")).clear();
            driver.findElement(By.id("children_1_lastName")).sendKeys("Ружайло");
            driver.findElement(By.id("children_1_name")).click();
            driver.findElement(By.id("children_1_name")).clear();
            driver.findElement(By.id("children_1_name")).sendKeys("Жужайло");
            driver.findElement(By.id("children_1_gender")).click();
            new Select(driver.findElement(By.id("children_1_gender"))).selectByVisibleText("Ж");
            driver.findElement(By.id("children_1_gender")).click();
            driver.findElement(By.id("children_0_gender")).click();
            new Select(driver.findElement(By.id("children_0_gender"))).selectByVisibleText("М");
            driver.findElement(By.id("children_0_gender")).click();
            driver.findElement(By.id("children_1_birthDate")).click();
            driver.findElement(By.id("children_1_birthPlace.country")).click();
            driver.findElement(By.id("children_1_birthPlace.country")).clear();
            driver.findElement(By.id("children_1_birthPlace.country")).sendKeys("Россия");
            driver.findElement(By.id("children_1_birthPlace.city")).click();
            driver.findElement(By.id("children_1_birthPlace.city")).clear();
            driver.findElement(By.id("children_1_birthPlace.city")).sendKeys("Пенза");
            driver.findElement(By.id("children_1_birthPlace.district")).click();
            driver.findElement(By.id("children_1_birthPlace.district")).clear();
            driver.findElement(By.id("children_1_birthPlace.district")).sendKeys("Ленинский");
            driver.findElement(By.id("children_1_attachedDoc.attDocType.id")).click();
            new Select(driver.findElement(By.id("children_1_attachedDoc.attDocType.id"))).selectByVisibleText("Свидетельство о рождении");
            driver.findElement(By.id("children_1_attachedDoc.attDocType.id")).click();
            driver.findElement(By.id("children_1_attachedDoc.issueAgency")).click();
            driver.findElement(By.id("children_1_attachedDoc.issueAgency")).clear();
            driver.findElement(By.id("children_1_attachedDoc.issueAgency")).sendKeys("300-400");
            driver.findElement(By.id("children_1_attachedDoc.serial")).click();
            driver.findElement(By.id("children_1_attachedDoc.serial")).clear();
            driver.findElement(By.id("children_1_attachedDoc.serial")).sendKeys("3344");
            driver.findElement(By.id("children_1_attachedDoc.number")).click();
            driver.findElement(By.id("children_1_attachedDoc.number")).clear();
            driver.findElement(By.id("children_1_attachedDoc.number")).sendKeys("123123");
            driver.findElement(By.id("children_1_attachedDoc.date")).click();
            driver.findElement(By.id("btnSend")).click();
            driver.findElement(By.linkText("Анкетные данные")).click();
            driver.findElement(By.id("lastname")).click();
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys("Ружайло");
            driver.findElement(By.id("lastnameOnBirth")).click();
            driver.findElement(By.id("lastnameOnBirth")).clear();
            driver.findElement(By.id("lastnameOnBirth")).sendKeys("Гужайло");
            driver.findElement(By.id("birthDate")).click();
            driver.findElement(By.id("name")).click();
            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("name")).sendKeys("Ужайло");
            driver.findElement(By.id("gender")).click();
            new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Ж");
            driver.findElement(By.id("gender")).click();
            driver.findElement(By.id("citizenship")).click();
            new Select(driver.findElement(By.id("citizenship"))).selectByVisibleText("ГРАЖДАНИН РФ");
            driver.findElement(By.id("citizenship")).click();
            driver.findElement(By.id("birthPlace_country")).click();
            driver.findElement(By.id("birthPlace_country")).clear();
            driver.findElement(By.id("birthPlace_country")).sendKeys("Россия");
            driver.findElement(By.id("birthPlace_city")).click();
            driver.findElement(By.id("birthPlace_city")).clear();
            driver.findElement(By.id("birthPlace_city")).sendKeys("Пенза");
            driver.findElement(By.id("birthPlace_district")).click();
            driver.findElement(By.id("birthPlace_district")).clear();
            driver.findElement(By.id("birthPlace_district")).sendKeys("Ленинский");
            driver.findElement(By.id("attDoc_attDocType")).click();
            new Select(driver.findElement(By.id("attDoc_attDocType"))).selectByVisibleText("Паспорт гражданина России");
            driver.findElement(By.id("attDoc_attDocType")).click();
            driver.findElement(By.id("attDoc_issueAgency")).click();
            driver.findElement(By.id("attDoc_issueAgency")).clear();
            driver.findElement(By.id("attDoc_issueAgency")).sendKeys("300-400");
            driver.findElement(By.id("attDoc_serial")).click();
            driver.findElement(By.id("attDoc_serial")).clear();
            driver.findElement(By.id("attDoc_serial")).sendKeys("5577");
            driver.findElement(By.id("attDoc_number")).click();
            driver.findElement(By.id("attDoc_number")).clear();
            driver.findElement(By.id("attDoc_number")).sendKeys("876543");
            driver.findElement(By.id("attDoc_date")).click();
            driver.findElement(By.id("btnSend")).click();
            assertEquals("Заявление было сохранено.", closeAlertAndGetItsText());
            driver.findElement(By.id("personalData")).click();



           // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='test2-2 тест 2-2'])[1]/following::button[1]")).click();
           // TimeUnit.SECONDS.sleep(2);
          //  driver.close();

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



