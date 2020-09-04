import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(stA.nextToken());
        int B = Integer.parseInt(stB.nextToken());

        if(A > 0){
            if(B > 0){
                System.out.println(1);
            }
            else
                System.out.println(4);

        }
        else if(A < 0){
            if(B > 0){
                System.out.println(2);
            }
            else
                System.out.println(3);
        }


    }
}
