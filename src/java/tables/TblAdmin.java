package tables;
// Generated 20 Apr, 2020 12:31:14 PM by Hibernate Tools 4.3.1



/**
 * TblAdmin generated by hbm2java
 */
public class TblAdmin  implements java.io.Serializable {


     private Integer adminId;
     private String adminName;
     private String adminPwd;

    public TblAdmin() {
    }

    public TblAdmin(String adminName, String adminPwd) {
       this.adminName = adminName;
       this.adminPwd = adminPwd;
    }
   
    public Integer getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public String getAdminName() {
        return this.adminName;
    }
    
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public String getAdminPwd() {
        return this.adminPwd;
    }
    
    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }




}


