import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = 0;
        int second = 0;
        int index = 0;
        //0 0 0 -> 20 0 20 -> 30 20 30 -> 10
        //30 0 30
        for(int i = 0 ; i < 3 ; i++){
            index = Integer.parseInt(st.nextToken());
            if(index >= second){
                if(index >= first){
                    second = first;
                    first = index;
                }
                else
                    second = index;
            }
        }

        System.out.println(second);


        /*
        ArrayList index = new ArrayList<Integer>();

        for(int i = 0 ; i < 3 ; i++){
            index.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(index);
        System.out.println(index.get(1));*/
    }
}
