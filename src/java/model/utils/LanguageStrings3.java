package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * LanguageStrings3 generated by hbm2java
 */
public class LanguageStrings3  implements java.io.Serializable {


     private int lsId;
     private Serializable lsFrontBack;
     private Serializable lsName;
     private Serializable lsValue;
     private Serializable lsDescription;
     private Float lsVersionAdded;
     private Serializable lsDefaultValue;

    public LanguageStrings3() {
    }

	
    public LanguageStrings3(int lsId) {
        this.lsId = lsId;
    }
    public LanguageStrings3(int lsId, Serializable lsFrontBack, Serializable lsName, Serializable lsValue, Serializable lsDescription, Float lsVersionAdded, Serializable lsDefaultValue) {
       this.lsId = lsId;
       this.lsFrontBack = lsFrontBack;
       this.lsName = lsName;
       this.lsValue = lsValue;
       this.lsDescription = lsDescription;
       this.lsVersionAdded = lsVersionAdded;
       this.lsDefaultValue = lsDefaultValue;
    }
   
    public int getLsId() {
        return this.lsId;
    }
    
    public void setLsId(int lsId) {
        this.lsId = lsId;
    }
    public Serializable getLsFrontBack() {
        return this.lsFrontBack;
    }
    
    public void setLsFrontBack(Serializable lsFrontBack) {
        this.lsFrontBack = lsFrontBack;
    }
    public Serializable getLsName() {
        return this.lsName;
    }
    
    public void setLsName(Serializable lsName) {
        this.lsName = lsName;
    }
    public Serializable getLsValue() {
        return this.lsValue;
    }
    
    public void setLsValue(Serializable lsValue) {
        this.lsValue = lsValue;
    }
    public Serializable getLsDescription() {
        return this.lsDescription;
    }
    
    public void setLsDescription(Serializable lsDescription) {
        this.lsDescription = lsDescription;
    }
    public Float getLsVersionAdded() {
        return this.lsVersionAdded;
    }
    
    public void setLsVersionAdded(Float lsVersionAdded) {
        this.lsVersionAdded = lsVersionAdded;
    }
    public Serializable getLsDefaultValue() {
        return this.lsDefaultValue;
    }
    
    public void setLsDefaultValue(Serializable lsDefaultValue) {
        this.lsDefaultValue = lsDefaultValue;
    }




}


