package BD_COM_JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/CT_JF";
        String usuario = "postgres";
        String senha = "8751";
        Connection conexao = DriverManager.getConnection(url,usuario, senha);
        conexao.close();
    }
}
