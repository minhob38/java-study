/*
포인터는 변수가 저장되어 있는 메모리 주소를 가리키는 것을 일컫습니다.
*/

package main

import (
	"fmt"
)

func main() {
	fmt.Println("\n=== 포인터 변수 선언 ===")
	/* 포인터 변수를 선언하면 nil로 초기화됩니다. */
  var pa *int
	fmt.Println("pa는", pa, "입니다.")

	fmt.Println("\n=== 포인터 변수 초기화 ===")
	/* new 연산자를 통해 해당 자료형에 맞는 메모리공간을 할당하고 주소를 반환합니다. */
	var pb *int = new(int)
	fmt.Println("pb는", pb, "입니다.")

	fmt.Println("\n=== * 연산자 ===")
  /*
  [* 연산자]
  - 포인터가 가리키는 메모리 공간에 접근하는 연산자입니다.
  - *[type]은 포인터형이고, *[포인터변수]는 포인터변수가 가리키는 변수로 다른 의미를 가집니다.
  */
	*pb = 3
	fmt.Println("pb는", pb, "입니다.")
	fmt.Println("*pb는", *pb, "입니다.")

	fmt.Println("\n=== & 연산자 ===")
  /*
  [& 연산자]
  변수가 저장된 메모리 공간의 주소를 반환하는 연산자입니다.
  */
	var c int = 3
	var pc *int = &c
	fmt.Println("pc는", pc, "입니다.")
	fmt.Println("*pc는", *pc, "입니다.")

	fmt.Println("\n=== 포인터 연산 ===")
	/* go는 포인터연산을 지원하지 않습니다. */
}
