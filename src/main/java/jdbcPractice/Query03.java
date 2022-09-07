package jdbcPractice;

import java.sql.*;

public class Query03 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1)Driver yükle
        Class.forName("org.postgresql.Driver");

        // 2) Bağlantı oluştur
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed", "postgres", "azraayse1981");

        //   Statement st = con.createStatement();
        PreparedStatement rs = con.prepareStatement("select * from  ogrenciler");

        ResultSetMetaData rsmd= rs.getMetaData();
        System.out.println("Süun sayısı : "+ rsmd.getColumnCount()); // tablodaki sutun sayisini verir

        System.out.println("1.Sütunun ismi : "+ rsmd.getColumnName(1));   // tablodaki sütun ismini verir
        System.out.println("2.Sütunun ismi : "+ rsmd.getColumnName(2));
        System.out.println("3.Sütunun ismi : "+ rsmd.getColumnName(3));
        System.out.println("4.Sütunun ismi : "+ rsmd.getColumnName(4));

        System.out.println("1.Sütunun Data Tipi :"+ rsmd.getColumnTypeName(1));  // Tablodaki data türlerini verir
        System.out.println("2.Sütunun Data Tipi :"+ rsmd.getColumnTypeName(2));
        System.out.println("3.Sütunun Data Tipi :"+ rsmd.getColumnTypeName(3));
        System.out.println("4.Sütunun Data Tipi :"+ rsmd.getColumnTypeName(4));

        System.out.println("Tablo ismi: "+ rsmd.getTableName(2));  // Tablo adını verir



    }
}
