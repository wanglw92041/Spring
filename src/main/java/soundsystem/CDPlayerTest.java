package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
/*@ContextConfiguration(classes=SoundSystemConfig.class)*/
/*@ContextConfiguration(classes = CDPlayerConfig.class)*/
@ContextConfiguration(locations = { "classpath:beans.xml" }) 
public class CDPlayerTest {
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	private MediaPlayer player;
	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" + " by the Beatles\n", log.getLog());
	}
}
