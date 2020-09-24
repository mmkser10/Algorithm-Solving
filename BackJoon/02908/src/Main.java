import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String first = st.nextToken();
        String second = st.nextToken();

        for(int i = 2 ; i >= 0 ; i--){
            if(first.charAt(i) > second.charAt(i)){
                for(int j = first.length() ; j > 0 ; j--){
                    System.out.print(first.charAt(j-1));
                }
                break;
            }
            else if(first.charAt(i) < second.charAt(i)){
                for(int j = second.length() ; j > 0 ; j--){
                    System.out.print(second.charAt(j-1));
                }
                break;
            }
        }
    }
}
