import java.io.FileWriter;

public class Example02 {
    public static void main(String[] args)throws Exception {
        FileWriter writer = new FileWriter("writer.txt");
        String str = "你好";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
    }
}
