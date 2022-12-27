/*
enum type이란 열거된 데이터의 묶음을 표현하는 자료형입니다.
*/

enum Color {
    RED, GREEN, BLUE;

    static void print() {
        System.out.println("Enum RED:" + " " + Color.RED);
        System.out.println("Enum GREEN:" + " " + Color.GREEN);
        System.out.println("Enum BLUE:" + " " + Color.BLUE);
    }
}

enum Alphabet {
    A("에이"), B("비"), C("씨");

    String korean; // 묵시적으로 private가 붙으며, 일반적으로 private final로 선언합니다.

    // 열거형에 member를 정의하기 위해 생성자가 필요합니다.
    Alphabet(String korean) {
        this.korean = korean;
    }

    // 열거형의 member를 얻기 위해, 반환함수가 필요합니다.
    String getKorean() {
        return this.korean;
    }

    static void print() {
        System.out.println("Enum A:" + " " + Alphabet.A);
        System.out.println("Enum B:" + " " + Alphabet.B);
        System.out.println("Enum C:" + " " + Alphabet.C);
    }
}

class Rainbow {
    Color color;

    Rainbow(Color color) {
        this.color = color;
    }

    public void print() {
        System.out.println("rainbow color:" + " " + this.color);
    }
}

public class EnumType {
    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow(Color.GREEN);
        rainbow.print();
        Color.print();
        Alphabet.print();

        /* values */
        // enum 배열을 반환받습니다.
        System.out.println(Color.values());

        /* ordinal */
        // ordinal method로 열거된 순서를 반환받습니다.
        System.out.println(Color.RED.ordinal());
        System.out.println(Color.GREEN.ordinal());
        System.out.println(Color.BLUE.ordinal());

        System.out.println(Alphabet.A.ordinal());
        System.out.println(Alphabet.B.ordinal());
        System.out.println(Alphabet.C.ordinal());

        // ordinal method로 열거된 순서를 반환받습니다.
        System.out.println(Alphabet.A.getKorean());
        System.out.println(Alphabet.B.getKorean());
        System.out.println(Alphabet.C.getKorean());

        /* enum 비교 */
        // enum type끼리 비교를 해야합니다.
        System.out.println("ENUM GREEN == GREEN:" + " " + "GREEN".equals(Color.GREEN));
        System.out.println("ENUM GREEN == ENUM GREEN:" + " " + (Color.GREEN == Color.GREEN));

        // enum type은 ==로 비교가 가능합니다.
        System.out.println("ENUM GREEN == ENUM BLUE:" + " " + (Color.GREEN == Color.BLUE));
    }
}
