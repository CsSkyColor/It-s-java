package chapter05;

public class Exercise0508 {
	public void startEx(){
		 int [][] array = {
	                {1,2},
	                {1,2,3},
	                {1,2,3,4,5}
	        };

	        int sum = 0;
	        double avg = 0.0;

	        System.out.print("ARRAY LENGTH" + array.length);


	        for(int i = 0; i < array.length; i++){
	            for(int j = 0; j <array[i].length; j++){
	                sum += array[i][j];
	            }
	        }

	        avg = sum/(array[0].length  +array[1].length+array[2].length);

	        System.out.println("SUM = " + sum);
	        System.out.println("AVG = " + avg);
	}
}
