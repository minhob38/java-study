/*
자료형이란 데이터를 표현하는 기준입니다.
java의 자료형은 기본형 / 참조형이 있으며, 기본형은 논리형(boolean) / 문자형(char) / 정수형(byte, short, int) / 실수형(float, double)이 있습니다.
*/

public class DataType {
    public static void main(String[] args) {
        /*
        - 정수형-
        byte: 1byte (-128 ~ 127)
        short: 2byte (-32768 ~ 32767)
        int: 4byte ( -2147483648 ~ 2147483647)
        long: 8byte (-9223372036854775808 ~ 9223372036854775807)
        ✏️ 일반적으로 int형을 사용합니다.
         */
        System.out.println("\n=== 정수형 ===");
        // 접미사(L)를 붙여 리터럴 자료형을 정의합니다. (붙이지 않으면 int형입니다.)
        int i = 5; // int i = 5L은 error
        System.out.println(i);
        long l = 5L;
        System.out.println(l);

        // short, byte에는 int형 리터럴을 할당할 수 있습니다.
        byte b = 5; // byte b = 5L은 error
        System.out.println(b);
        short s = 5; // short s = 5L은 error
        System.out.println(s);

        // 변수 자료형이 리터럴 자료형보다 크면 할당할 수 있습니다.
        long li = 5;
        System.out.println(li);

        // 자료형보다 크면 오버플로우가 발생합니다.
        short sh = 32767;
        System.out.println((short)(sh + 1));

        /*
        - 실수형 -
        float: 4byte (1.4E-45 ~ 3.4E38)
        double: 8byte (4.9E-324 ~ 1.8E308)
        ✏️ 일반적으로 double형을 사용합니다.
         */
        System.out.println("\n=== 실수형 ===");
        // 접미사(f, d)를 붙여 리터럴 자료형을 정의합니다. (붙이지 않으면 double형입니다.)
        double d = 5.6d;
        System.out.println(d);
        float f = 5.6f; // float f = 5.6은 error
        System.out.println(f);

        // 변수 자료형이 리터럴 자료형보다 크면 할당할 수 있습니다.
        double df = 5.6f;
        System.out.println(df);

        /*
        - 문자형 -
        문자 리터럴: ''
        문자열 리터럴: ""
         */
        System.out.println("\n=== 문자형 ===");
        // 문자 리터럴은 '', 문자열 리터럴은 ""로 정의합니다.
        char c = 'j'; // "j"는 error
        System.out.println(c);
        String str = "java"; // 'java'는 error
        System.out.println(str);

        // 문자형은 유니코드로 저장됩니다.
        char ch = 'A';
        System.out.println(ch == 65);

        // 문자는 + 연산을 하면, 유니코드 숫자로 바뀐뒤 연산됩니다.
        char chara = 'a';
        char charb = 'b';

        System.out.println((chara + charb));
        // 문자열은 + 연산을 하면, 문자열이 합쳐집니다.
        String stra = "a";
        String strb = "b";
        System.out.println((stra + strb));

        // 문자는 숫자와 + 연산을 하면, 유니코드 + 숫자로 연산됩니다.
        char charA = 'A';
        System.out.println((charA + 11.5));
        // 문자열은 숫자와 + 연산을 하면, 숫자를 문자열로 형변환하고 합쳐집니다.
        String strA = "A";
        System.out.println((strA + 11.5));

        /*
        - 형변환 -
        연산을 위해 자료형을 일치시켜야 하는 때가 있습니다. 이를 위해 변수 및 리터럴의 자료형을 다른 자료형으로 바꾸는것을 형변환이라 합니다.
        */
        System.out.println("\n=== 형변환 ===");
        double dou = 5.6d;
        float fl = (float)dou;
        int in = (int)dou;
        System.out.println(dou);
        System.out.println(fl);
        System.out.println(in);

        // 5.6f는 double로 형변환해도 5.6f와 같은데, 왜 출력이 다르게 나오는지 알아보기
        System.out.println((double)(5.6f));
        System.out.println(5.6f);
        System.out.println(5.6f == (double)5.6f);

        /*
        - 상수 -
        final로 상수를 선언합니다.
         */
        System.out.println("\n=== 상수(constant) ===");
        final int N = 5;
        final int M;
        M = 10;
        System.out.println(N);
        System.out.println(M);
    }
}
