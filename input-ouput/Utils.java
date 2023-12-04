import java.io.*;
import java.net.URL;

public class Utils {

    public static String readContentFromFile(String path){
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            String str;
            while((str = in.readLine()) != null){
                result.append(str).append('\n');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result.toString();
    }

    //delete the old content then replace with new one
    public static void writeContentToFile(String path){
        String content = "Hello this is an output test! \n"; //write this string to file
        //delete the content in the file then write new content
        try(BufferedWriter out = new BufferedWriter(new FileWriter(path))){
            out.write(content);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    //append new content to a file
    public static void addContentToAFile(String path){

        try(FileWriter fileWriter = new FileWriter("output.txt", true);
        PrintWriter pw = new PrintWriter(fileWriter)) {
            pw.println("new content!"); // add this string to file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static File findFileByName(String folderPath, String fileName){
        File folder = new File(folderPath);

        File[] file = folder.listFiles();

        assert file != null;
        for(var f : file){
            if(f.isFile() && f.getName().equals(fileName)){
                return f;
            }
        }

        return null;
    }

}
