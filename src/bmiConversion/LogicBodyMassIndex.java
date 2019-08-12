package bmiConversion;

public class LogicBodyMassIndex extends BodyMassIndex {

    public double calculateBodyMassIndex(){
        return ((this.getHeight()* this.getHeight()) / this.getWeight());
    }
}
