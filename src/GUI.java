import javax.swing.*;
public class GUI {
    /** The main panel for the GUI**/
    private JPanel mainPanel;
    /** main frame for GUI**/
    private JFrame mainFrame, options;

    /** button that shows price**/
    private JButton priceButton;

    /** Price label **/
    private JLabel priceLabel;

    /** Menubar for main frame**/
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem addTicker, printTicker;

    /** Reference to the Tracker instance**/
    private Tracker tracker;

    /** Main GUI for stock portfolio project**/
    public GUI(Tracker tracker) {
        this.tracker = tracker;
        mainFrame = new JFrame("Stock Portfolio");
        menuBar = createMenuBar();
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1920, 1080);
        mainFrame.setVisible(true);
    }

    public JMenuBar createMenuBar(){
        menuBar = new JMenuBar();
        menu = new JMenu("Options");
        addTicker = new JMenuItem("Show Price");
        printTicker = new JMenuItem("Print Ticker");
        addTicker.addActionListener(e -> {});
        printTicker.addActionListener(e -> {tracker.printTickers();});
        menu.add(addTicker);
        menuBar.add(menu);
        return menuBar;
    }
}
