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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author datbe
 */
public class accountDAO extends DBContext{
/*    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> product = new ArrayList<Product>();
        try {
            String sql = "select * from Product_HE163324";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                            int productID = rs.getInt("productID");
                            String name = rs.getString("name");
                            boolean availble = rs.getBoolean("availble");
                            String description = rs.getString("description");
                            String img = rs.getString("img");
                            int categoryID = rs.getInt("category");
                            double price = rs.getDouble("price");
                            int sale = rs.getInt("sale");
                    Product p = new Product(productID, name, availble, description, img, categoryID, price, sale);
                    product.add(p);
            }       
        } catch (Exception e) {
        }
        return product;
    }*/
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public Account login(String email, String pass){
        String query  = "select * from Account_HE163324 \n" +
                        "where email =?\n" +
                        "and password =?";
        try {
            conn = new DBContext().getConnection();//mo ket noi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {                
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5),
                        rs.getBoolean(6));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public static void main(String[] args) {
           
        
    }
}
