package pojo;
// Generated Mar 31, 2020 7:45:03 PM by Hibernate Tools 4.3.1



/**
 * Foodrecipie generated by hbm2java
 */
public class Foodrecipie  implements java.io.Serializable {


     private Integer foodId;
     private String foodName;

    public Foodrecipie() {
    }

    public Foodrecipie(String foodName) {
       this.foodName = foodName;
    }
   
    public Integer getFoodId() {
        return this.foodId;
    }
    
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }
    public String getFoodName() {
        return this.foodName;
    }
    
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }




}

