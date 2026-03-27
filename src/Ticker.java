public class Ticker {
    private String tickerName;
    private int price;
    public Ticker(String tickerName, int price){
        this.tickerName = tickerName.toUpperCase();
        this.price = price;
    }
    public String getTickerName(){
        return tickerName;
    }
    public int getPrice(){
        return price;
    }
}
