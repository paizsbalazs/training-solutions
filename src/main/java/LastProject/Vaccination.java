package LastProject;

public class Vaccination {

    private int citizen_id;
    private String v_d;
    private String v_c;
    private String note;
    private String v_t;

    public Vaccination(int citizen_id, String v_d, String v_c, String note, String v_t) {
        this.citizen_id = citizen_id;
        this.v_d = v_d;
        this.v_c = v_c;
        this.note = note;
        this.v_t = v_t;
    }

    public int getCitizen_id() {
        return citizen_id;
    }

    public String getV_d() {
        return v_d;
    }

    public String getV_c() {
        return v_c;
    }

    public String getNote() {
        return note;
    }

    public String getV_t() {
        return v_t;
    }
}
