package pojo;
// Generated Mar 31, 2020 7:45:03 PM by Hibernate Tools 4.3.1



/**
 * Review generated by hbm2java
 */
public class Review  implements java.io.Serializable {


     private Integer reviewId;
     private String commentz;
     private int cid;
     private String status;

    public Review() {
    }

    public Review(String commentz, int cid, String status) {
       this.commentz = commentz;
       this.cid = cid;
       this.status = status;
    }
   
    public Integer getReviewId() {
        return this.reviewId;
    }
    
    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }
    public String getCommentz() {
        return this.commentz;
    }
    
    public void setCommentz(String commentz) {
        this.commentz = commentz;
    }
    public int getCid() {
        return this.cid;
    }
    
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


