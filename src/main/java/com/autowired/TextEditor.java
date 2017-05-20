package com.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;

	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
