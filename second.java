import java.util.*;
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=sc.nextInt();
    int j=0;
    int temp=1;
    int a;
    System.out.println(j);
    System.out.println(temp);
    for(int i=1; i<=n-2; i++){
        a=j+temp;
        System.out.println(a);
        j= temp;
        temp=a;
    }
}
