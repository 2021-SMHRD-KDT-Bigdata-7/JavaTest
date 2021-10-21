import java.util.ArrayList;
import java.util.Scanner;

public class MusicController {
	Scanner sc = new Scanner(System.in);

	ArrayList<MusicVO> musiclist = new ArrayList<>();

	int index = 0;

	public MusicController() {
		
	}

	// ���
	public void register(MusicVO mv) {
		musiclist.add(mv);

	}

	// ���
	public void list() {
		System.out.println("====�뷡���====");
		for (int i = 0; i < musiclist.size(); i++) {
			print(i);
		}
		System.out.println("=============\n");
	}

	public void play() {
		System.out.println("====����====");
		print(index);
		System.out.println("=============\n");
	}

	public void next() {
		System.out.println("====������====");
		index++;
		if (index > musiclist.size()-1) {			
			index--;
		} 
		print(index);
		
		System.out.println("=============\n");

	}

	public void pre() {
		System.out.println("====������====");
		index--;
		if (index < 0) {
			index++;
		} 
		print(index);
		System.out.println("=============\n");

	}

	public void print(int i) {
		System.out.println((i + 1) + ". ���� : " + musiclist.get(i).getTitle() + "\t" + "���� : "
				+ musiclist.get(i).getSinger() + "\t" + "�ð� : " + musiclist.get(i).getPlayTime() + "��");
	
	}
}
