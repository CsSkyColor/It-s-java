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
            System.out.println("1.학생수 입력 | 2. 점수 입력 | 3.리스트 출력 | 4. 점수 계산 | 5. 초기화 | 6. 종료");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.print("입력 > ");
            putNum = scanner.nextInt();

            if(putNum == 6){
                System.out.println("프로그램을 종료합니다");
                isAlive = false;
            }


            switch(putNum){
                case 1 :
                    System.out.print("학생수 > ");
                    putNum = scanner.nextInt();
                    array = new int[putNum];
                    break;
                case 2 :
                   for(int i = 0; i < array.length; i++){
                       System.out.print("학생" + (i+1) + " > ");
                       array[i] = scanner.nextInt();
                   }
                    break;
                case 3:
                    for(int i = 0; i < array.length; i++){
                        System.out.println("학생" + (i+1) + " > " + array[i]);
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
                    System.out.println("1~6 사이의 숫자만 입력하세요");
            }

        }
	}
}
