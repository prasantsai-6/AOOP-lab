package browsinghistory;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowsingHistory {
    private Deque<String> history;
    private String currentPage;

    public BrowsingHistory() {
        history = new ArrayDeque<>();
        currentPage = null;
    }

    public void visitPage(String page) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = page;
    }

    public void goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
        }
    }

    public void goForward(String page) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = page;
    }

    public void displayCurrentPage() {
        System.out.println("Current page: " + currentPage);
    }

    public static void main(String[] args) {
        BrowsingHistory history = new BrowsingHistory();
        history.visitPage("Page 1");
        history.visitPage("Page 2");
        history.goBack();
        history.displayCurrentPage();
        history.goForward("Page 3");
        history.displayCurrentPage();
    }
}
