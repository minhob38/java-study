/*
함수는 입력과 출력 간 관계의 표현식이며, 또다른 의미로는 하나의 단위로 실행되는 code 집합입니다.
*/

package main

import (
	"fmt"
)

type Dog struct
{
	name string;
	age int;
};

func doginfo(dog *Dog) {
  fmt.Println("doginfo 함수")
	fmt.Printf("dog의 name은 %s age는 %d 입니다.\n", dog.name, dog.age);
  fmt.Println(dog)
}

func dogold(dog *Dog) {
  fmt.Println("dogold 함수")
	dog.age++
	fmt.Printf("dog의 name은 %s age는 %d 입니다.\n", dog.name, dog.age);
  fmt.Println(dog)
}

func dogcopy(dog Dog) {
  fmt.Println("dogcopy 함수")
	dog.age++
	fmt.Printf("dog의 name은 %s age는 %d 입니다.\n", dog.name, dog.age);
  fmt.Println(dog)
}

func add(m int, n int) int {
	return m + n
}

func subtract(m int, n int) (r int) {
	r = m - n
	return
}

func print(m int) {
	fmt.Println(m, "입니다.")
}

func addSub(m int, n int) (int, int) {
	return m + n, m - n
}

func printAll(m ...int) {
	for _, val := range m {
		fmt.Println(val, "입니다.")
	}
}

func main() {
	/*
	[함수 선언]
	- func [함수 이름] (함수 매개변수) [반환 자료형] { 함수 코드 ...  return [반환값] } (void는 없습니다.)
	- func [함수 이름] (함수 매개변수) [반환값] { 함수 코드 ...  return }
	- go는 반환을 여러개 할 수 있습니다.
	- go는 함수 안에 함수를 선언할 수 없습니다. (익명함수는 선언할 수 있습니다.)
	*/
	fmt.Println("\n=== 함수 실행 ===")
	/* 함수 실행 */
	fmt.Println("add(1, 5)는", add(1, 5), "입니다.")
	fmt.Println("subtract(3, 5)는", subtract(3, 5), "입니다.")

	fmt.Println("\n=== 함수(반환 여러개) 실행 ===")
	var a, b int = addSub(3, 5)
	fmt.Println("addSub(3, 5)는", a, b, "입니다.")

	fmt.Println("\n=== 함수(변수저장) 실행 ===")
	var sum func(a int, b int) int = add
	fmt.Println("sum(1, 5)은", sum(1, 5), "입니다.")

	fmt.Println("\n=== 함수(가변인자) 실행 ===")
	printAll(1, 2, 3, 4, 5)

	fmt.Println("\n=== 함수(anonymous) 실행 ===")
	func(m int, n int) { // 함수에 이름이 없음
		fmt.Println("m + n은", m+n, "입니다.")
	}(3, 5)

	/*
	[함수 매개변수]
	- go는 인자를 복사하고 매개변수에 할당하여, 함수를 실행합니다.
	- pass-by-value: 매개변수에 값을 전달합니다.
	- pass-by-reference: 매개변수에 주소값을 전달합니다.
	*/
	fmt.Println("\n=== 함수 매개변수 ===")
	/*
	[pass-by-reference (구조체)]
	구조체를 넘겨줄때 주소값을 넘겨줍니다. 따라서, 함수에서 매개변수를 수정하면 원래 구조체도 바뀝니다.
	(구조체(구조체 주소가 아닌)를 넘기면, 매개변수가 복사되어 pass-by-value로 실행됩니다.)
	*/
  var mydog Dog = Dog{ "dingo", 5 }
	fmt.Printf("mydog의 name은 %s age는 %d 입니다.\n", mydog.name, mydog.age);
	doginfo(&mydog)
	dogold(&mydog)
	fmt.Printf("mydog의 name은 %s age는 %d 입니다.\n", mydog.name, mydog.age);
	dogcopy(mydog)
	fmt.Printf("mydog의 name은 %s age는 %d 입니다.\n", mydog.name, mydog.age);
}
