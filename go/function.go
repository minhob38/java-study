/*
함수는 입력과 출력 간 관계의 표현식이며, 또다른 의미로는 하나의 단위로 실행되는 code 집합입니다.
*/

package main

import (
	"fmt"
)

func pass_by_value(val int) {
	fmt.Printf("받은 함수인자는 %d입니다.(할당전)\n", val)
	val = 5
	fmt.Printf("받은 함수인자는 %d입니다.(할당후)\n", val)
}

func pass_by_reference(sli []int) {
  for i := 0; i < len(sli); i ++ {
    fmt.Printf("받은 함수인자는 sli[%d]는 %d입니다.(할당전)\n", i, sli[i]);
  }
  sli[0] = 5;
  for i := 0; i < len(sli); i ++ {
    fmt.Printf("받은 함수인자는 sli[%d]는 %d입니다.(할당후)\n", i, sli[i]);
  }
}

var global_val string = "global function variable"

func outer_func() func() {
	var outer_val string = "outer function variable"
    return func() {
			var inner_val string = "inner function variable"
      fmt.Println("inner_val은", inner_val, "입니다.");
      fmt.Println("outer_val은", outer_val, "입니다.");
      fmt.Println("global_val은", global_val, "입니다.");
		}
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
		fmt.Println("m + n은", m + n, "입니다.")
	}(3, 5)

	var c func(int, int) = func(m int, n int) {
		fmt.Println("m + n은", m + n, "입니다.")
	}
	c(3, 5)

  d := func(m int, n int) {
		fmt.Println("m + n은", m + n, "입니다.")
	}
	d(3, 5)

	/*
	[함수 매개변수]
	- go는 인자를 복사하고 매개변수에 할당하여, 함수를 실행합니다.
	- pass-by-value: 매개변수에 값을 전달합니다.
	- pass-by-reference: 매개변수에 주소값을 전달합니다.
	*/
  /* call-by-value */
	fmt.Println("\n=== 함수 매개변수 ===")
  var val int = 3
	pass_by_value(val)
  fmt.Printf("넘겨준 함수인자 val은 %d입니다.(함수실행 뒤)\n", val);

  /* call-by-reference */
	sli := []int{1, 2, 3}
  pass_by_reference(sli)
  for i := 0; i < len(sli); i ++ {
    fmt.Printf("받은 함수인자는 sli[%d]는 %d입니다.(함수실행 뒤)\n", i, sli[i]);
  }

	/*
	[closure]
	closure는 inner 함수가 outer 함수를 참조할때, outer 함수가 종료되도 참조하는 outer scope의 변수들이 메모리에 남아있는 것을 의미합니다.
	*/
	fmt.Println("\n=== clousure ===")
	inner_func := outer_func()
	inner_func()

	/*
	[지연실행]
	- defer로 감싸고 있는 함수가 끝나기 직전에, defer 뒤에 있는 함수를 실행시킬 수 있습니다.
	- defer는 stack처럼 LIFO로 실행됩니다.
	*/
	fmt.Println("\n=== 지연실행 ===")
	defer func() {
    fmt.Println("defer a")
	}()

	func () {
    fmt.Println("normal a")
	}()

	defer func() {
    fmt.Println("defer b")
	}()

	defer func() {
    fmt.Println("defer c")
	}()

	func () {
    fmt.Println("normal b")
	}()

	func () {
    fmt.Println("normal c")
	}()
}
