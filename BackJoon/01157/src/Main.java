import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in_data = new Scanner(System.in);
        String words = in_data.next();
        int word_count[] = new int[26];
        int word_Freq = 0;
        int answer=0;
        words = words.toUpperCase();

        if(words.length() == 1){
            System.out.print(words);
            return;
        }

        for(int i = 0 ; i < words.length() ; i++){
            word_count[(int)words.charAt(i) - 'A']++;
            word_Freq=Math.max(word_count[ (int)words.charAt(i) - 'A' ], word_Freq);
        }
        for(int j = 0 ; j < word_count.length ; j++){
            if(word_count[j] == word_Freq){
                answer=j;
                break;
            }
        }
        Arrays.sort(word_count);
        if(word_count[word_count.length-1] == word_count[word_count.length-2]){
            System.out.print("?");
        }
        else {
            answer=answer+'A';
            System.out.print((char)answer);
        }
    }
}

// 개선점
// 코드 단순화 해볼 것! (조건처리 단순화)