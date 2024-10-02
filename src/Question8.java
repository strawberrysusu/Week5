public class Question8 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            if (i % 2 != 0) {
                sum += i;  // 홀수일 때만 합계에 더함
            }
            i++;
        }

        System.out.println("1부터 100까지 홀수의 합: " + sum);
    }
}
