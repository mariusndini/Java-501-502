class Link {
   String name;

   Link next;
   Link prev;
   
   //constructors
   public Link(String name){
      this.name = name;
   }
   
   public Link(String name, Link p){
      this.name = name;
      
      this.prev = p;
      p.next = this;
   }
   
   //getter
   public String getName(){
      return name;
   }
   
   public Link getNext(){
      return next;
   }
   public Link getPrev(){
      return prev;
   }
   
}


class driver{
   public static void main(String[] args){
      Link linkOne = new Link("Tom");
      Link _2 = new Link("Mike", linkOne);
      Link _3 = new Link("Sally", _2);
      Link _4 = new Link("Salman", _3);
   
      System.out.println(
         linkOne.getNext().getName());
   }

}



