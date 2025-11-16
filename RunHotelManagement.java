package pk.org.cas.Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RunHotelManagement {
    public static void main(String[] args) throws InterruptedException {
        FoodAppLoginPage foodAppLoginPage = new FoodAppLoginPage();
        foodAppLoginPage.login();
        HotelManagement hotelManagement = new HotelManagement();
        hotelManagement.setItems();
//        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","@H6h7190");
//            System.out.println(connection);
//        } catch (Exception e) {
//            System.out.println("error = "+e);
//        }


    }
}
