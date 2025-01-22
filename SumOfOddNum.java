import java.util.*;

public class second {
    public static void SumOfOddNum(int a, int j){
        for(int i=1; i<=a; i+=2){
            j+=i;
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int j=0;
        SumOfOddNum(a, j);
    }
}
