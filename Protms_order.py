# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re


class UntitledTestCase(unittest.TestCase):
    def setUp(self):
       # self.driver = webdriver.Firefox()
        self.driver = webdriver.Chrome()
        self.driver.implicitly_wait(30)
        self.base_url = "https://protms.ru/"
        self.verificationErrors = []
        self.accept_next_alert = True
        self.driver.maximize_window()
    def test_untitled_test_case(self):
        driver = self.driver
        driver.get(self.base_url)
        time.sleep(1)
       # driver.find_element_by_xpath("(//button[@type='button'])[2]").click() #("//*[contains(text(), 'My Button')]")
        time.sleep(1)
        driver.find_element_by_xpath("//button[contains(text(), 'Войти')]").click()
        time.sleep(1)
        driver.find_element_by_name("email").clear()
        driver.find_element_by_name("email").send_keys("0000000044@mail.ru")
        time.sleep(1)

        driver.find_element_by_xpath("//*[contains(text(), 'Отправить')]").click()
       # driver.find_element_by_partial_link_text("Отправить").click()
       # driver.find_element_by_class_name("md-ink-ripple").click()
        time.sleep(1)
        driver.find_element_by_name("password").clear()
        driver.find_element_by_name("password").send_keys("123456Q!")
        time.sleep(1)
        driver.find_element_by_xpath("//*[contains(text(), 'Отправить')]").click()
        #driver.find_element_by_xpath("//button[@type='button'][text()[/div/div/div[2]/button/span").click()
        time.sleep(3)

        i = 1
        for i in range(1000):
           # driver.find_element_by_xpath("(//button[@type='button'])[6]").click()
            driver.find_element_by_xpath("//*[contains(text(), 'Создать из шаблона')]").click()
            time.sleep(1)
           # driver.find_element_by_link_text("1").click()
            driver.find_element_by_xpath("(//a[contains(text(),'1')])[2]").click()
            time.sleep(1)

            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div/div[2]/div/div/div[2]/div/div").click()
            time.sleep(1)
           # print("1")
            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div[2]/button/span").click()
            time.sleep(1)
          #  driver.find_element_by_xpath("(//button[@type='button'])[8]").click()
           # time.sleep(1)
            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[2]/div/div/div/div/div/input").click()
            time.sleep(1)
         #  driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[2]/div/div/div/div/div/input").clear()
          #  time.sleep(1)
            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[2]/div/div/div/div/div/input").send_keys(
                "Dunkerque")
            time.sleep(1)

            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[2]/div/div/div/div/div[2]/input").click()
            time.sleep(1)
           # driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[2]/div/div/div/div/div[2]/input").clear()
           #cvghg time.sleep(1)
            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[2]/div/div/div/div/div[2]/input").send_keys(
                "80 Avenue Edmond Flamand, 59430 Dunkerque")
            time.sleep(1)
            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div[2]/button[2]/span").click()
            time.sleep(1)
            driver.find_element_by_xpath("(//button[@type='button'])[10]").click()
            time.sleep(1)


            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[2]/div/table/tbody/tr/td/div/div").click()
            time.sleep(1)
            driver.find_element_by_xpath("(//button[@type='button'])[6]").click()
            time.sleep(1)
            driver.find_element_by_xpath("//input[@type='text']").click()
            time.sleep(1)

            driver.find_element_by_xpath("//input[@type='text']").send_keys("90 000")
            time.sleep(1)
            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[3]/div/div/label/div/div/div/div").click()
            time.sleep(1)
            driver.find_element_by_xpath("//div[@id='app']/div/div/div/div/div[3]/div[2]/button[2]/span").click()
            time.sleep(1)
            print("order# ="+" "+str(i))
        driver.close()







    def is_element_present(self, how, what):
        try:
            self.driver.find_element(by=how, value=what)
        except NoSuchElementException as e:
            return False
        return True

    def is_alert_present(self):
        try:
            self.driver.switch_to_alert()
        except NoAlertPresentException as e:
            return False
        return True

    def close_alert_and_get_its_text(self):
        try:
            alert = self.driver.switch_to_alert()
            alert_text = alert.text
            if self.accept_next_alert:
                alert.accept()
            else:
                alert.dismiss()
            return alert_text
        finally:
            self.accept_next_alert = True

    def tearDown(self):
        self.driver.quit()
        self.assertEqual([], self.verificationErrors)


if __name__ == "__main__":
    unittest.main()
