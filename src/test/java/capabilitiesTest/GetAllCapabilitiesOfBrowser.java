package capabilitiesTest;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllCapabilitiesOfBrowser {

	public static void main(String[] args)
	{

		//all the capabilities of chrome
		ChromeDriver driver=new ChromeDriver();
		
		Capabilities cap=driver.getCapabilities();
		
		Map<String,Object> all=cap.asMap();
		System.out.println(all);
		
		/*
		 * {acceptInsecureCerts=false,
		 *  browserName=chrome,
		 *   browserVersion=125.0.6422.142,
		 *    chrome={chromedriverVersion=125.0.6422.141 (4b1e83937122185343ba92e909b021f307c719ca-refs/branch-heads/6422@{#1186})
		 *    , userDataDir=C:\Users\Ganes\AppData\Local\Temp\scoped_dir38544_1193805294},
		 *     fedcm:accounts=true,
		 *      goog:chromeOptions={debuggerAddress=localhost:63358},
		 *       networkConnectionEnabled=false,
		 *        pageLoadStrategy=normal, 
		 *        platformName=windows, proxy=Proxy(),
		 *         se:cdp=ws://localhost:63358/devtools/browser/6aa4afc8-b7c9-47c4-bb24-a8b0d3e99d8e, 
		 *         se:cdpVersion=125.0.6422.142,
		 *          setWindowRect=true,
		 *          strictFileInteractability=false, 
		 *          timeouts={implicit=0, pageLoad=300000, script=30000},
		 *           unhandledPromptBehavior=dismiss and notify,
		 *            webauthn:extension:credBlob=true,
		 *             webauthn:extension:largeBlob=true, 
		 *             webauthn:extension:minPinLength=true,
		 *          webauthn:extension:prf=true,
		 *           webauthn:virtualAuthenticators=true}


		 */

	}

}
