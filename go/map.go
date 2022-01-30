/*
map은 hash table(dictionary)를 저장하는 자료입니다.
*/

package main

import (
	"fmt"
)

func main() {
	fmt.Println("\n=== map 선언 ===")
	/*
	[map 선언]
	- map[[key 자료형]][value 자료형]으로 선언합니다.
	- make로 메모리 공간을 만들어야, item(key-value)을 저장할 수 있습니다.
	*/
	var a map[string]int = make(map[string]int)
	a["dog"] = 3
	a["cat"] = 5
	fmt.Println("a는", a, "입니다.")
	fmt.Println("a[\"dog\"]는", a["dog"], "입니다.")
	fmt.Println("a[\"cat\"]는", a["cat"], "입니다.")

	fmt.Println("\n=== map 선언 및 초기화 ===")
	/*
	[map 선언 및 초기화]
	선언을 초기화와 함께 하면, make를 생략할 수 있습니다.*
	*/
	b := map[string]int{"dog": 3, "cat": 5}
	fmt.Println("b는", b, "입니다.")
	fmt.Println("b[\"dog\"]는", b["dog"], "입니다.")
	fmt.Println("b[\"cat\"]는", b["cat"], "입니다.")

	fmt.Println("\n=== map 자료 저장 및 조회 ===")
	/*
	[map 자료 저장 및 조회]
	- [map 이름][[key 이름]] = value로 저장합니다.
	- [map 이름][[key 이름]]으로 value를 조회합니다.
	*/
	c := map[string]int{"dog": 3, "cat": 5}
	fmt.Println("c[\"dog\"]는", c["dog"], "입니다.")
	fmt.Println("c는", c, "입니다.")
	c["dog"] = -3
	fmt.Println("c[\"dog\"]는", c["dog"], "입니다.")
	fmt.Println("c는", c, "입니다.")

	/*
	map 조회할때, map[key]는 해당 key의 value와 해당 key가 있는지 bool로 반환합니다.
	(해당 key가 있으면 value, true / 해당 key가 없으면 해당자료형의 기본 초기화값, false를 반환합니다.)
	*/
	vald, isd := c["dog"]
	fmt.Println(vald, isd)

	valb, isb := c["bear"]
	fmt.Println(valb, isb)

	fmt.Println("\n=== map 순회 ===")
	/*
	[map 순회]
	- range 키워드로 map을 순회할 수 있습니다.
	*/
	d := map[string]int{"dog": 3, "cat": 5}
	for key, value := range d {
		fmt.Printf("key는 %s d[%s]는 %d입니다.\n", key, key, value)
	}

	/* value를 생략하면, key만 가져옵니다. */
	for key := range d {
		fmt.Printf("key는 %s입니다.\n", key)

	}
	/* _로 key를 생략할 수 있습니다. */
	for _, value := range d {
		fmt.Printf("value는 %d입니다.\n", value)
	}

	fmt.Println("\n=== map 안의 map ===")
	e := map[string]map[string]int{
		"dog": {
			"age": 3,
		},
		"cat": {
			"age": 5,
		},
	}

	fmt.Println("e는", e, "입니다.")
	fmt.Println("e[\"dog\"][\"age\"]는", e["dog"]["age"], "입니다.")
}
