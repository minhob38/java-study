/*
객체지향프로그래밍이란 프로그램을 단순한 명령어의 집합으로 바라보는 기존 컴퓨터 프로그래밍과 달리, 관계성 있는 객체들의 집합으로 바라보는 프로그램 설계입니다.
객체지향프로그래밍을 위해서 객체의 특성을 담고 있는 클래스라는 추상적 개념을 정의합니다. 이러한 클래스에 구체적인 특성들을 정의해줌으로써 실존적 개념인 인스턴스를 얻을 수 있습니다.
*/


public class Class {
    public static void main(String[] args) {
        // class
        System.out.println("\n=== class ===");
        Car myCar;
        myCar = new Car("1.4t", "blue");

        System.out.println("myCar의 engine/color는 " + myCar.engine + "/" + myCar.color);
        System.out.println("myCar의 wheel은 " + myCar.wheel);
        System.out.println("Car의 wheel은 " + Car.wheel);
        Car.blow();
        myCar.blow();
        myCar.info();
        myCar.info("민호");

        // inheritance
        System.out.println("\n=== inheritance ===");
        Vehicle myVehicle;
        myVehicle = new Vehicle("rectangle");
        System.out.println("myCar의 shape는 " +  myCar.shape);
        System.out.println("Vehicle의 hasWheel은 " +  Vehicle.hasWheel);
        System.out.println("Car의 hasWheel은 " +  Car.hasWheel);
        System.out.println("myCar의 hasWheel은 " +  myCar.hasWheel);
        Vehicle.ignite();
        Car.ignite();
        myCar.ignite();
        myCar.shapeinfo();
        myVehicle.sound();
        myCar.sound();
    }
}

/*
=== class 만들기 ===
class 변수
- 멤버변수: instance 변수 (instance에서 접근이 가능합니다.)
- 멤버변수: static(class)변수 (instance/class에서 접근이 가능합니다.)
- 지역변수: method 안에 선언된 변수입니다.

class method
- static(class) method: instance/class에서 호출이 가능합니다. (this, super를 사용할 수 없습니다.)
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

=== inheritance ===
- static(class) 변수가 child class 및 child instance에 상속됩니다.
- instance 변수가 child class 및 child instance에 상속됩니다.
- static(class) method가 child class 및 child instance에 상속됩니다.
- instance method가 child instance에 상속됩니다.

super / super()
- super와 super()는 유사해보이지만 다른것입니다.
- super는 parent instance 스스로를 가리킵니다.
- super()는 parent class 생성자입니다.

overriding
- parent class에서 상속받은 method를 덮어씁니다.
- method의 이름, 매개변수 개수, 반환 자료형이 같아야 합니다.
*/
class Vehicle {
    static boolean hasWheel = true;
    String shape;

    Vehicle (String shape) {
        this.shape = shape;
    }

    static void ignite() {
        System.out.println("덜덜덜");
    }

    void shapeinfo() {
        System.out.println("해당 vehicle은 " + this.shape + " 입니다.");
    }

    void sound() {
        System.out.println("부르릉");
    }
}


class Car extends Vehicle {

    static int wheel = 4; // static(class) 변수
    static String fuel = "gasoline"; // static(class) 변수
    String engine; // instance 변수
    String color; // instance 변수

    Car() { // 생성자
        super("rectangle"); // super 생성자

        this.engine = "1.6t";
        this.color = "white";
    }

    Car(String engine, String color) {
        super("rectangle");

        this.engine = engine;
        this.color = color;
    }

    static void blow() { // static(class) method
        System.out.println("빵빵");
    }

    void info() { // instance method
        System.out.println("해당 차량은 " + this.wheel + " " + this.fuel + " " +  this.engine + " " + this.color + " " + "입니다.");
    }

    void info(String owner) { // overloading
        System.out.println(owner + "의 차량은 " + this.wheel + " " + this.fuel + " " +  this.engine + " " + this.color + " " + "입니다.");
    }

    void sound() { // overriding
        System.out.println("와와왕");
    }
}

