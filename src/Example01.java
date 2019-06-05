import java.io.FileReader;

public class Example01 {
    public static void main(String[] args)throws Exception {
        FileReader reader = new FileReader("reader.txt");
        int ch;
        while ((ch = reader.read())!=-1){
            System.out.println((char) ch);
        }
        reader.close();
    }
}
