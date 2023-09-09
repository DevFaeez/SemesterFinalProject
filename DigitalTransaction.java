import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitalTransaction extends Account {

    private int transferExtraCharge;

    //constructor for class PhysicalTrasaction
    public DigitalTransaction(String accountFullName, String accountKeyWord, String accountNumberIC, String accountNumberPhone, long accountNumber, double accountBalance, Customer cust) {
        super(accountFullName, accountKeyWord, accountNumberIC, accountNumberPhone, accountNumber, accountBalance, cust);
    }

    //Implement method from class Account
    //USER INTERFACE(MAIN MENU)
    @Override
    public void mainUserInterface() {
        //create frame andd panel
        JFrame menuFrame = new JFrame();
        menuFrame.setTitle("ONE CAPITAL BANK");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(900, 700);
        menuFrame.setLocationRelativeTo(null);
        menuFrame.setLayout(new BorderLayout());
        menuFrame.setResizable(false);

        Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
        ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
        menuFrame.setIconImage(image1.getImage());

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

        JPanel topCenterPanel = new JPanel();
        topCenterPanel.setBackground(new Color(15, 122, 234, 255));
        topCenterPanel.setPreferredSize(new Dimension(700, 100));

        JPanel centerCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        centerCenterPanel.setBackground(new Color(15, 122, 234, 255));
        centerCenterPanel.setPreferredSize(new Dimension(600, 330));

        JPanel rightCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        rightCenterPanel.setBackground(new Color(15, 122, 234, 255));
        rightCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel leftCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        leftCenterPanel.setBackground(new Color(15, 122, 234, 255));
        leftCenterPanel.setPreferredSize(new Dimension(50, 330));

        //create all element ofr main user interface frame
        JLabel labelMainMenu = new JLabel("MAIN MENU");
        labelMainMenu.setFont(new Font("Verdana", Font.BOLD, 55));
        labelMainMenu.setForeground(Color.white);

        //button for Account Button
        //Create and give task to for Account Button
        JButton buttonCheckAccount = new JButton();
        buttonCheckAccount.setText("ACCOUNT DETAILS");
        buttonCheckAccount.setFocusable(false);
        buttonCheckAccount.setFocusPainted(false);
        buttonCheckAccount.setForeground(Color.WHITE);
        buttonCheckAccount.setBackground(Color.RED);
        buttonCheckAccount.setBorderPainted(false);
        buttonCheckAccount.setPreferredSize(new Dimension(300, 40));
        buttonCheckAccount.setFont(new Font("Tohoma", Font.BOLD, 20));
        buttonCheckAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TO-DO
                menuFrame.dispose();
                initializeAccountDetails();
            }
        });

        //button for transfer Button
        //Create and give task to for transfer Button
        JButton buttonTransfer = new JButton();
        buttonTransfer.setText("TRANSFER");
        buttonTransfer.setFocusable(false);
        buttonTransfer.setFocusPainted(false);
        buttonTransfer.setForeground(Color.WHITE);
        buttonTransfer.setBackground(Color.RED);
        buttonTransfer.setBorderPainted(false);
        buttonTransfer.setPreferredSize(new Dimension(300, 40));
        buttonTransfer.setFont(new Font("Tohoma", Font.BOLD, 20));
        buttonTransfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TO-DO
                menuFrame.dispose();
                initializeMainUserTrasaction();
            }
        });

        //button for bill payment Button
        //Create and give task to for bill payment Button
        JButton buttonBillPayment = new JButton();
        buttonBillPayment.setText("BILL PAYMENT");
        buttonBillPayment.setFocusable(false);
        buttonBillPayment.setFocusPainted(false);
        buttonBillPayment.setForeground(Color.WHITE);
        buttonBillPayment.setBackground(Color.RED);
        buttonBillPayment.setBorderPainted(false);
        buttonBillPayment.setPreferredSize(new Dimension(300, 40));
        buttonBillPayment.setFont(new Font("Tohoma", Font.BOLD, 20));
        buttonBillPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TO-DO
                menuFrame.dispose();
                initializeSecondUserTrasaction();
            }
        });

        //button for receipt Button
        //Create and give task to for receipt Button
        JButton buttonRecipt = new JButton();
        buttonRecipt.setText("RECEIPT");
        buttonRecipt.setFocusable(false);
        buttonRecipt.setFocusPainted(false);
        buttonRecipt.setForeground(Color.WHITE);
        buttonRecipt.setBackground(Color.RED);
        buttonRecipt.setBorderPainted(false);
        buttonRecipt.setPreferredSize(new Dimension(300, 40));
        buttonRecipt.setFont(new Font("Tohoma", Font.BOLD, 20));
        buttonRecipt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TO-DO
                menuFrame.dispose();
                initializeAccountReciept();
            }
        });

        //add all element and panel to frame
        topCenterPanel.add(labelMainMenu);

        centerCenterPanel.add(buttonCheckAccount);
        centerCenterPanel.add(buttonTransfer);
        centerCenterPanel.add(buttonBillPayment);
        centerCenterPanel.add(buttonRecipt);

        centerPanel.add(topCenterPanel, BorderLayout.NORTH);
        centerPanel.add(bottomCenterPanel, BorderLayout.SOUTH);
        centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
        centerPanel.add(rightCenterPanel, BorderLayout.EAST);
        centerPanel.add(leftCenterPanel, BorderLayout.WEST);
        menuFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
        menuFrame.getContentPane().add(leftPanel, BorderLayout.WEST);
        menuFrame.getContentPane().add(rightPanel, BorderLayout.EAST);
        menuFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        menuFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        menuFrame.setVisible(true);

    }

    //Implement method from class Account
    //TRANSFER MONEY
    @Override
    public void initializeMainUserTrasaction() {

        //create frame and panel
        JFrame billPayementFrame = new JFrame();
        billPayementFrame.setTitle("ONE CAPITAL BANK");
        billPayementFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        billPayementFrame.setSize(900, 700);
        billPayementFrame.setLocationRelativeTo(null);
        billPayementFrame.setLayout(new BorderLayout());
        billPayementFrame.setResizable(false);

        Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
        ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
        billPayementFrame.setIconImage(image1.getImage());

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

        JPanel bottomCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomCenterPanel.setBackground(new Color(15, 122, 234, 255));
        bottomCenterPanel.setPreferredSize(new Dimension(700, 70));

        JPanel topCenterPanel = new JPanel();
        topCenterPanel.setBackground(new Color(15, 122, 234, 255));
        topCenterPanel.setPreferredSize(new Dimension(700, 100));

        JPanel centerCenterPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        centerCenterPanel.setBackground(new Color(15, 122, 234, 255));
        centerCenterPanel.setPreferredSize(new Dimension(600, 330));

        JPanel rightCenterPanel = new JPanel();
        rightCenterPanel.setBackground(new Color(15, 122, 234, 255));
        rightCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel leftCenterPanel = new JPanel();
        leftCenterPanel.setBackground(new Color(15, 122, 234, 255));
        leftCenterPanel.setPreferredSize(new Dimension(50, 330));

        //create all element for transfer frame
        JLabel labelAccountNumber = new JLabel("ENTER ACCOUNT NUMBER: ");
        labelAccountNumber.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelAccountNumber.setPreferredSize(new Dimension(350, 30));

        JTextField textAccountNumber = new JTextField();
        textAccountNumber.setBorder(null);
        textAccountNumber.setPreferredSize(new Dimension(200, 30));
        textAccountNumber.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labeltransferAmount = new JLabel("ENTER TRANSFER AMOUNT: ");
        labeltransferAmount.setFont(new Font("Monospaced", Font.BOLD, 18));
        labeltransferAmount.setPreferredSize(new Dimension(350, 30));

        JTextField textTransferAmount = new JTextField();
        textTransferAmount.setBorder(null);
        textTransferAmount.setPreferredSize(new Dimension(200, 30));
        textTransferAmount.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelKeyWord = new JLabel("ENTER KEYWORD: ");
        labelKeyWord.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelKeyWord.setPreferredSize(new Dimension(350, 30));

        JTextField textKeyWord = new JTextField();
        textKeyWord.setBorder(null);
        textKeyWord.setPreferredSize(new Dimension(200, 30));
        textKeyWord.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelTransferType = new JLabel("CHOOSE TRANSFER TYPE: ");
        labelTransferType.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelTransferType.setPreferredSize(new Dimension(270, 30));

        JRadioButton instantTransfer = new JRadioButton("INSTANT");
        JRadioButton duitNowTransfer = new JRadioButton("DUIT NOW");
        JRadioButton NGOTransfer = new JRadioButton("NGO");

        instantTransfer.setPreferredSize(new Dimension(90, 40));
        duitNowTransfer.setPreferredSize(new Dimension(90, 40));
        NGOTransfer.setPreferredSize(new Dimension(90, 40));

        //selection for transfer type
        //instant(same bank) transfer no charge
        instantTransfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferExtraCharge = 0;
            }
        });

        //duitNow(different bank) transfer have RM 1 extra charge
        duitNowTransfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferExtraCharge = 1;
            }
        });

        //NGO transfer have RM 1 extra charge
        NGOTransfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transferExtraCharge = 1;
            }
        });

        ButtonGroup group = new ButtonGroup();
        group.add(instantTransfer);
        group.add(duitNowTransfer);
        group.add(NGOTransfer);

        JButton buttonTransfer = new JButton("TRANSFER");
        buttonTransfer.setFocusable(false);
        buttonTransfer.setFocusPainted(false);
        buttonTransfer.setForeground(Color.WHITE);
        buttonTransfer.setBackground(Color.RED);
        buttonTransfer.setBorderPainted(false);
        buttonTransfer.setPreferredSize(new Dimension(200, 40));
        buttonTransfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = textKeyWord.getText();  //convert textkeyword input to String

                if (group.getSelection() != null) { //for checking user choose the tranfer type first
                    if (Double.parseDouble(textTransferAmount.getText()) > getAccountBalance()) {  //check enough balance or not for transfer
                        JOptionPane.showMessageDialog(null, "YOUR BALANCE IS NOT ENOUGH, PLEASE ADD VALUE", "BALANCE ALERT", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (keyword.equals(getAccountKeyWord())) { //check input keyword same or not wuth user keyword
                            if (e.getSource() == buttonTransfer) {
                                getCust().setTransferQuantity(getCust().getTransferQuantity() + 1);
                                billPayementFrame.dispose(); // Use to close the last window
                                setAccountBalance(getAccountBalance() - Double.parseDouble(textTransferAmount.getText()) - transferExtraCharge); //making sub operation
                                mainUserInterface(); //return main user frame
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "YOUR USER KEYWORD IS WRONG", "KEYWORD ALERT", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "PLEASE SELECT TYPE OF TRANSFER", "TRANSFER TYPE", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        //add all element to frame
        centerCenterPanel.add(labelAccountNumber);
        centerCenterPanel.add(textAccountNumber);
        centerCenterPanel.add(labeltransferAmount);
        centerCenterPanel.add(textTransferAmount);
        centerCenterPanel.add(labelKeyWord);
        centerCenterPanel.add(textKeyWord);
        centerCenterPanel.add(labelTransferType);
        centerCenterPanel.add(instantTransfer);
        centerCenterPanel.add(duitNowTransfer);
        centerCenterPanel.add(NGOTransfer);
        bottomCenterPanel.add(buttonTransfer);


        centerPanel.add(topCenterPanel, BorderLayout.NORTH);
        centerPanel.add(bottomCenterPanel, BorderLayout.SOUTH);
        centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
        centerPanel.add(rightCenterPanel, BorderLayout.EAST);
        centerPanel.add(leftCenterPanel, BorderLayout.WEST);
        billPayementFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
        billPayementFrame.getContentPane().add(leftPanel, BorderLayout.WEST);
        billPayementFrame.getContentPane().add(rightPanel, BorderLayout.EAST);
        billPayementFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        billPayementFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        billPayementFrame.setVisible(true);
    }

    //Implement method from class Account
    //BILL PAYMENT
    @Override
    public void initializeSecondUserTrasaction() {

        //create frame and panel
        JFrame billPayementFrame = new JFrame();
        billPayementFrame.setTitle("ONE CAPITAL BANK");
        billPayementFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        billPayementFrame.setSize(900, 700);
        billPayementFrame.setLocationRelativeTo(null);
        billPayementFrame.setLayout(new BorderLayout());
        billPayementFrame.setResizable(false);

        Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
        ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
        billPayementFrame.setIconImage(image1.getImage());

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

        JPanel bottomCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomCenterPanel.setBackground(new Color(15, 122, 234, 255));
        bottomCenterPanel.setPreferredSize(new Dimension(700, 70));

        JPanel topCenterPanel = new JPanel();
        topCenterPanel.setBackground(new Color(15, 122, 234, 255));
        topCenterPanel.setPreferredSize(new Dimension(700, 100));

        JPanel centerCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerCenterPanel.setBackground(new Color(15, 122, 234, 255));
        centerCenterPanel.setPreferredSize(new Dimension(600, 330));

        JPanel rightCenterPanel = new JPanel();
        rightCenterPanel.setBackground(new Color(15, 122, 234, 255));
        rightCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel leftCenterPanel = new JPanel();
        leftCenterPanel.setBackground(new Color(15, 122, 234, 255));
        leftCenterPanel.setPreferredSize(new Dimension(50, 330));

        JLabel labelChooseBillType = new JLabel("                  CHOOSE BILL TYPE:");
        labelChooseBillType.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelChooseBillType.setPreferredSize(new Dimension(600, 30));
        labelChooseBillType.setForeground(Color.WHITE);

        //button for type utility type
        JButton buttonUtilityBill = new JButton("UTILITY BILL");
        buttonUtilityBill.setFocusable(false);
        buttonUtilityBill.setFocusPainted(false);
        buttonUtilityBill.setForeground(Color.WHITE);
        buttonUtilityBill.setBackground(Color.RED);
        buttonUtilityBill.setBorderPainted(false);
        buttonUtilityBill.setPreferredSize(new Dimension(220, 60));
        buttonUtilityBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                billPayementFrame.dispose();
                JPanel centerPanel2 = new JPanel(new BorderLayout());
                centerPanel2.setBackground(Color.WHITE);
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


                JFrame billUtilityFrame = new JFrame();
                billUtilityFrame.setTitle("ONE CAPITAL BANK");
                billUtilityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                billUtilityFrame.setSize(900, 700);
                billUtilityFrame.setLocationRelativeTo(null);
                billUtilityFrame.setLayout(new BorderLayout());
                billUtilityFrame.setResizable(false);

                ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
                billUtilityFrame.setIconImage(image1.getImage());

                JLabel labelICNumber = new JLabel("ENTER IC NUMBER: ");
                labelICNumber.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelICNumber.setPreferredSize(new Dimension(300, 30));

                JTextField textICNumber = new JTextField();
                textICNumber.setBorder(null);
                textICNumber.setPreferredSize(new Dimension(250, 30));
                textICNumber.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelAmount = new JLabel("ENTER AMOUNT: ");
                labelAmount.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelAmount.setPreferredSize(new Dimension(300, 30));

                JTextField textAmount = new JTextField();
                textAmount.setBorder(null);
                textAmount.setPreferredSize(new Dimension(250, 30));
                textAmount.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelKeyword = new JLabel("ENTER SECURITY WORD: ");
                labelKeyword.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelKeyword.setPreferredSize(new Dimension(300, 30));

                JTextField textKeyword = new JTextField();
                textKeyword.setBorder(null);
                textKeyword.setPreferredSize(new Dimension(250, 30));
                textKeyword.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelUtilityType = new JLabel("CHOOSE YOUR UTILITY: ");
                labelUtilityType.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelUtilityType.setPreferredSize(new Dimension(300, 30));

                JRadioButton water = new JRadioButton("WATER");
                JRadioButton electric = new JRadioButton("ELECTRIC");

                water.setPreferredSize(new Dimension(95, 40));
                electric.setPreferredSize(new Dimension(95, 40));

                ButtonGroup group = new ButtonGroup();
                group.add(water);
                group.add(electric);

                JButton buttonConfirmPayment = new JButton("CONFIRM PAYMENT");
                buttonConfirmPayment.setFocusable(false);
                buttonConfirmPayment.setFocusPainted(false);
                buttonConfirmPayment.setForeground(Color.WHITE);
                buttonConfirmPayment.setBackground(Color.RED);
                buttonConfirmPayment.setBorderPainted(false);
                buttonConfirmPayment.setPreferredSize(new Dimension(300, 40));
                buttonConfirmPayment.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String keyword = textKeyword.getText();

                        if (group.getSelection() != null) {
                            if (Double.parseDouble(textAmount.getText()) > getAccountBalance()) {
                                JOptionPane.showMessageDialog(null, "YOUR BALANCE IS NOT ENOUGH, PLEASE ADD VALUE", "BALANCE ALERT", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                if (keyword.equals(getAccountKeyWord())) {
                                    if (e.getSource() == buttonConfirmPayment) {
                                        getCust().setBillPayemntQuantity(getCust().getBillPayemntQuantity());
                                        billUtilityFrame.dispose(); // Use to close the last window
                                        setAccountBalance(getAccountBalance() - Double.parseDouble(textAmount.getText()));
                                        mainUserInterface();
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "YOUR USER KEYWORD IS WRONG", "KEYWORD ALERT", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "PLEASE SELECT TYPE OF UTILITY", "UTILITY TYPE", JOptionPane.INFORMATION_MESSAGE);

                        }


                    }
                });

                centerCenterPanel2.add(labelICNumber);
                centerCenterPanel2.add(textICNumber);
                centerCenterPanel2.add(labelAmount);
                centerCenterPanel2.add(textAmount);
                centerCenterPanel2.add(labelKeyword);
                centerCenterPanel2.add(textKeyword);
                centerCenterPanel2.add(labelUtilityType);
                centerCenterPanel2.add(water);
                centerCenterPanel2.add(electric);

                bottomCenterPanel2.add(buttonConfirmPayment);

                centerPanel2.add(topCenterPanel2, BorderLayout.NORTH);
                centerPanel2.add(bottomCenterPanel2, BorderLayout.SOUTH);
                centerPanel2.add(centerCenterPanel2, BorderLayout.CENTER);
                centerPanel2.add(rightCenterPanel2, BorderLayout.EAST);
                centerPanel2.add(leftCenterPanel2, BorderLayout.WEST);
                billUtilityFrame.getContentPane().add(topPanel2, BorderLayout.NORTH);
                billUtilityFrame.getContentPane().add(leftPanel2, BorderLayout.WEST);
                billUtilityFrame.getContentPane().add(rightPanel2, BorderLayout.EAST);
                billUtilityFrame.getContentPane().add(bottomPanel2, BorderLayout.SOUTH);
                billUtilityFrame.getContentPane().add(centerPanel2, BorderLayout.CENTER);

                billUtilityFrame.setVisible(true);
            }
        });

        //Button for internet Bill
        JButton buttonInternetBill = new JButton("INTERNET BILL");
        buttonInternetBill.setFocusable(false);
        buttonInternetBill.setFocusPainted(false);
        buttonInternetBill.setForeground(Color.WHITE);
        buttonInternetBill.setBackground(Color.RED);
        buttonInternetBill.setBorderPainted(false);
        buttonInternetBill.setPreferredSize(new Dimension(220, 60));
        buttonInternetBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                billPayementFrame.dispose();
                JPanel centerPanel2 = new JPanel(new BorderLayout());
                centerPanel2.setBackground(Color.WHITE);
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


                JFrame internetBillFrame = new JFrame();
                internetBillFrame.setTitle("ONE CAPITAL BANK");
                internetBillFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                internetBillFrame.setSize(900, 700);
                internetBillFrame.setLocationRelativeTo(null);
                internetBillFrame.setLayout(new BorderLayout());
                internetBillFrame.setResizable(false);

                ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
                internetBillFrame.setIconImage(image1.getImage());

                JLabel labelPhoneNumber = new JLabel("ENTER PHONE NUMBER: ");
                labelPhoneNumber.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelPhoneNumber.setPreferredSize(new Dimension(300, 30));

                JTextField textPhoneNumber = new JTextField();
                textPhoneNumber.setBorder(null);
                textPhoneNumber.setPreferredSize(new Dimension(250, 30));
                textPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelAmount = new JLabel("ENTER AMOUNT: ");
                labelAmount.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelAmount.setPreferredSize(new Dimension(300, 30));

                JTextField textAmount = new JTextField();
                textAmount.setBorder(null);
                textAmount.setPreferredSize(new Dimension(250, 30));
                textAmount.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelKeyword = new JLabel("ENTER SECURITY WORD: ");
                labelKeyword.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelKeyword.setPreferredSize(new Dimension(300, 30));

                JTextField textKeyword = new JTextField();
                textKeyword.setBorder(null);
                textKeyword.setPreferredSize(new Dimension(250, 30));
                textKeyword.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelUtilityType = new JLabel("CHOOSE YOUR UTILITY: ");
                labelUtilityType.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelUtilityType.setPreferredSize(new Dimension(300, 30));

                JButton buttonConfirmPayment = new JButton("CONFIRM PAYMENT");
                buttonConfirmPayment.setFocusable(false);
                buttonConfirmPayment.setFocusPainted(false);
                buttonConfirmPayment.setForeground(Color.WHITE);
                buttonConfirmPayment.setBackground(Color.RED);
                buttonConfirmPayment.setBorderPainted(false);
                buttonConfirmPayment.setPreferredSize(new Dimension(300, 40));
                buttonConfirmPayment.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String keyword = textKeyword.getText();


                        if (Double.parseDouble(textAmount.getText()) > getAccountBalance()) {
                            JOptionPane.showMessageDialog(null, "YOUR BALANCE IS NOT ENOUGH, PLEASE ADD VALUE", "BALANCE ALERT", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            if (keyword.equals(getAccountKeyWord())) {
                                if (e.getSource() == buttonConfirmPayment) {
                                    getCust().setBillPayemntQuantity(getCust().getBillPayemntQuantity());
                                    internetBillFrame.dispose(); // Use to close the last window
                                    setAccountBalance(getAccountBalance() - Double.parseDouble(textAmount.getText()));
                                    mainUserInterface();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "YOUR USER KEYWORD IS WRONG", "KEYWORD ALERT", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                });

                centerCenterPanel2.add(labelPhoneNumber);
                centerCenterPanel2.add(textPhoneNumber);
                centerCenterPanel2.add(labelAmount);
                centerCenterPanel2.add(textAmount);
                centerCenterPanel2.add(labelKeyword);
                centerCenterPanel2.add(textKeyword);


                bottomCenterPanel2.add(buttonConfirmPayment);


                centerPanel2.add(topCenterPanel2, BorderLayout.NORTH);
                centerPanel2.add(bottomCenterPanel2, BorderLayout.SOUTH);
                centerPanel2.add(centerCenterPanel2, BorderLayout.CENTER);
                centerPanel2.add(rightCenterPanel2, BorderLayout.EAST);
                centerPanel2.add(leftCenterPanel2, BorderLayout.WEST);
                internetBillFrame.getContentPane().add(topPanel2, BorderLayout.NORTH);
                internetBillFrame.getContentPane().add(leftPanel2, BorderLayout.WEST);
                internetBillFrame.getContentPane().add(rightPanel2, BorderLayout.EAST);
                internetBillFrame.getContentPane().add(bottomPanel2, BorderLayout.SOUTH);
                internetBillFrame.getContentPane().add(centerPanel2, BorderLayout.CENTER);

                internetBillFrame.setVisible(true);
            }
        });

        //Button for creadit card bill
        JButton buttonCreditCardBill = new JButton("CREDIT CARD BILL");
        buttonCreditCardBill.setFocusable(false);
        buttonCreditCardBill.setFocusPainted(false);
        buttonCreditCardBill.setForeground(Color.WHITE);
        buttonCreditCardBill.setBackground(Color.RED);
        buttonCreditCardBill.setBorderPainted(false);
        buttonCreditCardBill.setPreferredSize(new Dimension(220, 60));
        buttonCreditCardBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                billPayementFrame.dispose();
                JPanel centerPanel2 = new JPanel(new BorderLayout());
                centerPanel2.setBackground(Color.WHITE);
                centerPanel2.setPreferredSize(new Dimension(300, 500));

                JPanel topPanel2 = new JPanel();
                topPanel2.setBackground(Color.white);
                topPanel2.setPreferredSize(new Dimension(100, 150));

                JPanel rightPanel2 = new JPanel(null);
                rightPanel2.setBackground(Color.WHITE);
                rightPanel2.setPreferredSize(new Dimension(100, 100));

                JPanel bottomPanel2 = new JPanel(null);
                bottomPanel2.setBackground(Color.white);
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


                JFrame creditCardBillFrame = new JFrame();
                creditCardBillFrame.setTitle("ONE CAPITAL BANK");
                creditCardBillFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                creditCardBillFrame.setSize(900, 700);
                creditCardBillFrame.setLocationRelativeTo(null);
                creditCardBillFrame.setLayout(new BorderLayout());
                creditCardBillFrame.setResizable(false);

                ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
                creditCardBillFrame.setIconImage(image1.getImage());

                JLabel labelCreditCardNumber = new JLabel("ENTER CREDIT CARD NUMBER: ");
                labelCreditCardNumber.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelCreditCardNumber.setPreferredSize(new Dimension(300, 30));

                JTextField textCreditCardNumber = new JTextField();
                textCreditCardNumber.setBorder(null);
                textCreditCardNumber.setPreferredSize(new Dimension(250, 30));
                textCreditCardNumber.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelAmount = new JLabel("ENTER AMOUNT: ");
                labelAmount.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelAmount.setPreferredSize(new Dimension(300, 30));

                JTextField textAmount = new JTextField();
                textAmount.setBorder(null);
                textAmount.setPreferredSize(new Dimension(250, 30));
                textAmount.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelKeyword = new JLabel("ENTER SECURITY WORD: ");
                labelKeyword.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelKeyword.setPreferredSize(new Dimension(300, 30));

                JTextField textKeyword = new JTextField();
                textKeyword.setBorder(null);
                textKeyword.setPreferredSize(new Dimension(250, 30));
                textKeyword.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelCVV = new JLabel("ENTER CARD VARIFICATION VALUE: ");
                labelCVV.setFont(new Font("Monospaced", Font.BOLD, 16));
                labelCVV.setPreferredSize(new Dimension(300, 30));

                JTextField textCVV = new JTextField();
                textCVV.setBorder(null);
                textCVV.setPreferredSize(new Dimension(250, 30));
                textCVV.setHorizontalAlignment(SwingConstants.CENTER);

                JButton buttonConfirmPayment = new JButton("CONFIRM PAYMENT");
                buttonConfirmPayment.setFocusable(false);
                buttonConfirmPayment.setFocusPainted(false);
                buttonConfirmPayment.setForeground(Color.WHITE);
                buttonConfirmPayment.setBackground(Color.RED);
                buttonConfirmPayment.setBorderPainted(false);
                buttonConfirmPayment.setPreferredSize(new Dimension(300, 40));
                buttonConfirmPayment.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String keyword = textKeyword.getText();

                        System.out.println("Keyword: " + keyword);
                        System.out.println("Account Keyword: " + getAccountKeyWord());


                        if (Double.parseDouble(textAmount.getText()) > getAccountBalance()) {
                            JOptionPane.showMessageDialog(null, "YOUR BALANCE IS NOT ENOUGH, PLEASE ADD VALUE", "BALANCE ALERT", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            if (keyword.equals(getAccountKeyWord())) {
                                if (e.getSource() == buttonConfirmPayment) {
                                    getCust().setBillPayemntQuantity(getCust().getBillPayemntQuantity());
                                    creditCardBillFrame.dispose(); // Use to close the last window
                                    setAccountBalance(getAccountBalance() - Double.parseDouble(textAmount.getText()));
                                    mainUserInterface();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "YOUR USER KEYWORD IS WRONG", "KEYWORD ALERT", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                });

                centerCenterPanel2.add(labelCreditCardNumber);
                centerCenterPanel2.add(textCreditCardNumber);
                centerCenterPanel2.add(labelCVV);
                centerCenterPanel2.add(textCVV);
                centerCenterPanel2.add(labelAmount);
                centerCenterPanel2.add(textAmount);
                centerCenterPanel2.add(labelKeyword);
                centerCenterPanel2.add(textKeyword);


                bottomCenterPanel2.add(buttonConfirmPayment);


                centerPanel2.add(topCenterPanel2, BorderLayout.NORTH);
                centerPanel2.add(bottomCenterPanel2, BorderLayout.SOUTH);
                centerPanel2.add(centerCenterPanel2, BorderLayout.CENTER);
                centerPanel2.add(rightCenterPanel2, BorderLayout.EAST);
                centerPanel2.add(leftCenterPanel2, BorderLayout.WEST);
                creditCardBillFrame.getContentPane().add(topPanel2, BorderLayout.NORTH);
                creditCardBillFrame.getContentPane().add(leftPanel2, BorderLayout.WEST);
                creditCardBillFrame.getContentPane().add(rightPanel2, BorderLayout.EAST);
                creditCardBillFrame.getContentPane().add(bottomPanel2, BorderLayout.SOUTH);
                creditCardBillFrame.getContentPane().add(centerPanel2, BorderLayout.CENTER);

                creditCardBillFrame.setVisible(true);
            }
        });

        //Button for students loan bill
        JButton buttonStudentLoanBill = new JButton("STUDENTS LOAN BILL");
        buttonStudentLoanBill.setFocusable(false);
        buttonStudentLoanBill.setFocusPainted(false);
        buttonStudentLoanBill.setForeground(Color.WHITE);
        buttonStudentLoanBill.setBackground(Color.RED);
        buttonStudentLoanBill.setBorderPainted(false);
        buttonStudentLoanBill.setPreferredSize(new Dimension(220, 60));
        buttonStudentLoanBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                billPayementFrame.dispose();
                JPanel centerPanel2 = new JPanel(new BorderLayout());
                centerPanel2.setBackground(Color.WHITE);
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

                JFrame billStudentLoanFrame = new JFrame();
                billStudentLoanFrame.setTitle("ONE CAPITAL BANK");
                billStudentLoanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                billStudentLoanFrame.setSize(900, 700);
                billStudentLoanFrame.setLocationRelativeTo(null);
                billStudentLoanFrame.setLayout(new BorderLayout());
                billStudentLoanFrame.setResizable(false);

                ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
                billStudentLoanFrame.setIconImage(image1.getImage());

                JLabel labelStudentID = new JLabel("ENTER STUDENT ID: ");
                labelStudentID.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelStudentID.setPreferredSize(new Dimension(300, 30));

                JTextField textStudentsID = new JTextField();
                textStudentsID.setBorder(null);
                textStudentsID.setPreferredSize(new Dimension(250, 30));
                textStudentsID.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelAmount = new JLabel("ENTER AMOUNT: ");
                labelAmount.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelAmount.setPreferredSize(new Dimension(300, 30));

                JTextField textAmount = new JTextField();
                textAmount.setBorder(null);
                textAmount.setPreferredSize(new Dimension(250, 30));
                textAmount.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelKeyword = new JLabel("ENTER SECURITY WORD: ");
                labelKeyword.setFont(new Font("Monospaced", Font.BOLD, 18));
                labelKeyword.setPreferredSize(new Dimension(300, 30));

                JTextField textKeyword = new JTextField();
                textKeyword.setBorder(null);
                textKeyword.setPreferredSize(new Dimension(250, 30));
                textKeyword.setHorizontalAlignment(SwingConstants.CENTER);

                JLabel labelUniversityName = new JLabel("ENTER UNIVERSITI NAME: ");
                labelUniversityName.setFont(new Font("Monospaced", Font.BOLD, 16));
                labelUniversityName.setPreferredSize(new Dimension(300, 30));

                JTextField textUniversityName = new JTextField();
                textUniversityName.setBorder(null);
                textUniversityName.setPreferredSize(new Dimension(250, 30));
                textUniversityName.setHorizontalAlignment(SwingConstants.CENTER);
                textUniversityName.setToolTipText("Example: UiTM, UNIMAP, UTM, UM");

                JButton buttonConfirmPayment = new JButton("CONFIRM PAYMENT");
                buttonConfirmPayment.setFocusable(false);
                buttonConfirmPayment.setFocusPainted(false);
                buttonConfirmPayment.setForeground(Color.WHITE);
                buttonConfirmPayment.setBackground(Color.RED);
                buttonConfirmPayment.setBorderPainted(false);
                buttonConfirmPayment.setPreferredSize(new Dimension(300, 40));
                buttonConfirmPayment.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String keyword = textKeyword.getText();


                        if (Double.parseDouble(textAmount.getText()) > getAccountBalance()) {
                            JOptionPane.showMessageDialog(null, "YOUR BALANCE IS NOT ENOUGH, PLEASE ADD VALUE", "BALANCE ALERT", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            if (keyword.equals(getAccountKeyWord())) {
                                if (e.getSource() == buttonConfirmPayment) {
                                    getCust().setBillPayemntQuantity(getCust().getBillPayemntQuantity());
                                    billStudentLoanFrame.dispose(); // Use to close the last window
                                    setAccountBalance(getAccountBalance() - Double.parseDouble(textAmount.getText()));
                                    mainUserInterface();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "YOUR USER KEYWORD IS WRONG", "KEYWORD ALERT", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                });

                centerCenterPanel2.add(labelStudentID);
                centerCenterPanel2.add(textStudentsID);
                centerCenterPanel2.add(labelUniversityName);
                centerCenterPanel2.add(textUniversityName);
                centerCenterPanel2.add(labelAmount);
                centerCenterPanel2.add(textAmount);
                centerCenterPanel2.add(labelKeyword);
                centerCenterPanel2.add(textKeyword);

                bottomCenterPanel2.add(buttonConfirmPayment);

                centerPanel2.add(topCenterPanel2, BorderLayout.NORTH);
                centerPanel2.add(bottomCenterPanel2, BorderLayout.SOUTH);
                centerPanel2.add(centerCenterPanel2, BorderLayout.CENTER);
                centerPanel2.add(rightCenterPanel2, BorderLayout.EAST);
                centerPanel2.add(leftCenterPanel2, BorderLayout.WEST);
                billStudentLoanFrame.getContentPane().add(topPanel2, BorderLayout.NORTH);
                billStudentLoanFrame.getContentPane().add(leftPanel2, BorderLayout.WEST);
                billStudentLoanFrame.getContentPane().add(rightPanel2, BorderLayout.EAST);
                billStudentLoanFrame.getContentPane().add(bottomPanel2, BorderLayout.SOUTH);
                billStudentLoanFrame.getContentPane().add(centerPanel2, BorderLayout.CENTER);

                billStudentLoanFrame.setVisible(true);
            }
        });


        centerCenterPanel.add(labelChooseBillType);
        centerCenterPanel.add(buttonUtilityBill);
        centerCenterPanel.add(buttonInternetBill);
        centerCenterPanel.add(buttonStudentLoanBill);
        centerCenterPanel.add(buttonCreditCardBill);


        centerPanel.add(topCenterPanel, BorderLayout.NORTH);
        centerPanel.add(bottomCenterPanel, BorderLayout.SOUTH);
        centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
        centerPanel.add(rightCenterPanel, BorderLayout.EAST);
        centerPanel.add(leftCenterPanel, BorderLayout.WEST);
        billPayementFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
        billPayementFrame.getContentPane().add(leftPanel, BorderLayout.WEST);
        billPayementFrame.getContentPane().add(rightPanel, BorderLayout.EAST);
        billPayementFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        billPayementFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        billPayementFrame.setVisible(true);
    }

}