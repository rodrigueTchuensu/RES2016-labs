
package ch.heigvd.res.io;

import java.io.PrintStream;

//This class enable us define a serializer which formats the data to the csv format and then 
// store it to a csv file.
public class CsvSerializer implements ISerializer{
   
  public CsvSerializer() {}
  
  public void serialize(IData data, PrintStream printStream){
     
     //formatting the Data according to the csv format
     String csv = ((MyData)data).getOperation() + "," +
                  ((MyData)data).getStrategy() + "," +
                  ((MyData)data).getBlockSize() + "," +
                  ((MyData)data).getFileSizeInBytes() + "," +
                  ((MyData)data).getDurationInMs() ;
     
     //writing to the csv file through a PrinStream connection to the file
     printStream.println(csv);
  }
  
}
