package chapter05;

import java.util.Scanner;

public class Exercise0509 {
	public void startEx(){
		Scanner scanner = new Scanner(System.in);
        int putNum;
        int [] array = null;
        boolean isAlive = true;
        int sum = 0;
        double average = 0.0;
        int count =  0;



        while(isAlive) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("1.�л��� �Է� | 2. ���� �Է� | 3.����Ʈ ��� | 4. ���� ��� | 5. �ʱ�ȭ | 6. ����");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.print("�Է� > ");
            putNum = scanner.nextInt();

            if(putNum == 6){
                System.out.println("���α׷��� �����մϴ�");
                isAlive = false;
            }


            switch(putNum){
                case 1 :
                    System.out.print("�л��� > ");
                    putNum = scanner.nextInt();
                    array = new int[putNum];
                    break;
                case 2 :
                   for(int i = 0; i < array.length; i++){
                       System.out.print("�л�" + (i+1) + " > ");
                       array[i] = scanner.nextInt();
                   }
                    break;
                case 3:
                    for(int i = 0; i < array.length; i++){
                        System.out.println("�л�" + (i+1) + " > " + array[i]);
                    }
                    break;
                case 4:
                    for(int i = 0; i < array.length; i++){
                        sum += array[i];
                    }
                    average = sum/array.length;

                    System.out.println("SUM = " + sum + " | AVERAGE = " + average);
                    break;
                case 5 :
                    array = null;
                    break;
                default:
                    System.out.println("1~6 ������ ���ڸ� �Է��ϼ���");
            }

        }
	}
}
