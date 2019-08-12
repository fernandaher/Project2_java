package bmiConversion;

import static bmiConst.IntegreBmi.CERO;

public class BodyMassIndex {


    private double weight;
    private double height;

    public BodyMassIndex() {this.weight = CERO.getVal(); }

    public double getWeight() {return weight; }

    public void setWeight(double weight) {this.weight = weight; }

    public double getHeight() {return height; }

    public void setHeigth(double height) {this.height = height; }
}
