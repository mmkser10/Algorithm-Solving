import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double[] number = new double[3];
            number[0] = Integer.parseInt(st.nextToken());
            number[1] = Integer.parseInt(st.nextToken());
            number[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(number);
            String result = "wrong";

            if(number[0] == 0 && number[1] == 0 && number[2] == 0){
                break;
            }
            else if(Math.pow(number[2], 2) ==  (Math.pow(number[1], 2) + Math.pow(number[0], 2)) ){
                result = "right";
            }
            System.out.println(result);
        }
    }
}
