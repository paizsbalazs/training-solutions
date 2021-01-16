package schoolrecords;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {

        if ( subject.getSubjectName().equals("") || tutor.getName().equals("") ) {
            throw new NullPointerException("Both subject and tutor must be provided!");
        }

        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public String toString() {

        String string = this.markType.getDescription() + "(" + this.getMarkType().getValue() + ")";
        return string;
    }

}
