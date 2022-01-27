/*
자료형이란 데이터를 표현하는 기준입니다.
go의 자료형은 논리형 / 문자형 / 정수형 / 실수형 / 복소수형 / 룬형 / 바이트형이 있습니다.
*/

package main

import (
	"fmt"
	"unsafe"
)

func main() {
	/*
	   - 정수형 -
	   int8: 1byte (-128 ~ 127)
	   int16: 2byte (-32768 ~ 32767)
	   int32: 4byte (-2147483648 ~ 2147483647)
	   int64: 8byte (-9223372036854775808 ~ 9223372036854775807)
	   uint8: 1byte (0 ~ 255)
	   uint16: 2byte (0 ~ 65535)
	   uint32: 4byte (0 ~ 4294967295)
	   uint64: 8byte (0 ~ 18446744073709551615)
	   uintptr: pointer를 저장하는 자료형입니다. (uint와 크기가 같습니다.)

	   uint:32bit에서는 uint32, 64bit에서는 uint64입니다.
	   int:32bit에서는 int32, 64bit에서는 int64입니다.
	*/
	fmt.Println("\n=== 정수형 ===")
	var in int = 3
	fmt.Println("in은", in, "byte는", unsafe.Sizeof(in))
	var _in int64 = 3
	fmt.Println("_in은", _in, "byte는", unsafe.Sizeof(_in))

	/*
	   - 실수형 -
	   float32: 4byte (? ~ 3.4E38) - ieee-754 32bit 단정밀도 부동소수점
	   float64: 8byte (?~ 1.7E308) - ieee-754 32bit qo정밀도 부동소수점
	*/
	fmt.Println("\n=== 실수형 ===")
	var fn float32 = 3.0
	fmt.Println("fn은", fn, "byte는", unsafe.Sizeof(fn))
	var dn float64 = 3.0
	fmt.Println("dn은", dn, "byte는", unsafe.Sizeof(dn))

	/*
	   - 복소수형 -
	   complex64: 4byte (?) float32의 실수부와 허수부로 이루어진 자료형입니다.
	   complex128: 8byte (?) float64의 실수부와 허수부로 이루어진 자료형입니다.
	*/
	fmt.Println("\n=== 복소수형 ===")
	var ci complex64 = 3 + 5i
	fmt.Println("ci은", ci, "실수부는", real(ci), "허수부는", imag(ci), "byte는", unsafe.Sizeof(ci))

	/*
	   - 문자형 -
	   rune: unicode(utf-8)를 저장하는 자료형입니다. (int32와 크기가 같습니다.)
	   문자는 ''로 만듭니다.
	*/
	fmt.Println("\n=== 복소수형 ===")
	var ch rune = 'g'
	fmt.Println("ch는", ch, "byte는", unsafe.Sizeof(ch))
	var chn rune = 103
	fmt.Println("chn은", chn, "byte는", unsafe.Sizeof(chn))

	fmt.Println("ch == chn은", ch == chn)

	/*
	   - byte형 -
	   byte에 저장되어 있는 자료형입니다.
	*/
	fmt.Println("\n=== 복소수형 ===")
	var bi byte = 103
	fmt.Println("bi는", bi, "byte는", unsafe.Sizeof(bi))
	var bn byte = 'g'
	fmt.Println("bn은", bn, "byte는", unsafe.Sizeof(bn))

	/*
	   - 형변환 -
	   연산을 위해 자료형을 일치시켜야 하는 때가 있습니다. 이를 위해 변수 및 리터럴의 자료형을 다른 자료형으로 바꾸는것을 형변환이라 합니다.
	   go는 strong type 언어로 자동형변환이 일어나지 않습니다. (<- 대입연산은 아니지만, 산술연산에서는 일어나는듯)
	*/
	fmt.Println("\n=== 형변환 ===")
	var ia int32 = 3
	var ib int64 = 5
	// fmt.Println("ia + ib는", ia + ib) - error: ia와 ib의 자료형이 일치하지 않습니다.
	fmt.Println("ia + ib는", ia+int32(ib), "byte는", unsafe.Sizeof(ia+int32(ib)))
	fmt.Println("ia + ib는", int64(ia)+ib, "byte는", unsafe.Sizeof(int64(ia)+ib))

	var ra float32 = 3.0
	var rb float64 = 5.0
	// fmt.Println("ra + rb는", ra + rb) - error: ra와 rb의 자료형이 일치하지 않습니다.
	fmt.Println("ra + rb는", ra+float32(rb), "byte는", unsafe.Sizeof(ra+float32(rb)))
	fmt.Println("ra + rb는", float64(ra)+rb, "byte는", unsafe.Sizeof(float64(ra)+rb))

	var ic int64 = 3 / 2
	var rc float64 = 3 / 2
	var rd float64 = float64(3) / 2
	fmt.Println("ic는", ic, "byte는", unsafe.Sizeof(ic))
	fmt.Println("rc는", rc, "byte는", unsafe.Sizeof(rc))
	fmt.Println("rd는", rd, "byte는", unsafe.Sizeof(rd))
	fmt.Println("int64(rd)는", int64(rd), "byte는", unsafe.Sizeof(rd))

	/*
	   - 상수 -
	   const로 상수를 선언합니다.
	*/
	fmt.Println("\n=== 상수 ===")
	const M int = 5
	fmt.Println("M은", M, "byte는", unsafe.Sizeof(M))

	/*
	   짧은선언
	*/

	/*
	   - scope -
	   scope는 변수의 유효범위로, c는 block scope입니다.
	*/
}
