/*
go에는 대입연산자, 단항연산자, 산술연산자, 비교연산자, 논리연산자, 메모리연산자, 비트연산자 등이 있습니다.
*/

package main

import (
	"fmt"
)

func main() {
	/*
	[대입 연산자]
	=: 대입
	+=: 덧셈대입
	-=: 뺄셈대입
	*=: 곱셈대입
	/=: 나눗셈대입
	%=: 나머지 대입
	*/
	fmt.Println("\n=== 대입 연산자 ===")
	var n int = 0
	fmt.Println("n:", n)

	/*
	[단항 연산자]
	++: 후위증가
	--: 후위감소
	*/
	fmt.Println("\n=== 단항 연산자 ===")
	var i int = 0
	// fmt.Println(i++)
	i++
	fmt.Println("i++:", i)
	i--
	fmt.Println("i--:", i)

	/*
	[산술 연산자]
	+: 더하기
	-: 빼기
	*: 곱하기
	/: 나누기
	%: 나머지
	*/
	fmt.Println("\n=== 산술 연산자 ===")
	fmt.Println("3 + 5:", 3+5)
	fmt.Println("3 - 5:", 3+5)
	fmt.Println("3 / 5:", 3.0/5)
	fmt.Println("3 * 5:", 3*5)
	fmt.Println("3 % 5:", 3%5)

	/*
	[비교 연산자]
	a < b: a는 b보다 작다.
	a > b: a는 b보다 크다.
	a <= b: a는 b보다 같거나 작다.
	a >= b: a는 b보다 같거나 크다.
	a == b: a는 b와 같다.
	a != b: a는 b와 다르다.
	*/
	fmt.Println("\n=== 비교 연산자 ===")
	fmt.Println("3 < 5:", 3 > 5)
	fmt.Println("3 > 5:", 3 < 5)
	fmt.Println("3 <= 5:", 3 <= 5)
	fmt.Println("3 >= 5:", 3 >= 5)
	fmt.Println("3 == 5:", 3 == 5)
	fmt.Println("3 != 5:", 3 != 5)

	/*
	[논리 연산자]
	&&: and 연산
	||: or 연산
	!: not 연산
	*/
	fmt.Println("\n=== 논리 연산자 ===")
	fmt.Println("true && false", true && false)
	fmt.Println("true || false", true || false)
	fmt.Println("!true", !true)
}
