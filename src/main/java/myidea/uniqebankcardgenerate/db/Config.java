package myidea.uniqebankcardgenerate.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config  {
    public Connection connect() throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/bankcards_db";
        String username = "postgres";
        String password = "Metin598";
        Connection connection = DriverManager.getConnection(url,username,password);

        return connection;
    }

}
