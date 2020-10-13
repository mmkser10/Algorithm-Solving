import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int loop = Integer.parseInt(br.readLine());
        String[][] data = new String[loop][2];

        for(int i = 0 ; i < loop ; i++){
            st = new StringTokenizer(br.readLine());
            data[i][0] = st.nextToken();
            data[i][1] = st.nextToken();
        }

        Comparator<String[]> customC = new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])){
                    return 1;
                }
                else if(Integer.parseInt(o1[0]) < Integer.parseInt(o2[0])){
                    return -1;
                }
                else
                    return 0;
            }
        };

        Arrays.sort(data, customC);
        for(int i = 0 ; i < loop ; i++){
            System.out.println(data[i][0] + " " + data[i][1]);
        }

    }
}
