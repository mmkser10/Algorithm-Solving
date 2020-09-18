import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String[] words = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;


        for(int i = 0 ; i < words.length ; i++){
            word = word.replace(words[i], "!");
        }
        System.out.print(word.length());

    }
}
