import java.util.ArrayList;
import java.util.Scanner;

import LIbrary.BookVo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title;
		String singer;
		int playTime;
		MusicController mp = new MusicController();
		System.out.println("====�����÷��̾�====");
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
				MusicVO mk = new MusicVO(title,singer,playTime);    
				if (mk != null) {
					System.out.println("��Ͽ� �����ϼ̽��ϴ�");
				} else {
					System.out.println("������ �ȹٷ� Ȯ���Ͻʽÿ�");
				}
				break;
			case 2:
				MusicController List = mp.List();
				break;
			case 3:
				MusicController nowMusic = mp.play();
				System.out.println(musiclist.get());
				break;
			case 4:
				MusicController preMusic = mp.pre();
				System.out.println(play);
				break;
			case 5:
				MusicController nextMusic = mp.next();
				System.out.println(play);
				break;
			case 6:
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���");
				break;
			}

		}


	}
}
