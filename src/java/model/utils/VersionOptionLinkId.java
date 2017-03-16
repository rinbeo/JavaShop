package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1



/**
 * VersionOptionLinkId generated by hbm2java
 */
public class VersionOptionLinkId  implements java.io.Serializable {


     private Integer VOptVersionId;
     private Integer VOptOptionId;

    public VersionOptionLinkId() {
    }

    public VersionOptionLinkId(Integer VOptVersionId, Integer VOptOptionId) {
       this.VOptVersionId = VOptVersionId;
       this.VOptOptionId = VOptOptionId;
    }
   
    public Integer getVOptVersionId() {
        return this.VOptVersionId;
    }
    
    public void setVOptVersionId(Integer VOptVersionId) {
        this.VOptVersionId = VOptVersionId;
    }
    public Integer getVOptOptionId() {
        return this.VOptOptionId;
    }
    
    public void setVOptOptionId(Integer VOptOptionId) {
        this.VOptOptionId = VOptOptionId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VersionOptionLinkId) ) return false;
		 VersionOptionLinkId castOther = ( VersionOptionLinkId ) other; 
         
		 return ( (this.getVOptVersionId()==castOther.getVOptVersionId()) || ( this.getVOptVersionId()!=null && castOther.getVOptVersionId()!=null && this.getVOptVersionId().equals(castOther.getVOptVersionId()) ) )
 && ( (this.getVOptOptionId()==castOther.getVOptOptionId()) || ( this.getVOptOptionId()!=null && castOther.getVOptOptionId()!=null && this.getVOptOptionId().equals(castOther.getVOptOptionId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getVOptVersionId() == null ? 0 : this.getVOptVersionId().hashCode() );
         result = 37 * result + ( getVOptOptionId() == null ? 0 : this.getVOptOptionId().hashCode() );
         return result;
   }   


}


