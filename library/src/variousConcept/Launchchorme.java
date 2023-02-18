package variousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchorme {

 public static void main(String[] args) {
	
//	 System.setproperty("C:\\Users\\israt\\Sep2023_Selenium\\1st_selenium\\driver\\chromedriver.exe")
	 Scanner scn = new Scanner(System.in);
         WebDriver driver = new ChromeDriver();
    driver.get("https://www.selenium.dev/");
//   maximize
    
    driver.manage().window().maximize();
//   minimize
    driver.manage().window().minimize();
 
 
     driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
   
     
     driver.close();
     
     
     
}

 
}