package dbConst;

public enum IntegerBirthD {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12),
    NINETEEN(19),
    TWENTY(20),
    TWENTY_ONE(21),
    TWENTY_TWO(22);

    private int val;

    IntegerBirthD(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
