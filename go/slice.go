/*
slice는 배열과 유사하지만 동적으로 길이를 바꿀 수 있습니다.
*/

package main

import (
	"fmt"
)

func main() {
	fmt.Println("\n=== slice 선언 ===")
	/*
	[slice 선언]
	- slice는 []안에 길이를 정의하지 않습니다.
	- make로 메모리 공간을 만들어야, 요소를 저장할 수 있습니다.
	*/
	var a []int = make([]int, 5)
	for i := 0; i < 5; i++ {
		a[i] = i
		fmt.Printf("a[%d]는 %d입니다.\n", i, a[i])
	}

	fmt.Println("\n=== slice 선언 및 초기화 ===")
	/*
	[slice 선언 및 초기화]
	선언을 초기화와 함께 하면, make를 생략할 수 있습니다.*
	*/
	b := []int{1, 2, 3, 4, 5}
	for i := 0; i < len(b); i++ {
		fmt.Printf("b[%d]는 %d입니다.\n", i, b[i])
	}

	fmt.Println("\n=== make 함수 ===")
	/*
	[make 함수]
	- make 함수로 메모리 공간을 만듭니다.
	- slice의 길이가 크기보다 커지면 크기를 늘립니다.
	- 크기를 늘리면 기존 메모리 공간을 키우는것이 아닌 새로운 메모리 공간을 만듭니다.
	*/
	am := make([]int, 5)
	fmt.Println("am의 길이는", len(am), "크기는", cap(am))
	fmt.Println("am", am, "입니다.")

	bm := make([]int, 5, 10)
	fmt.Println("bm의 길이는", len(bm), "크기는", cap(bm))
	fmt.Println("bm은", bm, "입니다.")

	fmt.Printf("bm의 주소는 %p 입니다.\n", bm)
	fmt.Printf("append 된 bm의 주소는 %p 입니다.\n", append(bm, 1, 2, 3, 4, 5))
	fmt.Printf("append 된 bm의 주소는 %p 입니다.\n", append(bm, 1, 2, 3, 4, 5, 6))

	fmt.Println("\n=== slice 요소 삽입 ===")
	/*
	[slice 요소 삽입]
	append 함수로 slice에 요소를 삽입합니다.
	*/
	c := []int{1, 2, 3}
	fmt.Printf("c의 주소는 %p 입니다.\n", c)
	for i := 0; i < len(c); i++ {
		fmt.Printf("c[%d]는 %d입니다. (주소 %p)\n", i, c[i], &c[i])
	}
	c = append(c, 4, 5)
	fmt.Printf("c의 주소는 %p 입니다.\n", c)
	for i := 0; i < len(c); i++ {
		fmt.Printf("c[%d]는 %d입니다. (주소 %p)\n", i, c[i], &c[i])
	}

	d := []int{-1, -2, -3}
	c = append(c, d...)
	fmt.Printf("c의 주소는 %p 입니다.\n", c)
	for i := 0; i < len(c); i++ {
		fmt.Printf("c[%d]는 %d입니다. (주소 %p)\n", i, c[i], &c[i])
	}

	fmt.Println("\n=== 참조형 ===")
	/*
	[참조형]
	slice는 배열과 달리 참조형입니다.
	*/
	e := []int{1, 2, 3}
	f := e // var f []int와 같습니다.
	fmt.Printf("e의 주소는 %p 입니다.\n", e)
	fmt.Printf("f의 주소는 %p 입니다.\n", f)
	fmt.Println("e는", e)
	fmt.Println("f는", f)
	f[0] = 5
	fmt.Println("e는", e)
	fmt.Println("f는", f)

	fmt.Println("\n=== slice 복사 ===")
	/*
	[slice 복사]
	copy 함수로 slice를 복사합니다.
	*/
	g := []int{1, 2, 3}
	h := make([]int, 3)
	copy(h, g)
	fmt.Printf("g의 주소는 %p 입니다.\n", g)
	fmt.Printf("h의 주소는 %p 입니다.\n", h)
	fmt.Println("g는", g)
	fmt.Println("h는", h)
	h[0] = 5
	fmt.Println("g는", g)
	fmt.Println("h는", h)

	fmt.Println("\n=== slice 가져오기 ===")
	/*
	[slice 가져오기]
	- [m:n]으로 slice를 가져올 수 있습니다.
	- 가져온 slice는 참조형입니다.
	*/
	i := []int{1, 2, 3, 4, 5}
	fmt.Println("i[1:3]은", i[1:3])
	fmt.Println("i[:3]은", i[:3])
	fmt.Println("i[1:]은", i[1:])
	fmt.Println("i[:]은", i[:])

	j := i[1:3]
	fmt.Println("i는", i)
	fmt.Println("j는", j)
	j[0] = -3
	fmt.Println("i는", i)
	fmt.Println("j는", j)
}
