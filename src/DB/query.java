/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.SQLException;

/**
 *
 * @author Febo
 */
public class query extends fungsi {

    public query() throws SQLException {
        this.con = new DB_Main("postgres", "salsabila", "DBpbo");
    }

    public boolean insertUser(String nama, String nomor, String email, String alamat) {
        String sql = "insert into tb_user (nama, kontak, alamat, email) values ('" + nama + "', '" + nomor + "', '" + alamat + "', '" + email + "')";
        return getDataString(sql);
    }

    public boolean ambilNama() {
        String sql = "select nama from tb_user where iduser=2";
        return getDataString(sql);
    }

    public boolean ambilEmail() {
        String sql = "select email from tb_user where iduser=2";
        return getDataString(sql);
    }
}
