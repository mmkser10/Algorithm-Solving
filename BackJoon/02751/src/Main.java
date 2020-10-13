import java.io.*;

public class Main {

    public static int[] sorted_number;

    public static void mergeSort(int[] number, int left, int pivot, int right){
        int i = left;
        int j = pivot+1;
        int k = left;
        int l;
        while(i <= pivot && j <= right){
            if(number[i] <= number[j])
                sorted_number[k++] = number[i++];
            else
                sorted_number[k++] = number[j++];
        }

        if(i > pivot){
            for(l=j ; l <= right ; l++)
                sorted_number[k++] = number[l];
        }
        else{
            for(l=i ; l <= pivot ; l++)
                sorted_number[k++] = number[l];
        }

        for(l=left ; l <= right ; l++)
            number[l] = sorted_number[l];
    }


    public static void partiton(int number[], int left, int right){
        int pivot;
        if(left < right){
            pivot = (left+right)/2;
            partiton(number, left, pivot);
            partiton(number,pivot+1, right);
            mergeSort(number, left, pivot, right);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());
        int number[] = new int[loop];
        sorted_number = new int[loop+1];

        for(int i = 0 ; i < loop ; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        partiton(number, 0, number.length-1);

        for(int i = 0 ; i < loop ; i++){
            bw.write(String.valueOf(number[i]));
            bw.newLine(); //줄바꿈
        }

        bw.flush();
        bw.close();

    }
}
