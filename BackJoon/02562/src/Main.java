import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        int max = 0;
        int result = 0;

        for(int i = 0 ; i < array.length ; i++){
            array[i] = Integer.parseInt(br.readLine());
            if(array[i] > max){
                max = array[i];
                result = i+1;
            }
        }
        System.out.println(max);
        System.out.println(result);
    }
}
