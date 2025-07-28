c언어 데이터 종류

정수형 
short : 작은 정수 ( 출력 형식 지정자 : %d 또는 %hd)
int : 정수 ( 출력 형식 지정자 : %d)
long : 큰 정수( 출력 형식 지정자 : %ld // L 임)

short = 2바이트
int = 4바이트
long = 보통 4바이트 (Windows), 8바이트 (Linux)
long long = 8바이트 (대부분 시스템에서)

문자형
char : 문자( 출력 형식 지정자 : %c)

실수형
float : 단정밀도 부동 소수점 ( 출력 형식 지정자 : %f)
double : 배정밀도 부동 소수점 ( 출력 형식 지정자 : %lf // L 임 Long float = double)

기타 자료형

void : 값을 반환하지 않는 함수의 반환 타입 또는 범용 포인터

c언어에서 특히 많이 나오는거
문자열 >> 표현 방법이 너무 다양해서

1. 문자열 배열로

#include <stdio.h>

int main(void) {
    char str[6] = "Hello";  // 'H', 'e', 'l', 'l', 'o', '\0' 자동 포함
    printf("%s\n", str);

    str[0] = 'h';          // 배열 내부 문자 수정 가능
    printf("%s\n", str);

    return 0;
}

str 배열은 크기가 6으로 고정됨.
마지막에 자동으로 문자열 종료 문자 '\0'가 붙음.

2. 문자열 포인터로

문자 배열로 
문자열 배열 할당 후 개별 문자 할당

c에서는 0이 들어오면 무조건 거짓
