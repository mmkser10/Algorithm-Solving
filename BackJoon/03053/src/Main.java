import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radius = Integer.parseInt(br.readLine());

        System.out.println(Math.PI*Math.pow(radius, 2));
        System.out.println(2*Math.pow(radius, 2));
    }
}
