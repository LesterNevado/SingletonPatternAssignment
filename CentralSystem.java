public class CentralSystem {
    public static void main(String[] args) {
        // instantiate HelpDesk
        HelpDesk helpDesk = HelpDesk.getInstance();

        // serve 6 customers
        helpDesk.serveNextCustomer("Help Desk 1");
        helpDesk.serveNextCustomer("Help Desk 2");
        helpDesk.serveNextCustomer("Help Desk 3");
        helpDesk.serveNextCustomer("Help Desk 1");
        helpDesk.serveNextCustomer("Help Desk 2");
        helpDesk.serveNextCustomer("Help Desk 3");

        // show current queue number
        helpDesk.currentQueueNumber();

        // reset queue number to 0
        helpDesk.resetQueueNumber(0);

        // serve customers at new queue number
        helpDesk.serveNextCustomer("Help Desk 1");
        helpDesk.serveNextCustomer("Help Desk 2");
        helpDesk.serveNextCustomer("Help Desk 3");
    }
}
