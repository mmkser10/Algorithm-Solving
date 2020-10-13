import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        ArrayList<String> word = new ArrayList<>();
        String tmp;


        for(int i = 0 ; i < loop ; i++){
            tmp = br.readLine();
            if(word.contains(tmp))
                continue;
            word.add(tmp);
        }

        Comparator<String> customC = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                }
                else if(o1.length() == o2.length()) {
                    if (o1.compareTo(o2) >= 0) {
                        return 1;
                    }
                }
                else {
                    return -1;
                }
                return -1;
            }
        };

        Collections.sort(word, customC);
        for(int i = 0 ; i < word.size() ; i++){
            System.out.println(word.get(i));
        }

    }
}
