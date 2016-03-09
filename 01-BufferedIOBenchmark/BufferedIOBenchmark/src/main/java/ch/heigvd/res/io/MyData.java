
package ch.heigvd.res.io;

//This class defines de specific data object to acheive the required task of the 
//exercice
public class MyData implements IData{
   //operation,strategy,blockSize,fileSizeInBytes,durationInMs
   private String operation;
   private String strategy;
   private int blockSize;
   private long fileSizeInBytes;
   private long durationInMs;
   
   //constructor of the class
   public MyData(String operation,String strategy,int blockSize,long fileSize, long duration){
      this.operation = operation;
      this.strategy = strategy;
      this.blockSize = blockSize;
      fileSizeInBytes = fileSize;
      durationInMs = duration;
   }

//This methode returns the type of operation that lead to the generation/consumption 
// of the data
   public String getOperation() {
      return operation;
   }

 //This methode returns the strategy used to generate/consume the data
   public String getStrategy() {
      return strategy;
   }
//This methode returns the block size of the data generated/consumed 
   public int getBlockSize() {
      return blockSize;
   }

   //This methode returns the file size in Byte of the data generated/consumed 
   public long getFileSizeInBytes() {
      return fileSizeInBytes;
   }

  //This methode returns the time taken in Milli seconds to generate/consume the data  
   public long getDurationInMs() {
      return durationInMs;
   }
      
}
