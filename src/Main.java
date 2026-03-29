void main() {
    Tracker tracker = new Tracker();
    Ticker t1 = new Ticker("appl", 200, 20);
    Ticker t2 = new Ticker("googl", 180, 30);
    Ticker t3 = new Ticker("nvidia", 50, 40);
    Ticker t4 = new Ticker("amzn", 300, 10);
    tracker.add(t1);
    tracker.add(t2);
    tracker.add(t3);
    tracker.add(t4);
    tracker.printTickers();
}