    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author datbe
 */
public class Product {
    private int productID;
    private String name;
    
    private String description;
    private String img;
    private int categoryID;
   
    private double price;
    private int sale;

    public Product() {
    }

    public Product(int productID, String name, String description, String img, int categoryID, double price, int sale) {
        this.productID = productID;
        this.name = name;
        
        this.description = description;
        this.img = img;
        this.categoryID = categoryID;
        
        this.price = price;
        this.sale = sale;
    }

   

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", name=" + name + ", description=" + description + ", img=" + img + ", categoryID=" + categoryID + ", price=" + price + ", sale=" + sale + '}';
    }

   
    
}
