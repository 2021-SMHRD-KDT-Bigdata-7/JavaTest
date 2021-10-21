import java.util.ArrayList;
import java.util.Scanner;

import ex01.Music;
import ¿¬½À.MusicVO;

public class MusicController {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<MusicVO> musiclist = new ArrayList<>();
	
	int index = 0;
	
	
	
	public MusicController() {
		musiclist.add(new MusicVO("À¯¸®±¸½½", "¿©ÀÚÄ£±¸", 320));
		musiclist.add(new MusicVO("¹ð¹ð¹ð", "ºò¹ð", 201));
		musiclist.add(new MusicVO("ÁÖÀÎ°ø", "¼±¹Ì", 220));
	}
	
	public void List() {
		for(int i=0 ; musiclist.size(); i++)
		System.out.println("");
	}
	
	public MusicVO play() {
		return musiclist.get(index);
	}
	

	public MusicVO pre(){
		if(index > 0) {
			index--;
		}else {
			index = 0;
		}
		return musiclist.get(index);
		}
	
	public MusicVO next() {
		
		if(index < musiclist.size()-1) {
			index++;
		}else {
			index = musiclist.size();
		}
		return musiclist.get(index);
	}
}
