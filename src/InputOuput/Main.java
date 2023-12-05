package InputOuput;

public class Main {
    public static void main(String[] args){
        System.out.println(InputOuput.Utils.readContentFromFile("input.txt"));
        InputOuput.Utils.writeContentToFile("output.txt");
        InputOuput.Utils.addContentToAFile("output.txt");
        System.out.println(InputOuput.Utils.readContentFromFile("output.txt"));
        if(Utils.findFileByName("C:\\Users\\Admin\\git\\bTVN", "input.txt") != null){
            System.out.println("Found file!: " + Utils.findFileByName("C:\\Users\\Admin\\git\\bTVN", "input.txt"));
        }
        else {
            System.out.println("File not found!");
        }
    }
}
