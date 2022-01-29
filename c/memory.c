/*
메모리는 code, data, heap, stack 영역으로 이루어져 있습니다.
c의 메모리 관리는 아래와 같습니다.
- code: 프로그램의 코드가 저장되어 있는 공간입니다.
- data: 전역변수 및 static 변수가 저장되어 있는 공간입니다. 프로그램이 실행될때 할당되며, 종료되면 지워집니다.
- stack: 지역변수 및 매개변수가 저장되어 있는 공간입니다. 함수가 실행될때 할당되며 종료되면 지워집니다.
- heap: 프로그래머가 관리하는 공간입니다.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	printf("=== malloc 함수 ===\n");
  /*
  - malloc 함수를 통해 메모리 공간을 할당할 수 있습니다.
  - 인자로 넣어준 수에 해당하는 byte 공간을 할당합니다.
  - malloc 함수는 만들어진 메모리 공간을 쓰레기값으로 초기화 합니다.
  - malloc 함수는 메모리 주소를 반환합니다.
  - malloc 함수는 void 포인터형을 반환하기에 형변환을 해야합니다.
  */

  int * a = (int *)malloc(sizeof(int));
  *a = 3;
	printf("a는 %p 입니다.\n", a);
	printf("*a는 %d 입니다.\n", *a);

  double * b = (double *)malloc(8);
  *b = 3;
	printf("b는 %p 입니다.\n", b);
	printf("*b는 %f 입니다.\n", *b);

  char * c = (char *)malloc(sizeof(char) * 30);
  // c = "c language : )"; - error: 문자열리터럴은 data 영역에 만들어지고, c는 이 주소를 참조하기에 free를 해도 heap에 있는 메모리 공간이 사라지지 않습니다.
	strcpy(c, "c language : )");
  printf("c는 %p 입니다.\n", c);
	printf("c는 %s 입니다.\n", c);

  int * d = (int *)malloc(sizeof(int) * 3);
  int arr[] = { 1, 2, 3 };
  // d = arr; - error: arr은 data 영역에 만들어지고, d는 이 주소를 참조하기에 free를 해도 heap에 있는 메모리 공간이 사라지지 않습니다.
  memcpy(d, arr, sizeof(int) * 3);
  printf("d는 %p입니다.\n", d);
  for (int i = 0; i < 3; i++)
  {
    printf("d[%d]는 %d입니다.\n", i, d[i]);
  }

  printf("=== calloc 함수 ===\n");
  /*
  - calloc 함수는 malloc 함수와 비슷합니다.
  - calloc 함수는 block과 byte를 인자로 받습니다. (block * byte의 메모리 공간이 만들어집니다.)
  - calloc 함수는 만들어진 메모리 공간을 0으로 초기화 합니다.
  */
  int * e = (int *)calloc(10, sizeof(int));
	printf("*e는 %d 입니다.\n", *e);
  *e = 3;
	printf("e는 %p 입니다.\n", e);
	printf("*e는 %d 입니다.\n", *e);

  printf("=== realloc 함수 ===\n");
  /*
  - realloc 함수는 할당된 메모리 공간을 넓힙니다.
  */
  int * f = (int *)malloc(sizeof(int) * 3);
  memcpy(f, arr, sizeof(int) * 3);
	printf("f는 %p 입니다.\n", f);
  f = (int *)realloc(f, sizeof(int) * 3);
	printf("f는 %p 입니다.\n", f);

	printf("=== free 함수 ===\n");
  /*
  - malloc 및 calloc 함수로 할당한 메모리 공간 또한 프로그램이 종료되면 지워집니다.
  - free 함수를 통해 malloc 및 calloc 함수로 만든 메모리 공간을 지울 수 있습니다.
  */
  free(a);
  free(b);
  free(c);
  free(d);
  free(e);
  free(f);
}
