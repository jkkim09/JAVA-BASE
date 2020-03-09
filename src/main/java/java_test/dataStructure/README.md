# 자료구조

#### 표 1.1
| 자료형 |      크기(byte)     |        최소값        |        최대값          |
|--------|---------------------|----------------------|-----------------------|
| byte   | 1byte(8bits)       | -128                 | 127                   |
| short  | 2byte(16bits)      | -32768               | 32767                 |
| int    | 4byte(32bits)      | -2147483648          | 2147483647(20억 정도)  |
| long   | 8byte(64bits)      | -9223372036854775808 | 9223372036854775807   |

#### 표 1.2
| Class or Interface | Superinterfaces | Notes                                                                                | 중복허용           | Null허용                               | 멤버접근                                                                 |
|--------------------|-----------------|--------------------------------------------------------------------------------------|--------------------|----------------------------------------|--------------------------------------------------------------------------|
| Collection         | Iterable        | 전체 Collection의 상위 인터페이스.                                                   | -                  | -                                      | iterator                                                                 |
| List               | Collection      | 원하는 순서로 Element 삽입가능. 각 요소는 Index 번호를 부여 받는다.                  | Yes                | -                                      | iterator 또는 숫자 Index로 임의 접근                                     |
| Set                | Collection      | 중복 Element 불가능. 그러므로 쉽게 여부 중복확인 가능. 특정 순서(Order) 정할수 없음. | No                 | -                                      | iterator                                                                 |
| Queue              | Collection      | Output으로 나올 Element만 기본적으로 접근 가능하다.                                  | Yes                | -                                      | Peeking or Polling or iterator                                           |
| PriorityQueue      | Queue           | 가장 우선순위가 높은 Element가 Head First가 된다.                                    | Yes                | No                                     | Peeking or Polling                                                       |
| Deque              | Queue           | 양 끝단에서 모두 삽입 / 삭제 가능                                                    | Yes                | -                                      | Peeking or Polling or iterator                                           |
| Map                | 해당 없음       | Key / Value로 구성된다.                                                              | 키 : No - 값 : Yes | 키 : 하나의 (null) 키 허용) - 값 : Yes | 통상 Key를 통해 접근 혹은 (keySet ; entrySet ; values ) View를 제공한다. |

#### 표 1.3

| Class         | Base class             | Base interfaces            | 중복허용 | 순서(Order) 존재 | 정렬여부 |
|---------------|------------------------|----------------------------|----------|------------------|----------|
| ArrayList     | AbstractList           | List                       | Yes      | Yes              | No       |
| LinkedList    | AbstractSequentialList | List;Deque                 | Yes      | Yes              | No       |
| Vector        | AbstractList           | List                       | Yes      | Yes              | No       |
| HashSet       | AbstractSet            | Set                        | No       | No               | No       |
| LinkedHashSet | HashSet                | Set                        | No       | Yes              | No       |
| TreeSet       | AbstractSet            | Set;NavigableSet;SortedSet | No       | Yes              | Yes      |
| HashMap       | AbstractMap            | Map                        | No       | No               | No       |

![](https://github.com/jkkim09/JAVA-TEST/blob/master/src/main/resources/image/java_collection_3.jpg?raw=true)

## 실수

- 고정 소수점
- 부동(뜰 부, 움직일 동)소수점


### 고정 소수점
\- 소수점이 고정된 형태이다. <br>
\- 표현 가능한 실수의 범위와 정밀도가 제한적이기 때문에 실질적으로 잘 사용하지 않는다.<br>

ex) 예를 들어 부호부에 1개의 비트, 정수부에 n개의 비트, 소수부에 m개의 비트를 할당한 수의 경우 2^(n+m+1),

![](https://github.com/jkkim09/JAVA-TEST/blob/master/src/main/resources/image/img1.png?raw=true)


### 부동 소수점
\- 소수점이 이동 가능하다고 해서 붙여진 이름이다.<br>
\- 32비트 단정밀도는 부호부에 1비트, 지수부에 8비트, 가수부에 23비트를 할당하는 표현 방식을 말하며, 반드시 구현하도록 권장된다.<br>

![](https://github.com/jkkim09/JAVA-TEST/blob/master/src/main/resources/image/img2.png?raw=true)


#### 2진법으로 부동 소수로 소수를 정확하게 표현할 수 없어서 생기는 오류 
0.3 => 0.01001100110011......(0011)의 무한 반복입니다. 을 2진수로 정확하게 표현 할 수없기때문에 발생하는 오류이다.<br><br>
10진수 소수점을 수를 2진수로 표현하는방법은 ex)0.3 을 2진수로 변경하면
0.3 * 2 = 0.6 (0) => 0.6 * 2 (1) => 0.2 * 2 (0) => 0.4 * 2 (0) => 0.8 * 2 (1) => 0.6 * 2 (1) => 0.2 * 2 (0) => 0.4 * 2 (0) 0.8 * 2 (1) ........ 0100110011<br>
소수점에 2를 곱해여 정수 부분 수를 나열하는 방법이다 만약 정수가 1이된다면 해당 값에 1을뺀 나머지 부분을 다시 2를 곱하여 실수부분이 0이될때까지 2를 계속 곱해준다 하지만 3같은경우는 0011 을 계속 반복 되는 구조가 되어 2진수로 정확하게 표현이 불가능 하다.

`````java
public class FloatingPoint {
	public static void main(String[] args) {
		// Double 
		Double sum_1 = 0.0; 
		for (int i=0 ; i<100; i++) {
			sum_1 += 0.2;
		}
		System.out.println("Dobule 0.1 100번 더함, 0.1*100 : "+sum_1 + "  ,  "+ (0.1f*100));
		
		// Float
		Float sum_2 = 0.0f;
		for (int i=0 ; i<100; i++) {
			sum_2 += 0.2f;
		}
		System.out.println("Float 0.1f 100번 더함, 0.1*100 : "+sum_2 + "  ,  "+ (0.1*100));

		Double sum_3 = 0.0;
		for(int b=0; b<100; b++) {
			BigDecimal value1 = new BigDecimal(sum_3.toString());
			sum_3 = value1.add(new BigDecimal("0.1")).doubleValue();	
		}
		System.out.println("BigDecimal '0.1' 100더함 , 0.1*100 : "+sum_3 + "  ,  "+ (0.1*100));
	}
}
`````
#### 실행결과
`````cmd
Dobule 0.1 100번 더함, 0.1*100 : 19.99999999999996  ,  10.0
Float 0.1f 100번 더함, 0.1*100 : 20.000004  ,  10.0
BigDecimal '0.1' 100더함 , 0.1*100 : 10.0  ,  10.0
`````

자료형의 가수 부분이 커지면 정확도는 실수를 표현하는 정확도는 올라가지만 그래도 정확하게 10을 표현 할수는 없다.<br><
그러기 떄문에 위와같은 문제 때문에 정밀한 숫자계산을 필요한 영역에서는 BigDecimal을 사용한다.

### BigDecimal (https://jsonobject.tistory.com/466 자료를 참고하였습니다.)
- 소수점을 저장할 수 있는 가장 크기가 큰 타입인 double은 소수점의 정밀도에 있어 한계가 있어 값이 유실될 수 있다.
- BigDecimal은 Java 언어에서 숫자를 정밀하게 저장하고 표현할 수 있는 유일한 방법이다.
- BigDecimal의 유일한 단점은 느린 속도와 기본 타입보다 조금 불편한 사용법 뿐이다.