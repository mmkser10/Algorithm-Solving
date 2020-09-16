import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < star*2-1 ; i++){
            if( i < star){
                for(int j = 0 ; j < i+1 ; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int k = i ; k < star*2-1 ; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
