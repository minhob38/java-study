/*
객체지향프로그래밍이란 프로그램을 단순한 명령어의 집합으로 바라보는 기존 컴퓨터 프로그래밍과 달리, 관계성 있는 객체들의 집합으로 바라보는 프로그램 설계입니다.
객체지향프로그래밍을 위해서 객체의 특성을 담고 있는 클래스라는 추상적 개념을 정의합니다. 이러한 클래스에 구체적인 특성들을 정의해줌으로써 실존적 개념인 인스턴스를 얻을 수 있습니다.
*/


public class Class {
    public static void main(String[] args) {
        System.out.println("\n=== class 선언 ===");
          Car myCar;
          myCar = new Car("1.4t", "blue");
          System.out.println("myCar의 engine/color는 " + myCar.engine + "/" + myCar.color);
          System.out.println("myCar의 wheel은" + myCar.wheel);
          System.out.println("Car의 wheel은" + Car.wheel);
          Car.blow();
          myCar.blow();
          myCar.info();
          myCar.info("민호");
    }
}

/*
=== class 만들기 ===
class 변수
- 멤버변수: instance 변수 (instance에서 접근이 가능합니다.)
- 멤버변수: static(class)변수 (instance/class에서 접근이 가능합니다.)
- 지역변수:

class mehod
- static(class) method: instance/class에서 호출이 가능합니다.
- instance method: instance에서 호출이 가능합니다.

constructor(생성자)
- 생성자를 통해 instance를 초기화 할 수 있습니다.
- 생성자의 이름은 class와 같아야하며, 반환값은 없습니다.

overloading
- 하나의 class 안에서 같은 이름으로 여러개의 method를 만들 수 있습니다.
- method의 매개변수 개수 또는 자료형이 달라야합니다.

this / this()
- this와 this()는 유사해보이지만 다른것입니다.
- this는 instance 스스로를 가리킵니다.
- this()는 class 생성자입니다.
*/
class Car {
    static int wheel = 4; // static(class) 변수
    static String fuel = "gasoline"; // static(class) 변수
    String engine; // instance 변수
    String color; // instance 변수

    // 생성자
    Car() {
        engine = "1.6t";
        color = "white";
    }

    Car(String e, String c) {
        engine = e;
        color = c;
    }

    static void blow() { // static(class) method (instance(this)에 접근할 수 없습니다.)
        System.out.println("빵빵");
    }

    void info() { // static(class) method
        System.out.println("해당 차량은 " + this.wheel + " " + this.fuel + " " +  this.engine + " " + this.color + " " + "입니다.");
    }

    void info(String owner) { // overloading
        System.out.println(owner + "의 차량은 " + this.wheel + " " + this.fuel + " " +  this.engine + " " + this.color + " " + "입니다.");
    }
}

