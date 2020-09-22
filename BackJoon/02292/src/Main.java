import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int counter = 0;
        int bee = 1;
        while (true) {
            bee = bee + counter*6;
            if(number <= bee){
                break;
            }
            counter++;
        }
        System.out.println(counter+1);
    }
}
