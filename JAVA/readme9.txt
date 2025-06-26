배열(array) 

동일한 여러 개의 데이터를 다루기 위한 방법

한줄 == 선형구조 == 연속적인 구조

자료형 변수;
int : 정수 한개
int a;

Book : 책 한권
Book b;

String : 문자열 한 개
String s;

자료형[] 변수; // [] 배열 기호(여러 개가 묶여있다)

int[] : 정수 여러 개
int[] a;

Book[] : 책 여러 권
Book[] b;

String[] : 문자열 여러 개 
String[] s;

int[] a = new int[3]; 

>> int 3칸이 만들어짐.

int [] >> 인트가 여러 개 입니다.
배열
동일한 연속적인구조 
동일한 변수들의 집합
배열은 객체로 취급한다
데이터를 담아서 이동하기 쉽다.

1차원 배열 = []
2차원 배열 = [][]

배열은 객체로 판단하기 떄문에 만들때 new 를 붙여준다

배열의 길이를 구하는 속성
length
a.length = ?
. => 참조 

길이를 구하는 이유 => 반복문.
길이를 알아야 반복문을 실행할수 있으니까!
   for(int i=0;i<a.length;i++) { // 제어부 i의 시작값, a의 길이, i++ 증가합니다
            System.out.println(a[i]);
        }

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at ArrayMake.main(ArrayMake.java:11)

이건 배열의 인덱스를 잘못 참조했을 때 발생하는 에러로, 특히 배열 길이를 초과한 인덱스를 접근하려고 할 때 자주 나와요.

int[] arr = new int[5];  // 인덱스 0 ~ 4까지 존재

for (int i = 0; i <= 5; i++) {
    System.out.println(arr[i]);  // i가 5일 때 오류 발생
}
