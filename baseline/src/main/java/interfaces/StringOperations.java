package interfaces;

public interface StringOperations {

    String getStringA();

    String getStringB();

    default String concatAndCapitalize() {
        return (getStringA() + getStringB()).toUpperCase();
    }

    default String concatAndLowerCase() {
        return (getStringA() + getStringB()).toLowerCase();
    }

}
