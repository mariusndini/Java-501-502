public class Vehicle{
    private  int numOfTires;
    private boolean motor;
    
    public Vehicle() {
        numOfTires = 2;
        motor = false;
    }
    
    public int getNumOfTires() {
        return numOfTires;
    }
    
    public boolean isMotor() {
        return motor;
    }
    
    public void setNumOfTires( int tires ) {
        numOfTires = tires;
    }
    
    public void setMotor( boolean motor ) {
        this.motor = motor;
    }
    
    public String toString() {
        return "Vehicle: numOfTires = " + numOfTires + "; motor = " + motor;
    }
} // class Vehicle
