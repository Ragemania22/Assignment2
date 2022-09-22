

public class MainClass {

	public static void main(String[] args) {
		/* Question 1
		int [] array0 = {1,5,-5,2,12,30};
		int [] array1 = {-10,50,15,2};
		
		for(int i = 0; i < array0.length; i++) {
			for(int j = 0; j < array1.length; j++) {
				if(array0[i] == (array1[j])) {
					System.out.println("Common element is: " +(array0[i]));
				}
			}
		}*/
		
		/*Question 3
		char[] array4 = {'s','a','b','a'};
		for(int i=array4.length-1; i>=0; i--) {
			System.out.println(array4[i]);
		}*/
		
		//Question 2
		int[] array2 = {1,77,-5,6,65,30};
		//int[] array3 = {-10,50,15,2,77};
		int num1 = 77;
		int num2 = 65;
	}
	
	public static boolean result(int[] array2, int num1, int num2) {
		for (int number : array2) {
			boolean r = number == num1 && number == num2;
			if(r) {
				return true;
			}
		}
		return false;
		
	}

}
