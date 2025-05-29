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
