/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import DB.DB_Main;

/**
 *
 * @author Febo
 */
public class fungsi {

    DB_Main con;

    public fungsi() throws SQLException {
        this.con = new DB_Main("postgres", "salsabila", "DBpbo");
    }

    public boolean getDataString(String query) {
        boolean sukses = false;
        try {
            con.execute(query);
            sukses = true;
        } catch (Exception e) {
            sukses = false;
        }
        return sukses;
    }

    public int getDataInt(String query) throws SQLException {
        ResultSet hasil = con.getResult(query);
        hasil.next();
        int data = hasil.getInt(1);
        return data;
    }
}
