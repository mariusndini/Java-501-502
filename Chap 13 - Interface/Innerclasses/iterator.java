// https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html 
//  --more information about the Iterator interface above 
//    command line java doc 
//**  javadoc  < MySourceFileName >.java -d <Destination Directory>
//**  javadoc  iterator.java -d Docs
//
// JAVADOC Documentation
// http://www.oracle.com/technetwork/articles/java/index-137868.html
// http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html

import java.util.Iterator;

public class iterator implements Iterator{

//---- START NODE CLASS
   public class Node{
      String name;
      
      Node next;
      Node prev;

      public Node(String name){
         this.name = name;      
      }// end node constructor
      
      /**
       *Constructor
       *
       *Construcs the Node
       *
       *@param name the name of the node or person
       *@param prev the previous node in the chain
       *@return - does not return anything is a constructor
       *
      */
      public Node(String name, Node prev){
         this.name = name;
         
         prev.next = this; //was changed from using the getter
         this.prev = prev; 
      }// end node constructor
     
      public Node next(){
         current = next;
         return next;
      }
   
      public void setNext(Node n){
         next = n;
      }
      
      // Defining because we have to because we implement Ordered
      public Node getPrev(){
         return prev;
      }
      
      // lets us know if we are at the end of the line 
      // NEW Method
      public boolean hasNext(){
         if(this.next != null){
            return true;
         }
         return false;
      }
      
      // To String method
      public String toString(){
         return name; 
      }
      
      public boolean equals(Node n){
         if(n.name.equals(this.name)){
            return true;
         }
         return false;
      }//emnd equals
      
   }//end node class
//---- START NODE CLASS


   //here we start some iterator class methods/vars
   int counter = 0;
   Node first = null;
   Node last = null;
   Node current = null;
   
   //default constructor
   public iterator(){ /* DEFAULT CONSTRUCTOR */   }
   
   // Implementation Methods
   // we have to implement next method because of interface
   public Node next(){
      current = current.next;  
      return current;
   }
 
   public boolean hasNext(){
      return current.hasNext();
   }
 
   // GETTERS ----
   public Node getFirst(){
      return first;
   }
   
   public Node getLast(){
      return last; 
   }
   
   public Node getCurrent(){
      return current;
   }
   
   public Node get(int index){
      Node n = first;
      int i = 0;
      
      if(first != null && index==0){
         return first;
      }else if(index == counter-1){
         return last;
      
      }else{
         while(n.hasNext()){
            if(i == index){
               return n;
            }
            n = n.next(); 
            i++;
         }//end while
         
      }//end if
      return null;
   }//end get
   
   public boolean remove(Node n){
      for(int i =0; i < counter; i++){
         Node searchNode = get(i);
         
         if(searchNode.equals(n)){
            Node removedNodesPrev = searchNode.prev;
            Node removedNodesNext = searchNode.next;
            
            // Here we will have problems if we try and remove
            // first or last node (anything in between is good to go
            removedNodesPrev.next = removedNodesNext;
            removedNodesNext.prev = removedNodesPrev;
            
            return true;         
         }//end if
      }//end for
      
      return false;
      
   }//end remove
   
   
   // Add a node to linked list
   public void addNode(String value){
      Node newNode;
      if(first == null){
         newNode = new Node(value);
         first = newNode;
         current = newNode;
      }else{
         newNode = new Node(value, last);
      }
      
      last = newNode; 
      counter++;
   }
   
  
   public String toString(){
      Node n = first;
      String output = "";
      
      if(first != null){
         output += "["+first.toString()+"]";
         
         while(n.hasNext()){
            n = n.next(); 
            output += "->[" + n.toString() + "]";
         }
      }
      return output;
   }

}//END ITERATOR CLASS

class driver{
   public static void main(String[] args){
      iterator myNodes = new iterator();
      myNodes.addNode("Marius");
      myNodes.addNode("Tom");
      myNodes.addNode("Will");
      myNodes.addNode("Molly");
   
      System.out.println(myNodes);

      myNodes.remove(myNodes.get(2));
      System.out.println(myNodes);

      myNodes.addNode("Steve");
      
      System.out.println(myNodes);
      
      System.out.println(myNodes.first.next().next());
      System.out.println(myNodes.getCurrent());


   }
}