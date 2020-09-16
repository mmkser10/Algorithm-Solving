import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberCount = Integer.parseInt(br.readLine());
        int sum = 0;
        String numberString = br.readLine();

        for(int i = 0 ; i < numberCount ; i++){
            sum = sum + Integer.parseInt(numberString.substring(i, i+1));
        }
        System.out.println(sum);
    }
}
