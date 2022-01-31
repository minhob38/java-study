/*
recover, panic으로 프로그램의 예외처리를 합니다.
*/

package main

import (
	"fmt"
)

func main() {
	/*
	[예외처리하기]
	- recover로 예외가 발생한 프로그램을 복구할 수 있습니다.
	- 일반적으로 예외처리 함수를 만듭니다.
	- recover는 예외가 발생한 뒤 실행되어야 하므로, defer와 함께 사용합니다.
	*/
	fmt.Println("\n=== 예외 처리하기 ===")
	func() {
		defer func() { // 예외처리 함수
			s := recover()
			fmt.Printf("s의 type은 %T입니다. \n", s)
			fmt.Println("panic은", s, "입니다.")
		}()

		arr := [...]int{1, 2, 3}
		for i :=0; i < len(arr) + 1; i++ {
			fmt.Printf("arr[%d]는 %d입니다.\n", i, arr[i])
		}
	}()

	fmt.Println("\n=== 예외 만들기 ===")
	/*
	[예외 만들기]
	panic으로 예외를 만들 수 있습니다.
	*/
	func () {
		defer func() {
			s := recover()
			fmt.Println("panic은", s, "입니다.")
		}()

		panic("exception : (")
	}()
}
