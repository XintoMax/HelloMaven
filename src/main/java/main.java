import java.sql.Connection;
import java.sql.DriverManager;

public class main {
    public static void main(String[] args){
        System.out.println("Hello Maven");


        Connection connection = null;

        String url = "jdbc:sqlite:src/main/resources/student.db";
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("Connection success!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }





    }
}
