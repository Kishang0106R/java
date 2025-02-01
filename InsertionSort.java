import java.util.*;
public class InsertionSort{
    public  static  void  printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = sc.nextInt();
        int []arr = new int[a];

        for(int i=0; i<a; i++){
            System.out.print("Enter array element "+ (i+1) +":");
            arr[i]= sc.nextInt();
        }

        for(int i=1; i<arr.length; i++){
              int current = arr[i];
              int j= i-1;
              while(j>=0 && current <arr[j]){
                  arr[j+1] = arr[j];
                  j--;
              }
              arr[j+1]=current;
        }

        printarr(arr);

    }
}
