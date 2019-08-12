package bdConversion;

import javax.swing.*;

import static dbConst.IntegerBirthD.*;
import static dbConst.IntegerBirthD.NINETEEN;
import static dbConst.MessageBirthDate.*;

public class LogicBirthDate extends BirthDate {


    public void sign(){

        january();
        february();
        march();
        april();
        june();
        july();
        agust();
        september();
        october();
        december();
    }

        public void january() {

            if (this.getMonth() == ONE.getVal()) {
                if (this.getDay() >= TWENTY_ONE.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_AQUARIUS.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_CAPRICORN.getMessage());
                }
            }
        }

        public void february(){

            if (this.getMonth() == TWO.getVal()) {
                if (this.getDay() >= NINETEEN.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_PISCES.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_AQUARIUS.getMessage());
                }
            }
        }

        public void march(){

            if (this.getMonth() == THREE.getVal()) {
                if (this.getDay() >= TWENTY.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_ARIES.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_PISCES.getMessage());
                }
            }

        }

        public void april(){

            if (this.getMonth() == FOUR.getVal()) {
                if (this.getDay() >= TWENTY.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_TAURUS.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_ARIES.getMessage());
                }
            }
        }

        public void may(){

            if (this.getMonth() == FIVE.getVal()) {
                if (this.getDay() >= TWENTY_ONE.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_GEMINI.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null,MESSAGE_TAURUS.getMessage());
                }
            }


        }

        public void june(){

            if (this.getMonth() == SIX.getVal()) {
                if (this.getDay() >= TWENTY.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_CANCER.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_GEMINI.getMessage());
                }
            }

        }

        public void july(){

            if (this.getMonth() == SEVEN.getVal()) {
                if (this.getDay() >= TWENTY_TWO.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_LEO.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_CANCER.getMessage());
                }
            }
        }

        public void agust(){

            if (this.getMonth() == EIGHT.getVal()) {
                if (this.getDay() >= TWENTY_ONE.getVal()) {

                    JOptionPane.showMessageDialog(null,MESSAGE_VIRGO.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_LEO.getMessage());
                }
            }
        }

        public void september(){


            if (this.getMonth() == NINE.getVal()) {
                if (this.getDay() >= TWENTY_TWO.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_LIBRA.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_VIRGO.getMessage());
                }
            }
        }

        public void october(){

            if (this.getMonth() == TEN.getVal()) {
                if (this.getDay() >= TWENTY_TWO.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_SCORPION.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_LIBRA.getMessage());
                }
            }
        }

        public void november(){

            if (this.getMonth() == ELEVEN.getVal()) {
                if (this.getDay() >= TWENTY_ONE.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_SAGITTARIUS.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_SCORPION.getMessage());
                }
            }
        }

        public void december(){

            if (this.getMonth() == TWELVE.getVal()) {
                if (this.getDay() >= TWENTY_ONE.getVal()) {

                    JOptionPane.showMessageDialog(null, MESSAGE_CAPRICORN.getMessage());
                } else {

                    JOptionPane.showMessageDialog(null, MESSAGE_SAGITTARIUS.getMessage());
                }
            }
        }

}
