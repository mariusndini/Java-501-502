public class EmpDriver{
   public static void main(String[] args){
      Employee myEmp = new Employee("Marius", new Date(1,1,2017));
      Employee myEmp2 = new Employee("Tom", new Date(1,1,2017));
      
      Employee myCopyEmp = new Employee(myEmp);
      Employee myCopyEmp2 = new Employee(myEmp.getName(), myEmp.getHireDate());
      
      System.out.println(myCopyEmp2.getName());
   
   
   
   }
}