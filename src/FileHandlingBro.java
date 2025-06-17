import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingBro {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
//            Buffered Writer Is Used to Write Bulk Paragraphs
            BufferedWriter bw = new BufferedWriter(fw);
//            fw.write("Hello I am Cristiano Ronaldo");
            bw.write("Hello I Am Cristiano Ronaldo");
            bw.newLine();
//            bw.append("Remember the Name Leo Messi");
            bw.write("Remember the Name Leo Messi");
            bw.newLine();
            bw.write("Hello I Am Jagan YaDEV");
            bw.newLine();
            bw.write("Bye Guys Hope You Are Doing Good");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
