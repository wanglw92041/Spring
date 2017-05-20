package com.basejavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
public class TextEditorConfig {
	@Bean
	public TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}
	
	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
}
