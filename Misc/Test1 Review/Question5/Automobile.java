public class Automobile  extends Vehicle{
   private Boolean hasABS = false;
   
   public Automobile(Boolean abs){
      super();
      super.setNumOfTires(4);
      super.setMotor(false);
      hasABS = abs;
   }
   
   public void setABS(Boolean abs){
      hasABS = abs;
   }
   
   public Boolean getABS(){
      return hasABS;
   }
   //needed toString
   
}