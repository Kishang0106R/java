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
        
        for(int i= 0; i<arr.length-1; i++){
            int smallest = i;
            for(int j= i+1; j< arr.length; j++){
                if(arr[smallest]> arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i] = temp;
        }
        printarr(arr);

    }
}
