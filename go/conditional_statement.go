/*
조건문이란 특정 조건에서 실행 되는 구문을 의미합니다.
*/

package main

import (
	"fmt"
)

func main() {
	/* if문
	   if 조건이 참이면 실행됩니다.
	*/
	fmt.Println("\n=== if문 ===")
	/* 단일 if문 */
	var i int = 5
	if i > 3 {
		fmt.Println("i는 3보다 큽니다.")
	}

	/* if ~ else문 */
	var j int = 3
	if j < 3 {
		fmt.Println("j는 3보다 큽니다.")
	} else {
		fmt.Println("j는 3과 같거나 작습니다.")
	}

	/* if ~ else if문 */
	var k int = 3
	if k < 3 {
		fmt.Println("k는 3보다 큽니다.")
	} else if k == 3 {
		fmt.Println("k는 3과 같거나 작습니다.")
	} else if k < 3 {
		fmt.Println("k는 3보다 작습니다.")
	}

	/* switch문
		switch문은 해당 조건과 일치하는 case를 실행시킵니다.
	    switch문 조건에는 정수, 문자열, 조건식이 오도록하며, 하나의 case에 여러 조건을 넣을 수 있습니다.
	    (go에는 break를 생략할 수 있으며, fallthrough를 통해 아래 case를 실행시킬수 있습니다.)
	*/
	fmt.Println("\n=== switch문 ===")
	/* 기본 swtich문 */
	var n int = 3
	switch n {
	case 1:
		fmt.Println("n은 1입니다.")
		// break가 있는것과 같습니다.
	case 2:
		fmt.Println("n은 2입니다.")
		// break가 있는것과 같습니다.
	case 3:
		fmt.Println("n은 3입니다.")
		fallthrough
	case 4:
		fmt.Println("n은 4입니다.")
		fallthrough
	default:
		fmt.Println("default")
	}

	/* 여러조건 swtich문 */
	var m int = 3
	switch m {
	case 1, 3:
		fmt.Println("m은 1 또는 3입니다.")
	case 2, 4:
		fmt.Println("m은 2 또는 4입니다.")
	default:
		fmt.Println("default")
	}

	/* 조건식 swtich문 */
	var p int = 3
	switch {
	case p > 3:
		fmt.Println("p는 3보다 큽니다.")
	case p >= 0 && p <= 3:
		fmt.Println("p는 0보다 크고, 3보다 같거나 작습니다.")
	default:
		fmt.Println("default")
	}
}
