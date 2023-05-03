import java.util.ArrayList;
import java.util.List;

public class BookCart {
    private List<Pair<Integer, String>> cart_list;

    public BookCart() {
        cart_list = new ArrayList<>();
    }

    public void showList() {
        System.out.println("=== Book Cart List ===");
        for (Pair<Integer, String> item : cart_list) {
            System.out.println("ID: " + item.getKey() + ", Title: " + item.getValue());
        }
        System.out.println("======================");
    }

    public void loanList() {
        System.out.println("=== Loan Book List ===");
        for (Pair<Integer, String> item : cart_list) {
            System.out.println("Loaning book ID: " + item.getKey() + ", Title: " + item.getValue());
        }
        System.out.println("======================");
    }

    public void removeList() {
        System.out.println("=== Remove Book List ===");
        for (Pair<Integer, String> item : cart_list) {
            System.out.println("Removing book ID: " + item.getKey() + ", Title: " + item.getValue());
        }
        cart_list.clear();
        System.out.println("========================");
    }

    public void addBook(int id, String title) {
        cart_list.add(new Pair<Integer, String>(id, title));
        System.out.println("Book ID: " + id + ", Title: " + title + " has been added to the cart.");
    }
}
