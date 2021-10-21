import java.util.ArrayList;
import java.util.Scanner;

import LIbrary.BookVo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title;
		String singer;
		int playTime;
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
			    mk.list(mk);    
				if (mk != null) {
					System.out.println("��Ͽ� �����ϼ̽��ϴ�");
				} else {
					System.out.println("������ �ȹٷ� Ȯ���Ͻʽÿ�");
				}
				break;
			case 2:
				ArrayList<MusicController> list = mv.selectAll();
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).getTitle() + " / "+ list.get(i).getSinger()+" / "+list.get(i).getPlayTime());
				}
				break;
			case 3:
				MusicVO nowMusic = mp.play();
				System.out.println(nowMusic.getTitle()+"\t"+nowMusic.getSinger()+"\t"+nowMusic.getPlayTime());
				break;
			case 4:
				MusicVO preMusic = mp.pre();
				System.out.println(preMusic.getTitle()+"\t"+preMusic.getSinger()+"\t"+preMusic.getPlayTime());
				break;
			case 5:
				MusicVO nextMusic = mp.next();
				System.out.println(nextMusic.getTitle()+"\t"+nextMusic.getSinger()+"\t"+nextMusic.getPlayTime());
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
