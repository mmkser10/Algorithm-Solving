import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if( B - 45 < 0){
            if( A - 1 < 0){
                System.out.println( 23 + " " + (B - 45 + 60) );
            }
            else
                System.out.println( (A - 1) + " " +(B - 45 + 60) );
        }
        else
            System.out.println( A + " " +(B - 45) );
    }
}
