package chapter04;

public class Exercise0404 {
	public void startEx(){
		int num1;
        int num2;

        num1 = (int)(Math.random()*6) +1;
        num2 = (int)(Math.random()*6) +1;


        while((num1 + num2) != 5){

            num1 = (int)(Math.random()*6) +1;
            num2 = (int)(Math.random()*6) +1;
            System.out.println("(" + num1 + ", " + num2 + ")");
        }
	}
}
