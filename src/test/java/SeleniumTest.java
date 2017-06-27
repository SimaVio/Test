import java.io.File;

/**
 * Created by vsima on 1/6/2017.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {
    @Test

    public void TestTitle1() {

        File src = new File("/usr/bin/phantomjs");
        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://192.168.50.11:8080/StudentGo/");
        String title1=driver.getTitle();
        Assert.assertTrue(title1.contains("StudentGo"));


    }
      @Test
    public void TestTitle2() {
        File src = new File("/usr/bin/phantomjs");
        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://192.168.50.11:8080/StudentGo/");
        String title2=driver.getTitle();
        Assert.assertTrue(title2.contains("StudentGo"));


    }
    @Test
    public void TestTitle3() {
        File src = new File("/usr/bin/phantomjs");
        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://192.168.50.11:8080/StudentGo/");
        String title3=driver.getTitle();
        Assert.assertTrue(title3.contains("StudentGo"));


    }
    @Test
    public void TestTitle4() {
        File src = new File("/usr/bin/phantomjs");
        System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
        WebDriver driver = new PhantomJSDriver();
        driver.get("http://192.168.50.11:8080/StudentGo/");
        String title4=driver.getTitle();
        Assert.assertTrue(title4.contains("StudentGo"));


    }
}
