import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int I = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int result_X = 0;
        int result_Y = 0;

        if(X == I){
            result_X = K;
        }
        else if(X == K){
            result_X = I;
        }
        else{
            result_X = X;
        }


        if(Y == J){
            result_Y = L;
        }
        else if(Y == L){
            result_Y = J;
        }
        else{
            result_Y = Y;
        }

        System.out.println(result_X + " " + result_Y);

    }
}
