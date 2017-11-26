import java.util.*;


public class Block{
   int index;
   Date date;
   String data;
   public String previousHash;
   public String hash;
   
   public Block(int index, Date date, String data, String previousHash){
      this.index = index;
      this.date = date;
      this.data = data;
      this.previousHash = previousHash;  

   }
   
   public String calculateHash(){
      String sha = sha256.getHash(this.index + this.previousHash + this.data + this.date.toString());
      return sha;
   }//end calc hash
   
   
   public String toString(){
      return index+" "+hash+" " + data+" " + date+" " + previousHash;
   }

}//end class

class BlockChain{
   ArrayList<Block> chain = new ArrayList<Block>();
   public BlockChain(){
      this.chain.add( createGenesisBlock() );
   }
   
   public Block createGenesisBlock(){
      Block b = new Block(0, new Date(1,1,1900), "Genesis", "0");
      b.hash = b.calculateHash(); 
      return b;
   }
   
   public Block getLatestBlock(){
      return this.chain.get(this.chain.size()-1);
   }
   
   private void addBlock(Block newBlock){
      newBlock.previousHash = this.getLatestBlock().hash;
      newBlock.hash = newBlock.calculateHash();
      this.chain.add(newBlock);
      
   } 
   
   public boolean isChainValid(){
      for(int i = 1; i < this.chain.size(); i++){
         Block currentBlock = this.chain.get(i);
         Block prevBlock = this.chain.get(i - 1);
              
         if( !currentBlock.hash.equals(currentBlock.calculateHash()) ){
            return false;
         }
         
         if( !currentBlock.previousHash.equals(prevBlock.hash) ){
            return false;
         }
      
      }
      
      return true;
   } 
   
   public String toString(){
     String d = "";
     for(int i = 0; i < this.chain.size(); i++){
         d += this.chain.get(i)+"\n";
     }
     return d;
   }
   
   
   public static void main (String[] args){
      BlockChain BC = new BlockChain();
      BC.addBlock(new Block(1, new Date(11, 5, 2017), "Marius", BC.getLatestBlock().hash ));
      BC.addBlock(new Block(2, new Date(11, 5, 2017), "Marius", BC.getLatestBlock().hash ));
      BC.addBlock(new Block(3, new Date(11, 5, 2017), "Marius", BC.getLatestBlock().hash ));
      BC.addBlock(new Block(4, new Date(11, 5, 2017), "Marius", BC.getLatestBlock().hash ));

      System.out.println(BC.isChainValid());
      Block b = new Block(5, new Date(11, 5, 2017), "Marius", BC.getLatestBlock().hash);
      BC.addBlock(b);
      b.data = "Differnet";
   
      System.out.println(BC.isChainValid());
      
      System.out.println(BC);
      
   }
   
   
}

