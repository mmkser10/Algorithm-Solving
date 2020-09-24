import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader in_data = new BufferedReader(new InputStreamReader(System.in));
        String read_Data = in_data.readLine();
        int counter = 0;
        StringTokenizer cutting_data = new StringTokenizer(read_Data);
        System.out.print(cutting_data.countTokens());


    }
}
