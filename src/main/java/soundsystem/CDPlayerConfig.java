package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*@Configuration*/
/*@Import(CDConfig.class)*/
/* @ComponentScan */
public class CDPlayerConfig {
	/*
	 * @Bean public CompactDisc sgtPeppers() { return new SgtPeppers(); }
	 */

	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
}
