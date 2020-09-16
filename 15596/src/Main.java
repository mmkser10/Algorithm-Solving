public class Main {
    long sum(int[] a){
        long add = 0;
        for(int i = 0 ; i < a.length ; i++){
            add += a[i];
        }
        return add;
    }
}
