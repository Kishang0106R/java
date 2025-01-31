import java.util.*;
public class second {
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

        for(int i=0; i<a; i++){
            for(int j=0; j<a-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarr(arr);

    }
}
