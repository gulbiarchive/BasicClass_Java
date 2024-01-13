package Lesson;

public class L0113A {

	public static void main(String[] args) {
		/*
		 * 2 + 5

피연산자 : 2, 5
연산자에 의해 작업이 수행되는 값

연산자 : +
특정 작업을 수행하기 위한 기호

산술 연산자
: 수학적인 계산

+ 
-
*
/
%

증가 연산자
+ : 양수
- : 음수
++ : 증가 연산자, 1씩 증가
-- : 감소 연산자, 1씩 감소

[후위 증가 연산자]
int i = 5;
int sum = i++;

System.out.println(i); // 6
System.out.println(sum); // 5


대입 연산자
: 변수의 값에 대입

= : 단순 대입

a += 3(축약형 대입 연산자)

a = a + 3

a + 3이 a에 대입

관계 연산자(= 비교 연산자)
결과 : true of false

좌항 == 우항
같다는 의미를 갖는 비교 연산자

S.out.println(10 == 20); // f
S.out.println('A' == 'A'); // t

항 == 항 == 항 == 항(o)

= vs ==
좌항 = 우항 : 대입 연산자
우항의 값을 좌항의 변수에 단순 대입

== : 관계 연산자
'같다'는 의미

! : 부정을 의미
!= : 같지 않다.

좌항 != 우항

S.out.println(1 != 2); // t
S.out.println(1 != 1); // f
S.out.println('A' != 'B'); // t
S.out.println('A' != 'A'); // f
S.out.println('A' ! = 'A'); // error

좌항 > 우항
<

System.out.println(1 > 2); // false
System.out.println(1 > 1); // false
System.out.println(1 < 2); // true


좌항 >= 우항
<=

System.out.println(1 >= 2); // false
System.out.println(1 >= 1); // true
System.out.println(1 <= 2); // true


퀴즈

1. a += 3은 무엇인가?
a = a + 3

2. 축약형 대입 연산자를 사용하는 이유는 무엇인가?
가독성 높임

3. == 연산자는 어떤 의미인가?
같다

4. =와 ==의 차이는 무엇인가?
=
==

5. !=는 어떤 의미인가?

논리 연산자 
결과 : true, false

&&(and)
좌항 && 우항
좌항과 우항의 값이 모두 참일 때만 참
하나라도 거짓이면 거짓

항1 && 항2 && 항3 && 항4 && 항5
조건 : 항2는 false 값이다.
출력 : false


int a = 5, b = 3;

S.out.println((a > b) && (a > b)); // t
S.out.println((a > b) && (a < b)); // f
S.out.println((a < b) && (a < b)); // f

퀴즈
아래 출력은 무엇인가?
1. S.out.println((5 > 3) && (5 > 2) && (10 < 20));
true

2. S.out.println((5 > 1) && (4 < 3) && (20 > 10));
false

||(or)
좌항 || 우항
하나라도 true이면 전체가 true

항1(t) || 항2(t) // true
t || f // t
f || f // f

t || t || t || f // t

int a = 5, b = 3;

System.out.println((a > b) || (a > b)); // t
System.out.println((a > b) || (a < b)); // t
System.out.println((a < b) || (a < b)); // f

!(not)
true -> false
false -> true

int a = 5, b = 2;

System.out.println(!(a > b)); // f
System.out.println(!(a < b)); // t

퀴즈
1. &&는 어떤 의미인가?

2. ||는 어떤 의미인가?

3. !는 어떤 의미인가?

4. 비트 연산자의 종류는 무엇이 있는가?

조건 연산자(= 삼항 연산자)
항을 3개 갖는 연산자

형식
조건식 ? 반환값1 : 반환값2

조건식이 true -> 반환값1 출력
조건식이 false -> 반환값2 출력

(5 > 3) ? "크다" : "작다"; // 크다

int n1 = 5, n2 = 2;

String result = (n1 < n2) ? "pass" : "fail";
S.out.println(result); // fail

자동 형 변환
char -> int -> long -> float -> double

1) 좁은(작은) 데이터 타입 -> 넓은(큰) 데이터 타입

2) int, long(정수), float, double(실수)

3) 
정수 : 4, 5 등과 같은 수
실수 : 4.1, 4.01, 4.9999 등 같은 수
정수보다 조밀한 수 : 실수

4) 실수는 정수보다 더 많은 수를 표현 가능

5) 정밀도 손실 
수치 데이터의 세부적인 정확도

소수점 이하 몇 자릿수

3.14 -> 2자리의 정밀도
9876.4321 -> 4자리의 정밀도

9.187 -> 3자리 정밀도

// 정수형(int) -> 실수형(double) 자동 형 변환
int n1 = 20; // 정수 -> 실수
double n2 = 23.5; // 실수

double n3 = n1 + n2; // 실수
S.out.println(n3)

[자동 현 변환 과정]
n1(int -> double)
n1(20 -> 20.0)

20.0 + 23.5
= 43.5(double)

int a = 10; // -> float(10.0f)
float b = 10.2f;

float c = a + b; // 20.2f
S.out.prinltn(c); // 20.2
		 * */

	}

}
