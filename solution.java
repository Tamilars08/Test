package InterviewQuestions;

import java.time.Duration;

public class solution {
	//public static int main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
//		//span[text()='Apple iPhone 11 (128GB) - Black']//ancestor::h2//parent::div//following-sibling::div//following-sibling::div//child::a//child::span//child::span
//		String searchBoxId = "twotabsearchtextbox";
//		String priceXpath = "//span[text()='Apple iPhone 11 (128GB) - Black']//ancestor::h2//parent::div//following-sibling::div[@class=\"sg-row\"]//child::div[@class=\"a-row a-size-base a-color-base\"]//child::a//child::span[@class=\"a-price\"]";
//
//		driver.findElement(By.id(searchBoxId)).sendKeys("iphone \n");
//		System.out.println(driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (128GB) - Black']//ancestor::h2//parent::div//following-sibling::div//following-sibling::div//child::a[1]//child::span")).getText());
		int solution( ) {
			int x= 10;
			int y = 12;
			int[] a = {1,2,3,4};
			
	        int N = a.length;
	        int result = -1;
	        int nX = 0;
	        int nY = 0;
	        for (int i = 0; i < N; i++) {
	            if (a[i] == x)
	                nX += 1;
	            else if (a[i] == y)
	                nY += 1;
	            if (nX == nY)
	                result = i;
	        }
	        return result;
	    }
		public static void main(String[] args) {
			solution s = new solution();
			
		}
	}


