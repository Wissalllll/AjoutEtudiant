package Helpers;

public class AutoIncrementGenerateur implements IdGenerateur {
    private int id = 0;

    @Override
    public int genererId() {
        return ++id;
    }
}
