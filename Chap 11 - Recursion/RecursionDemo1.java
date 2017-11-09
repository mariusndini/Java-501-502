
public class RecursionDemo1{
    public static void main(String[] args){
        System.out.println("writeVertical(4613):");
        writeVertical(4613);
    }


    //Recursive method - Method which calls itself.
    public static void writeVertical(int n){
        if (n < 10){
            System.out.println(n);
        }else{ //n is two or more digits long:
            writeVertical(n/10);
            System.out.println(n%10);
        }//end if
    }//end vertical





}//end class
