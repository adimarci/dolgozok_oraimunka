import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/dolgozok";
        String user="root";
        String password="";
        try {
            Connection myConn= DriverManager.getConnection(url,user,password);
            Statement myStmt =myConn.createStatement();
            String sql ="SELECT * FROM `dolgozok`";
            ResultSet rs =myStmt.executeQuery(sql);
            System.out.println("Mondjon egy dolgozot:");
            Scanner sc=new Scanner(System.in);
            String keresettdolgozo=sc.nextLine();


            while (rs.next()){
                System.out.println(rs.getString("nev"));
                /*
                if (keresettdolgozo==rs.getString("nev")){
                    System.out.println("Van ilyen nevű dolgozó");
                }
                */

            }

        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
