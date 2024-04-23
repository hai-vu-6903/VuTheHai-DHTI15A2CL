/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author ADMIN
 */
public class SynchBank {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new  Bank(100, 1000);
        int size = bank.size();
        for (int i = 0; i < size; i++) {
            TransferMoney transferMoney = new TransferMoney(bank, i, 1000);
            Thread thread = new Thread(transferMoney);
            thread.start();
        }
    }
}
