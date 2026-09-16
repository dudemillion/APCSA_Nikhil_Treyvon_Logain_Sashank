public class Exercise {
    
    private double time ;
    private String type ;
    private int xpgain ;
    private String equipment;
    
    public Exercise(String newType, double newTime, int newxpgain,String newEquipment){
        this.type = newType;
        this.time = newTime;
        this.xpgain = newxpgain;
        this.equipment = newEquipment;
    } 
    public double getTime(){
        return this.time;
    }
    public String getType(){
        return this.type;
    }
    public String getEquipment(){
        return this.equipment;
    }
    public int getXpgain(){
        return this.xpgain;
    }
}
