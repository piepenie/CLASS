문자열이란 무엇인가?

1. 배열은 인덱스 0부터 시작한다. 변수명[0]부터 시작하고, 인덱스를 기준으로 반복문을 많이
구성한다.
2. c언어에서 문자와 문자열은 거의 차이가 없다. 문자를 여러개 묶어 놓은 것 뿐이며 맨 끝에
'\0' 문자가 들어간다.
3. 문자열을 변수로 할당하는 방식은 다양하다. [], [00], * 등 다양한 방식으로 선언할 수 있다.
4. 출력할 때는 %c 로 반복하여 출력하거나, %s 로 한번에 출력할 수 있다.

#include<stdio.h>
#include<string.h>

int main() {
	char str[] = "Hello, World!"; // 문자열 선언

	// 1. %s 형식 지정자로 출력 
	printf("1.%s\n",str);
	
	// 2. puts 함수로 출력(자동 개행) 
	puts("2.");
	puts(str);
	
	// 3. 인덱스 문자로 하나씩 출력 
	printf("3.");
	for (int i =0; str[i] != '\0'; i++ ){
		printf("%c",str[i]);
	}
	
	// 4. 포인터 연산으로 문자 하나씩 출력
	printf("\n4.") ;
	char *ptr = str;
	while(*ptr != '\0'){
		printf("%c",*ptr);
		ptr++;
	}
	
	// 5. strlen 함수를 사용하여 문자 하나씩 출력
	printf("\n5.") ;
	int len = strlen(str);
	for (int i = 0 ; i < len; i++){
		printf("%c",str[i]);
	}
	
}
