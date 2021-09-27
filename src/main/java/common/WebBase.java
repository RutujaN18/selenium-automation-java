package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class WebBase {

	@DataProvider(name = "Login Data")

	public String[][] getLoginData() {
		String LoginData[][] = { { "Admin", "admin123" }, { "admin", "admin123" } };
		return LoginData;
	}

	@DataProvider(name = "LoginCSVData")
	public String[][] getLoginCSVData() throws IOException {

		String fileName = "C:\\Users\\Rutuja\\eclipse-workspace\\selenium-automation-framework2\\src\\main\\resources\\LoginData.txt";
		File file = new File(fileName); // get file metadata
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String loginData[][] = new String[3][2];
		String line;

		int i = 0;
		while ((line = br.readLine()) != null) {
			String[] data = line.split(",");
			loginData[i] = data;
			i++;
		}
		return loginData;

	}
}