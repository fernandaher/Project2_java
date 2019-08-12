package salaryConst;

public enum MessageSalary {

    MESSAGE_SALARY("The Salary is: "),
    MESSAGE_CONTINUE("Do you want to continue?"),
    MESSAGE_ADD_SALARY("The Salary add is: "),
    MESSAGE_AVERAGE("The Salary average is: "),
    MESSAGE_M("The Salary heights is: "),
    MESSAGE_SALARY_ERROR("Error");

    private String message;

    MessageSalary(String m) {
        this.message = m;
    }

    public String getMessage() {
        return message;
    }
}
