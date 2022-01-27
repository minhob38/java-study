/*
반복문이란 특정조건까지 반복되는 구문을 의미합니다.
✏️ go는 반복문에 for loop만 있습니다.
*/

package main

import (
	"fmt"
)

func main() {
	/* for문
	조건식이 참이면 구문을 실행합니다.
	*/
	fmt.Println("\n=== for문 ===")
	for i := 0; i < 5; i++ {
		fmt.Println("i는:", i)
	}

	for i := 0; i < 10; i += 3 {
		fmt.Println("i는:", i)
	}

	fmt.Println("\n=== for문(while 형태) ===")
	var i int = 0
	for i < 5 {
		fmt.Println("i는:", i)
		i++
	}

	fmt.Println("\n=== for문(여러변수) ===")
	for i, j := 0, 0; i < 5; i, j = i+1, j-1 {
		fmt.Println("i는:", i, "j는", j)
	}

	/* break
	break를 감싸고 있는 반복문을 탈출합니다.
	*/
	fmt.Println("\n=== break ===")
	for i := 0; i < 5; i++ {
		if i == 3 {
			break
		}
		fmt.Println("i는:", i)
	}

	// infinite loop
	var j int = 0
	for {
		if j == 3 {
			break
		}
		fmt.Println("j는:", j)
		j++
	}

	/* continue
	continue를 감싸고 있는 반복문 조건식으로 이동합니다.
	*/
	fmt.Println("\n=== continue ===")
	for i := 0; i < 5; i++ {
		if i == 3 {
			continue
		}
		fmt.Println("i는:", i)
	}

	/* label */
}
