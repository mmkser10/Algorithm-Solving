import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int dot[][] = new int[loop][2];
        StringTokenizer st;


        for(int i = 0 ; i < loop ; i++){
            st  = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 2 ; j++){
                dot[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Comparator<int[]> customC = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                }
                return Integer.compare(o1[0], o2[0]);
            }
        };
        Arrays.sort(dot, customC);

        for(int i = 0 ; i < loop ; i++){
            System.out.println(dot[i][0] + " " + dot[i][1]);
        }
    }
}
