package java_test.dataStructure;

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
	}
}
