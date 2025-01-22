import java.util.*;

public static void grater(int a, int b){
    if (a > b) {
        System.out.println("a is grater: "+a);
    } else {
        System.out.println("b is grater: "+b);
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a = sc.nextInt();
    System.out.print("Enter a number: ");
    int b = sc.nextInt();
    grater(a, b);
}
