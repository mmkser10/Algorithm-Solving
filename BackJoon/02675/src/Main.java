import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int loop = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < loop ; i++){
            st = new StringTokenizer(br.readLine());
            int wordloop = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for(int j = 0 ; j < word.length() ; j++){
                for( int k = 0 ; k < wordloop ; k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
