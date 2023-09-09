import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicalTrasaction extends Account{

    //constructor for class PhysicalTrasaction
    public PhysicalTrasaction(String accountFullName, String accountKeyWord, String accountNumberIC, String accountNumberPhone, long accountNumber, double accountBalance, Customer cust) {
        super(accountFullName, accountKeyWord, accountNumberIC, accountNumberPhone, accountNumber, accountBalance, cust);
    }


    //Implement method from class Account
    //USER INTERFACE(MAIN MENU)
    @Override
    public void mainUserInterface() {

        //create frame and panel
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
        bottomCenterPanel.setBackground(new Color(15, 122, 234,255));
        bottomCenterPanel.setPreferredSize(new Dimension(700, 70));

        JPanel topCenterPanel = new JPanel();
        topCenterPanel.setBackground(new Color(15, 122, 234,255));
        topCenterPanel.setPreferredSize(new Dimension(700, 100));

        JPanel centerCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        centerCenterPanel.setBackground(new Color(15, 122, 234,255));
        centerCenterPanel.setPreferredSize(new Dimension(600, 330));

        JPanel rightCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        rightCenterPanel.setBackground(new Color(15, 122, 234,255));
        rightCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel leftCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        leftCenterPanel.setBackground(new Color(15, 122, 234,255));
        leftCenterPanel.setPreferredSize(new Dimension(50, 330));

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

        //button for Withdraw
        //Create and give task to for withdraw Button
        JButton buttonWithdraw = new JButton();
        buttonWithdraw.setText("WITHDRAW");
        buttonWithdraw.setFocusable(false);
        buttonWithdraw.setFocusPainted(false);
        buttonWithdraw.setForeground(Color.WHITE);
        buttonWithdraw.setBackground(Color.RED);
        buttonWithdraw.setBorderPainted(false);
        buttonWithdraw.setPreferredSize(new Dimension(300, 40));
        buttonWithdraw.setFont(new Font("Tohoma", Font.BOLD, 20));
        buttonWithdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TO-DO
                menuFrame.dispose();
                initializeSecondUserTrasaction();

            }
        });

        //button for Deposit Button
        //Create and give task to for deposit Button
        JButton buttonDeposit = new JButton();
        buttonDeposit.setText("DEPOSIT");
        buttonDeposit.setFocusable(false);
        buttonDeposit.setFocusPainted(false);
        buttonDeposit.setForeground(Color.WHITE);
        buttonDeposit.setBackground(Color.RED);
        buttonDeposit.setBorderPainted(false);
        buttonDeposit.setPreferredSize(new Dimension(300, 40));
        buttonDeposit.setFont(new Font("Tohoma", Font.BOLD, 20));
        buttonDeposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TO-DO
                menuFrame.dispose();
                initializeMainUserTrasaction();
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

        //Add all element to frame
        topCenterPanel.add(labelMainMenu);

        centerCenterPanel.add(buttonCheckAccount);
        centerCenterPanel.add(buttonWithdraw);
        centerCenterPanel.add(buttonDeposit);
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
    //DEPOSIT MONEY
    @Override
    public void initializeMainUserTrasaction() {

        //create frame and panel
        JFrame dipositFrame = new JFrame();
        dipositFrame.setTitle("ONE CAPITAL BANK");
        dipositFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dipositFrame.setSize(900, 700);
        dipositFrame.setLocationRelativeTo(null);
        dipositFrame.setLayout(new BorderLayout());
        dipositFrame.setResizable(false);

        Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
        ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
        dipositFrame.setIconImage(image1.getImage());

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.white);
        centerPanel.setPreferredSize(new Dimension(300, 500));

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.white);
        topPanel.setPreferredSize(new Dimension(100, 150));

        JPanel rightPanel = new JPanel(null);
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setPreferredSize(new Dimension(100, 100));

        JPanel bottomPanel = new JPanel(null);
        bottomPanel.setBackground(Color.white);
        bottomPanel.setPreferredSize(new Dimension(900, 100));

        JPanel leftPanel = new JPanel(null);
        leftPanel.setBackground(Color.white);
        leftPanel.setPreferredSize(new Dimension(100, 100));

        JPanel bottomCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomCenterPanel.setBackground(new Color(15, 122, 234,255));
        bottomCenterPanel.setPreferredSize(new Dimension(700, 70));

        JPanel topCenterPanel = new JPanel();
        topCenterPanel.setBackground(new Color(15, 122, 234,255));
        topCenterPanel.setPreferredSize(new Dimension(700, 100));

        JPanel centerCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        centerCenterPanel.setBackground(new Color(15, 122, 234,255));
        centerCenterPanel.setPreferredSize(new Dimension(600, 330));

        JPanel rightCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        rightCenterPanel.setBackground(new Color(15, 122, 234,255));
        rightCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel leftCenterPanel = new JPanel(new GridLayout(3, 2, 20, 20));
        leftCenterPanel.setBackground(new Color(15, 122, 234,255));
        leftCenterPanel.setPreferredSize(new Dimension(50, 330));

        //create all element for this frame
        JLabel labelWithdrawamount = new JLabel("ENTER DEPOSIT AMOUNT: ");
        labelWithdrawamount.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelWithdrawamount.setPreferredSize(new Dimension(300, 30));

        JTextField textWithdraw = new JTextField();
        textWithdraw.setBorder(null);
        textWithdraw.setPreferredSize(new Dimension(250, 30));
        textWithdraw.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelKeyword = new JLabel("ENTER SECURITY WORD: ");
        labelKeyword.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelKeyword.setPreferredSize(new Dimension(300, 30));

        JTextField textKeyword = new JTextField();
        textKeyword.setBorder(null);
        textKeyword.setPreferredSize(new Dimension(250, 30));
        textKeyword.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelUserName = new JLabel(" ");
        labelUserName.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelUserName.setPreferredSize(new Dimension(300, 30));

        JButton buttonDeposit = new JButton("DEPOSIT");
        buttonDeposit.setFocusable(false);
        buttonDeposit.setFocusPainted(false);
        buttonDeposit.setForeground(Color.WHITE);
        buttonDeposit.setBackground(Color.RED);
        buttonDeposit.setBorderPainted(false);
        buttonDeposit.setPreferredSize(new Dimension(200, 40));
        buttonDeposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = textKeyword.getText();  //change textKeyword to String

                if (keyword.equals(getAccountKeyWord())) {  //check if input keyword equal with in file
                    if (e.getSource() == buttonDeposit) {
                        getCust().setDepositQuantity(getCust().getDepositQuantity() + 1); //calculation for check deposit quantity
                        dipositFrame.dispose(); // Use to close the last window
                        setAccountBalance(getAccountBalance() + Double.parseDouble(textWithdraw.getText()));  //making operation for deposit
                        mainUserInterface();  //return to main frame again
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "YOUR USER KEYWORD IS WRONG", "KEYWORD ALERT", JOptionPane.WARNING_MESSAGE);
                }

            }
        });



        //add all element and panel to frame
        centerCenterPanel.add(labelWithdrawamount);
        centerCenterPanel.add(textWithdraw);
        centerCenterPanel.add(labelKeyword);
        centerCenterPanel.add(textKeyword);
        centerCenterPanel.add(labelUserName);
        bottomCenterPanel.add(buttonDeposit);


        centerPanel.add(topCenterPanel, BorderLayout.NORTH);
        centerPanel.add(bottomCenterPanel, BorderLayout.SOUTH);
        centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
        centerPanel.add(rightCenterPanel, BorderLayout.EAST);
        centerPanel.add(leftCenterPanel, BorderLayout.WEST);
        dipositFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
        dipositFrame.getContentPane().add(leftPanel, BorderLayout.WEST);
        dipositFrame.getContentPane().add(rightPanel, BorderLayout.EAST);
        dipositFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        dipositFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        dipositFrame.setVisible(true);
    }


    //Implement method from class Account
    //WITHDRAW MONEY
    @Override
    public void initializeSecondUserTrasaction() {

        //create frame and panel
        JFrame withdrawFrame = new JFrame();
        withdrawFrame.setTitle("ONE CAPITAL BANK");
        withdrawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        withdrawFrame.setSize(900, 700);
        withdrawFrame.setLocationRelativeTo(null);
        withdrawFrame.setLayout(new BorderLayout());
        withdrawFrame.setResizable(false);

        Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
        ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
        withdrawFrame.setIconImage(image1.getImage());

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
        bottomCenterPanel.setBackground(new Color(15, 122, 234,255));
        bottomCenterPanel.setPreferredSize(new Dimension(700, 70));

        JPanel topCenterPanel = new JPanel();
        topCenterPanel.setBackground(new Color(15, 122, 234,255));
        topCenterPanel.setPreferredSize(new Dimension(700, 100));

        JPanel centerCenterPanel = new JPanel(new BorderLayout());
        centerCenterPanel.setBackground(new Color(15, 122, 234,255));
        centerCenterPanel.setPreferredSize(new Dimension(600, 330));

        JPanel rightCenterPanel = new JPanel();
        rightCenterPanel.setBackground(new Color(15, 122, 234,255));
        rightCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel leftCenterPanel = new JPanel();
        leftCenterPanel.setBackground(new Color(15, 122, 234,255));
        leftCenterPanel.setPreferredSize(new Dimension(50, 330));

        JPanel topCenterCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        topCenterCenterPanel.setBackground(new Color(255, 0, 0,255));
        topCenterCenterPanel.setPreferredSize(new Dimension(600, 130));

        JPanel bottomCenterCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
        bottomCenterCenterPanel.setBackground(new Color(255, 0, 0,255));
        bottomCenterCenterPanel.setPreferredSize(new Dimension(600, 200));

        //create all element for frame withdraw
        JLabel labelWithdrawamount = new JLabel("ENTER WITHDRAW AMOUNT: ");
        labelWithdrawamount.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelWithdrawamount.setPreferredSize(new Dimension(300, 30));

        JTextField textWithdraw = new JTextField();
        textWithdraw.setBorder(null);
        textWithdraw.setPreferredSize(new Dimension(250, 30));
        textWithdraw.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelMoney = new JLabel("CHOOSE TYPE OF MONEY: ");
        labelMoney.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelMoney.setPreferredSize(new Dimension(300, 30));

        JRadioButton money50 = new JRadioButton("RM 50");
        JRadioButton money20 = new JRadioButton("RM 20");
        JRadioButton money10 = new JRadioButton("RM 10");

        money50.setPreferredSize(new Dimension(85, 40));
        money20.setPreferredSize(new Dimension(85, 40));
        money10.setPreferredSize(new Dimension(85, 40));

        //caculation for type of currency user choose
        money50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(textWithdraw.getText()) % 50 == 0) {
                    JOptionPane.showMessageDialog(null, "YOU WILL GIVEN RM 50 ONLY", "MONEY TYPE INFO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "YOU WILL GIVEN RM 50 AND BALANCE RM 10", "MONEY TYPE INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        money20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(textWithdraw.getText()) % 20 == 0) {
                    JOptionPane.showMessageDialog(null, "YOU WILL GIVEN RM 20 ONLY", "MONEY TYPE INFO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "YOU WILL GIVEN RM 20 AND BALANCE RM 10", "MONEY TYPE INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        money10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "YOU WILL GIVEN RM 10 ONLY", "MONEY TYPE INFO", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        ButtonGroup group = new ButtonGroup();
        group.add(money50);
        group.add(money20);
        group.add(money10);

        JLabel labelKeyword = new JLabel("ENTER SECURITY WORD: ");
        labelKeyword.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelKeyword.setPreferredSize(new Dimension(300, 30));

        JTextField textKeyword = new JTextField();
        textKeyword.setBorder(null);
        textKeyword.setPreferredSize(new Dimension(250, 30));
        textKeyword.setHorizontalAlignment(SwingConstants.CENTER);

        //button for withdraw
        //for start calculation
        JButton buttonWithdraw = new JButton("WITHDRAW");
        buttonWithdraw.setFocusable(false);
        buttonWithdraw.setFocusPainted(false);
        buttonWithdraw.setForeground(Color.WHITE);
        buttonWithdraw.setBackground(Color.RED);
        buttonWithdraw.setBorderPainted(false);
        buttonWithdraw.setPreferredSize(new Dimension(200, 40));
        buttonWithdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyword = textKeyword.getText();

                if (group.getSelection() != null) { //check user choose the currency type
                    if (Double.parseDouble(textWithdraw.getText()) > getAccountBalance()) {  //check the enough balance or not
                        JOptionPane.showMessageDialog(null, "YOUR BALANCE IS NOT ENOUGH, PLEASE ADD VALUE", "BALANCE ALERT", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (keyword.equals(getAccountKeyWord())) { //check input keyword same or not with user keyword
                            if (e.getSource() == buttonWithdraw) {
                                getCust().setWithdrawQuantity(getCust().getWithdrawQuantity() + 1); //add quantity of withdraw
                                withdrawFrame.dispose(); // Use to close the last window
                                setAccountBalance(getAccountBalance() - Double.parseDouble(textWithdraw.getText())); //making sub operation here
                                mainUserInterface(); //return main user frame after finish all caculation
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "YOUR USER KEYWORD IS WRONG", "KEYWORD ALERT", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "PLEASE SELECT TYPE OF CURRENCY", "CURRENCY TYPE", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });



        //add all element to frame
        topCenterCenterPanel.add(labelWithdrawamount);
        topCenterCenterPanel.add(textWithdraw);
        topCenterCenterPanel.add(labelKeyword);
        topCenterCenterPanel.add(textKeyword);

        bottomCenterCenterPanel.add(labelMoney);
        bottomCenterCenterPanel.add(money50);
        bottomCenterCenterPanel.add(money20);
        bottomCenterCenterPanel.add(money10);

        bottomCenterPanel.add(buttonWithdraw);

        centerCenterPanel.add(topCenterCenterPanel, BorderLayout.NORTH);
        centerCenterPanel.add(bottomCenterCenterPanel);
        centerPanel.add(topCenterPanel, BorderLayout.NORTH);
        centerPanel.add(bottomCenterPanel, BorderLayout.SOUTH);
        centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
        centerPanel.add(rightCenterPanel, BorderLayout.EAST);
        centerPanel.add(leftCenterPanel, BorderLayout.WEST);
        withdrawFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
        withdrawFrame.getContentPane().add(leftPanel, BorderLayout.WEST);
        withdrawFrame.getContentPane().add(rightPanel, BorderLayout.EAST);
        withdrawFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        withdrawFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        withdrawFrame.setVisible(true);
    }




}
