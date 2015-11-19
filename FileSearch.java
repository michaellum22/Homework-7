/* I had help from the site http://www.avajava.com/tutorials/lessons/how-do-i-recursively-display-all-files-and-directories-in-a-directory.html,
as well as the site:http://tutorials.jenkov.com/java-io/file.html#makeDir for this homework. I also learned that some Java packages provide
the appropiate functions for this type of work, such as .getCanonicalPath from the  java.io.File package.
I also ran this code on my Guest account on my Mac*/
import java.io.File;
import java.io.IOException;

public class FileSearch {
    
    public static void main(String[] args)
    {
       
        int j = 0;
        File file = new File("/");
        
        while (file.isDirectory()){
            String[] fileNames = file.list();

            File[] files = file.listFiles();
            for (File filefolder: files) {
                if (filefolder.isDirectory()) {
                    try {
                        System.out.println(filefolder.getCanonicalPath());
                    } catch (IOException e) {
                       
                        e.printStackTrace();
                    }
                    
                    System.out.print(fileNames[j]);
                    j++;
                    
                }
            }
        }
    }
}


