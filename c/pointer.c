/*
배열이란 같은 자료형들을 모아놓은 자료형입니다.
*/

#include <stdio.h>

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
  char str[] = "c language : )";
  /* 선언을 초기화와 함께 하면, 길이를 생략할 수 있습니다. */

  printf("str은 %s이며 %lu byte 입니다.\n", str, sizeof(str));
  /* printf("null문자는 정수형은 %d, 문자형은 %c입니다.", str[14], str[14]); */

  for (int i = 0; i < 14; i++)
  {
    printf("str[%d]는 %c입니다.\n", i, str[i]);
  }

}
