import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int indexA = 0;
        int indexB = 0;
        int minA = 2001;
        int minB = 2001;

        for(int i = 0 ; i < 5 ; i++){
            st = new StringTokenizer(br.readLine());
            if(i < 3) {
                indexA = Integer.parseInt(st.nextToken());
                minA = indexA < minA ? indexA : minA;
            }
            else{
                indexB = Integer.parseInt(st.nextToken());
                minB = indexB < minB ? indexB : minB;
            }
        }
        System.out.println(minA+minB-50);
    }
}
