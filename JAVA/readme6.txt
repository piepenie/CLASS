객체와 클래스의 등장

하나의 성적이라는 데이터를 표현하기위해서는 
여러개의 변수로 표현을 해야함

하나로 표현할 수 없는 여러개의 구성요소
>> 객체 데이터.

클래스를 설계한다
>> 책이라는 객체가 필요한 속성들을 만들어내는거
ex) 책에는 제목이라는 속성이있고 가격이라는 속성이있고
출판사, 저자, 페이지수, ISBN 같은 필요한 속성들만으로
추려서 만들어내는 과정을 말한다!

모델링 도구 = 클래스 
현실세계의 책이라는 객체를
가상세계(컴퓨터)안에 넣으려고 함

클래스 내부에 변수들을 생성해놓음

ex) BOOK >> 이란 클래스를 만들었을 때 해당 클래스에 변수를 만들어놓아서 새로운 자료형을 만들어놓는다.
public class Book {
    public String title;
    public int price;
    public String company;
    public String author;
    public int page;
    public String isbn;
}
