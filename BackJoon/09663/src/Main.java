import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;
    static int success = 0;
    static boolean visit[][];

    public static void dfs(int n, int m, int d){
        int loop_count = 0;

        if(m == d && success == n){
            count++;
            success=0;
            return;
        }

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++) {
                if (!visit[i][j]) {
                    for (int a = 1; a <= n; a++) {
                        visit[i][a] = true;
                        visit[a][j] = true;
                    } // 가로세로 제거
                    while (loop_count < 4) {
                        int x = i;
                        int y = j;
                        switch (loop_count++) {
                            case 0:
                                while (0 < x && x <= n && 0 < y && y <= n) {
                                    visit[x++][y++] = true;
                                }
                                break;
                            case 1:
                                while (0 < x && x <= n && 0 < y && y <= n) {
                                    visit[x++][y--] = true;
                                }
                                break;
                            case 2:
                                while (0 < x && x <= n && 0 < y && y <= n) {
                                    visit[x--][y++] = true;
                                }
                                break;
                            case 3:
                                while (0 < x && x <= n && 0 < y && y <= n) {
                                    visit[x--][y--] = true;
                                }
                                break;
                        }
                    }// 대각선 제거
                    success++;
                    dfs(n, m, d + 1);
                }
                loop_count = 0;
                while (loop_count < 4) {
                    int x = i;
                    int y = j;
                    switch (loop_count++) {
                        case 0:
                            while (0 < x && x <= n && 0 < y && y <= n) {
                                visit[x++][y++] = false;
                            }
                            break;
                        case 1:
                            while (0 < x && x <= n && 0 < y && y <= n) {
                                visit[x++][y--] = false;
                            }
                            break;
                        case 2:
                            while (0 < x && x <= n && 0 < y && y <= n) {
                                visit[x--][y++] = false;
                            }
                            break;
                        case 3:
                            while (0 < x && x <= n && 0 < y && y <= n) {
                                visit[x--][y--] = false;
                            }
                            break;
                    } //초기화
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        visit = new boolean[n+1][n+1];
        dfs(n, n, 0);
       System.out.println(count);
    }
}
