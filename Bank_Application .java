import java.util.*;

import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.lang.String;

class BankAccount {
    private String Account_No;
    private String Password;
    private String Name;
    private double balance;
    char checkAgain;
    //bankAccount method

    //Account_Create method
    protected void Account_Create() {

        System.out.println("Account_Create");
        Scanner scan = new Scanner(System.in);
        System.out.println("Name");
        Name = scan.nextLine();
        System.out.println("Account_No");
        Account_No = scan.nextLine();
        System.out.println("Password");
        Password = scan.nextLine();
    }

    //deposit method
    void deposit(double Amount) {

        balance = balance + Amount;
    }

    //withdraw method
    void withdraw(double Amount) {
        if (balance >= 100) {
            balance = balance - Amount;
            System.out.println("After withdraw the amount balance : " + " " + balance);
        } else {
            System.out.println("withdraw is not insuffition");
        }
    }

    //getbalance method
    public void getBalance() {
        System.out.println(balance);

    }

    //display_Menu methode
    void display_Menu() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("choose your choice");
            System.out.println("A : deposite ");
            System.out.println("B : withdraw ");
            System.out.println("C : balance ");
            System.out.println("E : Exit");
            char Char = in.next().charAt(0);
            //using switch case
            switch (Char) {
                //press A in deposit session
                case 'A':
                    System.out.println("deposit");
                    System.out.println("Enter the deposit amount :");
                    double Amount = in.nextDouble();
                    deposit(Amount);
                    break;
                //press B in withdraw session
                case 'B':

                    System.out.println("withdraw");
                    System.out.println("Enter the withdraw amount :");
                    double Amount2 = in.nextDouble();
                    withdraw(Amount2);
                    break;
                //press C in balance session
                case 'C':
                    System.out.println("balance");
                    getBalance();
                    break;


            }
            //checkAgain in Y/N
            System.out.println("Do you need to checkAgain? (Y/N): ");
            checkAgain = in.next().charAt(0);
        } while (checkAgain == 'Y' || checkAgain == 'y');
        System.out.println("Thank you!");
    }

    void Login() {
        System.out.println("lOGIN");
        System.out.println("---------------------------------");
        Scanner scane = new Scanner(System.in);
        System.out.println("AccountNumber");
        String Account_No2 = scane.nextLine();
        System.out.println("Password");
        String Password2 = scane.nextLine();
        //if (Datas.containsKey("Account_No") || Datas.containsKey("Password")) {
        if (Account_No.equals(Account_No2)) {
            if (Password.equals(Password2)) {
                System.out.println("Login sucessfully!");
                display_Menu();

            } else {
                System.out.println("Invalid Password! please check this correct");
            }

        } else {
            System.out.println("Invalid Account Number! please check this correct");
        }


    }
}

class Bank_Application extends BankAccount {
    public static void main(String[] args) {
        //class object create in this main class
        BankAccount StateBank = new BankAccount();
        //another class methode call in main methode
        StateBank.Account_Create();
        System.out.println();
        StateBank.Login();
    }
}
