import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static char[][] point;

    public static void star(int number, int x, int y){
        if(number == 1){
            point[x][y] = '*';
            return;
        }
        int start = number / 3;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(i == 1 && j == 1) {
                    continue;
                }
                star(start, x+(start*i), y+(start*j));
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        point = new char[number][number];
        star(number, 0, 0);

        for(int x = 0 ; x < number ; x++){
            for(int y = 0 ; y < number ; y++){
                if(point[x][y]=='*') {
                    System.out.print(point[x][y]);
                }
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }
}
