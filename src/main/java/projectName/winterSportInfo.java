package projectName;

//Methods are pretty self explanatory
public class winterSportInfo {

    private String skillLvl;
    private double height;
    
    public winterSportInfo() {
        this.skillLvl = "";
        this.height = 0.0;
    }
    public winterSportInfo(String skillLvl, double height) {
        this.skillLvl = skillLvl;
        this.height = height;
    }
    public String getSkillLvl() {
        return skillLvl;
    }
    public double getHeight() {
        return height;
    }
    public void setnewSkillLvl(String newSkillLvl) {
        this.skillLvl = newSkillLvl;
    }
    public void setnewHeight(double newHeight) {
        this.height = newHeight;
    }
    public String toString() { 
        String info = "Skill Level: " + skillLvl + "\nHeight: " + height;
        return info;
    }
}
