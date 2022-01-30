/*
조건문이란 특정 조건에서 실행 되는 구문을 의미합니다.
*/

#include <stdio.h>

int main(void)
{
  /*
  [if문]
  if 조건이 참이면 실행됩니다.
  */
	printf("=== if문 ===\n");
  /* 단일 if문 */
  int i = 5;
  if (i > 3)
  {
    printf("i는 3보다 큽니다.\n");
  }

  /* if ~ else문 */
  int j = 3;
  if (j < 3)
  {
    printf("j는 3보다 큽니다.\n");
  } else {
    printf("j는 3과 같거나 작습니다.\n");
  }

  /* if ~ else if문 */
  int k = 3;
  if (k > 3)
  {
    printf("k는 3보다 큽니다.\n");
  }
  else if (k == 3)
  {
    printf("k는 3과 같습니다.\n");
  }
  else if (k < 3)
  {
    printf("k는 3보다 작습니다.\n");
  }

  /*
  [조건 연산자]
  조건이 참인 코드를 실행하고 실행결과를 반환합니다.
  */
	printf("=== 조건연산자 ===\n");
  int m = 3;
  m > 3 ? printf("m은 3보다 큽니다.\n") : printf("m은 3보다 작습니다.\n");

  /*
  [switch문]
  switch문은 해당 조건과 일치하는 case로 이동하며, 아래 case들을 실행시킵니다.
  따라서, break를 넣어 해당 조건을 찾으면 switch문을 종료하도록 합니다.
  switch문 조건에는 정수 및 문자열이 오도록합니다.
  */
	printf("=== switch문 ===\n");
  int n = 3;
  switch(n)
  {
  case 1:
    printf("n은 1입니다.\n");
    break;
  case 2:
    printf("n은 2입니다. \n");
    break;
  case 3:
    printf("n은 3입니다. \n");
    break;
  case 4:
    printf("n은 4입니다. \n");
    break;
  default:
    printf("default \n");
    break;
  }

  /*
  [goto]
  program의 흐름을 원하는 위치로 이동시킵니다.
  */
  int p = 3;

CAR:
  printf("🏎\n");


  if (p > 3)
  {
    printf("p는 3보다 큽니다.\n");
    p++;
    goto CAR;
  }
  else if (p == 3)
  {
    printf("p는 3과 같습니다.\n");
    goto PLANE;
  }
  else if (p < 3)
  {
    printf("p는 3보다 작습니다.\n");
    goto TRAIN;
  }

PLANE:
  printf("🛩\n");
TRAIN:
  printf("🚂\n");
}
