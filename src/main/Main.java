package main;


import bdConversion.LogicBirthDate;
import bmiConversion.LogicBodyMassIndex;
import salaryConversion.LogicSalary;

import javax.swing.*;

import java.util.InputMismatchException;
import java.lang.String;

import static bmiConst.MessageBmi.MESSAGE_WRITE_HEIGHT;
import static bmiConst.MessageBmi.MESSAGE_WRITE_WEIGHT;
import static dbConst.MessageBirthDate.*;

public class Main {

    public static void main(String[] args) {


        boolean salir = false;
        int opt;

        while (!salir){

            LogicBodyMassIndex logicBodyMassIndex = new LogicBodyMassIndex();
            LogicBirthDate logicBirthDate = new LogicBirthDate();
            LogicSalary logicSalary = new LogicSalary();

            JOptionPane.showMessageDialog(null, "1. Option BMI"
                    +"\n"+ "2. Option BirthDay"
                    +"\n"+ "3. Option Salary"
                    +"\n"+ "4. Option Numbers"
                    +"\n"+ "5. Option Leave",
                    "If you want to left click Accept and write option 5.", JOptionPane.QUESTION_MESSAGE);

            try{
                String val = JOptionPane.showInputDialog(null, "Write the option");
                opt = Integer.parseInt(val);

                switch (opt) {

                    case 1:

                        String BodyMassIndexHei = JOptionPane.showInputDialog(null, MESSAGE_WRITE_HEIGHT.getMessages());
                        String BodyMassIndexWei = JOptionPane.showInputDialog(null, MESSAGE_WRITE_WEIGHT.getMessages());

                        logicBodyMassIndex.setHeigth(Double.parseDouble(BodyMassIndexWei));
                        logicBodyMassIndex.setWeight(Double.parseDouble(BodyMassIndexHei));
                        JOptionPane.showMessageDialog(null, "Your Body Mass Index is: " + logicBodyMassIndex.calculateBodyMassIndex());
                        break;

                    case 2:

                        JOptionPane.showMessageDialog(null, MESSAGE_ZODIAC.getMessage(),"INFORMATION", JOptionPane.QUESTION_MESSAGE);
                        String BirthDay = JOptionPane.showInputDialog(null, MESSAGE_BIRTH_DAY.getMessage());
                        String BirthMonth = JOptionPane.showInputDialog(null, MESSAGE_BIRTH_MONTH.getMessage());

                        logicBirthDate.setDay(Integer.parseInt(BirthDay));
                        logicBirthDate.setMonth(Integer.parseInt(BirthMonth));
                        logicBirthDate.sign();
                        break;

                    case 3:
                        
                        logicSalary.TotalPay();
                        break;

                    case 4:

                        JOptionPane.showInputDialog(null, "Wrote the option 4");
                        break;
                    case 5:

                        salir=true;
                        break;

                    default:
                        JOptionPane.showInputDialog("You just can to write numbers until 5"); }

                }
            catch (InputMismatchException e){
                JOptionPane.showInputDialog(null, "You should write a option");

            }
        }
    }
}
