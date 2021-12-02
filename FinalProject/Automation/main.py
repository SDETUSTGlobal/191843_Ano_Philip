from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
print("test case started")
#open Google Chrome browser
driver = webdriver.Chrome("D://chromedriver_win32(1)//chromedriver.exe")
#maximize the window size
driver.maximize_window()
#delete the cookies
driver.delete_all_cookies()
#navigate to the url
driver.get("http://127.0.0.1:5000/")
#identify the user name text box and enter the value
driver.find_element_by_id("+").send_keys("Rahul")
time.sleep(2)
driver.find_element_by_name("b").send_keys("545856")
time.sleep(2)
driver.find_element_by_xpath("/html/body/form/input[3]").send_keys("UST Global")
time.sleep(2)
driver.find_element_by_xpath("/html/body/form/input[4]").send_keys("ahu@gmail.com")
time.sleep(2)
driver.find_element_by_class_name("bt").click()
time.sleep(2)
driver.close()
print("successfully completed")