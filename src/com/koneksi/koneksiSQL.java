package com.koneksi;

import java.sql.*;
import com.mysql.jdbc.*;

public class koneksiSQL {
    private static Connection KONEKSI;
    private static Statement statement;
    private static ResultSet resultSet;

    public static Connection getKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://sql9.freemysqlhosting.net:3306/sql9384600";
            String user = "sql9384600";
            String passwd = "ElZ7eQfHsv";
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KONEKSI = DriverManager.getConnection(url,user,passwd);

        }catch (Exception e){
            System.err.println("Gagal Dalam Membuat Koneksi");
        }
        return KONEKSI;
    }

    public static void insertData(String query){

        try {
            statement = getKoneksi().createStatement();
            statement.execute(query);
            statement.close();
            KONEKSI.close();
        }catch (Exception e){
            System.out.println("Error Insert");
        }
    }

}
