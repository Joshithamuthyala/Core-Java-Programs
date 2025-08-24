package Challenges.Interface;
interface Playable {
    void play();
}

interface Recordable {
    void record();
}

class MusicPlayer implements Playable {
    private String song;

    public MusicPlayer(String song) {
        this.song = song;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + song);
    }
}

class Recorder implements Recordable {
    private String audio;

    public Recorder(String audio) {
        this.audio = audio;
    }

    @Override
    public void record() {
        System.out.println("Recording audio: " + audio);
    }
}

public class Playrecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
