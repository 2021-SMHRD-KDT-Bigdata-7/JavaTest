import java.util.ArrayList;
import java.util.Scanner;

import LIbrary.BookVo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title;
		String singer;
		int playTime;
		System.out.println("====뮤직플레이어====");
		int a = 0;
		while (a < 6) {
			System.out.println("1. 등록 2. 목록 3.실행 4. 이전곡 5.다음곡 6. 종료");
			a = sc.nextInt();

			switch (a) {
			case 1:
				System.out.print("제목: ");
				title = sc.next();
				System.out.print("가수: ");
				singer = sc.next();
				System.out.print("시간: ");
				playTime = sc.nextInt();
				MusicVO mk = new MusicVO(title,singer,playTime);
			    mk.list(mk);    
				if (mk != null) {
					System.out.println("등록에 성공하셨습니다");
				} else {
					System.out.println("정보를 똑바로 확인하십시오");
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
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("프로그램 종료");
				break;
			}

		}


	}
}
