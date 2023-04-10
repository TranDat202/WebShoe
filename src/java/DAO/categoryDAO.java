/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.Category;
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
public class categoryDAO extends DBContext{
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
    public List<Category> getAllCategory(){
        List<Category> list = new ArrayList<>();
        String query = "select * from Category_HE163324";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new Category(rs.getInt(1),
                                     rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;     
    }
     public List<Product> getProductByCID(String cid){
        List<Product> list = new ArrayList<>();
        String query = "select * from Product_HE163324"
                + " where categoryID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new Product(rs.getInt(1),
                                     rs.getString(2),
                                     
                                      rs.getString(3),
                                        rs.getString(4),
                                        rs.getInt(5),
                                       
                                        rs.getDouble(6),
                                        rs.getInt(7)));
            }
        } catch (Exception e) {
        }
        return list;     
    }
    public static void main(String[] args) {
            categoryDAO dao = new categoryDAO();
          
            List<Category> listC = dao.getAllCategory();
            for (Category o : listC) {
                System.out.println(o);
        }
    }
}
    
    
