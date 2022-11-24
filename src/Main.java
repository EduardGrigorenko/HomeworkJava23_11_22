import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String str = scanner.nextLine();
         int slovo = str.length();
         if (slovo > 10){
             System.out.println(true);
         }else {
             System.out.println(false);
         }

         char start = str.charAt(0);
         char finish = str.charAt(slovo -1);
         if (start == finish){
             System.out.println(true);
         }else {
             System.out.println(false);
         }
    }
}