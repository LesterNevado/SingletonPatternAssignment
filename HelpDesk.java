public class HelpDesk {
    private static HelpDesk instance;
    private int queueNumber = 0;

    // prevent instantiation outside class
    private HelpDesk() {
    }

    // get HelpDesk instantiation
    public static synchronized HelpDesk getInstance() {
        if (instance == null)
            instance = new HelpDesk();
        return instance;
    }

    // show current queue number
    public synchronized void currentQueueNumber() {
        System.out.println("Current Queue Number: " + queueNumber);
    }

    // serve next customer and increment queue number
    public synchronized void serveNextCustomer(String desk) {
        queueNumber++;
        System.out.println("Serving Customer: " + queueNumber + " on " + desk);
    }

    // reset queue number
    public synchronized void resetQueueNumber(int num) {
        queueNumber = num;
        System.out.println("Reset Queue Number to " + queueNumber);
    }
}