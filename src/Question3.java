import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("1 이상의 숫자를 입력하세요: ");
            number = sc.nextInt();
        } while (number <= 1);  // 1 미만일 때 반복

        System.out.println("입력한 값: " + number);
        sc.close();
    }
}