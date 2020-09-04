import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int fOr = Integer.parseInt(st.nextToken());
        int iF = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= fOr ; i++){
            int A = Integer.parseInt(st.nextToken());
            if(A < iF){
                list.add(A);
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i));
            if( i != list.size()-1){
                System.out.print(" ");
            }
        }
    }
}
