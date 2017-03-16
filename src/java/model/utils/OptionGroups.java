package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * OptionGroups generated by hbm2java
 */
public class OptionGroups  implements java.io.Serializable {


     private int optgId;
     private Serializable optgBackendName;
     private Serializable optgName1;
     private Serializable optgName2;
     private Serializable optgName3;
     private Serializable optgName4;
     private Serializable optgName5;
     private Serializable optgDesc1;
     private Serializable optgDesc2;
     private Serializable optgDesc3;
     private Serializable optgDesc4;
     private Serializable optgDesc5;
     private Serializable optgOptionDisplayType;
     private Integer optgDefOrderByValue;

    public OptionGroups() {
    }

	
    public OptionGroups(int optgId) {
        this.optgId = optgId;
    }
    public OptionGroups(int optgId, Serializable optgBackendName, Serializable optgName1, Serializable optgName2, Serializable optgName3, Serializable optgName4, Serializable optgName5, Serializable optgDesc1, Serializable optgDesc2, Serializable optgDesc3, Serializable optgDesc4, Serializable optgDesc5, Serializable optgOptionDisplayType, Integer optgDefOrderByValue) {
       this.optgId = optgId;
       this.optgBackendName = optgBackendName;
       this.optgName1 = optgName1;
       this.optgName2 = optgName2;
       this.optgName3 = optgName3;
       this.optgName4 = optgName4;
       this.optgName5 = optgName5;
       this.optgDesc1 = optgDesc1;
       this.optgDesc2 = optgDesc2;
       this.optgDesc3 = optgDesc3;
       this.optgDesc4 = optgDesc4;
       this.optgDesc5 = optgDesc5;
       this.optgOptionDisplayType = optgOptionDisplayType;
       this.optgDefOrderByValue = optgDefOrderByValue;
    }
   
    public int getOptgId() {
        return this.optgId;
    }
    
    public void setOptgId(int optgId) {
        this.optgId = optgId;
    }
    public Serializable getOptgBackendName() {
        return this.optgBackendName;
    }
    
    public void setOptgBackendName(Serializable optgBackendName) {
        this.optgBackendName = optgBackendName;
    }
    public Serializable getOptgName1() {
        return this.optgName1;
    }
    
    public void setOptgName1(Serializable optgName1) {
        this.optgName1 = optgName1;
    }
    public Serializable getOptgName2() {
        return this.optgName2;
    }
    
    public void setOptgName2(Serializable optgName2) {
        this.optgName2 = optgName2;
    }
    public Serializable getOptgName3() {
        return this.optgName3;
    }
    
    public void setOptgName3(Serializable optgName3) {
        this.optgName3 = optgName3;
    }
    public Serializable getOptgName4() {
        return this.optgName4;
    }
    
    public void setOptgName4(Serializable optgName4) {
        this.optgName4 = optgName4;
    }
    public Serializable getOptgName5() {
        return this.optgName5;
    }
    
    public void setOptgName5(Serializable optgName5) {
        this.optgName5 = optgName5;
    }
    public Serializable getOptgDesc1() {
        return this.optgDesc1;
    }
    
    public void setOptgDesc1(Serializable optgDesc1) {
        this.optgDesc1 = optgDesc1;
    }
    public Serializable getOptgDesc2() {
        return this.optgDesc2;
    }
    
    public void setOptgDesc2(Serializable optgDesc2) {
        this.optgDesc2 = optgDesc2;
    }
    public Serializable getOptgDesc3() {
        return this.optgDesc3;
    }
    
    public void setOptgDesc3(Serializable optgDesc3) {
        this.optgDesc3 = optgDesc3;
    }
    public Serializable getOptgDesc4() {
        return this.optgDesc4;
    }
    
    public void setOptgDesc4(Serializable optgDesc4) {
        this.optgDesc4 = optgDesc4;
    }
    public Serializable getOptgDesc5() {
        return this.optgDesc5;
    }
    
    public void setOptgDesc5(Serializable optgDesc5) {
        this.optgDesc5 = optgDesc5;
    }
    public Serializable getOptgOptionDisplayType() {
        return this.optgOptionDisplayType;
    }
    
    public void setOptgOptionDisplayType(Serializable optgOptionDisplayType) {
        this.optgOptionDisplayType = optgOptionDisplayType;
    }
    public Integer getOptgDefOrderByValue() {
        return this.optgDefOrderByValue;
    }
    
    public void setOptgDefOrderByValue(Integer optgDefOrderByValue) {
        this.optgDefOrderByValue = optgDefOrderByValue;
    }




}


