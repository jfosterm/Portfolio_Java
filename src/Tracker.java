import java.util.*;

public class Tracker {
    private Map<String, Ticker> tickers;

    /**
     * Creates a new instance of a datastructure holding Tickers
     */
    public Tracker(){
        tickers = new HashMap<>();
    }

    /**
     * Adds ticker to the tickers datastructure
     * @param ticker to be added to the datastructure
     */
    public void add(Ticker ticker){
        tickers.put(ticker.getTickerSymbol(), ticker);
    }

    /**
     * Get method for retrieving ticker information based on the ticker symbol "APPL"
     * @param tickerName
     * @return returns the Ticker object for the given ticker
     */
    public Ticker get(String tickerName){
        tickerName = tickerName.toUpperCase();
        return tickers.get(tickerName);
    }

    /**
     * Prints information of all Tickers to terminal
     */
    public void printTickers(){
        for(Ticker ticker : tickers.values()){
            ticker.display();
        }
    }

}
