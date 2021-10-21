import java.util.ArrayList;
import java.util.Scanner;

import ex01.Music;

public class MusicController {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<MusicVO> musiclist = new ArrayList<>();
	
	int index = 0;
	
	public MusicController() {
		musiclist.add(new MusicVO(??))
	}
	
	public void List() {
		for(int i=0 ; array.length<??)
		System.out.println("");
	}
	
	public MusicVO play() {
		return musiclist.get(index);
	}
	

	public MusicVO pre(){
		if(index > 0) {
			index--;
		}else {
			index = musiclist.size()-1;
		}
		return musiclist.get(index);
		}
	
	public MusicVO next() {
		//0 1 2 3 -> 0 1 2 3 -> 0
		if(index < musiclist.size()-1) {	//0, 1, 2번일때는 다음곡으로   3이 들어가면 4로 X
			index++;
		}else {
			index = 0;
		}
		return musiclist.get(index);
	}
}
