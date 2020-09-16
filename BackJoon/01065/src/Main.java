import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numberString = br.readLine();
        int numberInteger = Integer.parseInt(numberString);

        if( numberInteger < 100) {
            System.out.println(numberInteger);
        }
        else {
            boolean[] check = new boolean[numberInteger+1];
            int count = 0;
            for(int i = 1 ; i < 100 ; i++) {
                check[i] = true;
            }
            for(int i = 100 ; i < check.length ; i++) {
                int A = i / 100;
                int B = i % 100 / 10;
                int C = i % 10;
                if (C - B == B - A) {
                    check[i] = true;
                }
            }
            for(int i = 1 ; i < check.length ; i++) {
                if(check[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
