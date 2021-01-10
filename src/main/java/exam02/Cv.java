package exam02;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSkills(String... skill) {
        for (int i = 0; i < skill.length; i++ ) {
            this.skills.add(new Skill(skill[i].substring(0, skill[i].indexOf("(")-1), parseInt(skill[i].substring(skill[i].indexOf("(")+1, skill[i].length()-1))));
        }
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int findSkillLevelByName(String kskill) {
        int result=0;

        for (Skill s: this.skills) {
            if (s.getName().equals(kskill)) {
                result = s.getLevel();
            }
        }

        if (result==0) {
            throw new IllegalArgumentException(kskill);
        }

        return result;
    }
}
