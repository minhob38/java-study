/*
포인터는 메모리 주소를 가리키는 것을 일컫으며, 포인터 변수와 포인터 상수가 있습니다.
포인터 변수는 메모리 주소값을 저장하는 변수입니다.
& 연산자는 변수의 메모리 (시작)주소값을 반환합니다.
*/

#include <stdio.h>

void pointer_func(int * arr)
{
  for (int i = 0; i < 3; i++)
  {
    printf("배열의 요소는 %d입니다.\n", arr[i]);
  }
}

void array_func(int arr[])
{
  for (int i = 0; i < 3; i++)
  {
    printf("배열의 요소는 %d입니다.\n", arr[i]);
  }
}

int main(void)
{
  /* 베열 선언 */
	printf("=== 포인터 변수 선언 및 할당===\n");
  /*
  [포인터 변수 선언 및 할당]
  int형인 ia가 저장되어 있는 메모리의 시작 주소를, 포인터변수 pia에 저장합니다.
  - &ia: int형인 ia가 저장되어 있는 메모리의 시작 주소값을 반환합니다.
  - int * pia: int 자료형의 주소값을 저장할 수 있는 포인터 변수 pia를 만듭니다.
  - int *는 자료형이 아닌 포인터형으로, pia의 자료형이 int형가 아닌 담겨져 있는 시작주소가 int형인것을 의미합니다.
  - 포인터 변수의 자료형은 os bit system에 따라 다릅니다. (32bit system은 4byte, 64bit system은 8byte입니다.)
  - 포인터 변수는 시작주소를 담기 때문에, 끝주소를 계산하기 위해 포인터형이 필요합니다.
  - [type] *은 포인터형이고, *[포인터변수]는 포인터변수가 가리키는 변수입니다.
  */
  int ia = 3;
  int * pia = &ia;

  printf("=== * 연산자 ===\n");
  /*
  [* 연산자]
  - 포인터가 가리키는 메모리 공간에 접근하는 연산자입니다.
  - [type] *은 포인터형이고, * [포인터변수]는 포인터변수가 가리키는 변수로 다른 의미를 가집니다.
  */
  printf("pia는 %p입니다.\n", pia);
  printf("*pia는 %d입니다.\n", *pia);

  printf("=== NULL 포인터 ===\n");
  /*
  [NULL 포인터]
  - 포인터 변수에 잘못된 주소를 할당하면 예기치 못한 결과가 나올 수 있기에, 아무데도 가리키지 않는 NULL로 초기화 합니다.
  - NULL은 0과 같습니다. (0과는 같지만, 주소를 가리키는 차이가 있습니다.)
  */
  int * pn = NULL;
  printf("pn은 %p입니다.\n", pn);
  printf("%d\n", NULL == 0);

  /*
  [배열의 이름 - 포인터 상수]
  - 배열의 이름은 시작주소를 가리킵니다.
  - 배열의 이름은 포인터상수로, 새로운 주소를 할당할 수 없습니다.
  */
	printf("=== 배열의 이름 - 포인터 상수 ===\n");
  int arr[] = { 1, 2, 3 };
  printf("arr은 %p입니다.\n", arr);
  printf("&arr[0]은 %p입니다.\n", &arr[0]);
  printf("&arr[1]은 %p입니다.\n", &arr[1]);
  printf("&arr[2]는 %p입니다.\n", &arr[2]);

  /* 배열의 이름은 포인터이기에 *연산을 할 수 있습니다.*/
  *arr = 5;
  printf("*arr은 %d입니다.\n", *arr);
  printf("arr[0]은 %d입니다.\n", arr[0]);

  /*
  [포인터 연산]
  - 포인터는 메모리 접근을 위해, + - 연산을 할 수 있습니다.
  - 포인터형에 따라 +/-를 하면, 포인터형의 byte에 따라 가리키는 주소를 바꿉니다.
  (e.g: 포인터에 +1을 하면, int형은 4byte이기에 가리키는 주소가 +4가 되며, doint형은 8byte이기에 가리키는 주소가 +8이 됩니다.)
  */
	printf("=== 포인터 연산 ===\n");
  // int arr[] = { 1, 2, 3 };
  int a = 3;
  int * pa = &a;
  printf("pa는 %p입니다.\n", pa);
  pa++;
  printf("pa는 %p입니다.\n", pa);
  pa--;
  printf("pa는 %p입니다.\n", pa);

  double b = 3;
  double * pb = &b;
  printf("pb는 %p입니다.\n", pb);
  pb++;
  printf("pb는 %p입니다.\n", pb);
  pb--;
  printf("pb는 %p입니다.\n", pb);

  /*
  [문자열]
  - 문자열은 저장된 뒤 시작주소를 반환하기에, 포인터로 문자열을 가리킬 수 있습니다.
  - 포인터로 가리키는 문자열을 바꿀수는 있지만, 수정할수는 없습니다.
  */
	printf("=== 문자열 ===\n");
  char * pstr = "c language : )";
  printf("pstr은 %p입니다.\n", pstr);
  printf("*pstr은 %s입니다.\n", pstr);

  /*
  [포인터 배열]
  포인터를 배열에 저장할 수 있습니다.
  */
	printf("=== 포인터 배열 ===\n");
  int i = 3, j = 4, k = 5;
  int * pijk[] = { &i, &j, &k };
  printf("pijk[0]은 %p입니다.\n", pijk[0]);
  printf("pijk[1]은 %p입니다.\n", pijk[1]);
  printf("pijk[2]는 %p입니다.\n", pijk[2]);
  printf("*pijk[0]은 %d입니다.\n", *pijk[0]);
  printf("*pijk[1]은 %d입니다.\n", *pijk[1]);
  printf("*pijk[2]는 %d입니다.\n", *pijk[2]);

  /*
  [함수인자로 배열 넘겨주기]
  함수의 매개변수로 배열을 선언할 수 없기에, 포인터로 배열을 함수에 넘겨줍니다.
  */
	printf("=== 함수인자로 배열 넘겨주기 ===\n");
  int args[] = { 1, 2, 3 };
  pointer_func(args);
  array_func(args);
}
