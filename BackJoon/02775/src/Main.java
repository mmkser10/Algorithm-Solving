import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < loop ; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int building[][] = new int[k+1][n];

            for(int j = 0 ; j < k+1 ; j++){
                for(int q = 0 ; q < n ; q++){
                    if(q == 0){
                        building[j][q] = 1;
                    }
                    else if(j == 0){
                        building[j][q] = q+1;
                    }
                    else{
                        building[j][q] = building[j][q-1] + building[j-1][q];
                    }
                }
            }
            System.out.println(building[k][n-1]);
        }
    }
}
