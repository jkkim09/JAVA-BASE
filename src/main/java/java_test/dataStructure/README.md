# 자료구조

![](https://github.com/jkkim09/JAVA-TEST/blob/master/src/main/resources/image/java_collection_3.jpg?raw=true)

#### 표 1.1
| 자료형 |      크기(byte)     |        최소값        |        최대값          |
|--------|---------------------|----------------------|-----------------------|
| byte   | 1byte(8bits)       | -128                 | 127                   |
| short  | 2byte(16bits)      | -32768               | 32767                 |
| int    | 4byte(32bits)      | -2147483648          | 2147483647(20억 정도)  |
| long   | 8byte(64bits)      | -9223372036854775808 | 9223372036854775807   |

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

자료형의 가수 부분이 커지면 정확도는 실수를 표현하는 정확도는 올라가지만 그래도 정확하게 10을 표현 할수는 없다.<br>
위와같은 문제 때문에 정밀한 숫자계산을 필요한 영역에서는 BigDecimal을 사용한다.

### BigDecimal (https://jsonobject.tistory.com/466 자료를 참고하였습니다.)
- 소수점을 저장할 수 있는 가장 크기가 큰 타입인 double은 소수점의 정밀도에 있어 한계가 있어 값이 유실될 수 있다.
- BigDecimal은 Java 언어에서 숫자를 정밀하게 저장하고 표현할 수 있는 유일한 방법이다.
- BigDecimal의 유일한 단점은 느린 속도와 기본 타입보다 조금 불편한 사용법 뿐이다.

## Collection
 - 데이터의 집합, 그룹을 의미한다.
 - JCF(Java Collections Framework)는 이러한 데이터, 자료구조인 컬렌션과 이를 구현하는 클래스를 정의하는 인터페이스를 제공한다.

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

### ArrayList 
기본 배열을 사용할때 해당 인덱스값이 다차여 더이상 값을 넣지 못하거나 인덱스를 다 못채워서 메모리가 낭비가 있을 수 있다 이러한 이유로  ArrayList 클래스를 사용한다.
````java
public class ListTest {
	public static void main(String[] args) {
//		boolean add(E e)
		ArrayList<String> list_1 = new ArrayList<String>();
		list_1.add("T");
		list_1.add("E");
		list_1.add("S");
		list_1.add("T");
		System.out.println("list_1 : " + list_1);
		
//		void add(int index, E element)
		ArrayList<String> list_2 = new ArrayList<String>();
//		list_2.add(0, "T");
//		list_2.add(3, "T");
//		list_2.add(2, "S");
//		list_2.add(1, "E");
		list_2.add("T");
		list_2.add("T");
		list_2.add("T");
		list_2.add("T");
		list_2.add(1, "E");
		list_2.add(2, "S");
		list_2.add(3, "T");
		System.out.println("list_2 : " + list_2);
		
//		addAll
		list_1.addAll(list_2);
		System.out.println("addAll : ");
		for (int i=0; i<list_1.size(); i++) {
			System.out.print(list_1.subList(i, i+1));
		}
		System.out.println();
//		remove
//		list_1.remove(7);
//		list_1.remove(8);
//		list_1.remove(9);
		list_1.remove(7);
		list_1.remove(7);
		list_1.remove(7);
		System.out.println("remove : " + list_1);
	}
}
````
#### 실행결과
````
list_1 : [T, E, S, T]
list_2 : [T, E, S, T, T, T, T]
addAll : 
[T][E][S][T][T][E][S][T][T][T][T]
remove : [T, E, S, T, T, E, S, T]

````

위 결과를 하나씩 알아보면 일단 기본적으로 ArrayList\<T\> list = new ArrayList<T>(); 클래스를 이용하여 사용한다 T 는 해당 타입을 설정하고 설정한 타입으로만 add 할수 있다. add({index}, {value}) 형태로 값을 넣을 수 있으며 해당 index로 값을 넣으면 기존 index는 옆으로 밀리게 된다.
<bt><br>

`````java
list_2.add(0, "T");
list_2.add(3, "T");
list_2.add(2, "S");
list_2.add(1, "E");
`````

add({index}, {value}) 로 사용한 예이다. 위방법으로하면 당연히 정상적으로 "될리가 없다" 처음 생각에 될줄 알았지만 2초간 고민해보니 어이가 없는코드였다 그이유는 해당 ArrayList는 일단 크기를 정하지 안기 때문에 0 다음 3번쨰 인덱스의 영역은 잡혀있지안으며 1,2 인덱스는 존재하지 안기때문에 오류가 발생한다. 오류가 궁굼하다면 위에 코드에서 주석을 제거하고 실행 시켜보면 될것같다.<br>

`````java
list_1.remove(7);
list_1.remove(8);
list_1.remove(9);
`````
 remove({index})를 사용하여 해당 index에 값을 지울수 있다 위코드를 사용하면 "index size가 9"인 ArrayList 값의 7 8 9 번째 값을 지울 수 "있을리가 없다" 그이유는 7 인덱스를 지우면 다음인덱스들이 그자릴를 채우고 한칸씩 당겨지기 때문에 8 인덱스까지는 지워질수 있지만 9인덱스는 없기때문에 오류가 발생한다.

### Vector
Vector클래스의 기능을 개선 한 것이 ArrayList클래스입니다. Vector 클래스는 기존에 작성된 소스와의 호환성을 위해서 계속 남겨 두고 있을
뿐이기 때문에 가능하면 Vector클래스보다 ArrayList클래스를 사용하는 것이 바람직하다고 할 수 있습니다.

### Stack

후입선출(선출후입) = LIFO 나중에 들어온것이 먼저나가는 형식의 구조이다 

`````java
Stack<Element> stack = new Stack<>();
`````

`````java
public Element push(Element item); // 데이터 추가
public Element pop(); // 최근에 추가된(Top) 데이터 삭제
public Element peek(); // 최근에 추가된(Top) 데이터 조회
public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음
`````

`````java
public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		System.out.println("int 1의 index위치 : " + stack.search(1));
		stack.pop();
		System.out.println("int 1의 index위치 : " + stack.search(1));
	}
}
`````

#### 실행결과
`````
[1, 2, 3, 4, 5]
int 1의 index위치 : 5
int 1의 index위치 : 4
`````

### LinkedList
LinkedList도 배열처럼 선형 자료구조입니다. 하지만 배열은 저장소가 연속적인 메모리에 하나의 덩어리로 할당받지만 LinkedList는 노드 하나에 하나의 데이터를 보관하고 노드 내의 링크에 의해 순서 정보(다음 노드의 위치 정보, 이전 노드의 위치 정보)를 기억하는 자료구조입니다.<br>

````
[{이전 index 정보},{데이타},{다음 index 정보}] - [{이전 index 정보},{데이타},{다음 index 정보}] - [{이전 index 정보},{데이타},{다음 index 정보}] .......
````

![](https://github.com/jkkim09/JAVA-TEST/blob/master/src/main/resources/image/linkedlist.png?raw=true)

#### 표 1.4
|  		목록 	|  			장점 				| 				단점 				 |
|---------------|-------------------------------|-----------------------------------|
|  ArrayList  	| LinkedList 보다 조회가 빠르다 | LinkedList 추가 및 삭제가 느리다 |
|  LinkedList도  | ArrayList보다 추가 및 삭제가 빠르다 | ArrayList보다 조회가 느리다. |


#### 표 1.5

| 형태     | 메소드                                       | 설명                                      |
|----------|----------------------------------------------|-------------------------------------------|
| boolean  | add(E e)                                     | e를 리스트의 맨 끝에 추가                 |
| void     | add(int index, E e)                          | index 위치에 e를 리스트에 추가            |
| boolean  | addAll(Collection<? extends E> c)            | Collection인 c 전체를 리스트 맨 끝에 추가 |
| boolean  | addAll(int index, Collection<? extends E> c) | index 위치에 c 전체를 리스트에 추가       |
| void     | addFirst(E e)                                | 리스트의 시작부분에 e를 추가              |
| void     | addLast(E e)                                 | 리스트의 끝부분에 e를 추가                |
| void     | clear()                                      | 리스트의 내용을 전부 삭제                 |
| boolean  | contains(Object o)                           | 리스트에 o가 있다면 true, 없으면 false    |
| Iterator | descendingIterator()                         | 역방향으로 순환하는 iterator를 반환       |
| E        | get(int index)                               | index 위치의 값을 반환                    |
| E        | getFirst()                                   | 리스트의 첫 요소를 반환                   |
| E        | getLast()                                    | 리스트의 마지막 요소를 반환               |
| int      | indexOf(Object o)                            | o가 있는 인덱스를 반환, 없으면 -1 반환    |
| E        | remove()                                     | 리스트의 첫 요소를 반환 후 제거           |
| E        | remove(int index)                            | 리스트의 index 위치의 요소를 반환 후 제거 |
| E        | removeFisrt()                                | 리스트의 첫 요소를 제거 후 반환           |
| E        | removeLast()                                 | 리스트의 마지막 요소를 제거 후 반환       |
| E        | set(int index, E element)                    | index 위치의 값을 element로 변경          |
| int      | size()                                       | 현 리스트의 크기를 반환                   |

#### 속도비교 결과
`````
src -> main -> java -> java_text -> collection -> TestCode.java 코드의 결과이다.

5000000개의 인스턴스 생성 시간 0.1017051초

HashMap Test
	입력 소요 시간 3.1252693초
	탐색 소요 시간 0.0021148초
	삭제 소요 시간 0.0023803초

ArrayList
	입력 소요 시간 0.1053953초
	탐색 소요 시간 6.624E-4초
	삭제 소요 시간 23.5385218초

LinkedList
	입력 소요 시간 0.0345653초
	탐색 소요 시간 13.0546313초
	삭제 소요 시간 13.0241499초
`````
위 결과와 같이 LinkedList는 검색이 빈번하지 안고 추가삭제가 주로 사용하는 로직에서 용이하다.

### ArrayDeque
ArrayDeque는 내부 배열의 크기가 resizable할 수 있고 용량 제한이 없도록 구현되었다. 내부에서 필요에따라 배열을 확장시키는 구조이다. 이 ArrayDeque는 thread-safe하지 않기때문에 multi-thread 환경에서의 사용을 자제해야한다.

 - Double-Ended Queue의 줄임말
 말그대로 큐의 양쪽 끝에서 삽입과 삭제가 모두 발생할 수 있는 큐
 어떻게 사용하느냐에 따라 큐와 스택이 모두 될 수 있음

사실 하나하나 정리하면서 어디에서 쓸까라는 고민을 많이 해보았지만 "답은 나오지 안았다 어디에쓸까? 혹시 아시는분은 Email로 정보공유 부탁드립니다."


### PriorityQueue(우선순위 큐)
 일반적인 큐와는 다르게 데이터를 꺼낼 때 우선순위가 가장 높은 데이터가 가장 먼저 나온다.

`````java
public class PriorityQueueTest implements Comparable<PriorityQueueTest>{
	String name;
    int age;

    static PriorityQueue<PriorityQueueTest> getPriorityQueueOfStudents() {
        PriorityQueue<PriorityQueueTest> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(new PriorityQueueTest("김철수", 20));
        priorityQueue.offer(new PriorityQueueTest("김영희", 100));
        priorityQueue.offer(new PriorityQueueTest("한택희", 66));
        priorityQueue.offer(new PriorityQueueTest("이나영", 7));
        priorityQueue.offer(new PriorityQueueTest("이혁", 43));
        priorityQueue.offer(new PriorityQueueTest("안영희", 100));

        return priorityQueue;
    }
    
    public PriorityQueueTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(PriorityQueueTest target) {
        return this.age <= target.age ? 1 : - 1;
    }

    public String getName() {
    	return this.name;
    }
    
    @Override
    public String toString() {
        return "이름 : " + name + ", 나이 : " + age;
    }
    
    public static void main(String[] args) {
        PriorityQueue<PriorityQueueTest> priorityQueue = getPriorityQueueOfStudents();

        // 나이가 많은 순으로 학생들 목록을 출력
        while (!priorityQueue.isEmpty()) {
        	System.out.println(priorityQueue.poll());     
		//system.out.println(priorityQueue.poll().getName());
        }
    }
}
`````
#### 결과값
`````
이름 : 김영희, 나이 : 100
이름 : 안영희, 나이 : 100
이름 : 한택희, 나이 : 66
이름 : 이혁, 나이 : 43
이름 : 김철수, 나이 : 20
이름 : 이나영, 나이 : 7
`````

PriorityQueueTest Class에 Comparable interface의 compareTo함수를 구현하여 PriorityQueueTest Class 의 우선순위를 정의한다. 결과를 보면 기본 Queue 형식과 달리 입력 순서와 상관없이 제일먼저 입력된 값이 반환되는게 아니라 우선순위가 높은 값부터 반환되는것을 볼 수 있다.

### - Set 컬렉션 클래스

- 요소의 저장 순서를 유지하지 않습니다.
- 같은 요소의 중복 저장을 허용하지 않습니다.
- null 저장을 허용한다.

### HashSet
[HashSetTest.java Source](https://github.com/jkkim09/JAVA-TEST/blob/master/src/main/java/java_test/dataStructure/collection/HashSetTest.java)
##### hash: 임의의 크기를 간진 데이터를 고정된 데이터의 크기로 변환 이라고하는데 나는 값 과 메핑되여있는 고유한 값(주소:hash)이라고 외우고 있다.

|		메소드		|		설명		|
|------------------|-------------------|
|		add(Object o)      | 	인자를 저장하고, 객체를 저장할 때 객체가 Set에 저장되어있지 않았다면 True를 리턴합니다. 이미 저장되어있다면 False를 리턴합니다.				|
|	remove(Object o) |	인자로 전달된 객체를 Set에서 삭제합니다. Set에 객체가 존재하여 삭제가 되었다면 True를 리턴합니다. Set에 파일이 존재하지 않았다면 False를 리턴합니다.|
|	removeAll(Collection<?>) |	인자로 받은 Collection에 저장된 아이템들을 HashSet에서 삭제합니다. |
| removeIf() | Set의 아이템 중에 이 조건에 충족하는 객체는 삭제됩니다. |
| clear() | HashSet의 모든 아이템들을 삭제합니다. |
| contains() | Set 안에 객체가 존재하는지 여부를 리턴해줍니다. |
| iterator() |  Iterator 객체를 리턴해 줍니다. 이 객체로 Set의 모든 아이템을 순회할 수 있습니다. |
| isEmpty() | Set에 저장된 아이템이 없으면 True를 리턴해 줍니다. |
| size() | HashSet에 저장된 아이템 개수를 리턴합니다. |

※ Iterator는 자바의 컬렉션 프레임웍에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화 하였는데 그 중 하나가 Iterator이다

#### 실행결과
````
----------------------add()--------------------------
true
false
[A, B, C, D, E, F, G]
-------------------------remove()-----------------------
true
false
---------------------removeAll()--------------------------
[]
true
[A, D]
---------------------removeIf()---------------------------
[D]
----------------------clear()--------------------------
[]
------------------------contains()------------------------
false
true
-----------------------iterator()-------------------------
A
B
C
D
E
A
B
C
D
E
-----------------------isEmpty()-------------------------
false
true
````