package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1



/**
 * TaxRates generated by hbm2java
 */
public class TaxRates  implements java.io.Serializable {


     private int TId;
     private Float TTaxrate;

    public TaxRates() {
    }

	
    public TaxRates(int TId) {
        this.TId = TId;
    }
    public TaxRates(int TId, Float TTaxrate) {
       this.TId = TId;
       this.TTaxrate = TTaxrate;
    }
   
    public int getTId() {
        return this.TId;
    }
    
    public void setTId(int TId) {
        this.TId = TId;
    }
    public Float getTTaxrate() {
        return this.TTaxrate;
    }
    
    public void setTTaxrate(Float TTaxrate) {
        this.TTaxrate = TTaxrate;
    }




}


