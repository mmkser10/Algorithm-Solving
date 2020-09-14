import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] counter = new int[42];
        int answer = 0;
        int index = 0;

        for(int i = 0 ; i < 10 ; i++){
            index = Integer.parseInt(br.readLine())%42;
            if(counter[index] != 0){
                continue;
            }
            else {
                counter[index]++;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
