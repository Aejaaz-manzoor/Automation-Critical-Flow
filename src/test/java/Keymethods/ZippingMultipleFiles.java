package Keymethods;
import java.io.BufferedInputStream;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.util.zip.ZipEntry;  
import java.util.zip.ZipOutputStream;  
public class ZippingMultipleFiles   
{  
  public static void main(String[] args)   
  {  
    try   
    {  
      //Source files  
    String fileName1 = "\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\07062023\\extentreport.html";  
    String fileName2 = "\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\07062023\\Screenshot1.png";  
      //Zipped file  
      String zipFilename = "\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\07062023.zip";  
      File zipFile = new File(zipFilename);  
      FileOutputStream fos  = new FileOutputStream(zipFile);              
      ZipOutputStream zos = new ZipOutputStream(fos);  
      zipFile(fileName1, zos);  
     zipFile(fileName2, zos);  
      zos.close();  
    }   
    catch (IOException e)   
    {  
      e.printStackTrace();  
    }  
  }  
  // Method to zip file  
  private static void zipFile(String fileName, ZipOutputStream zos) throws IOException  
  {  
    final int BUFFER = 1024;  
    BufferedInputStream bis = null;  
    try  
    {  
      File file = new File(fileName);  
      FileInputStream fis = new FileInputStream(file);  
      bis = new BufferedInputStream(fis, BUFFER);            
  
      // ZipEntry --- Here file name can be created using the source file  
      ZipEntry zipEntry = new ZipEntry(file.getName());          
      zos.putNextEntry(zipEntry);  
      byte data[] = new byte[BUFFER];  
      int count;  
      while((count = bis.read(data, 0, BUFFER)) != -1)   
      {  
        zos.write(data, 0, count);  
      }    
      // close entry every time  
      zos.closeEntry();  
    }   
    finally  
    {  
      try   
      {  
        bis.close();  
      }   
      catch (IOException e)   
      {  
        e.printStackTrace();  
      }    
    }  
  }  
}