package vn.iotstar.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnectMySQL {
        private static String USERNAME = "root";


        private static String PASSWORD = "1234";


        private static String DRIVER = "com.mysql.cj.jdbc.Driver";


        private static String URL = "jdbc:mysql://localhost:3306/database";



        public static Connection getConnection() throws SQLException {


                try {
                        Class.forName(DRIVER);
                } catch (ClassNotFoundException e) {


                        // TODO Auto-generated catch block


                        e.printStackTrace();


                }
                return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }

}