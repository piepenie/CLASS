컴파일이란?
인간이 만든 고급언어를 컴퓨터가 해석 할 수 있는 
저급언어로 변환하는것 

c언어 컴파일 과정

.c >> 전처리기 >> .i >> 컴파일러 >> .s >> 어셈블러 >> .o
>> 링커 >> .exe

전처리기 : 전처리 구문을 처리하는 과정 // 확장자 .i
ex) #include<stdio.h> 

컴파일러 : 고급언어를 저급언어로 변환 기계어 가장 가까움 // 확장자 .s

어셈블러 : 완전히 기계어로 바꾸어주는 역할 // 확장자 .o

링커 : 어려 개의 목적 파일을 합쳐 실행 파일을 생성 // 확장자 .exe 또는 .out

컴파일러 vs 인터프리터 

# 컴파일러 
고급 >> 저급(기계어)로 번역이 중요함
한번 번역 한 이후엔 빠르다.

종류 : C, C++, JAVA 등

# 인터프리터 
고급언어로 작성된 프로그램을 한 줄 씩 읽어들여서 실행시킴
>> 실시간 통역을 하는 느낌.
번역과 실행이 동시에 이루어짐, 별도의 실행파일이 존재x

종류 : Ruby, php, javascript, Basic
