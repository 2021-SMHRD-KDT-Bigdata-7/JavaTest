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
				if (mk != null) {
					System.out.println("등록에 성공하셨습니다");
				} else {
					System.out.println("정보를 똑바로 확인하십시오");
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
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("정확한 숫자를 입력해주세요");
				break;
			}

		}


	}
}
