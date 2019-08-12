package salaryConversion;

import javax.swing.*;
import static salaryConst.MessageSalary.*;

public class LogicSalary extends Salary{


    public LogicSalary(){
        super.getSalary();
    }
    public boolean TotalPay()  {

        double acum = 0;
        double cont = 0;
        double payM=0;
        double payAver =0;
        double resp;

        while(true){
            resp= Integer.parseInt(JOptionPane.showInputDialog(null,
                    MESSAGE_CONTINUE.getMessage(),"Alert",JOptionPane.YES_NO_OPTION));

            if(resp==1){

                cont = cont + 1;

                String salary = JOptionPane.showInputDialog(null, MESSAGE_SALARY.getMessage()+ cont);
                setSalary(Integer.parseInt(salary));

                acum = acum + this.getSalary();

                acum += getSalary();

                if (cont == 1) {
                    payM = getSalary();
                } else {
                    if (getSalary()> payM)
                        payM = getSalary();

                }

                payAver = acum / cont;

            }
            if(resp>1) {


                JOptionPane.showMessageDialog(null, MESSAGE_ADD_SALARY.getMessage()+
                        acum + "\n"+ MESSAGE_AVERAGE.getMessage() + payAver+ "\n" + MESSAGE_M + payM);
                JOptionPane.showMessageDialog(null, MESSAGE_SALARY_ERROR.getMessage());
                System.exit(0);


                }

            }
        }
    }

