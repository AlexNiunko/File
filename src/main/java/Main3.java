import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("readme.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String str= bufferedReader.readLine();
        while ((str= bufferedReader.readLine())!=null){
            System.out.println(str);
        }
    }
}
