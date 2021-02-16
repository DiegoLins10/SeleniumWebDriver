package SeleniumAuto;

/*
 * @Author Diego Lins 15/02/2021
 */

import java.awt.Robot;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Eventos {

	public static WebDriver driver=null;
	Robot roobot=null;
	
	
	public void AbrirNavegador (String url, String Navegador) {
		try {
			//abrir pagina pela Internet Explorer
			if(Navegador.equals("IE")){
				File file = new File ("C:/Users/DiegoLins/OneDrive - Fatec Centro Paula Souza/Desktop/Faculdade/Selenium/drive/IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				driver = new InternetExplorerDriver(capabilities);
				//driver.manage().window().maximize();
				driver.get(url);
				System.out.println("Conexão feita com sucesso");
			}
			//abrir pagina pelo Google Chrome
			else if(Navegador.equals("chrome")){
				File file = new File ("C:/Users/DiegoLins/OneDrive - Fatec Centro Paula Souza/Desktop/Faculdade/Selenium/driver2/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				ChromeOptions options = new ChromeOptions();
				driver = new ChromeDriver(options);
				//options.addArguments("--start-maximized");
				driver.get(url);
				System.out.println("Conexão feita com sucesso");
			}
			
		} catch(Exception e) {
			// TODO: handle exception
			System.out.println("Erro nao esperado: " + e);
		}
	}
}
