public class Question11 {
    public static void main(String[] args) {
        int n = 5; // 피라미드의 높이

        for (int i = 1; i <= n; i++) {
            // 공백 출력          i 는 1에서 5까지 차례대로 증가할것
            for (int j = 1; j <= n - i; j++) {  //j 는 4 3 2 1 순서로 줄어들며 공백을 출력함
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");    //별이 홀수의 배수대로 늘어날것
            }
            // 줄바꿈
            System.out.println();
        }
    }
}
