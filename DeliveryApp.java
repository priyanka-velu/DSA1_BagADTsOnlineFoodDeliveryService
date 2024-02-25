import java.util.Scanner;

public class DeliveryApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Can of Soup", 4.99);
        Item item2 = new Item("Bread", 3.59);
        cart.addItem(item1);
        cart.addItem(item2);

        Scanner scanner = new Scanner(System.in);

        // Adding items
        System.out.println("Add items to the cart (press 'q' to quit):");
        while (true) {
            System.out.print("Enter item name (or 'q' to quit): ");
            String itemName = scanner.nextLine();
            if (itemName.equals("q")) {
                break;
            }

            System.out.print("Enter item price: ");
            double itemPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            Item newItem = new Item(itemName, itemPrice);
            cart.addItem(newItem);
            System.out.println("Item added to cart.");
        }

        // Displaying items in the cart
        System.out.println("\nItems in the cart:");
        for (Item item : cart.getItems()) {
            System.out.println(item);
        }

        // Removing an item from the cart
        boolean removed = cart.removeItem(item1);
        if (removed) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Failed to remove item. Item not found in the cart.");
        }

        // Update Items
        System.out.println("\nUpdated items in the cart:");
        for (Item item : cart.getItems()) {
            System.out.println(item);
        }

        scanner.close();
    }
}
