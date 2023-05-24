package conexao;

import java.sql.*;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/exemplobd";
    private static final String user = "root";
    private static final String password = "Holdmyhand027@";

    private static Connection conn;

    public static Connection getConexao(){
        try {
            if (conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn; 
            } else {
                return conn;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados.");
            return null;
        }
    }
}
