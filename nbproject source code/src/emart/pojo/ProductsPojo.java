/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emart.pojo;

/**
 *
 * @author WELCOME
 */
public class ProductsPojo {

    public String getMfg_date() {
        return mfg_date;
    }

    public void setMfg_date(String mfg_date) {
        this.mfg_date = mfg_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }
    private String mfg_date;
private String exp_date;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
     public ProductsPojo()
     {
         
     }
   public ProductsPojo(String productId, String productName, String productCompany, double productPrice, 
                    double ourPrice, int tax, int quantity, double total, String mfg_date, String exp_date) {
    this.productId = productId;
    this.productName = productName;
    this.productCompany = productCompany;
    this.productPrice = productPrice;
    this.ourPrice = ourPrice;
    this.tax = tax;
    this.quantity = quantity;
    this.total = total;
    this.mfg_date = mfg_date;
    this.exp_date = exp_date;
}


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getOurPrice() {
        return ourPrice;
    }

    public void setOurPrice(double ourPrice) {
        this.ourPrice = ourPrice;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    private String productId;
    private String productName;
    private String productCompany;
    private double productPrice;
    private double ourPrice;
    private int tax;
    private int quantity;
    private double total;
    
}
