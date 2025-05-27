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

Java 실행 구조 요약

1. 소스 파일 작성: HelloWorld.java (고급 언어, 인간이 이해하는 언어)
2. 컴파일: javac HelloWorld.java → HelloWorld.class (바이트코드, JVM이 이해하는 언어)
3. 실행: java HelloWorld → JVM이 바이트코드를 실행

JVM 동작 구조:
- Class Loader: .class 파일을 메모리에 로드
- Execution Engine: 바이트코드를 해석하거나 JIT 컴파일하여 실행
- JVM 메모리 구조:
   - Method Area: 클래스 구조, static 등
   - Heap: 객체 저장
   - Stack: 메서드 호출, 지역 변수
   - Runtime Constant Pool: 상수 정보 저장

사람 > 도구or메뉴판(API) 
미리 만들어놓은 API 도구들의 모음

Java 의 구동방식

intellij 에 연결된 JDK에서 처리해주는것 
1. java SourceFile(.java)

2. 컴파일(javac.exe)

3. Java Byte Code(.class) 

이후 RUN을 하는순간
C:\>java.exe HelloWorld : 실행
 >> JVM이 동작함 RPC는 기능 호출 시스템같은거
Class Loader (메모리에 로딩시킴)
Execute 실행시킴 

SW 소프트웨어
JVM 자바 버츄어 머신
OS 해당 OS 환경(win, mac, Linux or Something)
