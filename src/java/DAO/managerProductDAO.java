/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

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
public class managerProductDAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getProductBySale(int id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product_HE163324\n"
                + "where sale = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
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

    public void insertProduct(String name, String description, String img, String categoryID, String price, int sale) {
        String query = "INSERT [dbo].[Product_HE163324] \n"
                + "([name], [description], [img], [categoryID],[price], [sale])\n"
                + "VALUES ( ?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, description);
            ps.setString(3, img);
            ps.setString(4, categoryID);
            ps.setString(5, price);
            ps.setInt(6, sale);

            ps.executeUpdate();

        } catch (Exception e) {
        }

    }

}
