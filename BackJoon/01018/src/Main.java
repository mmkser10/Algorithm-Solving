import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chess = new char[N][M];
        char[] BW = new char[2];
        String point;
        int result = 100000;

        for(int i = 0 ; i < N ; i++){
            point = br.readLine();
            for(int j = 0 ; j < M ; j++){
                chess[i][j] = point.charAt(j);
            }
        }

        for(int x = 0 ; x <= N-8 ; x++){
            for(int y = 0 ; y <= M-8 ; y++){
                int count = 0;
                boolean black_Check;
                for(int a = 0+x ; a < 8+x ; a++){
                    int black = 0;
                    int white = 0;
                    for(int b = 0+y ; b < 8+y ; b++) {
                        if (chess[a][y + 0] == 'B') {
                            black_Check = true;
                        }
                        else {
                            black_Check = false;
                        }
                    }
                }
                result = Math.min(result, count);
            }
        }
        System.out.println(result);
    }
}
