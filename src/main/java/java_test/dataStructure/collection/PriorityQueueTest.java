package java_test.dataStructure.collection;

import java.util.PriorityQueue;

//	Comparable - 이 인터페이스를 구현한 객체 스스로에게 부여하는 한 가지 기본 정렬 규칙을 설정하는 목적으로 사용한다.
//	Comparator - 이 인터페이스를 구현한 클래스는 정렬 규칙 그 자체를 의미하며, 기본 정렬 규칙과 다르게 원하는대로 정렬순서를 지정하고 싶을 때 사용한다.

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
//        	System.out.println(priorityQueue.poll().getName());        	
        }
    }
}
