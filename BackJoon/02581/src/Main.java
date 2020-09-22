import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int first = -1;

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
                if(first == -1){
                    first = k;
                }
                sum+=k;
            }
        }
        if(first == -1) {
            System.out.println(first);
        }
        else{
            System.out.println(sum);
            System.out.println(first);
        }
    }
}
