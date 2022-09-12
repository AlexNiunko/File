import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while (true) {
            String s = bufferedReader.readLine();
            if (s.matches("[\\D]")){
                System.out.println("Некорректный ввод,введите еще раз");
                continue;
            } else if (s.equals("End")){
                break;
            }
            sum+=Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
