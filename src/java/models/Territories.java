package models;
// Generated Mar 29, 2017 4:38:48 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Territories generated by hbm2java
 */
public class Territories  implements java.io.Serializable {


     private String territoryId;
     private Region region;
     private String territoryDescription;
     private Set employeeses = new HashSet(0);

    public Territories() {
    }

	
    public Territories(String territoryId, Region region, String territoryDescription) {
        this.territoryId = territoryId;
        this.region = region;
        this.territoryDescription = territoryDescription;
    }
    public Territories(String territoryId, Region region, String territoryDescription, Set employeeses) {
       this.territoryId = territoryId;
       this.region = region;
       this.territoryDescription = territoryDescription;
       this.employeeses = employeeses;
    }
   
    public String getTerritoryId() {
        return this.territoryId;
    }
    
    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }
    public Region getRegion() {
        return this.region;
    }
    
    public void setRegion(Region region) {
        this.region = region;
    }
    public String getTerritoryDescription() {
        return this.territoryDescription;
    }
    
    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }
    public Set getEmployeeses() {
        return this.employeeses;
    }
    
    public void setEmployeeses(Set employeeses) {
        this.employeeses = employeeses;
    }




}


