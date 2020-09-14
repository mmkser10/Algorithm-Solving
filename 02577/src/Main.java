import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double mul = Double.parseDouble(br.readLine()) * Double.parseDouble(br.readLine()) * Double.parseDouble(br.readLine());
        String number = String.format("%.0f", mul);
        int[] counter = new int[10];


        for(int i = 0 ; i < number.length() ; i++){

            counter[Character.getNumericValue(number.charAt(i))]++;
        }
        for(int j = 0 ; j < counter.length ; j++){
            System.out.println(counter[j]);
        }
    }
}
