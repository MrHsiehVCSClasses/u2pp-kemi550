package projectName;
//Methods are pretty self explanatory
public class ski extends winterSportInfo {
    
    private boolean skiPoles;
    private double skiLength;
    private int bootSize;

    public ski() {
        super();
        skiPoles = false;
        skiLength = 0.0;
        bootSize = 0; 
    }
    public ski(String skillLvl, double height, boolean newSkiPoles, double newSkiLength, int newBootSize) {
        super(skillLvl, height);
        skiPoles = newSkiPoles;
        skiLength = newSkiLength;
        bootSize = newBootSize;
    }
    public boolean getSkiPoles() {
        return skiPoles;
    }
    public double getSkiLength() {
        return skiLength;
    }
    public int getBootSize() {
        return bootSize;
    }
    public void setnewSkiPoles(boolean newSkiPoles) {
        skiPoles = newSkiPoles;
    }
    public void setnewSkiLength(double newSkiLength) {
        skiLength = newSkiLength;
    }
    public void setnewBootSize(int newBootSize) {
        bootSize = newBootSize;
    }
    public String toString() { 
        String info = "Type of Winter Sport: Skiing\n";
        info += super.toString();
        info += "\nUsing Ski Poles?: " + skiPoles + "\nSki Length: " + skiLength + "\nBoot Size: " + bootSize;
        return info;
    }
}
