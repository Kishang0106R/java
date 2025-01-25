import java.util.*;
public class IOinJAVA{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter you array size: ");
        int a= sc.nextInt();
        int[]mark = new int[a];
        for(int i=0; i<a; i++){
            System.out.print("enter you array element "+i+":");
            mark[i]=sc.nextInt();
        }
        for(int i=0; i<a; i++){
            System.out.println(mark[i]);
        }
        sc.close();
    }
}
