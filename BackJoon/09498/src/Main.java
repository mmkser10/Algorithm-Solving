import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int A = Integer.parseInt(st.nextToken());

        if(A >= 60){
            if(A >= 70){
                if(A >= 80){
                    if(A >= 90){
                        System.out.println("A");
                    }
                    else
                        System.out.println("B");
                }
                else
                    System.out.println("C");
            }
            else
                System.out.println("D");

        }
        else
            System.out.println("F");

    }
}
