import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = Integer.parseInt(st.nextToken());
        if(index < 10){
            index = index*10;
        }
        int data = index;
        int counter = 0;

        while(true){
            counter++;
            int A = data/10;
            int B = data%10;
            int C = (A+B)%10;
            data = B*10+C;
            if(data == index){
                System.out.println(counter);
                break;
            }
        }

    }
}
