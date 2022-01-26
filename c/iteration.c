/*
반복문이란 특정조건까지 반복되는 구문을 의미합니다.
*/

#include <stdio.h>

int main(void)
{
  /* for문
  조건식이 참이면 구문을 실행합니다.
  */
	printf("=== for문 ===\n");
  for (int i = 0; i < 5; i++) 
  {
    printf("i는 %d \n", i);
  }

  for (int i = 0; i < 10; i += 3)
  {
    int j = 0;
    printf("i는 %d \n", i);
  }

  /* while문
  조건식이 참이면 구문을 실행합니다.
  */
  printf("=== while문 ===\n");
  int i = 0;
  while (i < 5)
  {
    printf("i는 %d \n", i);
    i++;
  }

  /* do-while문
  조건식이 참이면 구문을 실행합니다. (구문을 먼저 실행합니다.)
  */
  printf("=== while문 ===\n");
  int j = 0;
  do {
    printf("j는 %d \n", j);
    j++;
  } while (j < 5);

  /* break
  break를 감싸고 있는 반복문을 탈출합니다.
  */
  printf("=== break ===\n");
  for (int i = 0; i < 5; i++)
  {
    if (i == 3)
    {
      break;
    }
    printf("i는 %d \n", i);
  }

  // infinite loop (for)
  int k = 0;
  for (;;)
  {
    if (k == 3)
    {
      break;
    }
    printf("k는 %d \n", k);
    k++;
  }

  // infinite loop (while)
  int l = 0;
  while (1)
  {
    if (l == 3)
    {
      break;
    }
    printf("l은 %d \n", l);
    l++;
  }

  /* continue
  continue를 감싸고 있는 반복문 조건식으로 이동합니다.
  */
  printf("=== continue ===\n");
  for (int i = 0; i < 5; i++)
  {
    if (i == 3)
    {
      continue;
    }
    printf("i는 %d \n", i);
  }
}
