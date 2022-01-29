/*
구조체란 변수들을 묶어 새로운 자료형을 정의하는 도구를 의미합니다.
*/

#include <stdio.h>
#include <string.h>

int main(void)
{
	printf("=== 구조체 정의 ===\n");
  /*
  [구조체 정의]
  struct [구조체 이름] { [자료형 member 이름], ... } 으로 구조체를 정의합니다.
  */

  struct dog
  {
    char name[10];
    int age;
  };

  /* 구조체 정의와 구조체 선언을 동시에 할 수 있습니다. */
  struct pos
  {
    int x;
    int y;
  } mouse;

  printf("=== 구조체 선언 ===\n");
  /*
  [구조체 선언]
  struct [구조체 이름] [구조체 변수 이름]으로 구조체를 선언합니다.
  */
  struct dog mydog;

  printf("=== 구조체 member 접근===\n");
  /*
  [구조체 member 접근]
  . 연산자로 구조체 member에 접근할 수 있습니다.
  */
  strcpy(mydog.name, "dingo");
  mydog.age = 3;
  printf("mydog의 name은 %s age는 %d 입니다.\n", mydog.name, mydog.age);

  printf("=== 구조체 초기화 ===\n");
  /*
  [구조체 초기화]
  구조체 선언과 함께 member 순서대로 {}에 담아 초기화 합니다.
  */
  struct dog yourdog = { "badugi", 3 };
  printf("yourdog의 name은 %s age는 %d 입니다.\n", yourdog.name, yourdog.age);

  printf("=== 구조체 배열 ===\n");
  /*
  [구조체 배열]
  구조체 배열을 만들 수 있습니다.
  */
  struct dog mydogs[3];
  for (int i = 0; i < 3; i++)
  {
    strcpy(mydogs[i].name, "dingo");
    mydogs[i].age = 3;
  }

  for (int i = 0; i < 3; i++)
  {
    printf("mydog의 name은 %s age는 %d 입니다.\n", mydogs[i].name, mydogs[i].age);
  }

  struct dog yourdogs[] = {
    {"abc", 1},
    {"def", 2},
    {"ghi", 3},
  };

  for (int i = 0; i < 3; i++)
  {
    printf("yourdog의 name은 %s age는 %d 입니다.\n", yourdogs[i].name, yourdogs[i].age);
  }

  printf("=== 구조체 포인터 ===\n");
  /*
  [구조체 포인터]
  - 포인터로 구조체를 가리킬 수 있습니다.
  - 포인터는 구조체의 첫번째 member의 주소를 가리킵니다.
  */
  struct dog * pdog = &mydog;
  printf("pdog는 %p 입니다.\n", pdog);
  printf("*pdog name은 %s age는 %d 입니다.\n", (*pdog).name, (*pdog).age);

  printf("=== typedef ===\n");
  /*
  [typedef]
  기존 자료형에 새로운 이름을 붙여줄수 있습니다
  */
  typedef int INT; // 기본 자료형 typedef
  INT a = 3;
  printf("a는 %d입니다.\n", a);

  typedef int * PINT; // 포인터형 typedef
  PINT pa = &a;
  printf("pa는 %p입니다.\n", pa);

  typedef struct dog DOG; // 구조체 typedef
  DOG ourdog = { "siru", 3 };
  printf("ourdog의 name은 %s age는 %d 입니다.\n", ourdog.name, ourdog.age);

  typedef struct // typedef와 구조체 동시 정의
  {
    int x;
    int y;
  } POS;

  POS map = { 3, 5 };
  printf("map의 (x, y)는 (%d, %d) 입니다.\n", map.x, map.y);

	printf("=== 구조체 복사 ===\n");
  POS home = { 1, 3 };
  POS company = home;
  printf("home의 (x, y)는 (%d, %d) 입니다.\n", home.x, home.y);
  printf("company의 (x, y)는 (%d, %d) 입니다.\n", company.x, company.y);

  /* 공용체 */
  /* 열거형 */
}
