배열은무엇일까?

배열이란, 같은 형태의 데이터를 하나의 변수에 여러개 넣는 것
{} 중괄호를 사용해서 선언하고, 배열을 표현할 때는 [] 형태를 만든다.

//정수배열(선언)
int intArray[] = {1,2,3,4,5};
int intArray[5] = {1,2,3,4,5};

//정수배열(요소 접근)
printf("%d",intArray[0]);
출력값 : 1 

시험에서는 배열의 요소에 접근하는 것으로 많이 나온다
개별 요소는 변수[몇번째]로 접근한다.

[중요] 몇번째는 인덱스라고 부르며 0부터 시작한다.

배열에서의 반복문

#include <stdio.h>

int main() {
	int intArray[] = {1,2,3,4,5};
	int size = 5;

	printf("intArray:\n");
	for (int i = 0; i < size; i++ ){
		printf("%d",intArray[i]);
	}

	return 0;

}
