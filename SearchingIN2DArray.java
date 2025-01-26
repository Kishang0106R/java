import java.util.*;
public class SearchingIN2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows in array: ");
        int a = sc.nextInt();
        System.out.print("enter colam in array: ");
        int b= sc.nextInt();
        int[][] mark = new int[a][b];

        for(int i=0; i<a;i++){
            for(int j=0; j<b; j++){
                mark[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter witch element you want to find: ");
        int c=sc.nextInt();

        for(int i=0; i<a;i++){
            for(int j=0; j<b; j++){
                if(c==mark[i][j]){
                    System.out.println(c+"found at loction "+i+","+j);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
