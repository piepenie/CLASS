정수를 2진수 8진수 16진수로 바꾸려면
java.lang.Integer.toBinaryString(value); // 2진수
java.lang.Integer.toOctalString(value); // 8진수
java.lang.Integer.toHexString(value); // 16진수

보통은 Integer. 이하만 써도 자동으로 찾아줌

//Q . '1'+'2'+'3'+'4'+'5' = 15 값이 나오도록 프로그래밍 하시요.
char h = '1'; // 49 '0'= 48
char i = '2';
char j = '3';
char k = '4';
char l = '5';
int quiz = (h-'0')+(i-'0')+(j-'0')+(k-'0')+(l-'0');
System.out.println("quiz A : '1'+'2'+'3'+'4'+'5' = " + quiz);

자료형 Type 을 바꾼다는 거

자동형변환(묵시적) 암묵적으로 그냥 자동으로 바뀜
ex) byte -> int

강제형변환(명시적) 큰 type이 작은 type으로 저장되는 경우
손실이 발생함.
ex) int -> byte 
ex) float -> int 
(int) 2.6f >> 2 (손실이생김 *주의가 필요)

(원하는 데이터타입) 변수;

println은 간단하게 출력하고 자동 줄바꿈할 때 좋고,
printf는 **형식화된 출력(정수, 실수, 자리수 조절 등)**
이 필요할 때 사용.

System.out.printf("합계: %d\n", 15);  // printf
System.out.println("합계: " + 15);   // println

q1. 자료형을 분류할때 크게 두가지로 구분함 
1. 기본자료형 2. 사용자정의 자료형
1) 기본자료형은 총 8가지가 존재
정수형 타입을 가르키는 4가지
byte short int long 1 2 4 8 
실수형 타입을 가르키는 2가지
float double 4 8 
문자형(한글자) 
char 2 
마지막 논리형
boolean 1 (true or false)

q2. 문자열을 저장하기 위해서 자바에서 aPI로 제공하는 자료형
String (정확하게는 java.lang.String)

q3. 이진수 (10110011) 를 10진수 16 8진수로 표현해보시오
10 진수 : 179
8진수 263
16진수 0xB3 

q4. 기본자료형 중 정수 자료의 default 자료형과 실수형의 default 자료형
1. int 2. double 각각 4바이트 8바이트 
q5. 7비트로 이루어진 영문 알파벳을 수치형으로 만들어놓은 문자인코팅 >> 아스키 코드 
q6. 비영어권의 모든 문자를 수치로 만들어놓은 문자인코딩
유니코드(unicode)
q7. 대문자 'A' 와 소문자 'a'의 아스키 코드값 차이 
32
q8. 변수의 타입을 다른 타입으로 변환하는 것은?
형변환 (2가지)
q9. 다음 코드 에러가 발생. 정상으로 수정.
float f1 = 56.7f
int f2 = f1; // 형변환해줘야함.
>>수정될 부분 <<
int f2 = (int) f1;
