/*
조건문이란 특정 조건에서 실행 되는 구문을 의미합니다.
*/

public class ConditionalStatement {
    public static void main(String[] args) {
        /* if문
        if 조건이 참이면 실행됩니다.
        */
        System.out.println("\n=== if문 ===");
        /* 단일 if문*/
        int m = 5;

        if (m > 3) {
            System.out.println("m은 3보다 큽니다.");
        }

        /* if ~ else문*/
        int n = 1;

        if (n > 3) {
            System.out.println("n은 3보다 큽니다.");
        } else {
            System.out.println("n은 3과 같거나 작습니다.");
        }

        /* if ~ else if문*/
        int o = 3;

        if (o > 3) {
            System.out.println("o은 3보다 큽니다.");
        } else if (o == 3) {
            System.out.println("o은 3과 같습니다.");
        } else if (o < 3) {
            System.out.println("o은 3보다 작습니다.");
        }

        /* switch문
        switch문은 해당 조건과 일치하는 case로 이동하며, 아래 case들을 실행시킵니다.
        따라서, break를 넣어 해당 조건을 찾으면 switch문을 종료하도록 합니다.
        switch문 조건에는 정수 및 문자열이 오도록합니다.
        */
        System.out.println("\n=== switch문 ===");

        int p = 2;

        switch (p) {
            case 1:
                System.out.println("p는 1입니다.");
            case 2:
                System.out.println("p는 2입니다.");
            case 3:
                System.out.println("p는 3입니다.");
            default:
                System.out.println("p는 1, 2, 3이 아닙니다.");
        }

        String s = "autumn";

        switch (s) {
            case "spring":
                System.out.println("봄입니다.");
                break;
            case "summer":
                System.out.println("여름입니다.");
                break;
            case "autumn":
                System.out.println("가을입니다.");
                break;
            case "winter":
                System.out.println("겨울입니다.");
                break;
            default:
                System.out.println("계절이 아닙니다.");
        }

        /* 조건 연산자 */
        System.out.println("\n=== 조건 연산자 ===");
        int i = 5;
        System.out.println(5 > 3 ? "i는 3보다 큽니다." : "i은 3보다 같거나 작습니다.");
    }
}
