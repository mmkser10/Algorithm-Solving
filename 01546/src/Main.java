import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int length = Integer.parseInt(br.readLine());
        double max = 0;
        double sum = 0;
        st = new StringTokenizer(br.readLine());
        double[] loop = new double[length];

        for(int i = 0 ; i < loop.length ; i++ ){
           loop[i] = Double.parseDouble(st.nextToken());
           if(max < loop[i]){
               max = loop[i];
           }
        }
        for(int j = 0 ; j < loop.length ; j++ ){
            sum = sum + loop[j]/max*100;
        }

        System.out.println(String.format("%f", sum/loop.length));
    }
}
