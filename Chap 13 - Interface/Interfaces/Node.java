class Node implements Ordered{
   String name;

   Node next;
   Node prev;
   
   public Node(String name){
      this.name = name;      
   }// end node constructor
   
   public Node(String name, Node prev){
      this.name = name;
      
      prev.setNext(this);
      this.prev = prev;
      
   }// end node constructor
  
   public Node getNext(){
      return next;
   }

   public void setNext(Node n){
      next = n;
   }
   
   // Defining because we have to because we implement Ordered
   public Node getPrev(){
      return prev;
   }

}//implements node

class driverLink{
   public static void main(String[] args){
      Node firstNode = new Node("Tom");
      Node _2nd = new Node("Mike", firstNode);
      Node _3rd = new Node("Will", _2nd);
      Node _4th = new Node("Sam", _3rd);
      Node _5th = new Node("Amy", _4th);

      System.out.println(firstNode.getNext().getPrev().getNext().getNext().name);
      
   }
}// End Driver

