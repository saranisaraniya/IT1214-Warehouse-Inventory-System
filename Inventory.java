//Inventory file
import java.util.HashMap;

public class Inventory {
    private HashMap<String, Item> items = new HashMap<>();

    
    public void addItem(Item item) {
        if (items.containsKey(item.getItemId())) {
            System.out.println("Item already exists!");
        } else {
            items.put(item.getItemId(), item);
            System.out.println("Item added successfully!");
        }
    }


    public void removeItem(String itemId) {
        if (items.remove(itemId) != null) {
            System.out.println("Item removed successfully!");
        } else {
            System.out.println("Item not found!");
        }
    }

    public void updateQuantity(String itemId, int newQty) {
        Item item = items.get(itemId);
        if (item != null) {
            item.setQuantity(newQty);
            System.out.println("Quantity updated!");
        } else {
            System.out.println("Item not found!");
        }
    }

    
    public void searchById(String itemId) {
        Item item = items.get(itemId);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found!");
        }
    }

    
    public void searchByName(String name) {
        boolean found = false;
        for (Item item : items.values()) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                System.out.println(item);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found!");
        }
    }

    
    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            for (Item item : items.values()) {
                System.out.println(item);
            }
        }
    }
}
