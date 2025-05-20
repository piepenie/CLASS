# Secton 02-1
# 파이썬 기초 코딩
# print 구문의 이해
# 참조 : https://www.python-course.eu/python3_formatted_output.php

# 기본 출력
print('Hello Python!')
print("Hello Pyhton!")
print("""Hello Pyhton!""")
print('''Hello Python!''')

print()

# Separator 옵션 사용 + sep='' 공백을 만들어주고 공백안에 추가 기호를 넣어주는 것

print('T', 'E', 'S', 'T', sep='')
print('2019', '02', '19', sep='-')
print('piepenie', 'goolge.com', sep='@')

# end 옵션 사용 끝부분을 연결해주는 옵션

print('Welcome To', end=' ')
print(' the white paradise', end=' ')
print(' Lime notes')


# format 사용 [] , {} , () 순서대로 대괄호 중괄호 소괄호라고 부름. 
print('{} and {}'.format('You', 'Me'))
print("{0} and {1} and {0}".format('You', 'Me'))
print("{a} are {b}".format(a='you', b='Me'))

print("%s's favortie nunber is %d" %('piepenie', 777)) # %s : 문자 , %d : 정수, %f : 실수

print("Test1: %5d, Price: %4.2f" %(776, 6534.123)) # %5d : 5자리 정수가 온다고 지정해주는거 %4.2f : 소수점 4째짜리 4자리 실수가 나온다는 뜻
print("Test1: {0: 5d}, Price:{1: 4.2f}".format(776, 6534.123))
print("Test1: {a: 5d}, Price:{b: 4.2f}".format(a=776, b=6534.123)) # 이게 난 제일 편한거 같아.

# escape 코드란? 특정한 의미나 동작을 나타내기 위해 일반적인 문자에 특별한 의미를 부여하는 방식
