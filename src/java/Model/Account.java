/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author datbe
 */
public class Account {
    private int accID;
    private String email;
    private String username;
    private String password;
    private Boolean isAdmin;
    private Boolean isCustomer;

    public Account() {
    }

    public Account(int accID, String email, String username, String password, Boolean isAdmin, Boolean isCustomer) {
        this.accID = accID;
        this.email = email;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isCustomer = isCustomer;
    }

    public int getAccID() {
        return accID;
    }

    public void setAccID(int accID) {
        this.accID = accID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsCustomer() {
        return isCustomer;
    }

    public void setIsCustomer(Boolean isCustomer) {
        this.isCustomer = isCustomer;
    }

    @Override
    public String toString() {
        return "Account{" + "accID=" + accID + ", email=" + email + ", username=" + username + ", password=" + password + ", isAdmin=" + isAdmin + ", isCustomer=" + isCustomer + '}';
    }

 
    
}
