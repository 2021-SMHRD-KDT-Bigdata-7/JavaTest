import java.util.ArrayList;
import java.util.Scanner;

import LIbrary.BookVo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====�����÷��̾�====");
		MusicController mk = new MusicController();
		
		int a = 0;
		while (a < 6) {
			System.out.println("1. ��� 2. ��� 3.���� 4. ������ 5.������ 6. ����");
			a = sc.nextInt();

			switch (a) {
			case 1:
				System.out.print("����: ");
				title = sc.next();
				System.out.print("����: ");
				singer = sc.next();
				System.out.print("�ð�: ");
				playTime = sc.nextInt();
			    mk.ist(mk);    
				if (mk != null) {
					System.out.println("��Ͽ� �����ϼ̽��ϴ�");
				} else {
					System.out.println("������ �ȹٷ� Ȯ���Ͻʽÿ�");
				}
				break;
			case 2:
				mk.List();
				
				break;
			case 3:
				mk.play();
				break;
			case 4:
				mk.pre();
				
				break;
			case 5:
				mk.next();
				
				break;
			case 6:
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("���α׷� ����");
				break;
			}

		}


	}
}
