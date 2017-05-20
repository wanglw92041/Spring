package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker;
	private String s;

	public TextEditor(SpellChecker spellChecker, String s) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
		this.s = s;
	}

	public TextEditor() {
		System.out.println("Inside TextEditor no-arg constructor.");
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
		System.out.println(s);
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	public void setS(String s) {
		this.s = s;
	}

}
