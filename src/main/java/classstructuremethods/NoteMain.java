package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Felhasznalo Ferenc");
        note.setTopic("JAVA");
        note.setText("Teszteld az osztályod a NoteMain osztály main() metódusából! A Note tartalmának megjelenítésekor használd a getNoteText() metódust!");
        System.out.println(note.getNoteText());
    }
}


