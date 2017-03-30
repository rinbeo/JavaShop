package models;
// Generated Mar 29, 2017 4:38:48 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Products generated by hbm2java
 */
public class Products  implements java.io.Serializable {


     private Integer productId;
     private Categories categories;
     private Suppliers suppliers;
     private String productName;
     private String quantityPerUnit;
     private BigDecimal unitPrice;
     private Short unitsInStock;
     private Short unitsOnOrder;
     private Short reorderLevel;
     private boolean discontinued;
     private String image;
     private int unitPriceSale;
     private Set orderdetailses = new HashSet(0);

    public Products() {
    }
  public Products(Integer productID, String productName) {
    }

	
    public Products(String productName, boolean discontinued, String image, int unitPriceSale) {
        this.productName = productName;
        this.discontinued = discontinued;
        this.image = image;
        this.unitPriceSale = unitPriceSale;
    }
    public Products(Categories categories, Suppliers suppliers, String productName, String quantityPerUnit, BigDecimal unitPrice, Short unitsInStock, Short unitsOnOrder, Short reorderLevel, boolean discontinued, String image, int unitPriceSale, Set orderdetailses) {
       this.categories = categories;
       this.suppliers = suppliers;
       this.productName = productName;
       this.quantityPerUnit = quantityPerUnit;
       this.unitPrice = unitPrice;
       this.unitsInStock = unitsInStock;
       this.unitsOnOrder = unitsOnOrder;
       this.reorderLevel = reorderLevel;
       this.discontinued = discontinued;
       this.image = image;
       this.unitPriceSale = unitPriceSale;
       this.orderdetailses = orderdetailses;
    }
   
    public Integer getProductId() {
        return this.productId;
    }
    
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Categories getCategories() {
        return this.categories;
    }
    
    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    public Suppliers getSuppliers() {
        return this.suppliers;
    }
    
    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getQuantityPerUnit() {
        return this.quantityPerUnit;
    }
    
    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Short getUnitsInStock() {
        return this.unitsInStock;
    }
    
    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
    public Short getUnitsOnOrder() {
        return this.unitsOnOrder;
    }
    
    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }
    public Short getReorderLevel() {
        return this.reorderLevel;
    }
    
    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }
    public boolean isDiscontinued() {
        return this.discontinued;
    }
    
    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public int getUnitPriceSale() {
        return this.unitPriceSale;
    }
    
    public void setUnitPriceSale(int unitPriceSale) {
        this.unitPriceSale = unitPriceSale;
    }
    public Set getOrderdetailses() {
        return this.orderdetailses;
    }
    public void setOrderdetailses(Set orderdetailses) {
        this.orderdetailses = orderdetailses;
    }
}

