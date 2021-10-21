import java.util.ArrayList;
import java.util.Scanner;

public class MusicController {
	Scanner sc = new Scanner(System.in);

	ArrayList<MusicVO> musiclist = new ArrayList<>();

	int index = 0;

	public MusicController() {
		
	}

	// 등록
	public void register(MusicVO mv) {
		musiclist.add(mv);

	}

	// 목록
	public void list() {
		System.out.println("====노래목록====");
		for (int i = 0; i < musiclist.size(); i++) {
			print(i);
		}
		System.out.println("=============\n");
	}

	public void play() {
		System.out.println("====실행====");
		print(index);
		System.out.println("=============\n");
	}

	public void next() {
		System.out.println("====다음곡====");
		index++;
		if (index > musiclist.size()-1) {			
			index--;
		} 
		print(index);
		
		System.out.println("=============\n");

	}

	public void pre() {
		System.out.println("====이전곡====");
		index--;
		if (index < 0) {
			index++;
		} 
		print(index);
		System.out.println("=============\n");

	}

	public void print(int i) {
		System.out.println((i + 1) + ". 제목 : " + musiclist.get(i).getTitle() + "\t" + "가수 : "
				+ musiclist.get(i).getSinger() + "\t" + "시간 : " + musiclist.get(i).getPlayTime() + "초");
	
	}
}
