package sdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        String dirPath = "data";
        String fileName = "data.txt";

        //create a directory
        File newDir = new File(dirPath);
        boolean  isDirCreated = newDir.mkdir();

        if(isDirCreated){
            System.out.println("New directory " + dirPath + " created");
        }
        else{
            System.out.println("Directory " + dirPath + " already exist");
        }

        //create a file in the directory created above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if(isFileCreated){
            System.out.println("New File " + fileName + " created");
        }
        else{
            System.out.println("File " + fileName + " already exist");
        }

        File fileList[] = newDir.listFiles();
        for (File f:fileList){
            System.out.println("File " + f.getPath() + ":" + f.getCanonicalPath());
        }

        FileOutputStream fos = new FileOutputStream(newFile,true);
        for(int i=0;i<10;i++){
            char str[] = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }

        String welcomeMessage = "Welcome to ISS TFIP";
        byte[] outputData = welcomeMessage.getBytes();
        fos.write(outputData);

        fos.flush();
        fos.close();
    }
}
