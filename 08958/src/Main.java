import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < max ; i++){
            String index = br.readLine();
            char[] list = index.toCharArray();
            int counter = 0;
            int sum = 0;
            for(int j = 0 ; j < list.length ; j++){
                if(list[j] == 'O'){
                    counter++;
                    sum += counter;
                }
                else{
                    counter = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
