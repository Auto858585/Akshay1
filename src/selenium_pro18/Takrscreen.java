package selenium_pro18;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Takrscreen {
	
public static void takescrees(String name,WebDriver driver) throws IOException
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File scree = ts.getScreenshotAs(OutputType.FILE);
	          File saveshot= new File("./Screenshotbule/"+name+".png");
	          Files.copy(scree, saveshot);
	
}

}
