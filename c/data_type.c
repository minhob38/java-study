/*
자료형이란 데이터를 표현하는 기준입니다.
c의 자료형은 정수형 / 실수형이 있습니다.
- 문자형(char)은 정수형으로 간주됩니다.
- 논리형은(1byte) 정수형으로 간주됩니다. (1:참, 0:거짓)
*/

#include <stdio.h>

int main(void)
{
  /*
  - 정수형-
  char: 1byte (-128 ~ 127)
  short: 2byte (-32768 ~ 32767)
  int: 4byte (-2147483648 ~ 2147483647)
  long: 4byte (-2147483648 ~ 2147483647)
  long long: 8byte (-9223372036854775808 ~ 9223372036854775807)
  ✏️ 일반적으로 int형을 사용합니다.
  */
  printf("=== 정수형 ===\n");
  int in = 3;
  // sizeof로 자료형의 byte를 알 수 있습니다.
  printf("in의 byte는 %lu \n", sizeof(in));

  // 정수형 연산은 short끼리 연산해도 int로 형변환됩니다. (int형이 연산이 빠르기 때문에)
  short ia = 3;
  short ib = 5;
  printf("ia, ib의 byte는 %lu, %lu \n", sizeof(ia), sizeof(ib));
  printf("ia + ib의 byte는 %lu \n", sizeof(ia + ib));

  // 접미사(u, l, ul, ll, ull)을 붙여 리터럴 자료형을 정의합니다. (붙이지 않으면 int형입니다.)
  long long lli = 5ll;
  printf("lli는 %lld %lu byte \n", lli, sizeof(lli));



  /*
  - 실수형 -
  float: 4byte (3.4E-37 ~ 3.4E38)
  double: 8byte (1.7E-307 ~ 1.7E308)
  long double: double보다 큰 자료형
  ✏️ 일반적으로 double형을 사용합니다.
  */
  printf("=== 실수형 ===\n");
  int rn = 3;
  printf("rn의 byte는 %lu \n", sizeof(rn));

  // 정수형 연산은 float끼리 연산해도 double로 형변환되지는 않습니다.
  float ra = 3.0;
  float rb = 5.0;
  printf("ra, rb의 byte는 %lu, %lu \n", sizeof(ra), sizeof(rb));
  printf("ra + rb의 byte는 %lu \n", sizeof(ra + rb));

  // 접미사(f, l)을 붙여 리터럴 자료형을 정의합니다. (붙이지 않으면 double형입니다.)
  float fr = 5.0f;
  printf("fr은 %f %lu byte \n", fr, sizeof(fr));

  double dr = 5.0l;
  printf("dr은 %f %lu byte \n", dr, sizeof(dr));

  /*
  - 문자형 -
  문자형은 char에 담깁니다.
  문자(literal)는 '', 문자열(literal)은 ""로 만듭니다.
   */
  printf("=== 문자형 ===\n");
  char ch = 'c';
  printf("ch의 byte는 %lu \n", sizeof(ch));
  printf("ch의 문자 및 unicode는 %c, %d \n", ch, ch);

  char nch = 99;
  printf("nch의 문자 및 unicode는 %c, %d \n", nch, nch);

  int ich = 99;
  printf("ich의 문자 및 unicode는 %c, %d \n", ich, ich);


  /*
  - 형변환 -
  연산을 위해 자료형을 일치시켜야 하는 때가 있습니다. 이를 위해 변수 및 리터럴의 자료형을 다른 자료형으로 바꾸는것을 형변환이라 합니다.
  형변환에는 자동(묵시적)형변환, 강제(명시적)형변환 두가지가 있습니다.
  */
  printf("=== 형변환 ===\n");
  // 자동(묵시적)형변환은 대입연산(=)연산에서 형이 다르면 일어납니다. 대입연산은 왼쪽 피연산자의 자료형으로 형변환됩니다.
  double dm = 3;
  printf("dm은 %f byte %lu \n", dm, sizeof(dm));

  int im = 3.5; // warning
  printf("im은 %d byte %lu \n", im, sizeof(im));

  // 자동(묵시적)형변환은 산술연산에서 형이 다르면 일어납니다. 산술연산은 넓은 자료형으로 형변환됩니다.
  double dk = 3 / 2;
  printf("dk는 %f byte %lu \n", dk, sizeof(dk));

  double dj = (double)3 / 2;
  printf("dj는 %f byte %lu \n", dj, sizeof(dj));


  /*
  - 상수 -
  const로 상수를 선언합니다.
  */
  printf("=== 상수 ===\n");
  const int M = 5;
  printf("M은 %d \n", M);

  /*
  - scope -
  scope는 변수의 유효범위로, c는 block scope입니다.
  */
  printf("=== scope ===\n");
  int s = 3;
  printf("s는 %d입니다.\n", s);

  {
    int s = 5;
    printf("s는 %d입니다.\n", s);
  }

  /*
  - static / register -
  */
}
