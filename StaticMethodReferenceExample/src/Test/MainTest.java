package Test;

import org.NoteClass;
import org.Noteable;

public class MainTest {

	public static void main(String[] args) {
		Noteable note = NoteClass::noteSomthing;
		note.note("lecture");

	}

}
