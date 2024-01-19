package org.example;

public class WithSynchronized {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread thread1 = new Thread(() -> {
            account.withdrawSynchronized(300);
        });

        Thread thread2 = new Thread(() -> {
            account.withdrawSynchronized(500);
        });

        Thread thread3 = new Thread(() -> {
            account.withdrawSynchronized(500);
        });


        thread1.start();
        thread2.start();
        thread3.start();

//        300 => Withdrawal successful. Remaining balance: 700
//        500 => Withdrawal successful. Remaining balance: 200
//        500 =>Withdrawal failed. Insufficient funds.
    }
}
