/*
제어자(modifier)는 클래스, 함수, 변수 앞(선언부)에 붙어 접근 범위를 정의합니다.
- 접근제어자: public, protected, default, private
- 기타제어자: static, final, abstract, native, transient, synchronized, volatile, strictfp
*/

public class Modifier {
    public static void main(String[] args) {
        /*
        접근제어자
        - private: 같은 class 안에서만 접근가능합니다.
        - default: 같은 package 안에서만 접근가능합니다.
        - protected: 같은 package 및 child class에서 접근가능합니다.
        - public: 모든곳에서 접근가능합니다.
        */

        /*
        기타제어자
        - static: 공통의 의미를 가지고 있어 class 변수 및 class method 앞에 붙습니다.
        - final: 마지막의 의미를 가지고 있어 변수 앞에 붙으면 상수, method 앞에 붙으면 overriding이 되지 않으며, class 앞에 붙으면 다른 class의 parent class로 사용될 수 없습니다.
        - abstract: 미완성의 의미를 가지고 있어, class 앞에 붙으면 instance를 만들 수 없으며, method 앞에 붙으면 body가 없습니다.
        */
    }
}
