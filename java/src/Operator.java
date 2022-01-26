/*
java에는 단항연산자, 산술연산자, 비교연산자, 논리연산자가 있습니다.
*/

public class Operator {
    public static void main(String[] args) {
        /*
        - 단항 연산자 -
        ?: 조건 연산
        ++: 후위/전위증가
        --: 후위/전위감소
        */
        System.out.println("\n=== 단항 연산자 ===");
        int x = 5;
        int y = 5;
        System.out.println(x++);
        System.out.println(x);

        System.out.println(++y);

        /*
        - 산술 연산자 -
        +: 더하기
        =: 빼기
        *: 곱하기
        /: 나누기
        %: 나머지
        */
        System.out.println("\n=== 산술 연산자 ===");
        // 연산결과의 자료형은 피연산자와 같기에, 실수형의 결과를 보기 위해선 피연산자를 실수형으로 형변환해야합니다.
        int p = 5;
        int q = 2;
        System.out.println(p / q); // p / q는 int형이기에 0.5를 표현할 수 없습니다.
        System.out.println((double) p / q);

        int m = 1000000;
        int n = 1000000;
        System.out.println(m * n); // m * n은 int형이기에 2147483647를 넘는 1000000000000을 표현할 수 없습니다.
        System.out.println((long) m * n);

        /*
        - 비교 연산자 -
        a < b: a는 b보다 작다.
        a > b: a는 b보다 크다.
        a <= b: a는 b보다 같거나 작다.
        a >= b: a는 b보다 같거나 크다.
        a == b: a는 b와 같다.
        a != b: a는 b와 다르다.
        */
        System.out.println("\n=== 비교 연산자 ===");
        System.out.println(3.0 == 3.0d);
        System.out.println(0.1 == 0.1f); // 실수형은 오차가 있기에 0.1(double형)과 0.1f(float형)은 같지 않습니다.
        System.out.println(0.1 == 0.1d);

        String a = "abc";
        String b = "abc";
        System.out.println(a == b); // a, b는 String 객체이기에 서로 다르게 비교됩니다.
        System.out.println("abc" == "abc"); // true
        System.out.println("abc".equals("abc")); // true

        /*
        - 논리 연산자 -
        &&: and 연산
        ||: or 연산
        !: not 연산
        */
        System.out.println("\n=== 논리 연산자 ===");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(!true);
    }
}
