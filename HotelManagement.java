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
    private String address;
    private String nameOfPlace;


    Scanner scanner = new Scanner(System.in);

    public void setTopping(int topping) {
        this.topping = topping;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getNameOfPlace() {
        return nameOfPlace;
    }

    public HotelManagement(String nameOfPlace, char choice, String itemName, ArrayList<String> itemNameArray, int price) {
        this.nameOfPlace = nameOfPlace;
        this.choice = choice;
        this.itemName = itemName;
        this.itemNameArray = itemNameArray;
        this.price = price;
    }

    public HotelManagement(int quantity, int price, int topping, double totalPrice, String itemName, char choice, String address, String nameOfPlace) {
        this.quantity = quantity;
        this.price = price;
        this.topping = topping;
        this.totalPrice = totalPrice;
        this.itemName = itemName;
        this.choice = choice;
        this.address = address;
        this.nameOfPlace = nameOfPlace;
    }

    public void setNameOfPlace(String nameOfPlace) {
        this.nameOfPlace = nameOfPlace;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
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

    public HotelManagement(String address, String itemName, int price, int topping, double totalPrice, int quantity) {
        this.address = address;
        this.itemName = itemName;
        this.price = price;
        this.topping = topping;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
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

    ArrayList<String> itemNameArray = new ArrayList<String>();
    ArrayList<Integer> priceArray = new ArrayList<Integer>();

    public void choice() {
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
        System.out.println("17-String (90 per 500 ml) \n");

        do {
            System.out.print("Select an item: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    setItemName("Large pizza");
                    setPrice(2400);
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
                    setItemName("Small pizza");
                    setPrice(1500);
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
                    setItemName("Medium Pizza");
                    setPrice(1800);
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
                    setItemName("Biryani");
                    setPrice(500);
                    break;
                case 5:
                    setItemName("palao");
                    setPrice(800);
                    break;
                case 6:
                    setItemName("zinger Burger");
                    setPrice(270);
                    break;
                case 7:
                    setItemName("samosa");
                    setPrice(70);
                    break;
                case 8:
                    setItemName("Chicken Fingers");
                    setPrice(400);
                    break;
                case 9:
                    setItemName("Loaded fries");
                    setPrice(300);
                    break;
                case 10:
                    setItemName("Chicken Roll");
                    setPrice(40);
                    break;
                case 11:
                    setItemName("Fruit Cake");
                    setPrice(400);
                    break;
                case 12:
                    setItemName("Chocolate Cake");
                    setPrice(600);
                    break;
                case 13:
                    setItemName("pepsi");
                    setPrice(150);
                    break;
                case 14:
                    setItemName("Coke");
                    setPrice(140);
                    break;
                case 15:
                    setItemName("fanta");
                    setPrice(140);
                    break;
                case 16:
                    setItemName("gourmet cola");
                    setPrice(120);
                    break;
                case 17:
                    setItemName("String");
                    setPrice(90);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            itemNameArray.add(getItemName());
            priceArray.add(getPrice());

            System.out.print("Would you like to order anything else: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    public void setAddress() {
        System.out.print("Enter your address: ");
        setAddress(scanner.nextLine());
    }

    public void setItems() {
        System.out.println();
        for (int i = 0; i < itemNameArray.size(); i++) {
            System.out.println("Selected item = " + itemNameArray.get(i) + " and price = " + priceArray.get(i) + "\n");
        }
        System.out.println("----Thanks for order Enjoy your meal----");
    }

    public void setTotalBill() {
        for (int p : priceArray) {
            totalPrice += p;
        }
        System.out.println("The Total price of items ordered by you = " + totalPrice);
    }

    public void setAreaWhereYouOrderItem() {
        System.out.print("Enter your choice where you want to order: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'm', 'M':
                setNameOfPlace("Mac Donald's");
                break;
            case 'k', 'K':
                setNameOfPlace("KFC");
                break;
            case 'c', 'C':
                setNameOfPlace("Costa Corner");
                break;
            case 'f', 'F':
                setNameOfPlace("Fourteen Street");
                break;
            case 'p', 'P':
                setNameOfPlace("PizzaLogist");
                break;
            default:
                System.out.println("you entered a Wrong place");
        }
    }
}