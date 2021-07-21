package postgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class biaDb01 {
    public static void main(String[] args) {
        String urlPostgres = "jdbc:postgresql://talents-tech-bank.cvitjixrebr2.us-east-1.rds.amazonaws.com:5432/db_bia";
        String usuario = "bia";
        String senha = "***";
        try (
                Connection conn = DriverManager.getConnection(urlPostgres, usuario, senha);
                Statement stmt = conn.createStatement()) {
            String query = "select 1 as id, 'Bia' as nome";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("NOME: " + rs.getString("nome"));
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
