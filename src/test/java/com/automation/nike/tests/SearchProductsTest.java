package com.automation.nike.tests;

import com.automation.nike.pages.SearchProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductsTest extends BaseTest{

    SearchProductsPage searchProductsPage;

    @Test
    public void SearchProductsJordanTest() throws InterruptedException {
        searchProductsPage = new SearchProductsPage(driver);
        searchProductsPage.searchProducts("Jordan");

        Thread.sleep(5000);

        int product = 1;
        for(String results : searchProductsPage.getSearchResults()){
            Assert.assertTrue(results.contains("Jordan") , "Product: " + product + " does not contain Jordan");
            product++;
        }

    }

    @Test
    public void SearchProductsAirMaxTest() throws InterruptedException {
        searchProductsPage = new SearchProductsPage(driver);
        searchProductsPage.searchProducts("Air Max");

        Thread.sleep(5000);

        int product = 1;
        for(String results : searchProductsPage.getSearchResults()){
            Assert.assertTrue(results.contains("Air Max") , "Product: " + product + " does not contain Air Max");
            product++;
        }

    }

    @Test
    public void SearchProductsDunksTest() throws InterruptedException {
        searchProductsPage = new SearchProductsPage(driver);
        searchProductsPage.searchProducts("Dunk");

        Thread.sleep(5000);

        int product = 1;
        for(String results : searchProductsPage.getSearchResults()){
            Assert.assertTrue(results.contains("Dunk") , "Product: " + product + " does not contain Dunk");
            product++;
        }

    }

    @Test
    public void SearchProductsAirForceTest() throws InterruptedException {
        searchProductsPage = new SearchProductsPage(driver);
        searchProductsPage.searchProducts("Air Force");

        Thread.sleep(5000);

        int product = 1;
        for(String results : searchProductsPage.getSearchResults()){
            Assert.assertTrue((results.contains("Air Force") || results.contains("Force")) , "Product: " + product + " does not contain Air Force");
            product++;
        }

    }



}
