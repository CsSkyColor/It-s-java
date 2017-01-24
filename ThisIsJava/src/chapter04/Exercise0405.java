package chapter04;

public class Exercise0405 {
	public void startEx(){
		for(int x = 0; x <= 10 ; x++){
            for (int y = 0;  y <= 10 ; y++) {
                if(((4*x) + (5*y)) == 60){
                    System.out.println("x = " + x + ", " + "y = " + y);
                }
            }
		}
	}
}
