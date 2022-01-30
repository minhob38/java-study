/*
포인터는 변수가 저장되어 있는 메모리 주소를 가리키는 것을 일컫습니다.
*/

package main

import (
	"fmt"
)

type Plane struct {
	engine string
	span int
}

type Fighter struct {
	plane Plane
	missle string
}

func (plane Plane) fly(name string) {
	fmt.Println(name, "은", plane.engine, "으로 비행합니다. 🛩")
}

func (plane *Plane) repair() {
	plane.span++
	fmt.Println("수리되었습니다.", "span은", plane.span, "입니다.")
}

func main() {
	fmt.Println("\n=== 구조체 정의 ===")
	/*
  [구조체 정의]
  type [구조체 이름] struct { [member 이름 자료형], ... } 으로 구조체를 정의합니다.
  */
  type Dog struct
  {
    name string
    age int
  }

	fmt.Println("\n=== 구조체 선언 ===")
  /*
  [구조체 선언]
  var [구조체 변수 이름] [구조체 이름]으로 구조체를 선언합니다.
  */
  var mydog Dog

	fmt.Println("\n=== 구조체 member 접근 ===")
  /*
  [구조체 member 접근]
  . 연산자로 구조체 member에 접근할 수 있습니다.
  */
	mydog.name = "dingo"
	mydog.age = 3
	fmt.Printf("mydog의 name은 %s age는 %d 입니다.\n", mydog.name, mydog.age)

	fmt.Println("\n=== 구조체 초기화 ===")
	/*
  [구조체 초기화]
  - 구조체 선언과 함께 member 순서대로 {}에 담아 초기화합니다.
	- 구조체 선언과 함께 member 이름으로 {}에 담아 초기화합니다.
  */
  var yourdog Dog = Dog{ "badugi", 5 }
	fmt.Printf("yourdog의 name은 %s age는 %d 입니다.\n", yourdog.name, yourdog.age)
  var ourdog Dog = Dog{ name: "siru", age: 1 }
	fmt.Printf("ourdog의 name은 %s age는 %d 입니다.\n", ourdog.name, ourdog.age)
  minhodog := Dog{ name: "injeolmi", age: 1 }
	fmt.Printf("minhodog의 name은 %s age는 %d 입니다.\n", minhodog.name, minhodog.age)
  fmt.Println("minhodog는", minhodog, "입니다")

	fmt.Println("\n=== 구조체 포인터 ===")
  /*
  [구조체 포인터]
  - 포인터로 구조체를 가리킬 수 있습니다.
  - 포인터로 구조체의 member를 다룰 수 있습니다.
  */
	var pdog *Dog = &minhodog
	pdog.name = "baekseolgi"
	fmt.Printf("minhodog의 name은 %s age는 %d 입니다.\n", minhodog.name, minhodog.age)
  fmt.Println("minhodog는", minhodog, "pdog는", pdog, "입니다")

	fmt.Println("\n=== 구조체 함수 ===")
  /*
  [구조체 함수]
  - go는 class가 없기에 구조체를 통해 함수를 연결합니다.
	- func ([연결할 reciever 이름] *[구조체 이름] [함수 이름] (함수 매개변수) [반환 자료형] { 함수 코드 ...  return [반환값] }
  - reciever는 this와 비슷합니다.
	- reciever는 구조체 주소 또는 구조체를 받을 수 있으며, 구조체 주소는 원구조체를 수정하며 구조체는 복사된 구조체를 수정합니다.
	*/
	var myplane Plane = Plane{engine: "turbofan", span: 30}
	myplane.fly("f16")
	var yourplane Plane = Plane{engine: "turbojet", span: 15}
	yourplane.fly("boeing747")

	fmt.Println(myplane)
	myplane.repair()
	fmt.Println(myplane)

	fmt.Println("\n=== 구조체 embedding ===")
	/*
  [구조체 embedding]
  - go는 class가 없기에 child 구조체에 parent 구조체를 embedding하여 inherit합니다.
	*/
	var myfighter Fighter = Fighter{plane: myplane, missle: "sidewinder"}
	fmt.Println(myfighter)
	fmt.Println(myfighter.plane)
	fmt.Println(myfighter.plane.engine)
  myfighter.plane.fly("f35")
}
