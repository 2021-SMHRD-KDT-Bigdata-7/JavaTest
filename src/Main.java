import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title;
		String singer;
		int playTime;
		MusicController mp = new MusicController();
			
		System.out.println("====�����÷��̾�====");
		int a = 0;
		while (!(a == 6)) {
			System.out.print("1. ��� 2. ��� 3.���� 4. ������ 5.������ 6. ���� >> ");
			a = sc.nextInt();
		

			switch (a) {
			case 1:
				System.out.print("����: ");
				title = sc.next();
				System.out.print("����: ");
				singer = sc.next();
				System.out.print("�ð�: ");
				playTime = sc.nextInt();
				MusicVO mk = new MusicVO(title,singer,playTime);
				
				mp.register(mk);
				
				break;
			case 2:
				mp.list();
				
				break;
			case 3:
				mp.play();
				
				break;
			case 4:
				mp.pre();
				break;
			case 5:
				mp.next();
				break;
			case 6:
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���");
				a=0;
				break;
			}

		}


	}
}
