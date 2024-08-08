import java.util.*;
import java.sql.*;

public class StoreDetails {
    public static void main(String[] args) {
        StoreDetails storeDetails = new StoreDetails();
        storeDetails.registerUser();
        storeDetails.login();
    }

    public void registerUser() {
        System.out.println("Registration successful");
    }

    public void login() {
        System.out.println("Login successful");
    }
}