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
            long x_Location = Integer.parseInt(st.nextToken());
            long y_Location = Integer.parseInt(st.nextToken());
            long cycle = 0;
            long distance = y_Location-x_Location;
            for(long j = 0 ; ; j++) {
                if(distance <= j*(j+1) && distance > j*(j-1)){
                    cycle = j*2;
                    if(distance-j*(j-1)>j){
                        System.out.println(cycle);
                    }
                    else {
                        System.out.println(cycle-1);
                    }
                    break;
                }

            }
        }

    }
}
