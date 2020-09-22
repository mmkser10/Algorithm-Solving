import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int i = 1;
        int count = 0;

        while(true){
            count = count + i;
            if(number <= count ){
                count = count - number;
                if(i%2 == 1) {
                    System.out.println((1 + count) + "/" + (i - count));
                }
                else{
                    System.out.println((i - count) + "/" + (1 + count));
                }
                break;
            }
            i++;
        }

    }
}
