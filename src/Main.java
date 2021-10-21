import java.util.ArrayList;
import java.util.Scanner;

import LIbrary.BookVo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====뮤직플레이어====");
		MusicController mk = new MusicController();
		
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
			    mk.ist(mk);    
				if (mk != null) {
					System.out.println("등록에 성공하셨습니다");
				} else {
					System.out.println("정보를 똑바로 확인하십시오");
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
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("프로그램 종료");
				break;
			}

		}


	}
}
