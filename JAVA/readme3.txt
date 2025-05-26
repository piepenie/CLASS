수의 표현 이해하기

8 4 2 1 = weight code

weight code란

각 비트의 자리값 (place value) 또는 가중치 (weight) 를 뜻함

ex) 4bit 이진수 표현 1010 을 십진수로 표기시 10으로 표현됨
1 0 1 0 => 2진수
8 4 2 1 => 각 자리값 

8과 2가 존재하므로 10이라는 숫자가 표현됨

CASTING (형변환)

자료형 Type 을 바꾼다는 거

'\uAC00' >> 한글이란뜻

실행가능한 파일(out = 폴더명) .class 로 만들어진다(byte code)
(저급언어 = 컴퓨터 이해 언어)

소스파일(src = 폴더명) .java 로 저장된다. (고급언어 = 인간이해언어)
 
고급언어 >> 저급언어 로 번역해주는게 Compiler 컴파일러
그리고 그 컴파일러를 자바에서 JDK 라고 부름

사람 > 도구or메뉴판(API) 
미리 만들어놓은 API 도구들의 모음

Java 의 구동방식

intellij 에 연결된 JDK에서 처리해주는것 
1. java SourceFile(.java)

2. 컴파일(javac.exe)

3. Java Byte Code(.class) 

이후 RUN을 하는순간
C:\>java.exe HelloWorld : 실행
 >> RPC(원격프로세스호출) : JVM이 동작함
Class Loader (메모리에 로딩시킴)
Execute 실행시킴 

JVM 의 메모리 모델 (Runtime Data Area)

Method Area
Heap Area
Stack Area
Runtime Constant Pool
