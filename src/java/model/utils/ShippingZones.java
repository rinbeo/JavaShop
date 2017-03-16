package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * ShippingZones generated by hbm2java
 */
public class ShippingZones  implements java.io.Serializable {


     private int szId;
     private Serializable szName1;
     private Serializable szName2;
     private Serializable szName3;
     private Serializable szName4;
     private Serializable szName5;
     private Integer szOrderByValue;

    public ShippingZones() {
    }

	
    public ShippingZones(int szId) {
        this.szId = szId;
    }
    public ShippingZones(int szId, Serializable szName1, Serializable szName2, Serializable szName3, Serializable szName4, Serializable szName5, Integer szOrderByValue) {
       this.szId = szId;
       this.szName1 = szName1;
       this.szName2 = szName2;
       this.szName3 = szName3;
       this.szName4 = szName4;
       this.szName5 = szName5;
       this.szOrderByValue = szOrderByValue;
    }
   
    public int getSzId() {
        return this.szId;
    }
    
    public void setSzId(int szId) {
        this.szId = szId;
    }
    public Serializable getSzName1() {
        return this.szName1;
    }
    
    public void setSzName1(Serializable szName1) {
        this.szName1 = szName1;
    }
    public Serializable getSzName2() {
        return this.szName2;
    }
    
    public void setSzName2(Serializable szName2) {
        this.szName2 = szName2;
    }
    public Serializable getSzName3() {
        return this.szName3;
    }
    
    public void setSzName3(Serializable szName3) {
        this.szName3 = szName3;
    }
    public Serializable getSzName4() {
        return this.szName4;
    }
    
    public void setSzName4(Serializable szName4) {
        this.szName4 = szName4;
    }
    public Serializable getSzName5() {
        return this.szName5;
    }
    
    public void setSzName5(Serializable szName5) {
        this.szName5 = szName5;
    }
    public Integer getSzOrderByValue() {
        return this.szOrderByValue;
    }
    
    public void setSzOrderByValue(Integer szOrderByValue) {
        this.szOrderByValue = szOrderByValue;
    }




}


