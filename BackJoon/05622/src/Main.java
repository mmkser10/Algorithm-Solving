import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] wordCount = new int[26];
        int x = 3;
        int sum = 0;

        for(int i = 0 ; i < wordCount.length ; i++){
            if(i == 'P'-'A' || i == 'W'-'A') {
                wordCount[i++] = x;
                wordCount[i++] = x;
                wordCount[i++] = x;
                wordCount[i] = x++;
            }
            else{
                wordCount[i++] = x;
                wordCount[i++] = x;
                wordCount[i] = x++;
            }
        }

        for(int j = 0 ; j < word.length() ; j++){
            sum += wordCount[word.charAt(j) - 'A'];
        }
        System.out.print(sum);
    }
}
