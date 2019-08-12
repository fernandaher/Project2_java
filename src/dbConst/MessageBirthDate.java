package dbConst;

public enum MessageBirthDate {

    MESSAGE_ZODIAC("Stay here for to know your Zodiac sign. "),
    MESSAGE_BIRTH_DAY("Write your birth day "),
    MESSAGE_BIRTH_MONTH("Write your birth month "),
    MESSAGE_ARIES("Your Zodiac Sign is Aries"),
    MESSAGE_TAURUS("Your Zodiac Sign is Taurus"),
    MESSAGE_GEMINI("Your Zodiac Sign is Gemini"),
    MESSAGE_CANCER("Your Zodiac Sign is Cancer"),
    MESSAGE_LEO("Your Zodiac Sign is Leo"),
    MESSAGE_VIRGO("Your Zodiac Sign is Virgo"),
    MESSAGE_LIBRA("Your Zodiac Sign is Libra"),
    MESSAGE_SCORPION("Your Zodiac Sign is Scorpion"),
    MESSAGE_SAGITTARIUS("Your Zodiac Sign is Sagittarius"),
    MESSAGE_CAPRICORN("Your Zodiac Sign is Capricorn"),
    MESSAGE_AQUARIUS("Your Zodiac Sign is Aquarius"),
    MESSAGE_PISCES("Your Zodiac Sign is Pisces");



    private String message;

    MessageBirthDate(String m) {
        this.message = m;
    }

    public String getMessage() {
        return message;
    }
}
