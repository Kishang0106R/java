import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter you last name: ");
        String lastName =sc.nextLine();
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        sc.close();
    }
}