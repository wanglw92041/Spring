package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
/* @Import({CDConfig.class,CDPlayerConfig.class}) */
@Import(CDPlayerConfig.class)
@ImportResource("classpath:beans.xml")
public class SoundSystemConfig {

}
