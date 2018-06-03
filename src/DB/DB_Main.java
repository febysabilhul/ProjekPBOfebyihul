/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Main {

    private Statement stm;
    private Connection con;

    public DB_Main(String username, String password, String db) throws SQLException {
        try {
            String url = "jdbc:postgresql://localhost/DBpbo";
            con = DriverManager.getConnection(url, username, password);
            stm = con.createStatement();
            System.out.println("sukses, url = " + url + ", user = " + username + ", pass = " + password);
        } catch (Exception e) {
            System.out.println("gagal");
        }
    }

    public DB_Main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void execute(String sql) throws SQLException {
        this.stm.executeUpdate(sql);
    }

    public ResultSet getResult(String sql) throws SQLException {
        return stm.executeQuery(sql);
    }
}
