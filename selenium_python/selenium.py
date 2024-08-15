from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.edge.service import Service as EdgeService
import time

def main():
    edge_driver_path = "C:\\Users\\dinhh\\OneDrive\\Desktop\\ktnc\\advance_test\\edgedriver_win64\\msedgedriver.exe"
    
    service = EdgeService(executable_path=edge_driver_path)
    driver = webdriver.Edge(service=service)
    
    try:
        driver.get("https://www.youtube.com")
        
        search_box = driver.find_element(By.NAME, "search_query")
        
        search_box.send_keys("kiểm thử nâng cao package lab7")
        
        search_button = driver.find_element(By.ID, "search-icon-legacy")
        search_button.click()
        
        
    except Exception as e:
        print(e)
    finally:
        driver.quit()

if __name__ == "__main__":
    main()