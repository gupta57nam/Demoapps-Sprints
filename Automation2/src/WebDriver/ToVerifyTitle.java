package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedTitle="Google";
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String actualTitle = driver.getTitle();
		System.out.println("The actual tite is:"+actualTitle);
		System.out.println("The expected tite is:"+expectedTitle);
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass: thetitle is verified");
		}
		else
			System.out.println("Pass: thetitle is not verified");

		
		
		
		
		
		
		
		
		
		
		

	}

}
