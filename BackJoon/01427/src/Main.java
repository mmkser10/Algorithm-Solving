import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        int i;
        int[] lower = new int[10];

        for(i = 0 ; i < number.length() ; i++){
            lower[number.charAt(i) - '0']++;
        }

        for(i = lower.length - 1 ; i >= 0 ; i--){
            if(lower[i] == 0)
                continue;
            for(int j = 0 ; j < lower[i] ; j++){
                System.out.print(i);
            }
        }
    }
}
