package net.mpentek.finance_manager.api;

public interface Finance {
    void start(String Username, String Password);
    void stop();
    boolean addExpense();
    boolean removeExpense();


}
