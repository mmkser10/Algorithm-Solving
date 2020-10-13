import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number[] = new int[10001];
        int loop = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < loop ; i++){
            number[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 1 ; i < number.length ; i++){
            if( number[i] == 0 )
                continue;
            for(int j = 0 ; j < number[i] ; j++){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
