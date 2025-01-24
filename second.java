import java.util.*;
public static void rasisedToThePower(int x, int n){
    int j=1;
    for(int i=1; i<=n; i++ ){
        j*=x;
    }
    System.out.println("answer: "+ j);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int x=sc.nextInt();
    System.out.print("Enter power of number: ");
    int n=sc.nextInt();
    rasisedToThePower(x, n);
}
