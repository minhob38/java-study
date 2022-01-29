/*
배열이란 같은 자료형들을 모아놓은 자료형입니다.
*/

#include <stdio.h>
#include <string.h>

int main(void)
{
  /* 베열 선언 */
	printf("=== 배열 선언 ===\n");
  int a[5];
  for (int i = 0; i < 5; i++)
  {
    a[i] = i;
    printf("a[%d]는 %d입니다.\n", i, a[i]);
  }

  /* 배열 선언 및 초기화 */
	printf("=== 배열 선언 및 초기화 ===\n");
  int b[5] = { 1, 2, 3, 4, 5 };
  /* 선언을 초기화와 함께 하면, 길이를 생략할 수 있습니다. */
  int c[] = { 1, 2, 3, 4, 5 };

  for (int i = 0; i < 5; i++)
  {
    printf("b[%d]는 %d입니다.\n", i, b[i]);
    printf("c[%d]는 %d입니다.\n", i, b[i]);
  }

  /*
  [문자열]
  c는 null문자로 문자열의 끝을 표현합니다. null문자가 없으면 문자배열과 같습니다.
  (자동으로 문자열 끝에 null문자인 \0를 붙입니다.)
  */
	printf("=== 문자열 ===\n");
  /* 선언을 초기화와 함께 하면, 길이를 생략할 수 있습니다. */
  char str[] = "c language : )";

  /* 선언과 초기화를 따로 하면, 서로 다른 메모리 공간을 가지고 있기에, strcpy로 할당을 해야합니다. */
  char stri[30];
  // stri = "c language : )"; - error
  strcpy(stri, "c language : )");
  printf("stri은 %s이며 %lu byte 입니다.\n", stri, sizeof(stri));

  /* printf("null문자는 정수형은 %d, 문자형은 %c입니다.", str[14], str[14]); */
  printf("str은 %s이며 %lu byte 입니다.\n", str, sizeof(str));

  for (int i = 0; i < 14; i++)
  {
    printf("str[%d]는 %c입니다.\n", i, str[i]);
  }

  /* 다차원 배열 선언 및 초기화 */
	printf("=== 다차원 배열 선언 및 초기화 ===\n");
  int d[3][3] = {
    { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 }
  };

  for (int i = 0; i < 3; i++)
  {
		for (int j = 0; j < 3; j++)
    {
			printf("d[%d][%d]는 %d입니다.\n", i, j, d[i][j]);
		}
	}

	printf("=== 배열 얕은복사 ===\n");
  /* 배열이름은 시작주소를 담고 있습니다.*/
  int e[] = { 1, 2, 3 };
  // int f[] = e; - error: e는 { 1, 2, 3 }이 아닌 시작주소입니다. 따라서, f에 할당할 수 없습니다.
  int * f = e;
  for (int i = 0; i < 3; i++)
  {
    printf("f[%d]는 %d입니다.\n", i, f[i]);
  }

  printf("=== 배열 깊은복사 ===\n");
  int g[] = { 1, 2, 3 };
  int h[3];
  memcpy(h, g, sizeof(int) * 3);
  for (int i = 0; i < 3; i++)
  {
    printf("h[%d]는 %d입니다.\n", i, h[i]);
  }
}
