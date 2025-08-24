package Challenges.Interface;
interface Playabl {
    void play();
}

interface Recordabl {
    void record();
}

class MusicPlay implements Playabl {
    private String song;

    public MusicPlay(String song) {
        this.song = song;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + song);
    }
}

class Recorde implements Recordabl {
    private String audio;

    public Recorde(String audio) {
        this.audio = audio;
    }

    @Override
    public void record() {
        System.out.println("Recording audio: " + audio);
    }
}

public class PlayRecordObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicPlay player = new MusicPlay("Imagine Dragons - Believer");
        Recorde recorder = new Recorde("Lecture Audio");

        player.play();
        recorder.record();
	}

}
