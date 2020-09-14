import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int div = 0;
        int index = 0;

        for(int i = 0 ; i < 5 ; i++) {
            st = new StringTokenizer(br.readLine());
            index = Integer.parseInt(st.nextToken());
            if(index < 40){
                div = div+40;
            }
            else {
                div = div + index;
            }
        }
        System.out.println(div/5);
    }
}
