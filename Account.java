import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Account {

    //all variable for account class
    private String accountFullName, accountKeyWord, accountNumberIC, accountNumberPhone;
    private long accountNumber;
    private double accountBalance;
    private Customer cust; //variable named "cust" of type "Customer" from class customer by aggregation

    //all getter and setter
    public String getAccountFullName() {
        return accountFullName;
    }

    public void setAccountFullName(String accountFullName) {
        this.accountFullName = accountFullName;
    }

    public String getAccountKeyWord() {
        return accountKeyWord;
    }

    public void setAccountKeyWord(String accountKeyWord) {
        this.accountKeyWord = accountKeyWord;
    }

    public String getAccountNumberIC() {
        return accountNumberIC;
    }

    public void setAccountNumberIC(String accountNumberIC) {
        this.accountNumberIC = accountNumberIC;
    }

    public String getAccountNumberPhone() {
        return accountNumberPhone;
    }

    public void setAccountNumberPhone(String accountNumberPhone) {
        this.accountNumberPhone = accountNumberPhone;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountUserName() {
        return cust.getAccountUsername();
    }

    public void setAccountUserName(String userName) {
        cust.setAccountUsername(userName);
    }

    public String getAccountPassword() {
        return cust.getAccountPassword();
    }


    public void setAccountPassword(String password) {
        cust.setAccountPassword(password);
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    //consturctor
    public Account(String accountFullName, String accountKeyWord, String accountNumberIC, String accountNumberPhone, long accountNumber, double accountBalance, Customer cust) {
        this.accountFullName = accountFullName;
        this.accountKeyWord = accountKeyWord;
        this.accountNumberIC = accountNumberIC;
        this.accountNumberPhone = accountNumberPhone;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.cust = cust;
    }

    //first abstract method for use interface(main menu)
    public abstract void mainUserInterface();

    //second abstract method for use deposit and transfer
    public abstract void initializeMainUserTrasaction();

    //third abstract method for use withdraw and bill payment
    public abstract void initializeSecondUserTrasaction();

    //metthod for display account detals
    public void initializeAccountDetails() {
        //create panel and frame
        JFrame checkAccountFrame = new JFrame();
        checkAccountFrame.setTitle("ONE CAPITAL BANK");
        checkAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkAccountFrame.setSize(900, 700);
        checkAccountFrame.setLocationRelativeTo(null);
        checkAccountFrame.setLayout(new BorderLayout());
        checkAccountFrame.setResizable(false);

        Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
        ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
        checkAccountFrame.setIconImage(image1.getImage());

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.RED);
        centerPanel.setPreferredSize(new Dimension(300, 500));

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.white);
        topPanel.setPreferredSize(new Dimension(100, 150));

        JPanel rightPanel = new JPanel(null);
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setPreferredSize(new Dimension(100, 100));


        JPanel bottomPanel = new JPanel(null);
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.setPreferredSize(new Dimension(900, 100));


        JPanel leftPanel = new JPanel(null);
        leftPanel.setBackground(Color.WHITE);
        leftPanel.setPreferredSize(new Dimension(100, 100));

        JPanel bottomCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        bottomCenterPanel.setBackground(new Color(15, 122, 234, 255));
        bottomCenterPanel.setPreferredSize(new Dimension(700, 70));

        JPanel topCenterPanel = new JPanel();
        topCenterPanel.setBackground(new Color(15, 122, 234, 255));
        topCenterPanel.setPreferredSize(new Dimension(700, 100));

        JPanel centerCenterPanel = new JPanel(new FlowLayout(10, 50, 10));
        centerCenterPanel.setBackground(new Color(255, 0, 0, 255));
        centerCenterPanel.setPreferredSize(new Dimension(600, 330));

        JPanel rightCenterPanel = new JPanel();
        rightCenterPanel.setBackground(new Color(15, 122, 234, 255));
        rightCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel leftCenterPanel = new JPanel();
        leftCenterPanel.setBackground(new Color(15, 122, 234, 255));
        leftCenterPanel.setPreferredSize(new Dimension(50, 330));


        JLabel labelMainMenu = new JLabel("MAIN MENU");
        labelMainMenu.setFont(new Font("Verdana", Font.BOLD, 55));
        labelMainMenu.setForeground(Color.white);

        //DETAILS OF ACCOUNT START HERE

        JLabel labelFullName = new JLabel("NAME: " + getAccountFullName());
        labelFullName.setForeground(Color.WHITE);
        labelFullName.setFont(new Font("Arial", Font.BOLD, 16));
        labelFullName.setPreferredSize(new Dimension(500, 20));

        JLabel labelUserName = new JLabel("USERNAME: " + getAccountUserName()); //add later
        labelUserName.setForeground(Color.WHITE);
        labelUserName.setFont(new Font("Arial", Font.BOLD, 16));
        labelUserName.setPreferredSize(new Dimension(500, 20));

        JLabel labelPassword = new JLabel("PASSWORD: " + getAccountPassword());
        labelPassword.setForeground(Color.WHITE);
        labelPassword.setFont(new Font("Arial", Font.BOLD, 16));
        labelPassword.setPreferredSize(new Dimension(500, 20));

        JLabel labelKeyWord = new JLabel("KEYWORD: " + accountKeyWord);
        labelKeyWord.setForeground(Color.WHITE);
        labelKeyWord.setFont(new Font("Arial", Font.BOLD, 16));
        labelKeyWord.setPreferredSize(new Dimension(500, 20));

        JLabel labelNumberIC = new JLabel("IC NUMBER: " + accountNumberIC);
        labelNumberIC.setForeground(Color.WHITE);
        labelNumberIC.setFont(new Font("Arial", Font.BOLD, 16));
        labelNumberIC.setPreferredSize(new Dimension(500, 20));

        JLabel labelNumberPhone = new JLabel("PHONE NUMBER: " + accountNumberPhone);
        labelNumberPhone.setForeground(Color.WHITE);
        labelNumberPhone.setFont(new Font("Arial", Font.BOLD, 16));
        labelNumberPhone.setPreferredSize(new Dimension(500, 20));

        JLabel labelAccountNumber = new JLabel("ACCOUNT NUMBER: " + accountNumber);
        labelAccountNumber.setForeground(Color.WHITE);
        labelAccountNumber.setFont(new Font("Arial", Font.BOLD, 16));
        labelAccountNumber.setPreferredSize(new Dimension(500, 20));

        JLabel labelAccountBalance = new JLabel("ACCOUNT BALANCE: RM " + accountBalance);
        labelAccountBalance.setForeground(Color.WHITE);
        labelAccountBalance.setFont(new Font("Arial", Font.BOLD, 16));
        labelAccountBalance.setPreferredSize(new Dimension(500, 20));

        JButton buttonBack = new JButton("MAIN MENU");
        buttonBack.setFocusable(false);
        buttonBack.setFocusPainted(false);
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setBackground(Color.RED);
        buttonBack.setBorderPainted(false);
        buttonBack.setPreferredSize(new Dimension(200, 40));
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAccountFrame.dispose();
                mainUserInterface();
            }
        });


        JButton buttonEdit = new JButton("EDIT DETAILS");
        buttonEdit.setFocusable(false);
        buttonEdit.setFocusPainted(false);
        buttonEdit.setForeground(Color.WHITE);
        buttonEdit.setBackground(Color.RED);
        buttonEdit.setBorderPainted(false);
        buttonEdit.setPreferredSize(new Dimension(200, 40));
        buttonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                checkAccountFrame.dispose();

                JFrame frameEditInfo = new JFrame();
                frameEditInfo.setTitle("ONE CAPITAL BANK");
                frameEditInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frameEditInfo.setSize(900, 700);
                frameEditInfo.setLocationRelativeTo(null);
                frameEditInfo.setLayout(new BorderLayout());
                frameEditInfo.setResizable(false);

                JPanel centerPanel2 = new JPanel(new BorderLayout());
                centerPanel2.setBackground(Color.RED);
                centerPanel2.setPreferredSize(new Dimension(300, 500));

                JPanel topPanel2 = new JPanel();
                topPanel2.setBackground(Color.white);
                topPanel2.setPreferredSize(new Dimension(100, 150));


                JPanel rightPanel2 = new JPanel(null);
                rightPanel2.setBackground(Color.WHITE);
                rightPanel2.setPreferredSize(new Dimension(100, 100));


                JPanel bottomPanel2 = new JPanel(null);
                bottomPanel2.setBackground(Color.WHITE);
                bottomPanel2.setPreferredSize(new Dimension(900, 100));

                JPanel leftPanel2 = new JPanel(null);
                leftPanel2.setBackground(Color.WHITE);
                leftPanel2.setPreferredSize(new Dimension(100, 100));


                JPanel bottomCenterPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
                bottomCenterPanel2.setBackground(new Color(15, 122, 234, 255));
                bottomCenterPanel2.setPreferredSize(new Dimension(700, 70));

                JPanel topCenterPanel2 = new JPanel();
                topCenterPanel2.setBackground(new Color(15, 122, 234, 255));
                topCenterPanel2.setPreferredSize(new Dimension(700, 100));

                JPanel centerCenterPanel2 = new JPanel(new FlowLayout(0, 10, 10));
                centerCenterPanel2.setBackground(new Color(255, 0, 0, 255));
                centerCenterPanel2.setPreferredSize(new Dimension(600, 330));

                JPanel rightCenterPanel2 = new JPanel();
                rightCenterPanel2.setBackground(new Color(15, 122, 234, 255));
                rightCenterPanel2.setPreferredSize(new Dimension(50, 330));

                JPanel leftCenterPanel2 = new JPanel();
                leftCenterPanel2.setBackground(new Color(15, 122, 234, 255));
                leftCenterPanel2.setPreferredSize(new Dimension(50, 330));

                JLabel labelNewUserName = new JLabel("Enter new user Name: " + getAccountUserName());
                labelNewUserName.setPreferredSize(new Dimension(250, 40));
                JTextField textNewUserName = new JTextField(getAccountUserName());
                textNewUserName.setPreferredSize(new Dimension(250, 40));
                textNewUserName.setBorder(null);

                JLabel labelNewPassword = new JLabel("Enter new password: " + getAccountPassword());
                labelNewPassword.setPreferredSize(new Dimension(250, 40));
                JTextField textNewPassword = new JTextField(getAccountPassword());
                textNewPassword.setPreferredSize(new Dimension(250, 40));
                textNewPassword.setBorder(null);

                JLabel labelNewNumberPhone = new JLabel("Enter new number phone: ");
                labelNewNumberPhone.setPreferredSize(new Dimension(250, 40));
                JTextField textNewNumberPhone = new JTextField(accountNumberPhone);
                textNewNumberPhone.setPreferredSize(new Dimension(250, 40));
                textNewNumberPhone.setBorder(null);

                JLabel labelNewKeyword = new JLabel("Enter new keyword: ");
                labelNewKeyword.setPreferredSize(new Dimension(250, 40));
                JTextField textNewKeyword = new JTextField(accountKeyWord);
                textNewKeyword.setPreferredSize(new Dimension(250, 40));
                textNewKeyword.setBorder(null);

                JButton buttonSave = new JButton("SAVE");
                buttonSave.setFocusable(false);
                buttonSave.setFocusPainted(false);
                buttonSave.setForeground(Color.WHITE);
                buttonSave.setBackground(Color.RED);
                buttonSave.setBorderPainted(false);
                buttonSave.setPreferredSize(new Dimension(200, 40));
                buttonSave.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        frameEditInfo.dispose();

                        //using setter tu update new user data
                        setAccountUserName(textNewUserName.getText());
                        setAccountNumberPhone(textNewNumberPhone.getText());
                        setAccountPassword(textNewPassword.getText());
                        setAccountKeyWord(textNewKeyword.getText());

                        mainUserInterface();

                    }
                });

                centerCenterPanel2.add(labelNewUserName);
                centerCenterPanel2.add(textNewUserName);
                centerCenterPanel2.add(labelNewPassword);
                centerCenterPanel2.add(textNewPassword);
                centerCenterPanel2.add(labelNewNumberPhone);
                centerCenterPanel2.add(textNewNumberPhone);
                centerCenterPanel2.add(labelNewKeyword);
                centerCenterPanel2.add(textNewKeyword);
                bottomCenterPanel2.add(buttonSave);

                centerPanel2.add(topCenterPanel2, BorderLayout.NORTH);
                centerPanel2.add(bottomCenterPanel2, BorderLayout.SOUTH);
                centerPanel2.add(centerCenterPanel2, BorderLayout.CENTER);
                centerPanel2.add(rightCenterPanel2, BorderLayout.EAST);
                centerPanel2.add(leftCenterPanel2, BorderLayout.WEST);
                frameEditInfo.getContentPane().add(topPanel2, BorderLayout.NORTH);
                frameEditInfo.getContentPane().add(leftPanel2, BorderLayout.WEST);
                frameEditInfo.getContentPane().add(rightPanel2, BorderLayout.EAST);
                frameEditInfo.getContentPane().add(bottomPanel2, BorderLayout.SOUTH);
                frameEditInfo.getContentPane().add(centerPanel2, BorderLayout.CENTER);

                frameEditInfo.setVisible(true);

            }
        });


        centerCenterPanel.add(labelFullName);
        centerCenterPanel.add(labelUserName);
        centerCenterPanel.add(labelPassword);
        centerCenterPanel.add(labelAccountNumber);
        centerCenterPanel.add(labelKeyWord);
        centerCenterPanel.add(labelNumberIC);
        centerCenterPanel.add(labelNumberPhone);
        centerCenterPanel.add(labelAccountBalance);

        bottomCenterPanel.add(buttonBack);
        bottomCenterPanel.add(buttonEdit);


        centerPanel.add(topCenterPanel, BorderLayout.NORTH);
        centerPanel.add(bottomCenterPanel, BorderLayout.SOUTH);
        centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
        centerPanel.add(rightCenterPanel, BorderLayout.EAST);
        centerPanel.add(leftCenterPanel, BorderLayout.WEST);
        checkAccountFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
        checkAccountFrame.getContentPane().add(leftPanel, BorderLayout.WEST);
        checkAccountFrame.getContentPane().add(rightPanel, BorderLayout.EAST);
        checkAccountFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        checkAccountFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);

        checkAccountFrame.setVisible(true);

    }

    //method for print receipt
    public void initializeAccountReciept() {
        //create panel and frame
        JFrame receiptFrame = new JFrame();
        receiptFrame.setTitle("ONE CAPITAL BANK");
        receiptFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        receiptFrame.setSize(900, 700);
        receiptFrame.setLocationRelativeTo(null);
        receiptFrame.setLayout(new BorderLayout());
        receiptFrame.setResizable(false);

        Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
        ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
        receiptFrame.setIconImage(image1.getImage());

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setPreferredSize(new Dimension(300, 500));

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.white);
        topPanel.setPreferredSize(new Dimension(100, 150));


        JPanel rightPanel = new JPanel(null);
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setPreferredSize(new Dimension(100, 100));

        JPanel bottomPanel = new JPanel(null);
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.setPreferredSize(new Dimension(900, 100));


        JPanel leftPanel = new JPanel(null);
        leftPanel.setBackground(Color.WHITE);
        leftPanel.setPreferredSize(new Dimension(100, 100));

        JPanel bottomCenterPanel = new JPanel();
        bottomCenterPanel.setBackground(new Color(15, 122, 234, 255));
        bottomCenterPanel.setPreferredSize(new Dimension(700, 70));

        JPanel topCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topCenterPanel.setBackground(new Color(15, 122, 234, 255));
        topCenterPanel.setPreferredSize(new Dimension(700, 100));

        JPanel centerCenterPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, -7));
        centerCenterPanel.setBackground(new Color(255, 0, 0, 255));
        centerCenterPanel.setPreferredSize(new Dimension(600, 330));

        JPanel rightCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        rightCenterPanel.setBackground(new Color(15, 122, 234, 255));
        rightCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel leftCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        leftCenterPanel.setBackground(new Color(15, 122, 234, 255));
        leftCenterPanel.setPreferredSize(new Dimension(50, 330));

        //craete all element

        JLabel labelReceipt = new JLabel("FULL NAME: " + accountFullName);
        labelReceipt.setFont(new Font("Monospaced", Font.BOLD, 24));
        labelReceipt.setPreferredSize(new Dimension(600, 30));
        labelReceipt.setForeground(Color.WHITE);

        JLabel labelFullName = new JLabel("FULL NAME: " + accountFullName);
        labelFullName.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelFullName.setPreferredSize(new Dimension(600, 30));
        labelFullName.setForeground(Color.WHITE);

        JLabel labelTransactionNumber = new JLabel("TRASACTION NUMBER: " + cust.generateRandomNumbers());  // genarate random number here
        labelTransactionNumber.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelTransactionNumber.setPreferredSize(new Dimension(600, 30));
        labelTransactionNumber.setForeground(Color.WHITE);

        JLabel labelReceiptBalance = new JLabel("ACCOUNT BALANCE: RM " + accountBalance);
        labelReceiptBalance.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelReceiptBalance.setPreferredSize(new Dimension(600, 30));
        labelReceiptBalance.setForeground(Color.WHITE);

        JLabel labelTransactionType = new JLabel("TRANSACTION TYPE");
        labelTransactionType.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelTransactionType.setPreferredSize(new Dimension(300, 30));
        labelTransactionType.setForeground(Color.WHITE);


        JLabel labelTrasactionQuantity = new JLabel("QUANTITY");
        labelTrasactionQuantity.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelTrasactionQuantity.setPreferredSize(new Dimension(200, 30));
        labelTrasactionQuantity.setForeground(Color.WHITE);


        JLabel labelDepositType = new JLabel("  DEPOSIT                            " + cust.getDepositQuantity());
        labelDepositType.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelDepositType.setPreferredSize(new Dimension(600, 30));
        labelDepositType.setForeground(Color.WHITE);


        JLabel labelWithdrawType = new JLabel("  WITHDRAW                           " + cust.getWithdrawQuantity());
        labelWithdrawType.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelWithdrawType.setPreferredSize(new Dimension(600, 30));
        labelWithdrawType.setForeground(Color.WHITE);


        JLabel labelBillPaymentType = new JLabel("  BILL PAYMENT                       " + cust.getBillPayemntQuantity());
        labelBillPaymentType.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelBillPaymentType.setPreferredSize(new Dimension(600, 30));
        labelBillPaymentType.setForeground(Color.WHITE);


        JLabel labelTransferType = new JLabel("  TRANSFER                           " + cust.getTransferQuantity());
        labelTransferType.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelTransferType.setPreferredSize(new Dimension(600, 30));
        labelTransferType.setForeground(Color.WHITE);

        JLabel labelDate = new JLabel("DATE: " + cust.Day());
        labelDate.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelDate.setPreferredSize(new Dimension(600, 30));
        labelDate.setForeground(Color.WHITE);


        JLabel labelTime = new JLabel("TIME: " + cust.Time());
        labelTime.setFont(new Font("Monospaced", Font.BOLD, 16));
        labelTime.setPreferredSize(new Dimension(600, 30));
        labelTime.setForeground(Color.WHITE);

        JButton buttonPrintRecepit = new JButton("PRINT RECEIPT");
        buttonPrintRecepit.setFocusable(false);
        buttonPrintRecepit.setFocusPainted(false);
        buttonPrintRecepit.setForeground(Color.WHITE);
        buttonPrintRecepit.setBackground(Color.RED);
        buttonPrintRecepit.setBorderPainted(false);
        buttonPrintRecepit.setPreferredSize(new Dimension(200, 40));
        buttonPrintRecepit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String filePath = "D:\\JAVA ASSIGNMENT\\Main\\src\\userData.txt";
                int lineToReplace = cust.getCustomerIndex();
                System.out.println(lineToReplace);
                String newValue = getAccountUserName() + ":" +
                        getAccountPassword() + ":" +
                        accountFullName + ":" +
                        accountKeyWord + ":" +
                        accountNumberIC + ":" +
                        accountNumberPhone + ":" +
                        accountNumber + ":" +
                        accountBalance;

                //temporary file
                String tempFilePath = "TemporaryFile.txt";

                //this is for replace new data into file
                try {
                    // Open the files for reading and writing
                    BufferedReader reader = new BufferedReader(new FileReader(filePath));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFilePath));

                    String line;
                    int lineNumber = 0;

                    while ((line = reader.readLine()) != null) {
                        lineNumber++;

                        if (lineNumber == lineToReplace) {
                            writer.write(newValue);
                            writer.newLine();
                        } else {
                            writer.write(line); //copy all data to new file
                            writer.newLine();
                        }
                    }

                    reader.close();
                    writer.close();

                    File originalFile = new File(filePath);
                    originalFile.delete(); //delete original file

                    File tempFile = new File(tempFilePath);
                    tempFile.renameTo(originalFile); //change name to original file

                    System.out.println("File updated");
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
                JOptionPane.showMessageDialog(null, "PLEASE WAIT PATIENTLY UNTIL IT IS COMPLETELY PRINTED. THANK YOU", "RECEIPT", JOptionPane.INFORMATION_MESSAGE);
                receiptFrame.dispose();
            }

        });

        topCenterPanel.add(labelReceipt);
        bottomCenterPanel.add(buttonPrintRecepit);

        centerCenterPanel.add(labelFullName);
        centerCenterPanel.add(labelTransactionNumber);
        centerCenterPanel.add(labelReceiptBalance);
        centerCenterPanel.add(labelTransactionType);
        centerCenterPanel.add(labelTrasactionQuantity);

        centerCenterPanel.add(labelDepositType);
        centerCenterPanel.add(labelWithdrawType);
        centerCenterPanel.add(labelBillPaymentType);
        centerCenterPanel.add(labelTransferType);

        centerCenterPanel.add(labelDate);
        centerCenterPanel.add(labelTime);

        centerPanel.add(topCenterPanel, BorderLayout.NORTH);
        centerPanel.add(bottomCenterPanel, BorderLayout.SOUTH);
        centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
        centerPanel.add(rightCenterPanel, BorderLayout.EAST);
        centerPanel.add(leftCenterPanel, BorderLayout.WEST);
        receiptFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
        receiptFrame.getContentPane().add(leftPanel, BorderLayout.WEST);
        receiptFrame.getContentPane().add(rightPanel, BorderLayout.EAST);
        receiptFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        receiptFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);

        receiptFrame.setVisible(true);

    }

}
