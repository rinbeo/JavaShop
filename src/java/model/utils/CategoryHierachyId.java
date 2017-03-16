package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1



/**
 * CategoryHierachyId generated by hbm2java
 */
public class CategoryHierachyId  implements java.io.Serializable {


     private Integer chParentId;
     private Integer chChildId;

    public CategoryHierachyId() {
    }

    public CategoryHierachyId(Integer chParentId, Integer chChildId) {
       this.chParentId = chParentId;
       this.chChildId = chChildId;
    }
   
    public Integer getChParentId() {
        return this.chParentId;
    }
    
    public void setChParentId(Integer chParentId) {
        this.chParentId = chParentId;
    }
    public Integer getChChildId() {
        return this.chChildId;
    }
    
    public void setChChildId(Integer chChildId) {
        this.chChildId = chChildId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CategoryHierachyId) ) return false;
		 CategoryHierachyId castOther = ( CategoryHierachyId ) other; 
         
		 return ( (this.getChParentId()==castOther.getChParentId()) || ( this.getChParentId()!=null && castOther.getChParentId()!=null && this.getChParentId().equals(castOther.getChParentId()) ) )
 && ( (this.getChChildId()==castOther.getChChildId()) || ( this.getChChildId()!=null && castOther.getChChildId()!=null && this.getChChildId().equals(castOther.getChChildId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getChParentId() == null ? 0 : this.getChParentId().hashCode() );
         result = 37 * result + ( getChChildId() == null ? 0 : this.getChChildId().hashCode() );
         return result;
   }   


}


