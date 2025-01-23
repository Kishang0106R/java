import java.util.*;

public static int eligiblety(int a){
    if(a>18){
        return 1;
    }else{
        return 0;
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int a = sc.nextInt();
    int vote = eligiblety(a);
    if(1==vote){
        System.out.println("you are eligible for vote");
    }else{
        System.out.println("you aren't eligible for vote");
    }
}
