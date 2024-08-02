package Lab4_Michael_Zhao;

import java.util.LinkedList;
import java.util.Queue;

public class HelpDesk {
    private Queue<String> helpdeskQueue;

    public HelpDesk() {
        helpdeskQueue = new LinkedList<>();
    }

    // Add a request
    public void addRequest(String request) {
        helpdeskQueue.add(request);
        System.out.println("Added request: " + request);
    }

    // Process the request
    public void processRequest() {
        if (helpdeskQueue.isEmpty()) {
            System.out.println("No requests to process.");
        } else {
            String request = helpdeskQueue.poll();
            System.out.println("Processed request: " + request);
        }
    }

    // Print all requests
    public void printRequests() {
        if (helpdeskQueue.isEmpty()) {
            System.out.println("No requests in the queue.");
        } else {
            System.out.println("Current requests in the queue: ");
            for (String request : helpdeskQueue) {
                System.out.println(request);
            }
        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();

        Queue<String> helpdeskQueue = new LinkedList<>();
        // request can be added to helpdeskQueue and should be processed
        // you don't need to make it complicated; however, encouraged to be creative.
        // Help desk receives requests from customers and processes them in the order
        // they were received.

        helpDesk.addRequest("Reset password");
        helpDesk.addRequest("Cannot connect to VPN");
        helpDesk.addRequest("Software installation issue");
        helpDesk.printRequests();
        helpDesk.processRequest();
        helpDesk.processRequest();
        helpDesk.printRequests();
        helpDesk.processRequest();
        helpDesk.processRequest();
    }
}