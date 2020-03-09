package java_test.dataStructure.collection;

import java.util.PriorityQueue;

//	Comparable - �� �������̽��� ������ ��ü �����ο��� �ο��ϴ� �� ���� �⺻ ���� ��Ģ�� �����ϴ� �������� ����Ѵ�.
//	Comparator - �� �������̽��� ������ Ŭ������ ���� ��Ģ �� ��ü�� �ǹ��ϸ�, �⺻ ���� ��Ģ�� �ٸ��� ���ϴ´�� ���ļ����� �����ϰ� ���� �� ����Ѵ�.

public class PriorityQueueTest implements Comparable<PriorityQueueTest>{
	String name;
    int age;

    static PriorityQueue<PriorityQueueTest> getPriorityQueueOfStudents() {
        PriorityQueue<PriorityQueueTest> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(new PriorityQueueTest("��ö��", 20));
        priorityQueue.offer(new PriorityQueueTest("�迵��", 100));
        priorityQueue.offer(new PriorityQueueTest("������", 66));
        priorityQueue.offer(new PriorityQueueTest("�̳���", 7));
        priorityQueue.offer(new PriorityQueueTest("����", 43));
        priorityQueue.offer(new PriorityQueueTest("�ȿ���", 100));

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
        return "�̸� : " + name + ", ���� : " + age;
    }
    
    public static void main(String[] args) {
        PriorityQueue<PriorityQueueTest> priorityQueue = getPriorityQueueOfStudents();

        // ���̰� ���� ������ �л��� ����� ���
        while (!priorityQueue.isEmpty()) {
        	System.out.println(priorityQueue.poll());     
//        	System.out.println(priorityQueue.poll().getName());        	
        }
    }
}
