package TianMaoFenXiao.pojo;



/**
 * ZhiFuLeiXingBiaoId entity. @author MyEclipse Persistence Tools
 */

public class ZhiFuLeiXingBiaoId  implements java.io.Serializable {


    // Fields    

     private Integer zhiFuLeiXingId;
     private String zhiFuLeiXing;


    // Constructors

    /** default constructor */
    public ZhiFuLeiXingBiaoId() {
    }

	/** minimal constructor */
    public ZhiFuLeiXingBiaoId(Integer zhiFuLeiXingId) {
        this.zhiFuLeiXingId = zhiFuLeiXingId;
    }
    
    /** full constructor */
    public ZhiFuLeiXingBiaoId(Integer zhiFuLeiXingId, String zhiFuLeiXing) {
        this.zhiFuLeiXingId = zhiFuLeiXingId;
        this.zhiFuLeiXing = zhiFuLeiXing;
    }

   
    // Property accessors

    public Integer getZhiFuLeiXingId() {
        return this.zhiFuLeiXingId;
    }
    
    public void setZhiFuLeiXingId(Integer zhiFuLeiXingId) {
        this.zhiFuLeiXingId = zhiFuLeiXingId;
    }

    public String getZhiFuLeiXing() {
        return this.zhiFuLeiXing;
    }
    
    public void setZhiFuLeiXing(String zhiFuLeiXing) {
        this.zhiFuLeiXing = zhiFuLeiXing;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ZhiFuLeiXingBiaoId) ) return false;
		 ZhiFuLeiXingBiaoId castOther = ( ZhiFuLeiXingBiaoId ) other; 
         
		 return ( (this.getZhiFuLeiXingId()==castOther.getZhiFuLeiXingId()) || ( this.getZhiFuLeiXingId()!=null && castOther.getZhiFuLeiXingId()!=null && this.getZhiFuLeiXingId().equals(castOther.getZhiFuLeiXingId()) ) )
 && ( (this.getZhiFuLeiXing()==castOther.getZhiFuLeiXing()) || ( this.getZhiFuLeiXing()!=null && castOther.getZhiFuLeiXing()!=null && this.getZhiFuLeiXing().equals(castOther.getZhiFuLeiXing()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getZhiFuLeiXingId() == null ? 0 : this.getZhiFuLeiXingId().hashCode() );
         result = 37 * result + ( getZhiFuLeiXing() == null ? 0 : this.getZhiFuLeiXing().hashCode() );
         return result;
   }   





}