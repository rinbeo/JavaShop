package models;
// Generated Mar 29, 2017 4:38:48 PM by Hibernate Tools 4.3.1



/**
 * Logins generated by hbm2java
 */
public class Logins  implements java.io.Serializable {


     private Long loginId;
     private String username;
     private String passwordHash;
     private Integer employeeId;

    public Logins() {
    }

    public Logins(String username, String passwordHash, Integer employeeId) {
       this.username = username;
       this.passwordHash = passwordHash;
       this.employeeId = employeeId;
    }
   
    public Long getLoginId() {
        return this.loginId;
    }
    
    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswordHash() {
        return this.passwordHash;
    }
    
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }




}

