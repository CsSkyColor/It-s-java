package chapter04;

import java.util.Scanner;

public class Exercise0407 {
	public void startEx(){
		 boolean run = true;

	        int balance = 0;
	        String input;

	        Scanner scanner = new Scanner(System.in);

	        while(run){
	            System.out.println("--------------------------------------");
	            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
	            System.out.println("--------------------------------------");
	            System.out.print("선택하세요 >>");
	            input = scanner.nextLine();

	            if(input.equals("4")){
	                System.out.println("프로그램을 종료합니다.");
	                run = false;
	            }

	            switch(input){
	                case "1":
	                    System.out.print("예금액 >");
	                    Scanner inScan = new Scanner(System.in);
	                    int inputNum = inScan.nextInt();
	                    balance += inputNum;
	                    break;

	                case "2":
	                    System.out.print("출금액 >");
	                    Scanner outScan = new Scanner(System.in) ;
	                    int outputNum = outScan.nextInt();

	                    if((balance-outputNum) < 0){
	                        System.out.println("통장인 잔고보다 많이 출금하려하십니다.");
	                    }else {
	                        balance -= outputNum;
	                    }

	                    break;

	                case "3":
	                    System.out.println("잔고 >" + balance);
	                    break;

	                default:
	                    System.out.println("1~4 사이의 숫자만 입력하세요");
	            }


	        }
	}
}
