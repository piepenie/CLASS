문자열이란 무엇인가?


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

	// 4. 포인터 연산으로 문자 하나씩 출력
	

	// 5. strlen 함수를 사용하여 문자 하나씩 출력


	}
	
	
	
	
}
