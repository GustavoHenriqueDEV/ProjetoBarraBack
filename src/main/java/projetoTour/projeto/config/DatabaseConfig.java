package projetoTour.projeto.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConfig {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/projeto", "root", "");
            System.out.println("Conexão estabelecida com sucesso!");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver do banco de dados não localizado");
        } catch (
                SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());

    }

        return con;
    }

}
