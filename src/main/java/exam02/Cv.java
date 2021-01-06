package exam02;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSkills(Skill... skill) {
        for (int i = 0; i < skill.length; i++ ) {
            this.skills.add(skill[i]);
        }
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
