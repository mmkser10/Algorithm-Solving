import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int loopA = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < loopA ; i++){
            st = new StringTokenizer(br.readLine());
            int loopB = Integer.parseInt(st.nextToken());
            int[] array = new int[loopB];
            double add = 0;
            double div = 0;
            double counter = 0;


            for(int j = 0 ; j < loopB ; j++){
                array[j]=Integer.parseInt(st.nextToken());
                add = add + array[j];
            }

            div = add/loopB;

            for(int z = 0 ; z < loopB ; z++){
                if(array[z] > div){
                    counter++;
                }
            }

            System.out.println( String.format("%.3f",counter/loopB*100) + "%");
        }
    }
}
