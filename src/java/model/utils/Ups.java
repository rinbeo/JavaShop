package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * Ups generated by hbm2java
 */
public class Ups  implements java.io.Serializable {


     private int upsId;
     private Serializable upsCode;
     private Serializable upsRegion;
     private Serializable upsName;

    public Ups() {
    }

	
    public Ups(int upsId) {
        this.upsId = upsId;
    }
    public Ups(int upsId, Serializable upsCode, Serializable upsRegion, Serializable upsName) {
       this.upsId = upsId;
       this.upsCode = upsCode;
       this.upsRegion = upsRegion;
       this.upsName = upsName;
    }
   
    public int getUpsId() {
        return this.upsId;
    }
    
    public void setUpsId(int upsId) {
        this.upsId = upsId;
    }
    public Serializable getUpsCode() {
        return this.upsCode;
    }
    
    public void setUpsCode(Serializable upsCode) {
        this.upsCode = upsCode;
    }
    public Serializable getUpsRegion() {
        return this.upsRegion;
    }
    
    public void setUpsRegion(Serializable upsRegion) {
        this.upsRegion = upsRegion;
    }
    public Serializable getUpsName() {
        return this.upsName;
    }
    
    public void setUpsName(Serializable upsName) {
        this.upsName = upsName;
    }




}

