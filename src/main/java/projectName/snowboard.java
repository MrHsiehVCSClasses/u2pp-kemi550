package projectName;
//Methods are pretty self explanatory
public class snowboard extends winterSportInfo {

    private String binding;
    private double boardLength;
    private String bootType; 
    private int bootSize;

    public snowboard() {
        super();
        binding = "";
        boardLength = 0.0;
        bootType = "";
        bootSize = 0;
    }
    public snowboard(String skillLvl, double height, String newBinding, double newBoardLength, String newBootType, int newBootSize) {
        super(skillLvl, height);
        binding = newBinding;
        boardLength = newBoardLength;
        bootType = newBootType;
        bootSize = newBootSize;
    }
    public String getBinding() {
        return binding;
    }
    public double getBoardLength() {
        return boardLength;
    }
    public String getBootType() {
        return bootType;
    }
    public int getBootSize() {
        return bootSize;
    }
    public void setnewBinding(String newBinding) {
        binding = newBinding;
    }
    public void setnewBoardLength(double newBoardLength) {
        boardLength = newBoardLength;
    }
    public void setnewBootType(String newBootType) {
        bootType = newBootType;
    }
    public void setnewBootSize(int newBootSize) {
        bootSize = newBootSize;
    }
    public String toString() { 
        String info = "Type of Winter Sport: Snowboarding\n";
        info += super.toString();
        info += "\nBinding Stiffness: " + binding + "\nBoard Length: " + boardLength + "\nBoot Type: " + bootType + "\nBoot Size: " + bootSize;
        return info;
    }
}
