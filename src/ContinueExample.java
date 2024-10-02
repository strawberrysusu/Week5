public class ContinueExample {
   {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;  // 3의 배수는 건너뜀
            }
            System.out.println(i);
        }
        System.out.println("반복문이 종료되었습니다.");
    }
}