package com.mtartag.scraper;

public class App {
    public static void main(String[] args) {
        Scraper scraper = new Scraper();
        scraper.login();
        scraper.scrapePage();
        scraper.quitDriver();
    }
}
