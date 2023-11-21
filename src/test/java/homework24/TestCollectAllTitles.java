package homework24;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.io.FileWriter;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestCollectAllTitles extends InitialWebDriver {
    @Test
    public void testCollectAllTitles() throws IOException {
        driver.get("https://rozetka.com.ua/");

        WebElement computersNotebooks = driver.findElement(By.xpath("//rz-main-page-sidebar//a[contains(@href, 'computers-notebooks')]"));
        computersNotebooks.click();

        WebElement notebooks = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='tile-cats__picture ng-star-inserted'])[1]")));
        notebooks.click();

        List<WebElement> titlesList = webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class = 'goods-tile__title']")));
        List<WebElement> pricesList = driver.findElements(By.xpath("//span[@class='goods-tile__price-value']"));

        Map<String, String> productsMap = new LinkedHashMap<>();
        for (int i = 0; i < titlesList.size(); i++) {
            String title = titlesList.get(i).getText().trim();
            String price = pricesList.get(i).getText().replace("₴", "");
            productsMap.put(title, price);
        }

        writeProductsToFile(productsMap, "testResult.txt");
    }

    private void writeProductsToFile(Map<String, String> productsMap, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter("src/test/java/homework24/testResult.txt");
            for (Map.Entry<String, String> product : productsMap.entrySet()) {
                fileWriter.write(product.getKey() + " " + product.getValue() + "\n");
            }
            fileWriter.close();
            System.out.println("Data successfully written to file " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing data to file " + fileName);
        }
    }
}

