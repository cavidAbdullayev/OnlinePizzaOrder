package enums;

public enum ErrorEnum {
    INVALID_INPUT("Invalid input!"),
    NOT_ENOUGH_AMOUNT("Not enough amount!"),
    USER_EXISTS("User is exits!"),
    USER_NOT_EXISTS("User doesn't exits!"),
    NOT_FREE_COURIER("There are not any free courier");
    private final String message;

    ErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}