import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int count = loop;

        for(int i  = 0 ; i < loop ; i++){
            String word = br.readLine();
            boolean[] wordCount = new boolean[26];
            for(int j = 0 ; j < word.length() ; j++){
                if(j < word.length() - 1) {
                    if (word.charAt(j) != word.charAt(j + 1)) {
                        if (wordCount[word.charAt(j) - 'a']) {
                            count--;
                            break;
                        }
                        else {
                            wordCount[word.charAt(j) - 'a'] = true;
                        }
                    }
                }
                else{
                    if(wordCount[word.charAt(j) - 'a']){
                        count--;
                        break;
                    }
                    else {
                        wordCount[word.charAt(j) - 'a'] = true;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
