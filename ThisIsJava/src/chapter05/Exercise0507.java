package chapter05;

public class Exercise0507 {
	public void startEx(){
		 int [] array = {1,5,4,3,8,2};
	        int max = array[0];

	        for(int i = 0; i < array.length; i++){
	            if(max < array[i]){
	                max = array[i];
	            }
	        }

	        System.out.println("MAX = " + max);
	}
}
