package ch08;

import java.util.Scanner;

class Exercise8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = (int) (Math.random()*100)+1;
		int input = 0;
		int count = 0;
		do {
			++count;
			System.out.print("1�� 100 ������ ���� �Է��ϼ��� :");
			try {
				input = new Scanner(System.in).nextInt();			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���.");
				continue;
			}
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			} else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
				break;
			}
		} while (true);
	}

}