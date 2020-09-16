import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] wordCount = new int[26];

        for(int i = 0 ; i < word.length() ; i++){
            int index = word.substring(i, i+1).charAt(0)-'a';
            if(wordCount[index] == 0) {
                wordCount[index] = i + 1;
            }
        }
        for(int i = 0 ; i < wordCount.length ; i++){
            System.out.print(wordCount[i]-1 + " ");
        }
    }
}
