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
	            System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
	            System.out.println("--------------------------------------");
	            System.out.print("�����ϼ��� >>");
	            input = scanner.nextLine();

	            if(input.equals("4")){
	                System.out.println("���α׷��� �����մϴ�.");
	                run = false;
	            }

	            switch(input){
	                case "1":
	                    System.out.print("���ݾ� >");
	                    Scanner inScan = new Scanner(System.in);
	                    int inputNum = inScan.nextInt();
	                    balance += inputNum;
	                    break;

	                case "2":
	                    System.out.print("��ݾ� >");
	                    Scanner outScan = new Scanner(System.in) ;
	                    int outputNum = outScan.nextInt();

	                    if((balance-outputNum) < 0){
	                        System.out.println("������ �ܰ��� ���� ����Ϸ��Ͻʴϴ�.");
	                    }else {
	                        balance -= outputNum;
	                    }

	                    break;

	                case "3":
	                    System.out.println("�ܰ� >" + balance);
	                    break;

	                default:
	                    System.out.println("1~4 ������ ���ڸ� �Է��ϼ���");
	            }


	        }
	}
}
