import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요 (100 이상이면 프로그램 종료): ");
            n = scanner.nextInt();

            if (n >= 100) {
                break;  // n이 100 이상일 때 반복 종료
            }

            for (int i = 1; i <= n; i++) {
                sum += i;  // 1부터 n까지 합을 계산
            }

            System.out.println("1부터 " + n + "까지의 합: " + sum);
            sum = 0;  // 다음 반복을 위해 합계를 초기화
        }

        System.out.println("프로그램이 종료되었습니다.");
    }
}
