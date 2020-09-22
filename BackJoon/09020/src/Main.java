import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[10001];
        prime[0] = true;
        prime[1] = true;

        for(int i = 0 ; i < prime.length ; i++){
            if(!prime[i]){
                for(int j = i+i ; j < prime.length ; j+=i){
                    prime[j] = true;
                }
            }
        }

        for(int j = 0 ; j < loop ; j++){
            int A = 0;
            int B = 0;
            int N = Integer.parseInt(br.readLine());
            boolean find = false;

            for(int k = N/2 ; k >= 1 ; k--) {
                if (!prime[k]) {
                    A = k;
                    for (int l = N/2; l <= N; l++) {
                        if (!prime[l]) {
                            B = l;
                        }
                        if (A + B == N) {
                            System.out.println(A + " " + B);
                            find = true;
                            break;
                        }
                    }
                }
                if(find)
                    break;
            }
        }
    }
}
