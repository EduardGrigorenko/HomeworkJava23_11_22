import java.util.Scanner;

public class homeworkJavaTask2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace('A','-');
        str =str.replace('B','A');
        str =str.replace('-','B');

        System.out.println(str);
    }
}
