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


public class ArrayExam {
    public static void main(String[] args) {
        // Q. 아래 char[] 배열에 APPLE 이라는 문자가 저장되어 있다. 대문자로 된 APPLE 을 소문자 apple 로 출력하세요.
        char[] c = {'A','P','P','L','E'}; // 아스키코드값에서 소문자로 돌아가려면 각각 -값을 더해주면 될거같거든? 32만큼 더해주면됨 각각
        for(int i=0; i<c.length; i++){
            System.out.println((char)(c[i]+32)); // 형변환을 내가 헷갈렷어!
        }
        int A = 'A';
        System.out.println("A = " + A);
        int a = 'a';
        System.out.println("a = " + a); // 헷갈린 아스키 코드값을 불러오기 위해서 출력함
    }
}
