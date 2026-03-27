public class Ticker {
    private String tickerSymbol;
    private int price;
    public Ticker(String tickerSymbol, int price){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.price = price;
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

    public void display(){
        System.out.println(tickerSymbol);
        System.out.println(price);
    }

}
