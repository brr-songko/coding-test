package BOJ.src.n4673;

//	14480KB	164MS

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[10000];
        int n = 1;
        int tempN = 0;
        int one = 0;
        int ten = 0;
        int hun = 0;
        int thous = 0;
        int tenThous = 0;

        while(n <= 10000) {
            tempN = n;
            if (tempN < 10) {
                tempN = tempN + tempN;
            } else if (tempN >= 10 && tempN < 100) {
                tempN = tempN + tempN%10 + tempN/10;
            } else if (tempN >= 100 && tempN < 1000) {
                one = tempN % 10;
                tempN = tempN / 10;
                ten = tempN % 10;
                tempN = tempN / 10;
                hun = tempN % 10;
                tempN = n + hun + ten + one;
            } else if (tempN >= 1000 && tempN < 10000) {
                one = tempN % 10;
                tempN = tempN / 10;
                ten = tempN % 10;
                tempN = tempN / 10;
                hun = tempN % 10;
                tempN = tempN / 10;
                thous = tempN % 10;
                tempN = n + thous + hun + ten + one;
            } else {
                one = tempN % 10;
                tempN = tempN / 10;
                ten = tempN % 10;
                tempN = tempN / 10;
                hun = tempN % 10;
                tempN = tempN / 10;
                thous = tempN % 10;
                tempN = n + 1 + thous + hun + ten + one;
            }
            if(tempN <= 10000){
                arr[tempN - 1] = true;
            }
            n++;
        }

        for (int i = 0; i < 10000; i++) {
            if (!arr[i]) {
                System.out.println(i+1);
            }
        }
    }
}
