package chap02_dependecy_injection.com.common;

public interface Account {

    String getBalance();

    String deposit(int money);

    String withDraw(int money);

}
