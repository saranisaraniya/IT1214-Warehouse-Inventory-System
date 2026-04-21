import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        int choice = 0; 

        do {
            System.out.println("\n===== Warehouse Menu =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search by ID");
            System.out.println("5. Search by Name");
            System.out.println("6. Display All Items");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");

            // Handle invalid input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next(); 
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); 

                    inventory.addItem(new Item(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    String removeId = sc.nextLine();
                    inventory.removeItem(removeId);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String uid = sc.nextLine();

                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();
                    sc.nextLine(); 

                    inventory.updateQuantity(uid, newQty);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    String searchId = sc.nextLine();
                    inventory.searchById(searchId);
                    break;

                case 5:
                    System.out.print("Enter Name: ");
                    String searchName = sc.nextLine();
                    inventory.searchByName(searchName);
                    break;

                case 6:
                    inventory.displayAll();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}