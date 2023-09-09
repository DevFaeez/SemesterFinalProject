import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Customer {

    //all variable in this class
    private String accountUsername, accountPassword;
    private int customerIndex, withdrawQuantity = 0, depositQuantity = 0, transferQuantity = 0, billPayemntQuantity = 0;

    //constructor
    public Customer(String accountUsername, String accountPassword) {
        this.accountUsername = accountUsername;
        this.accountPassword = accountPassword;
    }

    //all getter and setter
    public String getAccountUsername() {
        return accountUsername;
    }

    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public int getCustomerIndex() {
        return customerIndex;
    }

    public void setCustomerIndex(int customerIndex) {
        this.customerIndex = customerIndex;
    }

    public int getWithdrawQuantity() {
        return withdrawQuantity;
    }

    public void setWithdrawQuantity(int withdrawQuantity) {
        this.withdrawQuantity = withdrawQuantity;
    }

    public int getDepositQuantity() {
        return depositQuantity;
    }

    public void setDepositQuantity(int depositQuantity) {
        this.depositQuantity = depositQuantity;
    }

    public int getTransferQuantity() {
        return transferQuantity;
    }

    public void setTransferQuantity(int transferQuantity) {
        this.transferQuantity = transferQuantity;
    }

    public int getBillPayemntQuantity() {
        return billPayemntQuantity;
    }

    public void setBillPayemntQuantity(int billPayemntQuantity) {
        this.billPayemntQuantity = billPayemntQuantity;
    }

    //method to display Time
    //return in string
    public String Time() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //set time format
        return myDateObj.format(date);
    }

    //Method to dispat Day
    //return in string
    public String Day() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter date = DateTimeFormatter.ofPattern("HH:mm:ss"); //set date format
        return myDateObj.format(date);
    }

    //methos to generate random number for trasactionNumber
    //return in string
    public String generateRandomNumbers() {
        Random random = new Random();
        long randomNumber = random.nextLong();
        randomNumber = Math.abs(randomNumber % 1000000000000L); //set number qauntity

        String formattedNumber = String.format("%012d", randomNumber);

        return formattedNumber;
    }


}
