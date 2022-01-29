/*
[header file]
- header는 단순히 code(문자들의) 모음으로, 프로그램의 의미는 없습니다.
- include를 통해 header file에을 가져올 수 있습니다.
- 해당 source code에 header file의 code가 작성된것 같습니다.
- #include <header file 이름>으로 표준 header file이 저장되어 있는 경로에서 해당 header file을 가져옵니다.
- #include "[header file 이름]"으로 같은 경로에 있는 header file을 가져옵니다.
- #include "[header file 상대경로]"으로 해당 header file을 가져옵니다.
- #include "[header file 절대경로]"으로 해당 header file을 가져옵니다.

[extern]
c는 file 단위로 compile하기에, 다른 file에 있는 정보를 extern으로 알려주어야합니다.
*/

#include <stdio.h>
#include "header_a.h"
#include "header_b.h"

extern int add(int, int);
extern int a;
extern double b;

int main(void)
{
	printf("=== header ===\n");
	/* header_a */
	print("c language : )");

	/* header_b.h */
	DOG mydog = { "dingo", 3 };
  printf("mydog의 name은 %s age는 %d 입니다.\n", mydog.name, mydog.age);
	printf("i는 %d 입니다.", i);
	printf("j는 %f 입니다.", j);
	printf("k는 %s 입니다.", k);

	printf("=== extern ===\n");
	printf("add(2, 3)은 %d 입니다.", add(2,3));
  printf("a는 %d 입니다.", a);
  printf("b는 %f 입니다.", b);
}
