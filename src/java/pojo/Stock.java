package pojo;
// Generated Mar 31, 2020 7:45:03 PM by Hibernate Tools 4.3.1



/**
 * Stock generated by hbm2java
 */
public class Stock  implements java.io.Serializable {


     private Integer stockid;
     private int itemId;
     private int unitQty;

    public Stock() {
    }

    public Stock(int itemId, int unitQty) {
       this.itemId = itemId;
       this.unitQty = unitQty;
    }
   
    public Integer getStockid() {
        return this.stockid;
    }
    
    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public int getUnitQty() {
        return this.unitQty;
    }
    
    public void setUnitQty(int unitQty) {
        this.unitQty = unitQty;
    }




}

