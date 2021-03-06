package com.mtartag.scraper;

import javax.persistence.*;

@Entity
@Table(name = "stocks")
public class StockEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "last_price")
    private String lastPrice;

    @Column(name = "change_dollars")
    private String changeDollars;

    @Column(name = "change_percent")
    private String changePercent;

    @Column(name = "volume")
    private String volume;

    @Column(name = "average_volume")
    private String averageVolume;

    @Column(name = "market_cap")
    private String marketCap;

    @Column(name = "scrape_date")
    private String scrapeDate;

    // Constructors

    public StockEntity() {

    }

    public StockEntity(int id, String symbol, String lastPrice, String changeDollars, String changePercent, String volume, String averageVolume, String marketCap, String scrapeDate) {
        this.id = id;
        this.symbol = symbol;
        this.lastPrice = lastPrice;
        this.changeDollars = changeDollars;
        this.changePercent = changePercent;
        this.volume = volume;
        this.averageVolume = averageVolume;
        this.marketCap = marketCap;
        this.scrapeDate = scrapeDate;
    }

    // Getters + Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getChangeDollars() {
        return changeDollars;
    }

    public void setChangeDollars(String changeDollars) {
        this.changeDollars = changeDollars;
    }

    public String getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(String changePercent) {
        this.changePercent = changePercent;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getAverageVolume() {
        return averageVolume;
    }

    public void setAverageVolume(String averageVolume) {
        this.averageVolume = averageVolume;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }
    public String getScrapeDate() {
        return scrapeDate;
    }

    public void setScrapeDate(String scrapeDate) {
        this.scrapeDate = scrapeDate;
    }

    // Print Stock Method

    public void stockReport() {
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Last Price: " + this.lastPrice);
        System.out.println("Dollar Change: " + this.changeDollars);
        System.out.println("Percent Change: " + this.changePercent);
        System.out.println("Volume: " + this.volume);
        System.out.println("Avg Volume: " + this.averageVolume);
        System.out.println("Market Cap: " + this.marketCap);
        System.out.println("Date: " + this.scrapeDate);
        System.out.println("----------------");
    }
}

