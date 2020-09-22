import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int prime_NM = 0;

        boolean[] prime = new boolean[N+1];
        if(prime.length > 1){
            if(prime.length > 0){
                prime[0] = true;
            }
            prime[1] = true;
        }


        for(int i = 2 ; (i*i) < prime.length ; i++){
            if(!prime[i]){
                for(int j = i*i ; j < prime.length ; j+=i){
                    prime[j] = true;
                }
            }
        }
        for(int k = M ; k < prime.length ; k++){
            if(!prime[k]){
                System.out.println(k);
            }
        }
    }
}

