/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Sachi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.log4j.Logger;

public class JDBC {
    private static final Logger logger=Logger.getLogger(JDBC.class);

    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/tictactoe";

    static Connection con;

    Connection getConnection() throws Exception {
        try {
            Class.forName(driver);
            if (con == null) {
                con = DriverManager.getConnection(url, "root", "1234");
            }
        } catch (Exception err) {
            logger.error("Exception in getconnection - "+err);
        }
        return con;

    }

    public void putData(String sql) {
        try {
            Statement state = getConnection().createStatement();
            state.executeUpdate(sql);
        } catch (Exception e) {
            logger.error("Exception in put data - " +e);
        }
    }

    public ResultSet getData(String sql) throws Exception {
        Statement state = getConnection().createStatement();
        ResultSet rset = state.executeQuery(sql);
        return rset;
    }
}
