public class Main {
    public static void main(String[] args) {
        boolean[] selfNumber = new boolean[10001];

        for(int i = 1 ; i < selfNumber.length ; i++) {
            int j = i;
            if (selfNumber[j]) {
                continue;
            }
            else {
                while (true) {
                    switch (String.valueOf(j).length()) {
                        case 1:
                            j = j + j;
                            break;
                        case 2:
                            j = j / 10 + j % 10 + j;
                            break;
                        case 3:
                            j = j / 100 + j % 100 / 10 + j % 10 + j;
                            break;
                        case 4:
                            j = j / 1000 + j % 1000 / 100 + j % 100 / 10 + j % 10 + j;
                            break;
                        case 5:
                            j = j / 10000 + j % 10000 / 1000 + j % 1000 / 100 + j % 100 / 10 + j % 10 + j;
                            break;
                    }
                    if (j > 10000) {
                        break;
                    }
                    else {
                        selfNumber[j] = true;
                    }
                }
            }
        }
        for(int i = 1 ; i < selfNumber.length ; i++){
            if (!selfNumber[i]) {
                System.out.println(i);
            }
        }
    }
}
