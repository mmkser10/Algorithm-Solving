import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int deliver = Integer.parseInt(br.readLine());

        int A, B;
        int ans = -1;

        for(A = 0 ; A <= deliver/3 ; A++){
            B = deliver-3*A;
            if(B%5 == 0){
                ans = A+B/5;
                break;
            }
        }

        System.out.println(ans);

    }
}
