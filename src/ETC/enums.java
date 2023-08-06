package ETC;

public class enums {
	public static void main(String[] args) {
		
		test();
	}
	
	public static void test() {
		int[] arrint = {1,2,3,4,5};
		int[] result = {0,0};
		
		
		for(int num : arrint) {
			if(num%2==0) {
				result[1] +=1; 
			} else {
				result[0] +=1;
				
			}
			
		}
		System.out.println(result[1]);
		System.out.println(result[0]);
		
		
		
	}
}
