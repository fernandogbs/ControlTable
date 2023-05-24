import java.sql.*;
import java.util.*;

public class exibeTabela {
    public void retornaTabela(){
        Connection con = null;
        Statement statement = null;
        try {
            HashMap<Integer, String> hm = new HashMap<>();
            HashMap<String, String> hm2 = new HashMap<>();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exemplobd", "root", "Holdmyhand027@");
            statement = (Statement) con.createStatement();
            String sql;
            sql = "SELECT * FROM exemplobd.usuario";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
            hm.put(resultSet.getInt("idusuario"), resultSet.getString("nome"));
            hm2.put(resultSet.getString("login"), resultSet.getString("email"));
        }
        System.out.println(hm + "\n" + hm2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
