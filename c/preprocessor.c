/*
[선행처리기]
- 선행처리기는 complie 전에 source code를 수정합니다.
- [지시자] [매크로] [매크로 body]로 선행처리 코드를 만들며, 매크로는 매크로 body로 치환됩니다.
- 선행처리를 만들때 한줄로 만드는게 좋으며, 여러줄이 될때는 \로 줄바꿈을 표현해야합니다.
*/

#include <stdio.h>

# define A 3
# define B 5
# define C printf("선행처리기 입니다. :)\n")

# define ADD(M, N) M + N

# define IS 1
# define M 5
# define ISMACRO 0

int main(void)
{
	printf("=== 선행처리 만들기 (object-like macro)===\n");
  /*
  [선행처리 만들기 (object-like macro)]
  매크로를 사물형태의 매크로 body로 치환합니다.
  */
  int a = A;
  printf("a는 %d 입니다.\n",  a);
  printf("B는 %d 입니다.\n",  B);
  C;

	printf("=== 선행처리 만들기 (function-like macro)===\n");
  /*
  [선행처리 만들기 (function-like macro)]
  매크로를 연산형태의 매크로 body로 치환합니다.
  */
  printf("ADD(2, 3)은 %d 입니다.\n",  ADD(2, 3));

	printf("=== 선행처리 만들기 (조건부 compile)===\n");
  /*
  [선행처리 만들기 (조건부 compile)]
  #if 조건문에 따라 code를 삽입합니다.
  #ifdef의 macro가 있으면 code를 삽입합니다.
  */
  #if IS
    printf("IS는 참입니다.\n");
  #endif

  #if IS
    printf("IS는 참입니다.\n");
  #else
    printf("IS는 참입니다.\n");
  #endif

  #if M > 3
    printf("M은 3보다 큽니다.\n");
  #elif M < 3
    printf("M은 3보다 작습니다.\n");
  #else
    printf("M은 3과 같습니다.\n");
  #endif

  #ifdef ISMACRO
    printf("ISMACRO는 있습니다.\n");
  #endif

  #ifdef ISNOT
    printf("ISNOT은 있습니다.\n");
  #else
    printf("ISNOT은 없습니다.\n");
  #endif

  #ifndef ISNOT
    printf("ISNOT은 없습니다.\n");
  #else
    printf("ISNOT은 있습니다.\n");
  #endif
}
