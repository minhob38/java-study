/*
포인터는 메모리 주소를 가리키는 것을 일컫으며, 포인터 변수와 포인터 상수가 있습니다.
포인터 변수는 메모리 주소값을 저장하는 변수입니다.
& 연산자는 변수의 메모리 (시작)주소값을 반환합니다.
*/

#include <stdio.h>

void pointer_func_a(int * arr)
{
  for (int i = 0; i < 3; i++)
  {
    printf("배열의 요소는 %d입니다.\n", arr[i]);
  }
}

void array_func_a(int arr[])
{
  for (int i = 0; i < 3; i++)
  {
    printf("배열의 요소는 %d입니다.\n", arr[i]);
  }
}

void pointer_func_b(int (* arr)[3])
{
  for (int i = 0; i < 3; i++)
  {
		for (int j = 0; j < 3; j++)
    {
			printf("배열의 요소는 %d입니다.\n", arr[i][j]);
		}
	}
}

void array_func_b(int arr[][3])
{
  for (int i = 0; i < 3; i++)
  {
		for (int j = 0; j < 3; j++)
    {
			printf("배열의 요소는 %d입니다.\n", arr[i][j]);
		}
	}
}

int add(int m, int n)
{
  return m + n;
}

int main(void)
{
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
  printf("pstr의 주소형태는 %p입니다.\n", pstr);
  printf("pstr은 문자열형태는 %s입니다.\n", pstr);

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

  char * q = "c", * w = "go", * e = "python"; // 문자열은 주소를 반환합니다.
  char ** dq = &q , ** dw = &w, ** de = &e;
  char * r[] = { q, w, e }; // pointer 배열입니다.
  char ** z = r; // r은 pointer를 담고있는 배열이기에 double pointer로 받아야 합니다.

  for (int i = 0; i < 3; i++)
  {
    printf("r[%d]의 주소형태는 %p입니다.\n", i, r[i]);
    printf("r[%d]의 문자열형태는 %s입니다.\n", i, r[i]);

    printf("z[%d]의 주소형태는 %p입니다.\n", i, z[i]);
    printf("z[%d]의 문자열형태는 %s입니다.\n", i, z[i]);
  }

  /*
  [함수인자로 배열 넘겨주기]
  - 함수의 매개변수로 배열을 선언할 수 없기에, 포인터로 배열을 함수에 넘겨줍니다.
  - 2차원 배열은 포인터에 +1을 했을때, 가리키는 주소(열의 크기)로 배열 포인터를 통해 함수에 넘겨줍니다.
  - 배열은 arr[i]처럼 index로 주소를 참조하여 변수를 가져옵니다. (따라서, index가 포인터연산과 같습니다.)
  - 2차원 배열의 경우 arr[i][j]처럼 행/열 index가 두개이기 때문에, 해당 행을 가져올때 어떤 주소를 가져올지 기준이 있어야하며, 열의 크기로 기준을 정할 수 있습니다.
  따라서, 배열 포인터([type] (*parr) [열의 크기]))를 만들어 함수인자로 배열을 넘겨주어야 합니다.
  */
	printf("=== 함수인자로 배열 넘겨주기 ===\n");
  int args_a[] = { 1, 2, 3 };
  pointer_func_a(args_a);
  array_func_a(args_a);

  int args_b[3][3] = {
    { 1, 2, 3 },
    { 4, 5, 6 },
    { 7, 8, 9 }
  };
  pointer_func_b(args_b);
  array_func_b(args_b);

  /*
  [다중 포인터]
  포인터 변수 또한 메모리에 저장되기에, 이를 가리키는 포인터 변수를 만들 수 있습니다.
  이처럼 포인터를 가리키는 포인터를 다중 포인터라 합니다.
  */
	printf("=== 다중포인터 ===\n");
  int m = 3;
  int *pm = &m;
  int **dpm = &pm;
  printf("pm은 %p입니다.\n", pm);
  printf("dpm은 %p입니다.\n", dpm);
  printf("*pm은 %d입니다.\n", *pm);
  printf("*dpm은 %p입니다.\n", *dpm);
  printf("**dpm은 %d입니다.\n", **dpm);

  /*
  [함수 포인터]
  - 함수가 저장되어 있는 메모리 주소를 포인터로 가리킬 수 있습니다.
  - 함수 포인터는 [반환 자료형] * [함수포인터 이름] ([매개변수 자료형])으로 만들 수 있습니다.
  */
	printf("=== 함수 포인터 ===\n");
  int (* padd)(int, int) = add;
  printf("add(2, 3)은 %d입니다.\n", add(2, 3));
  printf("padd(2, 3)은 %d입니다.\n", padd(2, 3));

  /*
  [void 포인터]
  - 모든 포인터형을 담을 수 있습니다.
  - 포인터형이 정의되지 않았기에, 연산 및 참조가 안됩니다.
  */
	printf("=== void 포인터 ===\n");
  int h = 0;
  void * ph = &h;
  printf("pi는 %p입니다.\n", ph);
}
