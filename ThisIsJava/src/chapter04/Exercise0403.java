package chapter04;

public class Exercise0403 {
	public void startEx(){
		int sum = 0;

        for(int i = 0; i < 100; i++){
            if(i%3 == 0){
                sum += i;
            }
        }

        System.out.println("3����� �� : " + sum);
	}
}
