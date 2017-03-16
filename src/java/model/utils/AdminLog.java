package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;

/**
 * AdminLog generated by hbm2java
 */
public class AdminLog  implements java.io.Serializable {


     private int alId;
     private Date alDateStamp;
     private Integer alLoginId;
     private Serializable alType;
     private Serializable alDescription;
     private Serializable alQuery;
     private Serializable alRelatedId;
     private Serializable alIp;

    public AdminLog() {
    }

	
    public AdminLog(int alId) {
        this.alId = alId;
    }
    public AdminLog(int alId, Date alDateStamp, Integer alLoginId, Serializable alType, Serializable alDescription, Serializable alQuery, Serializable alRelatedId, Serializable alIp) {
       this.alId = alId;
       this.alDateStamp = alDateStamp;
       this.alLoginId = alLoginId;
       this.alType = alType;
       this.alDescription = alDescription;
       this.alQuery = alQuery;
       this.alRelatedId = alRelatedId;
       this.alIp = alIp;
    }
   
    public int getAlId() {
        return this.alId;
    }
    
    public void setAlId(int alId) {
        this.alId = alId;
    }
    public Date getAlDateStamp() {
        return this.alDateStamp;
    }
    
    public void setAlDateStamp(Date alDateStamp) {
        this.alDateStamp = alDateStamp;
    }
    public Integer getAlLoginId() {
        return this.alLoginId;
    }
    
    public void setAlLoginId(Integer alLoginId) {
        this.alLoginId = alLoginId;
    }
    public Serializable getAlType() {
        return this.alType;
    }
    
    public void setAlType(Serializable alType) {
        this.alType = alType;
    }
    public Serializable getAlDescription() {
        return this.alDescription;
    }
    
    public void setAlDescription(Serializable alDescription) {
        this.alDescription = alDescription;
    }
    public Serializable getAlQuery() {
        return this.alQuery;
    }
    
    public void setAlQuery(Serializable alQuery) {
        this.alQuery = alQuery;
    }
    public Serializable getAlRelatedId() {
        return this.alRelatedId;
    }
    
    public void setAlRelatedId(Serializable alRelatedId) {
        this.alRelatedId = alRelatedId;
    }
    public Serializable getAlIp() {
        return this.alIp;
    }
    
    public void setAlIp(Serializable alIp) {
        this.alIp = alIp;
    }




}


