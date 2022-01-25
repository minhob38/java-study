/*
반복문이란 특정조건까지 반복되는 구문을 의미합니다.
*/

public class Iteration {
    public static void main(String[] args) {
        /* for문
        조건식이 참이면 구문을 실행합니다.
        */
        System.out.println("\n=== for문 ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("i는" + i);
        }

        for (int j = 0; j < 10; j = j + 3) {
            System.out.println("j는" + j);
        }

        for (int k = 0; k < 10; k += 3) {
            System.out.println("k는" + k);
        }

        /* while문
        조건식이 참이면 구문을 실행합니다.
        */
        System.out.println("\n=== while문 ===");
        int i = 0;
        while (i < 5) {
            System.out.println("i는" + i);
            i++;
        }

        /* do-while문
        조건식이 참이면 구문을 실행합니다. (구문을 먼저 실행합니다.)
        */
        System.out.println("\n=== do-while문 ===");
        int j = 0;
        do {
            System.out.println("j는" + j);
            j++;
        } while (j < 5);

        /* break
        break를 감싸고 있는 반복문을 탈출합니다.
        */
        System.out.println("\n=== break ===");
        for (int p = 0; p < 5; p++) {
            if (p == 3) break;
            System.out.println("p는" + p);
        }

        /* continue
        continue를 감싸고 있는 반복문 조건식으로 이동합니다.
        */
        System.out.println("\n=== continue ===");
        for (int q = 0; q < 5; q++) {
            if (q == 3) continue;
            System.out.println("q는" + q);
        }
    }
}
