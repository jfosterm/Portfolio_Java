public class Ticker {
    private String tickerSymbol;
    private int price;
    private int holdings;
    public Ticker(String tickerSymbol, int price,  int holdings) {
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.price = price;
        this.holdings = holdings;
    }

    /**
     * Returns the ticker objects name
     * @return tickerSymbol
     */
    public String getTickerSymbol(){
        return tickerSymbol;
    }

    /**
     * Gets ticker price
     * @return ticker price
     */
    public int getPrice(){
        return price;
    }

    /**
     * Returns value of holdings ticker
     * @return holdings * current price
     */
    public int getHoldingsValue(){
        return price*holdings;
    }

    public void display(){
        System.out.println("Ticker symbol: " + tickerSymbol);
        System.out.println("Current price: " + price);
        System.out.println("Holdings: " + holdings);
        System.out.println("Current value: "+getHoldingsValue());
        System.out.println("--------------------");
    }

}
