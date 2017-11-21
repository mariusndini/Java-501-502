// Example Interface
// Any Class which implements this interface 
// HAS TO define precedes and follows as well !!

//     For objects of the class o1 and o2,
//     o1.follows(o2) == o2.preceded(o1).
    


public interface Ordered{
    public Node getPrev();
    public Node getNext(); 
}

