import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTest extends PageObject{

    private final String SEARCH_INPUT = "torba";
    private final String EMAIL = "email@gmail.com";
    private final String PASS = "SGAGSA";

    //signIn
    @FindBy(xpath="/html/body/div[3]/header/div/div[2]/div/div[1]/a")
    private WebElement signIn;

    @FindBy( id="email")
    private WebElement email;

    @FindBy( id="pass")
    private WebElement pass;

    @FindBy( id="send2")
    private WebElement send2;

    //search
    @FindBy(id ="search")
    private WebElement search;

    @FindBy(xpath="//*[@id=\"search_mini_form\"]/div/div/div/button")
    private WebElement searchButton;


    //filter products
    @FindBy(xpath="//*[@id=\"narrow-by-list\"]/div[1]/dd/form/ul/li[1]/a")
    private WebElement filter;


    //add product
    @FindBy( id="product-addtocart-button")
    private WebElement addProduct;

    //choose category
    @FindBy(xpath="//*[@id=\"ui-id-3\"]/span[2]")
    private WebElement chooseCategory;


    public WebTest(WebDriver driver) {
        super(driver);
    }
    //sign in
    public void signIn(){
        this.signIn.click();
    }
    public void email(){ this.email.sendKeys(EMAIL);}
    public void pass(){ this.pass.sendKeys(PASS);}
    public void send2(){ this.send2.click();}
    //search
    public void searchInput(){
        this.search.sendKeys(SEARCH_INPUT);
     }
    public void searchButton(){ this.searchButton.click();}
    //filter
     public void filter(){ this.filter.click();}
    //add product
    public void addProduct(){ this.addProduct.click();}
    // choose category
    public void chooseCategory(){this.chooseCategory.click();}

}

