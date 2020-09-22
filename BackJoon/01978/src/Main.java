import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int loop = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int result = 0;

        for(int i = 0 ; i < loop ; i++){
            int number = Integer.parseInt(st.nextToken());
            int count = 0;
            result++;
            for(int j = 1 ; j <= number ; j++){
                if(number%j == 0){
                    count++;
                }
                if(count > 2){
                    result--;
                    break;
                }
            }
            if(count == 1){
                result--;
            }
        }
        System.out.println(result);
    }
}
