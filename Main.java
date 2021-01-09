//git remote add origin https://github.com/akrati1/java_datastructure.git
//git branch -M main
//import java.util.*;

public class Main {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem == d) {
                cnt++;
            }
            n = n / 10;
        }
        return cnt;
        // write code here
    }
}git push -u origin main