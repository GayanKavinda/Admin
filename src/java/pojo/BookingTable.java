package pojo;
// Generated Mar 31, 2020 7:45:03 PM by Hibernate Tools 4.3.1



/**
 * BookingTable generated by hbm2java
 */
public class BookingTable  implements java.io.Serializable {


     private Integer bookId;
     private String status;
     private int numberOfSeat;
     private int cid;
     private String mealplan;
     private String occasionz;
     private String bookeddate;
     private String booktime;

    public BookingTable() {
    }

    public BookingTable(String status, int numberOfSeat, int cid, String mealplan, String occasionz, String bookeddate, String booktime) {
       this.status = status;
       this.numberOfSeat = numberOfSeat;
       this.cid = cid;
       this.mealplan = mealplan;
       this.occasionz = occasionz;
       this.bookeddate = bookeddate;
       this.booktime = booktime;
    }
   
    public Integer getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public int getNumberOfSeat() {
        return this.numberOfSeat;
    }
    
    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }
    public int getCid() {
        return this.cid;
    }
    
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getMealplan() {
        return this.mealplan;
    }
    
    public void setMealplan(String mealplan) {
        this.mealplan = mealplan;
    }
    public String getOccasionz() {
        return this.occasionz;
    }
    
    public void setOccasionz(String occasionz) {
        this.occasionz = occasionz;
    }
    public String getBookeddate() {
        return this.bookeddate;
    }
    
    public void setBookeddate(String bookeddate) {
        this.bookeddate = bookeddate;
    }
    public String getBooktime() {
        return this.booktime;
    }
    
    public void setBooktime(String booktime) {
        this.booktime = booktime;
    }




}


