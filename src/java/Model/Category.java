/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author datbe
 */
public class Category {
    private int categoryID;
    private String title;

    public Category() {
    }

    public Category(int categoryID, String title) {
        this.categoryID = categoryID;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Category{" + "categoryID=" + categoryID + ", title=" + title + '}';
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
