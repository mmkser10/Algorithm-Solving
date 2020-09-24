import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static long[] memorization;

    public static long fibo(long number){
        if(number <= 2) return number == 0 ? 0 : 1;
        if(memorization[(int)number] != 0){
            return memorization[(int)number];
        }
        memorization[(int)number] = fibo(number - 1) + fibo(number - 2);
        return memorization[(int)number];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        memorization = new long[number+1];
        System.out.println(fibo((long)number));
    }
}
