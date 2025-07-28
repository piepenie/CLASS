Switch 문은 다중 선택 제어구조
변수의 값을 평가하고, 그 값에 해당하는 case 블록을 
실행하게 된다.

다양한 분기처리를 할 때 사용
(여러 조건을 걸어서 그 조건을 실행!)

break 가 없는 경우에는 다음 case 로 폭포수처럼 
내려감.

ex)
public class StringLengthProblem {
    public static void main(String[] args) {
        String str = "helloworld";
        int len = str.length();
        switch (len){
            case 3 : len += 2;
            case 4 : len *= 2;
            case 5 : len -= 1;
            case 6 : len += 3;
                break;
            case 7 : len -= 2;
            case 8 : len *= 3;
            default: len /= 2;
        }
        System.out.println(len);
    }
}

A : 5 (문자열 값이 10이고, 해당 케이스에 적합한 결과값이 없으므로 default 값으로 출력됨)
