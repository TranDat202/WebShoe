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
public class SignUpDAO extends DBContext{
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
    public Account checkAccountExist(String email){
        String query  = "select * from Account_HE163324 \n" +
                        "where email =?";
                        
        try {
            conn = new DBContext().getConnection();//mo ket noi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
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
    public void signup(String email,String name , String pass)
    {
        String query = "insert into Account_HE163324\n" +
                       "values (?,?,?,0,0)";
         try {
            conn = new DBContext().getConnection();//mo ket noi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, name);
            
            ps.setString(3, pass);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
    }
    public void changePass(Account a){
        String query = "update Account_HE163324 set password = ? where email=?";
        try {
             conn = new DBContext().getConnection();//mo ket noi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,a.getPassword() );
            ps.setString(2, a.getEmail());
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
           
        
    }
}
