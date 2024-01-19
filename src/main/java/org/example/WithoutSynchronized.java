package org.example;

public class WithoutSynchronized {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread thread1 = new Thread(() -> {
            account.withDrawWithoutSynchronized(300);
        });

        Thread thread2 = new Thread(() -> {
            account.withDrawWithoutSynchronized(500);
        });

        Thread thread3 = new Thread(() -> {
            account.withDrawWithoutSynchronized(500);
        });


        thread1.start();
        thread2.start();
        thread3.start();

//        500 => Withdrawal successful. Remaining balance: -300
//        500 => Withdrawal successful. Remaining balance: 200
//        300 => Withdrawal successful. Remaining balance: 700
    }
}
