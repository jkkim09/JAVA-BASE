# 자료구조

#### 표 1.1
| 자료형 | 크기(바이트) | 최소값               | 최대값                |
|--------|--------------|----------------------|-----------------------|
| byte   | 1바이트      | -128                 | 127                   |
| short  | 2바이트      | -32768               | 32767                 |
| int    | 4바이트      | -2147483648          | 2147483647(20억 정도) |
| long   | 8바이트      | -9223372036854775808 | 9223372036854775807   |

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