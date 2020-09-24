import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static long factorial(long number){
        if(number == 1 || number == 0) return 1;
        return factorial(number-1)*number;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Integer.parseInt(br.readLine());
        long answer = factorial(number);
        System.out.print(answer);
    }
}
