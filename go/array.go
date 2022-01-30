/*
배열이란 같은 자료형들을 모아놓은 자료형입니다.
*/

package main

import (
	"fmt"
)

func main() {
	/* 배열 선언 */
	fmt.Println("\n=== 배열 선언 ===")
	var a [5]int
	for i := 0; i < 5; i++ {
		a[i] = i
		fmt.Printf("a[%d]는 %d입니다.\n", i, a[i])
	}

	/* 배열 선언 및 초기화*/
	fmt.Println("\n=== 배열 선언 및 초기화 ===")
	var b [5]int = [5]int{1, 2, 3, 4, 5}
  /* 선언을 초기화와 함께 하면, 자료형을 생략할 수 있습니다. */
	var c = [5]int{1, 2, 3, 4, 5}
	d := [5]int{1, 2, 3, 4, 5}
	for i := 0; i < 5; i++ {
		fmt.Printf("b[%d]는 %d입니다.\n", i, b[i])
		fmt.Printf("c[%d]는 %d입니다.\n", i, c[i])
		fmt.Printf("d[%d]는 %d입니다.\n", i, d[i])
	}

  /* 선언을 초기화와 함께 하면, ...를 통해 길이를 생략할 수 있습니다. */
	e := [...]int{1, 2, 3, 4, 5}

	for i := 0; i < 5; i++ {
		fmt.Printf("e[%d]는 %d입니다.\n", i, e[i])
	}

  /* 다차원 배열 선언 및 초기화*/
	fmt.Println("\n=== 다차원 배열 선언 및 초기화 ===")
	f := [3][3]int{ // ... 안되나? []는 되는듯
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	}

	for i := 0; i < 3; i++ {
		for j :=0; j < 3; j++ {
			fmt.Printf("f[%d][%d]는 %d입니다.\n", i, j, f[i][j])
		}
	}

	/*
	[배열 순회]
	- len 함수로 배열의 길이를 알 수 있습니다.
	- range 키워드로 배열을 순회할 수 있습니다.
	*/
	fmt.Println("\n=== 배열 순회 ===")
	g := [...]int{11, 12, 13, 14, 15}
	fmt.Println("g의 길이는", len(g), "입니다.")
	for i := 0; i < len(g); i++ {
		fmt.Printf("g[%d]는 %d입니다.\n", i, g[i])
	}

	for i, value := range g {
		fmt.Printf("value(g[%d])는 %d입니다.\n", i, value)
	}

	/* value를 생략하면, index만 가져옵니다. */
	for i := range g {
		fmt.Printf("value(g[%d])는 %d입니다.\n", i, g[i])
	}

	/* _로 index를 생략할 수 있습니다. */
	for _, value := range g {
		fmt.Printf("value는 %d입니다.\n", value)
	}

	/*
	[배열 복사]
	- go의 배열은 참조형이 아니기에, 변수를 할당을 통해 복사를 할 수 있습니다.
	*/
	fmt.Println("\n=== 배열 복사 ===")
	h := [...]int{11, 12, 13}
	i := h // var i [3]int = h와 같습니다.

	for k, value := range h {
		fmt.Printf("value(h[%d])는 %d입니다.\n", k, value)
	}
	for k, value := range i {
		fmt.Printf("value(i[%d])는 %d입니다.\n", k, value)
	}

	i[0] = 0
	for k, value := range h {
		fmt.Printf("value(h[%d])는 %d입니다.\n", k, value)
	}
	for k, value := range i {
		fmt.Printf("value(i[%d])는 %d입니다.\n", k, value)
	}

	/*
	[배열 가져오기]
  - [m:n]으로 배열을 slice로 가져올 수 있습니다.
	- 가져온 slice는 참조형입니다.
	*/
	fmt.Println("\n=== slice 가져오기 ===")
	l := [...]int{ 1, 2, 3, 4, 5 }
	fmt.Println("l[1:3]은", l[1:3])
	fmt.Println("l[:3]은", l[:3])
	fmt.Println("l[1:]은", l[1:])
	fmt.Println("l[:]은", l[:])

	m := l[1:3]
	fmt.Println("l은", l)
	fmt.Println("m는", m)
	m[0] = -3
	fmt.Println("l은", l)
	fmt.Println("m는", m)
}
