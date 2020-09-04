import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in_data = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(in_data.readLine());
        StringTokenizer data_split = null;

        for(int x = 0 ; x < loop ; x++) {
            data_split = new StringTokenizer(in_data.readLine());
            int first = Integer.parseInt(data_split.nextToken());
            int second = Integer.parseInt(data_split.nextToken());

            System.out.println(first + second);
        }
    }
}
