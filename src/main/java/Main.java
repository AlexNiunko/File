import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        if (!(Files.exists(Paths.get("readme.txt")))) {
            Files.createFile(Paths.get("readme.txt"));
        }
        Files.delete(Paths.get("readme.txt"));
    }
}
