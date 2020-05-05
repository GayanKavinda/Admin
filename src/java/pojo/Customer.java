package pojo;
// Generated Mar 31, 2020 7:45:03 PM by Hibernate Tools 4.3.1



/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private Integer cid;
     private String name;
     private String email;
     private String phone;
     private String password;
     private String address;

    public Customer() {
    }

    public Customer(String name, String email, String phone, String password, String address) {
       this.name = name;
       this.email = email;
       this.phone = phone;
       this.password = password;
       this.address = address;
    }
   
    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }




}

