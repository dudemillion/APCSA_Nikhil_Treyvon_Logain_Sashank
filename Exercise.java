public class Exercise {

    private String name ;
    private double time ;
    private String type ;
    private int xpgain ;
    private boolean equipment;
    
    public Exercise(String newName, String newType, double newTime, int newxpgain, boolean newEquipment){
        this.name = newName;
        this.type = newType;
        this.time = newTime;
        this.xpgain = newxpgain;
        this.equipment = newEquipment;
    } 
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public double getTime(){
        return this.time;
    }
    public boolean getEquipment(){
        return this.equipment;
    }
    public int getXpgain(){
        return this.xpgain;
    }
}
