package test;

import org.NoteClass;
import org.Noteable;

public class MainTest {

	public static void main(String[] args) {
		Noteable n = NoteClass::new;
		n.note(" lecture");

	}

}
