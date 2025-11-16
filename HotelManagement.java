package pk.org.cas.Hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelManagement {
    private int quantity;
    private int price;
    private int topping;
    private double totalPrice;
    private String itemName;
    private char choice;


    Scanner scanner = new Scanner(System.in);

    public void setTopping(int topping) {
        this.topping = topping;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTopping() {
        return topping;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public HotelManagement(int quantity) {
        this.quantity = quantity;
    }

    public HotelManagement() {
    }

    public HotelManagement(double totalPrice, int topping) {
        this.totalPrice = totalPrice;
        this.topping = topping;
    }

    public HotelManagement(int topping, double totalPrice, int quantity) {
        this.topping = topping;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public HotelManagement(int price, String itemName, double totalPrice) {
        this.price = price;
        this.itemName = itemName;
        this.totalPrice = totalPrice;
    }

    public HotelManagement(int quantity, int topping, double totalPrice, String itemName, int price) {
        this.quantity = quantity;
        this.topping = topping;
        this.totalPrice = totalPrice;
        this.itemName = itemName;
        this.price = price;
    }

    public void setItems() {
        System.out.println("1-large pizza (2400)");
        System.out.println("2-small pizza (1500)");
        System.out.println("3-medium pizza (1800)");
        System.out.println("4-biryani (500)");
        System.out.println("5-palao (800 per kg)");
        System.out.println("6-zinger burger (270)");
        System.out.println("7-Samosa (70 per plate)");
        System.out.println("8-chicken fingers (400 1kg box)");
        System.out.println("9-loaded fries (300 per plate)");
        System.out.println("10-chicken roll (40)");
        System.out.println("11-Fruit Cake (400 per pound)");
        System.out.println("12-chocolate cake(600 per pound)");
        System.out.println("13-pepsi (150 of 1 Litter)");
        System.out.println("14-coke (140 per litter)");
        System.out.println("15-Fanta ( 140 per litter)");
        System.out.println("16-gourmet cola (120 per litter)");
        System.out.println("17-String (90 per 500 ml)");

        ArrayList<String> itemNameArray = new ArrayList<>();
        ArrayList<Integer> priceArray = new ArrayList<Integer>();

        do {
            System.out.print("Select an item: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    itemName = "large pizza";
                    price = 2400;
                    System.out.print("can you add extra topping (yes or no): ");
                    char toppingChoice = scanner.next().charAt(0);
                    if (toppingChoice == 'y' || toppingChoice == 'Y') {
                        topping = 300;
                        price += topping;
                        System.out.println("You choose extra cheeze and chicken piece topping and price is " + topping);
                        break;
                    } else {
                        System.out.println("You do not add any extra topping");
                    }
                    break;
                case 2:
                    itemName = "small pizza";
                    price = 1500;
                    System.out.print("can you add extra topping (yes or no): ");
                    char toppingChoiceForSmallPizza = scanner.next().charAt(0);
                    if (toppingChoiceForSmallPizza == 'y' || toppingChoiceForSmallPizza == 'Y') {
                        topping = 200;
                        price += topping;
                        System.out.println("You choose extra cheeze and extra Mashroom and price is " + topping);
                        break;
                    } else {
                        System.out.println("You do not add any extra topping");
                    }
                    break;
                case 3:
                    itemName = "medium pizza";
                    price = 1800;
                    System.out.print("can you add extra topping (yes or no): ");
                    char toppingChoiceForMediumPizza = scanner.next().charAt(0);
                    if (toppingChoiceForMediumPizza == 'y' || toppingChoiceForMediumPizza == 'Y') {
                        topping = 150;
                        price += topping;
                        System.out.println("You choose extra cheeze and price is " + topping);
                        break;
                    } else {
                        System.out.println("You do not add any extra topping");
                    }
                    break;
                case 4:
                    itemName = "Biryani";
                    price = 500;
                    break;
                case 5:
                    itemName = "palao";
                    price = 800;
                    break;
                case 6:
                    itemName = "Zinger Burger";
                    price = 270;
                    break;
                case 7:
                    itemName = "Samosa";
                    price = 70;
                    break;
                case 8:
                    itemName = "Chicken Fingers";
                    price = 400;
                    break;
                case 9:
                    itemName = "Loaded fries";
                    price = 300;
                    break;
                case 10:
                    itemName = "Chicken Roll";
                    price = 40;
                    break;
                case 11:
                    itemName = "Fruit Cake";
                    price = 400;
                    break;
                case 12:
                    itemName = "Chocolate Cake";
                    price = 600;
                    break;
                case 13:
                    itemName = "Pepsi";
                    price = 150;
                    break;
                case 14:
                    itemName = "Coke";
                    price = 140;
                    break;
                case 15:
                    itemName = "Fanta";
                    price = 140;
                    break;
                case 16:
                    itemName = "gourmet cola";
                    price = 120;
                    break;
                case 17:
                    itemName = "String";
                    price = 90;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            itemNameArray.add(itemName);
            priceArray.add(price);

            System.out.print("Would you like to order anything else: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        for (int i = 0; i < itemNameArray.size(); i++) {
            System.out.println("Selected item = " + itemNameArray.get(i) + " and price = " + priceArray.get(i));
        }
        for (int p : priceArray) {
            totalPrice += p;
        }
        System.out.println("Total price of item which you order = " + totalPrice);
        System.out.println("----Thanks for order Enjoy your meal----");
    }
}