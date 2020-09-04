import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader를 이용해서 여러줄을 처리하는 방법이 없을까?
        StringTokenizer stA  = new StringTokenizer(br.readLine(), "\n");
        StringTokenizer stB  = new StringTokenizer(br.readLine(), "\n");

        int A = Integer.parseInt(stA.nextToken());
        int B = Integer.parseInt(stB.nextToken());

        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}
