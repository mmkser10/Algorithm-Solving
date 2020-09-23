import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int loop = Integer.parseInt(br.readLine());


        for(int i = 0 ; i < loop ; i++){
            st = new StringTokenizer(br.readLine());
            int x_One = Integer.parseInt(st.nextToken());
            int y_One = Integer.parseInt(st.nextToken());
            int r_One = Integer.parseInt(st.nextToken());
            int x_Two = Integer.parseInt(st.nextToken());
            int y_Two = Integer.parseInt(st.nextToken());
            int r_Two = Integer.parseInt(st.nextToken());

            double r = Math.pow(x_Two-x_One, 2) + Math.pow(y_Two-y_One, 2);
            double add_r = Math.pow(r_Two+r_One, 2);
            double min_r = Math.pow(r_Two-r_One, 2);

            if(x_One == x_Two && y_One == y_Two){
                if(r_One != r_Two){
                    System.out.println(0);
                }
                else{
                    System.out.println(-1);
                }
            }
            else{
                if(add_r < r || r < min_r){
                    System.out.println(0);
                }
                else if(add_r == r || min_r == r){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }


        }
    }
}
