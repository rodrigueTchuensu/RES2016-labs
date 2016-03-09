package ch.heigvd.res.io;


import java.io.IOException;
import java.io.PrintStream;

public class FileRecorder implements IRecorder {
   private String fileName; //csv file
   private ISerializer serializer; //csv serializer
   private PrintStream printStream; // PrintStream Stream used to connect to our file

   public FileRecorder(String fileName, ISerializer serializer) {
      this.fileName = fileName;
      this.serializer = serializer;
   }

   public void init() {
      try {
         printStream = new PrintStream(fileName);
      } 
      catch (IOException ex) {
         if (printStream != null) {
            printStream.close();
         }
         ex.getMessage();
      }
      printStream.println("operation,strategy,blockSize,fileSizeInBytes,durationInMs");
   }
   
   //This methode enable us to close our file by interruption our connection
   public void close(){
      printStream.close();
   }

   //This methode records(store) data in a csv file.
   // it makes use of csv-serializer and stream connected to our csv-file
   public void record(IData data) {
      ((CsvSerializer) serializer).serialize(data, printStream);
   }
}

