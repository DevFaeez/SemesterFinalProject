import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public void MainFrameUI() {
        initialize();
    }

    public void initialize() {
        //create frame and panel
        JFrame frame1 = new JFrame();
        frame1.setTitle("ONE CAPITAL BANK");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(900, 700);
        frame1.setLocationRelativeTo(null);
        frame1.setLayout(new BorderLayout());
        frame1.setResizable(false);

        Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
        ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
        ImageIcon background = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");

        frame1.setIconImage(image1.getImage());

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

        Border topPadding = BorderFactory.createEmptyBorder(00, 700, 00, 00);


        JPanel rightCenterPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //rightCenterPanel.setBorder(topPadding);
        rightCenterPanel.setBackground(Color.RED);
        rightCenterPanel.setPreferredSize(new Dimension(410, 250));

        JPanel leftCenterPanel = new JPanel();
        leftCenterPanel.setBackground(new Color(15, 122, 234,255));
        leftCenterPanel.setPreferredSize(new Dimension(290, 250));

        Border lineBorder = BorderFactory.createLineBorder(Color.RED, 4);
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border compoundBorder = BorderFactory.createCompoundBorder(lineBorder, emptyBorder);

        ImageIcon logInLogo = new ImageIcon("D:\\UITM\\CSC 186\\FINAL ASSINGMENT\\Main\\src\\login logo.png");

        //create all element in this frame
        JLabel labelLOGINtext = new JLabel("    LOGIN");
        labelLOGINtext.setFont(new Font("Verdana", Font.BOLD, 32));

        JLabel paddingLabel = new JLabel();
        paddingLabel.setPreferredSize(new Dimension(300, 60));
        paddingLabel.setBorder(topPadding);

        JLabel paddingLabel2 = new JLabel();
        paddingLabel2.setPreferredSize(new Dimension(300, 30));
        paddingLabel2.setBorder(topPadding);


        JLabel labelAcccountNumber = new JLabel();
        labelAcccountNumber.setText("Username: ");
        labelAcccountNumber.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelAcccountNumber.setPreferredSize(new Dimension(300, 30));

        JTextField textAccountNumber = new JTextField(20);
        textAccountNumber.setBorder(null);
        textAccountNumber.setPreferredSize(new Dimension(300, 30));
        textAccountNumber.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelPassword = new JLabel();
        labelPassword.setText("Password: ");
        labelPassword.setFont(new Font("Monospaced", Font.BOLD, 18));
        labelPassword.setPreferredSize(new Dimension(300, 30));

        JPasswordField passwordFieldPassword = new JPasswordField(20);
        passwordFieldPassword.setEchoChar('*');
        passwordFieldPassword.setBorder(null);
        passwordFieldPassword.setPreferredSize(new Dimension(300, 30));
        passwordFieldPassword.setHorizontalAlignment(SwingConstants.CENTER);

        JButton logInButton = new JButton();
        logInButton.setText("Log In");
        logInButton.setFocusable(false);
        logInButton.setForeground(Color.RED);
        logInButton.setBackground(Color.WHITE);
        logInButton.setPreferredSize(new Dimension(200, 40));
        logInButton.setBorder(null);
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame1.dispose();
                String userName = textAccountNumber.getText(); //convert textAccountNumber to String
                String passwordd = new String(passwordFieldPassword.getPassword()); //convert password to String and can readble

                Account[] customerAccount = new Account[1000];
                Customer[] cust = new Customer[1000];

                String filePath = "D:\\JAVA ASSIGNMENT\\Main\\src\\userData.txt"; //file path for file userData [replace the file path first]
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
                    for (int i = 0; i < 10; i++) {  //loop all data from file
                        String line = bufferedReader.readLine();
                        if (line != null) {  //test to confirm line in file not null
                            StringTokenizer tokenizer = new StringTokenizer(line, ":"); //setup tokenizer and using delimeter ":" to devide all data
                            if (tokenizer.countTokens() == 8) { //test data in every line enough data

                                //devide all data from file into their own variable
                                String username = tokenizer.nextToken();
                                String password = tokenizer.nextToken();
                                 String fullname = tokenizer.nextToken();
                                String keyword = tokenizer.nextToken();
                                String icNumber = tokenizer.nextToken();
                                String phoneNumber = tokenizer.nextToken();
                                long accountNumber = Long.parseLong(tokenizer.nextToken());
                                double balance = Double.parseDouble(tokenizer.nextToken());

                                if (i == 9 && ((!userName.equals(username)) || (!passwordd.equals(password)))) {  //if input username or input password did not exist in any customer in file then system will dispose
                                    JOptionPane.showMessageDialog(null, "INVALID USERNAME OR PASSWORD \nPLEASE RESTART THE PROGRAM AGAIN", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                                }

                                if (userName.equals(username) && passwordd.equals(password)) {
                                    int setIndexUser = i; //set customer index

                                    //create all frame and panel
                                    JFrame trasactionTypeFrame = new JFrame();
                                    trasactionTypeFrame.setTitle("ONE CAPITAL BANK");
                                    trasactionTypeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    trasactionTypeFrame.setSize(900, 700);
                                    trasactionTypeFrame.setLocationRelativeTo(null);
                                    trasactionTypeFrame.setLayout(new BorderLayout());
                                    trasactionTypeFrame.setResizable(false);

                                    Border border = BorderFactory.createLineBorder(Color.RED, 2); //make border
                                    ImageIcon image1 = new ImageIcon("D:\\JAVA ASSIGNMENT\\Main\\src\\bank logo.png");
                                    trasactionTypeFrame.setIconImage(image1.getImage());

                                    JPanel centerPanel = new JPanel(new BorderLayout());
                                    centerPanel.setBackground(Color.WHITE);
                                    centerPanel.setPreferredSize(new Dimension(300, 500));

                                    JPanel  topPanel = new JPanel();
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

                                    JPanel centerCenterPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                                    centerCenterPanel.setBackground(new Color(15, 122, 234,255));
                                    centerCenterPanel.setPreferredSize(new Dimension(600, 330));

                                    JPanel rightCenterPanel = new JPanel();
                                    rightCenterPanel.setBackground(new Color(15, 122, 234,255));
                                    rightCenterPanel.setPreferredSize(new Dimension(50, 330));

                                    JPanel leftCenterPanel = new JPanel();
                                    leftCenterPanel.setBackground(new Color(15, 122, 234,255));
                                    leftCenterPanel.setPreferredSize(new Dimension(50, 330));

                                    //button for physical trasaction
                                    //FIRST POLYMORPHISM for class PhysicalTrasaction
                                    JButton buttonPhysicalTrasaction = new JButton("PHYSICAL TRNSACTION");
                                    buttonPhysicalTrasaction.setFocusable(false);
                                    buttonPhysicalTrasaction.setFocusPainted(false);
                                    buttonPhysicalTrasaction.setForeground(Color.WHITE);
                                    buttonPhysicalTrasaction.setBackground(Color.RED);
                                    buttonPhysicalTrasaction.setBorderPainted(false);
                                    buttonPhysicalTrasaction.setPreferredSize(new Dimension(310, 80));
                                    buttonPhysicalTrasaction.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            trasactionTypeFrame.dispose();

                                            cust[setIndexUser] = new Customer(username, password);
                                            cust[setIndexUser].setCustomerIndex(setIndexUser + 1);
                                            customerAccount[setIndexUser] = new PhysicalTrasaction(fullname, keyword, icNumber, phoneNumber, accountNumber, balance, cust[setIndexUser]);
                                            customerAccount[setIndexUser].mainUserInterface();
                                        }
                                    });

                                    //button for digital trasaction
                                    //FIRST POLYMORPHISM for class DigitalTransaction
                                    JButton buttonDigitalTrsaction = new JButton("DIGITAL TRSACTION");
                                    buttonDigitalTrsaction.setFocusable(false);
                                    buttonDigitalTrsaction.setFocusPainted(false);
                                    buttonDigitalTrsaction.setForeground(Color.WHITE);
                                    buttonDigitalTrsaction.setBackground(Color.RED);
                                    buttonDigitalTrsaction.setBorderPainted(false);
                                    buttonDigitalTrsaction.setPreferredSize(new Dimension(310, 80));
                                    buttonDigitalTrsaction.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            trasactionTypeFrame.dispose();
                                            cust[setIndexUser] = new Customer(username, password);
                                            cust[setIndexUser].setCustomerIndex(setIndexUser + 1);
                                            customerAccount[setIndexUser] = new DigitalTransaction(fullname, keyword, icNumber, phoneNumber, accountNumber, balance, cust[setIndexUser]);
                                            customerAccount[setIndexUser].mainUserInterface();
                                        }
                                    });

                                    centerCenterPanel.add(buttonDigitalTrsaction);
                                    centerCenterPanel.add(buttonPhysicalTrasaction);

                                    centerPanel.add(topCenterPanel, BorderLayout.NORTH);
                                    centerPanel.add(bottomCenterPanel, BorderLayout.SOUTH);
                                    centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
                                    centerPanel.add(rightCenterPanel, BorderLayout.EAST);
                                    centerPanel.add(leftCenterPanel, BorderLayout.WEST);
                                    trasactionTypeFrame.getContentPane().add(topPanel, BorderLayout.NORTH);
                                    trasactionTypeFrame.getContentPane().add(leftPanel, BorderLayout.WEST);
                                    trasactionTypeFrame.getContentPane().add(rightPanel, BorderLayout.EAST);
                                    trasactionTypeFrame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
                                    trasactionTypeFrame.getContentPane().add(centerPanel, BorderLayout.CENTER);
                                    trasactionTypeFrame.setVisible(true);



                                    break;
                                }

                            } else {
                                System.out.println("Invalid data format on line " + (i + 1));
                            }
                        } else {
                            System.out.println("File doesn't contain enough data");
                            break;
                        }
                    }


                } catch (IOException ioe) {
                    System.out.println("Error reading the file: " + ioe.getMessage());
                }


            }
        });

        JLabel labelLogIn = new JLabel();
        labelLogIn.setIcon(logInLogo);
        labelLogIn.setPreferredSize(new Dimension(220, 220));

        JButton logInButtonLeft = new JButton();
        logInButtonLeft.setText("Log In");
        logInButtonLeft.setFocusable(false);
        logInButtonLeft.setForeground(Color.RED);
        logInButtonLeft.setBackground(Color.WHITE);
        logInButtonLeft.setBorderPainted(false);
        logInButtonLeft.setPreferredSize(new Dimension(200, 40));

        JButton registerButtonLeft = new JButton();
        registerButtonLeft.setText("Register");
        registerButtonLeft.setFocusable(false);
        registerButtonLeft.setFocusPainted(false);
        registerButtonLeft.setForeground(Color.WHITE);
        registerButtonLeft.setBackground(Color.RED);
        registerButtonLeft.setBorderPainted(false);
        registerButtonLeft.setPreferredSize(new Dimension(200, 40));
        registerButtonLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Register is under maintenance", "Register reminder", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        //add all element to frame
        leftCenterPanel.add(paddingLabel2);
        leftCenterPanel.add(labelLogIn);
        leftCenterPanel.add(logInButtonLeft);
        leftCenterPanel.add(registerButtonLeft);

        rightCenterPanel.add(paddingLabel);
        rightCenterPanel.add(labelLOGINtext);
        rightCenterPanel.add(labelAcccountNumber);
        rightCenterPanel.add(textAccountNumber);
        rightCenterPanel.add(labelPassword);
        rightCenterPanel.add(passwordFieldPassword);
        rightCenterPanel.add(paddingLabel2);
        rightCenterPanel.add(logInButton);

        centerPanel.add(rightCenterPanel, BorderLayout.EAST);
        centerPanel.add(leftCenterPanel, BorderLayout.WEST);
        frame1.getContentPane().add(centerPanel, BorderLayout.CENTER);
        frame1.getContentPane().add(topPanel, BorderLayout.NORTH);
        frame1.getContentPane().add(leftPanel, BorderLayout.WEST);
        frame1.getContentPane().add(rightPanel, BorderLayout.EAST);
        frame1.getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        frame1.setVisible(true);
    }

    public static void main(String[] args) {

        // This code schedules the creation and initialization of the Main frame on the Event Dispatch Thread (EDT) using SwingUtilities.invokeLater().
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.MainFrameUI();
            }
        });

    }
}

