public class BasicArrayTest {
    public static void main(String[] args) {
        float[] f = new float[3];
        for (int i = 0; i < f.length; i++) {
            f[0] = 17.4f;
            f[1] = 59.2f;
            f[2] = 34.8f;
            System.out.println( "f" + [i] + f[i] + "f;");
        }

    }
}  

이 부분에서 "[i]" 부분이 잘못된 문법이에요.

Java에서는 배열 요소를 출력할 때 인덱스를 이렇게 표현하지 않습니다. "f" + [i] → 여기서 [i]는 문법적으로 의미가 없기 때문에 컴파일 오류가 발생
*문법 오류*
          System.out.println("f[" + i + "] = " + f[i] + "f;");
수정된 구문. >> 정상 출력. 
f[0] = 17.4f;
f[1] = 59.2f;
f[2] = 34.8f;

////

배열을 이용해서 객체를 정리하는거 마치 사물함 정리처럼 생각하면 좋아.
Movie[] arr = new Movie[3];   // [null][null][null]
arr[0] = new Movie();         // [Movie@주소][null][null]

////

2차원 배열(이미지를 표현하는)
ex) Pixel(픽셀) 256 x 256(이미지)

int[] socre = new int[][];
ex)int[] socre = new int[3][3];
9칸짜리 3x3행열이 만들어짐 앞이 행(세로) 뒤가 열(가로)



