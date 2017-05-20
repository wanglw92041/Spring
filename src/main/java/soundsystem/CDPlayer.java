package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/*@Component*/
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	public CDPlayer() {
		super();
	}

	/* @Autowired */
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	/*@Autowired*/
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}

}
