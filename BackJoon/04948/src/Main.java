import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] prime = new boolean[123456*2+1];
        prime[0] = true;
        prime[1] = true;
        for(int i = 2 ; (i*i) < prime.length ; i++){
            if(!prime[i]){
                for(int j = i+i ; j < prime.length ; j+=i){
                    prime[j] = true;
                }
            }
        }

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0){
                break;
            }
            int count = 0;
            for(int k = N + 1; k <= N*2 ; k++){
                if(!prime[k]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
