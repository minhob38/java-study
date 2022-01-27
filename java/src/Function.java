/*
함수는 입력과 출력 간 관계의 표현식이며, 또다른 의미로는 하나의 단위로 실행되는 code 집합입니다.
*/

class Data { int m = 5; }

public class Function {
    /*
    함수 선언
    - [반환 자료형] [함수 이름] (함수 매개변수) { 함수 코드 ...  return [반환값] }
    - java는 순서지향이 아닌 객체지향이기에 함수선언을 아래에 해도 java가 compile 시 모두 선언합니다.
    - java는 함수 안에 함수를 선언할 수 없습니다.
    */
    static int add(int m, int n) {
        return m + n;
    }

    static void print(String s) {
        System.out.println(s);
    }

    /*
    함수 매개변수
    - java는 인자를 복사하고 매개변수에 할당하여, 함수를 실행합니다.
    - 기본형 매개변수: 기본형(primitive type)은 값이 복사됩니다.
    - 참조형 매개변수: 참조형(reference type)은 주소가 복사됩니다.
    */
    static void changePrimitive(int m) {
        m = 3;
    }

    static void changeReference(Data d) { d.m = 3; }

    public static void main(String[] args) {
        // 함수 실행
        System.out.println("\n=== 함수 실행 ===");
        System.out.println("add(1, 5)은 " + add(1,5) + " 입니다.");
        print("java spring server");

        // 함수 매개변수
        System.out.println("\n=== 함수 매개변수 ===");
        Data d = new Data();
        changePrimitive(d.m);
        System.out.println("changePrimitive 함수 실행 전 m은 " + d.m + "함수 실행 후 m은 " + d.m + " 입니다.");
        changeReference(d);
        System.out.println("changeReference 함수 실행 전 m은 " + d.m + "함수 실행 후 m은 " + d.m + " 입니다.");
    }
}
