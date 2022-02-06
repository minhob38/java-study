/*
객체지향프로그래밍이란 프로그램을 단순한 명령어의 집합으로 바라보는 기존 컴퓨터 프로그래밍과 달리, 관계성 있는 객체들의 집합으로 바라보는 프로그램 설계입니다.
객체지향프로그래밍을 위해서 객체의 특성을 담고 있는 클래스라는 추상적 개념을 정의합니다. 이러한 클래스에 구체적인 특성들을 정의해줌으로써 실존적 개념인 인스턴스를 얻을 수 있습니다.

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

=== class inheritance ===
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

=== class polymorphism ===
다형성은 객체가 여러가지 형태를 가질 수 있는것을 의미합니다.
(자료형이 parent class이어도 할당을 통해 child class의 instance가 됩니다. 이를 통해 parent class가 여러가지 형태의 child class를 참조하여 다형성을 만듭니다.)

=== abstract class ===
미완성의 class로 instance를 만들 수 없으며, child class에서 class를 완성시킵니다.
따라서, class의 설계도로 쓰입니다.

=== interface ===
interface는 abstract class보다 더 추상화된 class입니다. 따라서 class의 기본 설계도로 쓰이며 아래와 같은 특징이 있습니다.
- abstract method, static method, default method만 가질 수 있습니다.
- 생성자를 가질 수 없습니다.
- member 변수들은 public static final이며, modifier은 생략가능합니다.
- 자료형을 interface로 하면 아래처럼 유연한 코드를 설계할 수 있습니다.
interface I { ... }
class A implements I { ... }
class B implements I { ... }
A a = new A(); // A를 B로 바꾸면 func도 수정해야합니다. 반면 a 및 func 매개변수 자료형을 I로 바꾸면 A를 B로 바꾸기만 하면 됩니다.
void func(A a) { ... }

=== inner class ===
=== anonymous class ===
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
        System.out.println("해당 차량은 " + super.shape + " " + this.wheel + " " + this.fuel + " " +  this.engine + " " + this.color + " " + "입니다.");
    }

    void info(String owner) { // overloading
        System.out.println(owner + "의 차량은 " + super.shape + " " + this.wheel + " " + this.fuel + " " +  this.engine + " " + this.color + " " + "입니다.");
    }

    void sound() { // overriding
        System.out.println("와와왕");
    }
}

class Plane extends Vehicle {
    static int wheel = 3; // static(class) 변수
    static String fuel = "jp"; // static(class) 변수
    String engine; // instance 변수
    String color; // instance 변수

    Plane() { // 생성자
        super("triangle"); // super 생성자

        this.engine = "turbojet";
        this.color = "gray";
    }

    Plane(String engine, String color) {
        super("rectangle");

        this.engine = engine;
        this.color = color;
    }

    static void blow() { // static(class) method
        System.out.println("빠아아앙");
    }

    void info() { // instance method
        System.out.println("해당 비행기는 " + super.shape + " " + this.wheel + " " + this.fuel + " " +  this.engine + " " + this.color + " " + "입니다.");
    }

    void info(String owner) { // overloading
        System.out.println(owner + "의 비행기는 " + super.shape + " " + this.wheel + " " + this.fuel + " " +  this.engine + " " + this.color + " " + "입니다.");
    }

    void sound() { // overriding
        System.out.println("으으으아아앙");
    }
}

abstract class Computer {
    static String shape = "rectangle";
    String cpu;

    Computer(String cpu) {
        this.cpu = cpu;
    }

    static void reset () {
        System.out.println("흐으응");
    }
    abstract void turnon (); // abstact mehod는 function body가 없습니다.
    // abstract void turnoff (); error - abstract method는 child class에서 완성되어야 합니다.

    void sleep() {
        System.out.println("스으윽");
    }
}

class Labtop extends Computer {
    String color;

    Labtop(String color) {
        super("i5");
        this.color = color;
    }

    void turnon () {
        System.out.println("우우웅");
    }
}

interface Watch {
    public static final int HOURS = 12;
    public abstract void alarm (); // interface에서 pubic abstract modifier는 생략가능합니다.
    static void timer () {
        System.out.println("따르릉");
    }
}

class SmartWatch implements Watch {
    public void alarm () {
        System.out.println("뜨르릉");
    }
}

public class Class {
    static Watch makeSmartWatch () {
        return new SmartWatch();
    }

    static Vehicle makeCar () {
        return new Car();
    }

    public static void main(String[] args) {
        // === class ===
        System.out.println("\n=== class ===");
        Car myCar;
        myCar = new Car("1.4t", "blue");

        System.out.println("myCar의 engine/color는 " + myCar.engine + "/" + myCar.color);
        System.out.println("myCar의 wheel은 " + myCar.wheel);
        // System.out.println("Car의 engine/color는 " + Car.engine + "/" + Car.color); error - class는 instance 변수에 접근할수 없습니다.
        System.out.println("Car의 wheel은 " + Car.wheel);
        Car.blow();
        myCar.blow();
        // Car.info(); error - class는 instance method에 접근할 수 없습니다.
        myCar.info();
        myCar.info("민호"); // overloading

        // === inheritance ===
        System.out.println("\n=== inheritance ===");
        Vehicle myVehicle;
        myVehicle = new Vehicle("rectangle");
        // System.out.println("Car의 shape는 " +  Car.shape); error - class는 instance 변수에 접근할수 없습니다.
        System.out.println("myCar의 shape는 " +  myCar.shape);
        System.out.println("Vehicle의 hasWheel은 " +  Vehicle.hasWheel);
        System.out.println("myVehicle hasWheel은 " +  myVehicle.hasWheel);
        System.out.println("Car의 hasWheel은 " +  Car.hasWheel);
        System.out.println("myCar의 hasWheel은 " +  myCar.hasWheel);
        Vehicle.ignite();
        Car.ignite();
        myVehicle.ignite();
        myCar.ignite();
        myVehicle.shapeinfo();
        myCar.shapeinfo();
        myVehicle.sound();
        myCar.sound();

        System.out.println(myVehicle instanceof Vehicle); // true
        System.out.println(myVehicle instanceof Car); // false

        // === polymorphism ===
        System.out.println("\n=== polymorphism ===");
        Car c = new Car("1.4t", "blue");
        Vehicle v = new Car("1.4t", "blue");
        // Car c = new Vehicle("1.4t", "blue"); error - Car 참조변수가 Vehicle보다 작기에 c를 선언할 수 없습니다.
        System.out.println(c.engine);
        // System.out.println(v.engine); error - v의 자료형은 Vehicle이므로, Car instance여도 member에 접근할 수 없습니다.

        System.out.println(c instanceof Car); // true
        System.out.println(c instanceof Vehicle); // true - Car는 Vehicle을 상속받았기에 Car의 instance는 Vehicle의 instance입니다.
        System.out.println(v instanceof Car); // false
        System.out.println(v instanceof Vehicle); // true

        System.out.println(c instanceof Car); // true
        System.out.println(c instanceof Vehicle); // true - Car는 Vehicle을 상속받았기에 Car의 instance는 Vehicle의 instance입니다.
        System.out.println(v instanceof Car); // false
        System.out.println(v instanceof Vehicle); // true

        Vehicle veh = new Vehicle("rectangle");
        System.out.println(veh instanceof Vehicle); // true
        System.out.println(veh instanceof Car); // false
        veh = myCar; // veh의 자료형은 Vehicle이지만, myCar를 할당하여 Car의 instance가 됩니다.
        System.out.println(veh instanceof Vehicle); // true
        System.out.println(veh instanceof Car); // true

        Vehicle myV = new Vehicle("rectangle");
        Car myC = new Car("1.4t", "blue");
        myV = (Vehicle)myC; // 자료형이 바뀌었을 뿐 참조주소가 바뀐것은 아니기에, myV는 Vehicle만큼 접근할 수 있는 myC의 instance입니다.
        myC.info();
        // myV.info(); error - myV은 Vehicle 자료형이기에 Car의 instance method를 실행할 수 없습니다.
        ((Car)myV).info();
        System.out.println(myC instanceof Vehicle);
        System.out.println(myC instanceof Car);
        System.out.println(myV instanceof Vehicle);
        System.out.println(myV instanceof Car);

        // === abstract class ===
        System.out.println("\n=== abstract class ===");
        // Computer myComputer = new Computer(); error - abstract class는 instance를 만들 수 없습니다.
        System.out.println(Computer.shape); // instance는 만들수 없지만, class 변수를 읽을 수 있습니다.
        Computer.reset(); // instance는 만들수 없지만, class method는 실행할 수 있습니다.
        Labtop myLabtop = new Labtop("black");
        myLabtop.turnon();
        myLabtop.sleep();
        System.out.println("Laptop의 " + "cpu는 " + myLabtop.cpu + " color는 " + myLabtop.color + " 입니다.");

        // === interface ===
        System.out.println("\n=== interface ===");
        //Watch myWatch = new Watch(); error - abstract class는 instance를 만들 수 없습니다.
        SmartWatch mySmartWatch = new SmartWatch();
        System.out.println(Watch.HOURS); // instance는 만들수 없지만, class 변수를 읽을 수 있습니다.
        Watch.timer(); // instance는 만들수 없지만, class method는 실행할 수 있습니다.
        // SmartWatch.timer(); error - child class는 interface static method를 실행할 수 없습니다.
        mySmartWatch.alarm();
        Watch yourSmartWatch = makeSmartWatch();
        yourSmartWatch.alarm();
        System.out.println(mySmartWatch instanceof Watch);
        System.out.println(mySmartWatch instanceof SmartWatch);
        System.out.println(yourSmartWatch instanceof Watch);
        System.out.println(yourSmartWatch instanceof SmartWatch);
    }
}
