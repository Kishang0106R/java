import java.util.*;
public class searchingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you array size: ");
        int a = sc.nextInt();
        int[] mark = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("enter you array element " + i + ":");
            mark[i] = sc.nextInt();
        }
        System.out.print("enter your which you want to find: ");
        int b=sc.nextInt();
        for (int i = 0; i < a; i++) {
            if(mark[i]==b){
                System.out.println("you element is fount at this position: "+i);
            }
        }
        sc.close();
    }
}
