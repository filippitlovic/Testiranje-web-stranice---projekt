import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", References.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "SignIn")
    public static void signIn() throws InterruptedException {
        driver.get(References.BASE_URL);
        driver.manage().window().maximize();
        WebTest webTest = new WebTest(driver);
        Thread.sleep(2000);
        webTest.signIn();
        Thread.sleep(1000);
        webTest.email();
        Thread.sleep(1000);
        webTest.pass();
        Thread.sleep(1000);
        webTest.send2();
        Thread.sleep(1000);
    }


    @Test(testName = "Search product")
    public static void searchProduct() throws InterruptedException {
        driver.get(References.BASE_URL);
        WebTest webTest = new WebTest(driver);
        ///search
        Thread.sleep(2000);
        webTest.searchInput();
        Thread.sleep(2000);
        webTest.searchButton();
        Thread.sleep(2000);
    }


    @Test(testName = "Filter product")
    public static void filterProduct() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(References.BASE_URL2);
        WebTest webTest = new WebTest(driver);
        webTest.filter();
        Thread.sleep(2000);
    }


    @Test(testName = "Add product to shopping cart")
    public static void addProduct() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(References.BASE_URL3);
        WebTest webTest = new WebTest(driver);
        Thread.sleep(2000);
        webTest.addProduct();
        Thread.sleep(1000);
    }

    @Test(testName = "Choose category")
    public static void chooseCategory() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(References.BASE_URL);
        WebTest webTest = new WebTest(driver);
        Thread.sleep(2000);
        webTest.chooseCategory();
        Thread.sleep(2000);
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }


}