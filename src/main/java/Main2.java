import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) throws IOException {
        if (!(Files.exists(Paths.get("readme.txt")))) {
            Files.createFile(Paths.get("readme.txt"));
        }
        String str="Я люблю джава";
        File file =new File("readme.txt");
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();
    }
}
