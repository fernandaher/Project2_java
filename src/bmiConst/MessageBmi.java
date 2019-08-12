package bmiConst;

public enum MessageBmi {

    MESSAGE_WRITE_HEIGHT("Write your height in M"),
    MESSAGE_WRITE_WEIGHT("Write your weight in KG"),
    MESSAGE_YOUR_BMI("Your Body Mass Index is: ");

    private String messages;

    MessageBmi(String m) {
        this.messages = m;
    }

    public String getMessages() {
        return messages;
    }
}
