import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class Xml_Test {


        long  start = System.currentTimeMillis();
        private WebDriver driver;
        private java.lang.String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @Before
        public void setUp() throws Exception {

            start =  System.currentTimeMillis();

            driver = new ChromeDriver(); //1



            baseUrl = "http://10.138.243.194:8080/report/query?query=InfoWorkZL&snils=11608660343&lastname=-581498941&firstname=-1894049236&patronymic=1797973543&period_from=10.2016&period_to=02.2017";
            //driver.manage().window().setSize(new Dimension(800,600)); //1
            driver.manage().window().maximize(); //2
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        }

        @Test
        public void testUntitProtmsAut() throws Exception {


            driver.get(baseUrl);
            TimeUnit.SECONDS.sleep(2);

            String dr = driver.getPageSource();

            String InfoWorkZL=  driver.findElement(By.tagName("body")).getText();
            String InfoWorkZL_Et = "This XML file does not appear to have any style information associated with it. The document tree is shown below.\n" +
                    "<vir:InfoWorkZL xmlns:vir=\"http://kvs.pfr.com/work-fact/1.0.1\">\n" +
                    "<vir:Lastname>-581498941</vir:Lastname>\n" +
                    "<vir:Firstname>-1894049236</vir:Firstname>\n" +
                    "<vir:Patronymic>1797973543</vir:Patronymic>\n" +
                    "<vir:SNILS>11608660343</vir:SNILS>\n" +
                    "<vir:Period_from>10.2016</vir:Period_from>\n" +
                    "<vir:Period_to>02.2017</vir:Period_to>\n" +
                    "<vir:InfoWork>\n" +
                    "<vir:Year>2016</vir:Year>\n" +
                    "<vir:Month>10</vir:Month>\n" +
                    "<vir:Insurant>\n" +
                    "<vir:Insurant_INN>040601785895</vir:Insurant_INN>\n" +
                    "<vir:Insurant_KPP/>\n" +
                    "<vir:Insurant_Name/>\n" +
                    "<vir:Insurant_Address>649105 - - - - БОЛЬНИЧНЫЙ ПЕР 4 А -</vir:Insurant_Address>\n" +
                    "</vir:Insurant>\n" +
                    "</vir:InfoWork>\n" +
                    "<vir:InfoWork>\n" +
                    "<vir:Year>2016</vir:Year>\n" +
                    "<vir:Month>11</vir:Month>\n" +
                    "<vir:Insurant>\n" +
                    "<vir:Insurant_INN>040601785895</vir:Insurant_INN>\n" +
                    "<vir:Insurant_KPP/>\n" +
                    "<vir:Insurant_Name/>\n" +
                    "<vir:Insurant_Address>649105 - - - - БОЛЬНИЧНЫЙ ПЕР 4 А -</vir:Insurant_Address>\n" +
                    "</vir:Insurant>\n" +
                    "</vir:InfoWork>\n" +
                    "<vir:InfoWork>\n" +
                    "<vir:Year>2016</vir:Year>\n" +
                    "<vir:Month>12</vir:Month>\n" +
                    "<vir:Insurant>\n" +
                    "<vir:Insurant_INN>040601785895</vir:Insurant_INN>\n" +
                    "<vir:Insurant_KPP/>\n" +
                    "<vir:Insurant_Name/>\n" +
                    "<vir:Insurant_Address>649105 - - - - БОЛЬНИЧНЫЙ ПЕР 4 А -</vir:Insurant_Address>\n" +
                    "</vir:Insurant>\n" +
                    "</vir:InfoWork>\n" +
                    "<vir:InfoWork>\n" +
                    "<vir:Year>2017</vir:Year>\n" +
                    "<vir:Month>1</vir:Month>\n" +
                    "<vir:Insurant>\n" +
                    "<vir:Insurant_INN>040601785895</vir:Insurant_INN>\n" +
                    "<vir:Insurant_KPP/>\n" +
                    "<vir:Insurant_Name/>\n" +
                    "<vir:Insurant_Address>649105 - - - - БОЛЬНИЧНЫЙ ПЕР 4 А -</vir:Insurant_Address>\n" +
                    "</vir:Insurant>\n" +
                    "</vir:InfoWork>\n" +
                    "<vir:InfoWork>\n" +
                    "<vir:Year>2017</vir:Year>\n" +
                    "<vir:Month>2</vir:Month>\n" +
                    "<vir:Insurant>\n" +
                    "<vir:Insurant_INN>040601785895</vir:Insurant_INN>\n" +
                    "<vir:Insurant_KPP/>\n" +
                    "<vir:Insurant_Name/>\n" +
                    "<vir:Insurant_Address>649105 - - - - БОЛЬНИЧНЫЙ ПЕР 4 А -</vir:Insurant_Address>\n" +
                    "</vir:Insurant>\n" +
                    "</vir:InfoWork>\n";
                 

            if (InfoWorkZL.contains(InfoWorkZL_Et)) {

                System.out.println("muy bien ");
                TimeUnit.SECONDS.sleep(1);

            }

            else {
                System.out.println(InfoWorkZL+ "\n" +" ---------------------- "  + "\n"+ "Не соответствует ожидаемрму результату" + "\n" + InfoWorkZL_Et);
                driver.quit();
            }

            
            
            
            
            
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


