import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int sort[] = new int[loop];

        for(int i = 0 ; i < loop ; i++){
            sort[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(sort);
        for(int i = 0 ; i < loop ; i++){
            System.out.println(sort[i]);
        }
    }
}
