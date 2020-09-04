import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        StringTokenizer st = null;


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int x = 0 ; x < loop ; x++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            bw.write(first + second+"\n");
        }
        bw.flush();
        bw.close();
    }
}
