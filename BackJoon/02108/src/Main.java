import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int[] number = new int[loop];
        int[] result = new int[loop+1];
        int[] counting_sort = new int[8001];
        int max = 0;
        boolean multi = false;
        double ans_One = 0;
        int ans_Two = 0;

        for(int i = 0 ; i < loop ; i++){
            int data = Integer.parseInt(br.readLine());
            number[i] = data;
            ans_One += data;
            counting_sort[data+4000]++;
        }

        for(int i = 0 ; i < counting_sort.length ; i++){
            if(max < counting_sort[i]){
                multi=false;
                max = counting_sort[i];
            }
            else if( max == counting_sort[i]){
                multi=true;
            }
        }

        for(int i = 0 ; i < counting_sort.length ; i++){
            if( max == counting_sort[i] && multi){
                multi=false;
            }
            else if (max == counting_sort[i] && !multi){
                ans_Two = i-4000;
                break;
            }
        }

        for(int i = 1 ; i < counting_sort.length ; i++){
            counting_sort[i] = counting_sort[i]+counting_sort[i-1];
        }

        for(int i = 0 ; i < number.length ; i++){
            result[counting_sort[number[i]+4000]--] = number[i];
        }

        System.out.println((int)Math.rint(ans_One/loop));
        System.out.println(result[result.length/2]);
        System.out.println(ans_Two);
        System.out.println(result[result.length-1] - result[1]);
    }
}