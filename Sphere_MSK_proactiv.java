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

public class Sphere_MSK_proactiv {

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
            // baseUrl = "https://mini-ecasa/oam/server/obrareq.cgi?wh%3DIAMSuiteAgent%20wu%3D%2Fmskb%2Findex%20wo%3D1%20rh%3Dhttps%3A%2F%2Fmini-ecasa%20ru%3D%252Fmskb%252Findex";
            baseUrl = "https://mini-ecasa/oam/server/obrareq.cgi?wh%3DIAMSuiteAgent%20wu%3D%2Fmskt%2Findex%20wo%3D1%20rh%3Dhttps%3A%2F%2F10.0.14.112%20ru%3D%252Fmskt%252Findex";

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
            TimeUnit.SECONDS.sleep(2);
            // driver.findElement(By.linkText("Advanced")).click(); //details-button// proceed-link
            TimeUnit.SECONDS.sleep(2);
            System.out.println("2");
            driver.findElement(By.id("proceed-link")).click(); //Proceed to mini-ecasa (unsafe)
            TimeUnit.SECONDS.sleep(2);
            System.out.println("3");


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


            driver.findElement(By.id("details-button")).click();
            //TimeUnit.SECONDS.sleep(2);
            // driver.findElement(By.linkText("Advanced")).click(); //details-button// proceed-link
            TimeUnit.SECONDS.sleep(2);
            System.out.println("2-1");
            driver.findElement(By.id("proceed-link")).click(); //Proceed to mini-ecasa (unsafe)
            TimeUnit.SECONDS.sleep(2);
            System.out.println("3-1");




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


            TimeUnit.SECONDS.sleep(2);
            System.out.println("12");


            // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
            // driver.findElement(By.linkText("Общие")).click();
            // TimeUnit.SECONDS.sleep(2);
            // System.out.println("13");


            driver.findElement(By.id("snils")).click();
            TimeUnit.SECONDS.sleep(2);
            System.out.println("13");
            driver.findElement(By.id("snils")).sendKeys("000-422-000 01");

            driver.findElement(By.id("incomingNum")).click();
            driver.findElement(By.id("incomingNum")).clear();
            driver.findElement(By.id("incomingNum")).sendKeys("034-025 14 СН 35212489");
            driver.findElement(By.id("isProactive")).click();
            driver.findElement(By.id("docDate")).click();
            driver.findElement(By.id("docDate")).sendKeys("01.01.2020");
            driver.findElement(By.id("csEmployee")).click();
            driver.findElement(By.xpath("//div[@id='general-info']/div[4]/table/tbody/tr[4]")).click();
            driver.findElement(By.id("csEmployee")).clear();
            driver.findElement(By.id("csEmployee")).sendKeys("Сорокина");
            driver.findElement(By.id("accDate")).click();
            driver.findElement(By.id("accDate")).sendKeys("01.01.2020");
            driver.findElement(By.xpath("//div[@id='general-info']/div[4]/table/tbody/tr[5]/td[2]")).click();
            driver.findElement(By.linkText("Дети")).click();
            driver.findElement(By.id("btnAddChild")).click();
            driver.findElement(By.id("children_0_snils")).click();
            driver.findElement(By.id("children_0_snils")).sendKeys("000-422-000 02");
            driver.findElement(By.id("children_0_citizenship.id")).click();
            new Select(driver.findElement(By.id("children_0_citizenship.id"))).selectByVisibleText("ГРАЖДАНИН РФ");
            driver.findElement(By.id("children_0_citizenship.id")).click();
            driver.findElement(By.id("children_0_birthOrder")).sendKeys("1");
            driver.findElement(By.id("children_0_lastName")).click();
            driver.findElement(By.id("children_0_lastName")).clear();
            driver.findElement(By.id("children_0_lastName")).sendKeys("Фвмусов");
            driver.findElement(By.id("children_0_name")).click();
            driver.findElement(By.id("children_0_name")).clear();
            driver.findElement(By.id("children_0_name")).sendKeys("Рамусов");
            driver.findElement(By.id("children_0_patronymic")).click();
            driver.findElement(By.id("children_0_patronymic")).clear();
            driver.findElement(By.id("children_0_patronymic")).sendKeys("Парусов");
            driver.findElement(By.id("children_0_birthDate")).click();
            driver.findElement(By.id("children_0_birthDate")).sendKeys("11.11.2015");
            driver.findElement(By.id("children_0_gender")).click();
            new Select(driver.findElement(By.id("children_0_gender"))).selectByVisibleText("М");
            driver.findElement(By.id("children_0_gender")).click();
            driver.findElement(By.id("children_0_birthPlace.country")).click();
            driver.findElement(By.id("children_0_birthPlace.country")).clear();
            driver.findElement(By.id("children_0_birthPlace.country")).sendKeys("россия");
            driver.findElement(By.id("children_0_birthPlace.city")).click();
            driver.findElement(By.id("children_0_birthPlace.city")).clear();
            driver.findElement(By.id("children_0_birthPlace.city")).sendKeys("Пенза");
            driver.findElement(By.id("children_0_birthPlace.district")).click();
            driver.findElement(By.id("children_0_birthPlace.district")).clear();
            driver.findElement(By.id("children_0_birthPlace.district")).sendKeys("Ленинский");
            driver.findElement(By.id("children_0_attachedDoc.attDocType.id")).click();
            new Select(driver.findElement(By.id("children_0_attachedDoc.attDocType.id"))).selectByVisibleText("Свидетельство о рождении");
            driver.findElement(By.id("children_0_attachedDoc.attDocType.id")).click();
            driver.findElement(By.id("children_0_attachedDoc.issueAgency")).click();
            driver.findElement(By.id("children_0_attachedDoc.issueAgency")).clear();
            driver.findElement(By.id("children_0_attachedDoc.issueAgency")).sendKeys("300-400");
            driver.findElement(By.id("children_0_attachedDoc.serial")).click();
            driver.findElement(By.id("children_0_attachedDoc.serial")).clear();
            driver.findElement(By.id("children_0_attachedDoc.serial")).sendKeys("1234");
            driver.findElement(By.id("children_0_attachedDoc.number")).click();
            driver.findElement(By.id("children_0_attachedDoc.number")).clear();
            driver.findElement(By.id("children_0_attachedDoc.number")).sendKeys("456789");
            driver.findElement(By.id("children_0_attachedDoc.date")).click();
            driver.findElement(By.id("children_0_attachedDoc.date")).sendKeys("11.11.2015");
            driver.findElement(By.id("btnAddChild")).click();
            driver.findElement(By.id("children_1_snils")).click();
            driver.findElement(By.id("children_1_snils")).sendKeys("000-422-000 03");
            driver.findElement(By.id("children_1_citizenship.id")).click();
            new Select(driver.findElement(By.id("children_1_citizenship.id"))).selectByVisibleText("ГРАЖДАНИН РФ");
            driver.findElement(By.id("children_1_citizenship.id")).click();
            driver.findElement(By.id("children_1_isCertified")).click();
            driver.findElement(By.id("children_1_parentRelation.id")).click();
            new Select(driver.findElement(By.id("children_1_parentRelation.id"))).selectByVisibleText("РОЖДЕНИЕ");
            driver.findElement(By.id("children_1_parentRelation.id")).click();
            driver.findElement(By.id("children_1_birthOrder")).click();
            driver.findElement(By.id("children_1_birthOrder")).sendKeys("2");
            driver.findElement(By.id("children_1_gender")).click();
            new Select(driver.findElement(By.id("children_1_gender"))).selectByVisibleText("Ж");
            driver.findElement(By.id("children_1_gender")).click();
            driver.findElement(By.id("children_1_lastName")).click();
            driver.findElement(By.id("children_1_lastName")).clear();
            driver.findElement(By.id("children_1_lastName")).sendKeys("Фамусова");
            driver.findElement(By.id("children_1_name")).click();
            driver.findElement(By.id("children_1_name")).clear();
            driver.findElement(By.id("children_1_name")).sendKeys("Гамуса");
            driver.findElement(By.id("children_1_patronymic")).click();
            driver.findElement(By.id("children_1_patronymic")).clear();
            driver.findElement(By.id("children_1_patronymic")).sendKeys("Парусовна");
            driver.findElement(By.id("children_1_birthDate")).click();
            driver.findElement(By.id("children_1_birthDate")).sendKeys("11.11.2018");
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
            driver.findElement(By.id("children_1_attachedDoc.serial")).sendKeys("1234");
            driver.findElement(By.id("children_1_attachedDoc.number")).click();
            driver.findElement(By.id("children_1_attachedDoc.number")).clear();
            driver.findElement(By.id("children_1_attachedDoc.number")).sendKeys("987654");
            driver.findElement(By.id("children_1_attachedDoc.date")).click();
            driver.findElement(By.id("children_1_attachedDoc.date")).sendKeys("11.11.2018");
            driver.findElement(By.id("children")).click();
            driver.findElement(By.linkText("Анкетные данные")).click();
            driver.findElement(By.id("lastname")).click();
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys("Фамусова");
            driver.findElement(By.id("name")).click();
            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("name")).sendKeys("Дамуса");
            driver.findElement(By.id("patronymic")).click();
            driver.findElement(By.id("patronymic")).clear();
            driver.findElement(By.id("patronymic")).sendKeys("Чамусовна");
            driver.findElement(By.id("gender")).click();
            new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Ж");
            driver.findElement(By.id("gender")).click();
            driver.findElement(By.id("lastnameOnBirth")).click();
            driver.findElement(By.id("lastnameOnBirth")).clear();
            driver.findElement(By.id("lastnameOnBirth")).sendKeys("Жамусова");
            driver.findElement(By.id("birthDate")).click();
            driver.findElement(By.id("birthDate")).sendKeys("11.11.1989");
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
            driver.findElement(By.id("attDoc_serial")).sendKeys("1234");
            driver.findElement(By.id("attDoc_number")).click();
            driver.findElement(By.id("attDoc_number")).clear();
            driver.findElement(By.id("attDoc_number")).sendKeys("0987654");
            driver.findElement(By.id("attDoc_date")).click();
            driver.findElement(By.id("attDoc_date")).sendKeys("11.11.2009");
            driver.findElement(By.id("tab-personal-data")).click();
            driver.findElement(By.id("btnSend")).click();
            driver.findElement(By.id("children")).click();
            driver.findElement(By.id("btnSend")).click();
            assertEquals("Заявление было сохранено.", closeAlertAndGetItsText());







          /*
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
*/
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



