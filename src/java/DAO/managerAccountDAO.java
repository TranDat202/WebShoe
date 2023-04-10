/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Account;
import Model.Product;
import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author datbe
 */
public class managerAccountDAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Account> getAllAccount(){
        List<Account> list = new ArrayList<>();
        String query = "select * from Account_HE163324";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new Account(rs.getInt(1),
                                     rs.getString(2),
                                     
                                      rs.getString(3),
                                        rs.getString(4),
                                        rs.getBoolean(5),
                                        
                                        rs.getBoolean(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteProduct(String pid) {
        String query = "delete from productDetail_HE163324 \n"
                + "where productID = ?\n"
                + "\n"
                + "delete from Product_HE163324 \n"
                + "where productID = ?\n"
                + "";
        try {
            conn = new DBContext().getConnection();//mo ket noi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.setString(2, pid);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

   public static void main(String[] args) {
            managerAccountDAO dao = new managerAccountDAO();
            List<Account> list = dao.getAllAccount();
            for (Account o : list) {
                System.out.println(o);
        }
    }

}
