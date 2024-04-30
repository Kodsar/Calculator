import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame implements ActionListener {
    private myPanel langPanel, loginPanel, mainPanel,transferPanel,changePassPanel,BalancePanel,EndOPanel,withdrawPanel;
    private JTextField passwordField,transferAField,transferBField,changePassField,withdrawField;
    private myButton  changePasswordBtn, checkBalanceBtn,transferBtn, withdrawBtn, loginBtn,FarsiB,EngB, EndB, newPassB,EndOB,BackB;

    private double balance = 1000.00;
    private String password = "1234"; // Default password
    private String[] lang;
    private int num =0;
    private String[] FarsiLang = {"رمز خود را وارد کنید","ورود","ورود با موفقیت انجام شد!","تایید","تغییر رمز","اعلام موجودی","برداشت وجه","کارت به کارت","رمز جدید را وارد کنید:","تایید","کنسل","موجودی حساب شما:","ریال","کارت مقصد را وارد کنید:","مبلغ انتقالی را وارد کنید:","OK","این عملیات قبلا انجام شده است.","عملیات با موفقیت انجام شد.","بازگشت","رمز جدید را وارد کنید:","اتمام عملیات","برداشتن کارت","موجودی شما : 550000000 ریال","مبلغ برداشتی را وارد کنید: "};
    private String[] EngLang = {"Enter Password:","login","Login Successful!","OK","Change Password","Check Balance","Withdraw","Transfer","Enter New Password:","OK","Cancel","Your balance is:","$","Enter The Destination Card:","Enter The Transfer Amount","OK","Nope","Operation Successful","Back","Enter New Password"," ",""," Your Balance is 1000$","Enter the Withrawal amount:"};

    public ATM() {
        setTitle("ATM");
        setSize(700, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("ATM3.png");
        this.setIconImage(image.getImage());



        // Language Panel
        langPanel = new myPanel();
        langPanel.setLayout(null); // Use null layout for explicit positioning

        FarsiB = new myButton("فارسی");
        EngB = new myButton("English");
        myLabel FarsiLangLabel = new myLabel("زبان خود را انتخاب کنید ");
        myLabel EngLangLabel = new myLabel("Choose Your Language");

        FarsiLangLabel.setBounds(450, 350, 200, 50);
        EngLangLabel.setBounds(115, 350, 200, 50);
        FarsiB.setBounds(580, 360, 100, 30);
        EngB.setBounds(5, 360, 100, 30);

        FarsiB.addActionListener(this);
        EngB.addActionListener(this);

        myLabel imageL = new myLabel(" ");
        imageL.setBounds(270, 50, 200, 200);


        langPanel.add(FarsiB);
        langPanel.add(EngB);
        langPanel.add(imageL);

        langPanel.add(FarsiLangLabel);
        langPanel.add(EngLangLabel);




        add(langPanel);
        setVisible(true);


    }

    public static void main(String[] args) {
        new ATM();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == FarsiB || e.getSource() == EngB) {
            if (e.getSource() == FarsiB) {
                lang = FarsiLang;
                remove(langPanel);
            }
            if (e.getSource() == EngB) {
                lang = EngLang;
                remove(langPanel);
            }

            EndB = new myButton(lang[3]);
            EndB.setBounds(250, 400, 100, 20);
            EndB.addActionListener(this);

            BackB = new myButton(lang[18]);
            BackB.setBounds(150, 400, 100, 20);
            BackB.addActionListener(this);

            // Login Panel
            loginPanel = new myPanel();
            myLabel passwordLabel = new myLabel(lang[0]);
            passwordLabel.setBounds(270, 270, 200, 20);
            passwordField = new JTextField(10);
            passwordField.setBounds(270, 300, 100, 20);

            loginBtn = new myButton(lang[1]);
            loginBtn.setBounds(270, 350, 100, 20);
            loginBtn.addActionListener(this);

            loginPanel.add(passwordLabel);
            loginPanel.add(passwordField);
            loginPanel.add(loginBtn);

            // Main Panel
            mainPanel = new myPanel();
            changePasswordBtn = new myButton(lang[4]);
            checkBalanceBtn = new myButton(lang[5]);
            transferBtn = new myButton(lang[7]);
            withdrawBtn = new myButton(lang[6]);

            changePasswordBtn.addActionListener(this);
            checkBalanceBtn.addActionListener(this);
            transferBtn.addActionListener(this);
            withdrawBtn.addActionListener(this);

            changePasswordBtn.setBounds(270, 150, 150, 30);
            checkBalanceBtn.setBounds(270, 250, 150, 30);
            transferBtn.setBounds(270, 350, 150, 30);
            withdrawBtn.setBounds(270, 450, 150, 30);

            mainPanel.add(changePasswordBtn);
            mainPanel.add(checkBalanceBtn);
            mainPanel.add(transferBtn);
            mainPanel.add(withdrawBtn);
            myButton EndB1,EndB2,EndB3, EndB4,BackB1 ,BackB2 ,BackB3 ,BackB4;
            EndB1 = new myButton(lang[3]);
            EndB2 =new myButton(lang[3]);
            EndB3 = new myButton(lang[3]);
            EndB4 =new myButton(lang[3]);
            BackB1 = new myButton(lang[18]);
            BackB2 =new myButton(lang[18]);
            BackB3 =new myButton(lang[18]);
            BackB4 = new myButton(lang[18]);




            //changePassPanel

            EndB1.setBounds(300, 500, 100, 20);
            EndB1.addActionListener(this);
            BackB1.setBounds(200, 500, 100, 20);
            BackB1.addActionListener(this);

            changePassPanel = new myPanel();
            myLabel changePassLabel = new myLabel(lang[19]);
            changePassLabel.setBounds(270, 270, 200, 20);
            changePassField = new JTextField(10);
            changePassField.setBounds(270, 300, 100, 20);


            changePassPanel.add(changePassLabel);
            changePassPanel.add(changePassField);
            changePassPanel.add(EndB1);
            changePassPanel.add(BackB1);

            //checkBalance
            EndB2.setBounds(300, 500, 100, 20);
            EndB2.addActionListener(this);
            BackB2.setBounds(200, 500, 100, 20);
            BackB2.addActionListener(this);

            BalancePanel = new myPanel();
            myLabel BalanceLabel = new myLabel(lang[22]);
            BalanceLabel.setBounds(230, 250, 200, 20);
            BalancePanel.add(BalanceLabel);
            BalancePanel.add(EndB2);
            BalancePanel.add(BackB2);


            //transferPanel
            EndB3.setBounds(300, 500, 100, 20);
            EndB3.addActionListener(this);
            BackB3.setBounds(200, 500, 100, 20);
            BackB3.addActionListener(this);

            transferPanel = new myPanel();
            myLabel transferALabel = new myLabel(lang[13]);
            transferALabel.setBounds(270, 190, 200, 20);
            transferAField = new JTextField(20);
            transferAField.setBounds(270, 220, 100, 20);


            myLabel transferBLabel = new myLabel(lang[14]);
            transferBLabel.setBounds(270, 270, 200, 20);
            transferBField = new JTextField(20);
            transferBField.setBounds(270, 300, 100, 20);


            transferPanel.add(EndB3);
            transferPanel.add(BackB3);
            transferPanel.add(transferALabel);
            transferPanel.add(transferAField);
            transferPanel.add(transferBLabel);
            transferPanel.add(transferBField);



            //withdrawPanel

            EndB4.setBounds(300, 500, 100, 20);
            EndB4.addActionListener(this);
            BackB4.setBounds(200, 500, 100, 20);
            BackB4.addActionListener(this);

            withdrawPanel = new myPanel();
            myLabel withdrawLabel = new myLabel(lang[23]);
            withdrawLabel.setBounds(270, 270, 200, 20);
            withdrawField = new JTextField(10);
            withdrawField.setBounds(270, 300, 100, 20);


            withdrawPanel.add(withdrawLabel);
            withdrawPanel.add(withdrawField);
            withdrawPanel.add(EndB4);
            withdrawPanel.add(BackB4);

            //EndOPanel
            EndOPanel = new myPanel();
            myLabel EndOLabel = new myLabel(lang[17]);
            EndOLabel.setBounds(270, 250, 200, 20);

            /*
            EndOB = new myButton(lang[15]);

            EndOB.setBounds(250, 350, 100, 20);
            EndOB.addActionListener(this);
            */
            EndOPanel.add(EndOLabel);
            EndOPanel.add(BackB);

            add(loginPanel);
            revalidate();
            repaint();
        }
        if (e.getSource() == loginBtn) {
            String inputPassword = passwordField.getText();
                JOptionPane.showMessageDialog(this, lang[2]);
                remove(loginPanel);
                add(mainPanel);
                revalidate();
                repaint();
        } else if (e.getSource() == transferBtn) {
            // Code for transfer
            //JOptionPane.showMessageDialog(this, lang[15]);
            remove(mainPanel);
            num=3;
            add(transferPanel);
            revalidate();
            repaint();


        } else if (e.getSource() == EndOB) {
            remove(transferPanel);
            add(EndOPanel);
            revalidate();
            repaint();
        }else if (e.getSource() == changePasswordBtn) {
            remove(mainPanel);
            num=1;
            add(changePassPanel);
            revalidate();
            repaint();
        }else if (e.getSource() == withdrawBtn) {
            remove(mainPanel);
            num=4;
            add(withdrawPanel);
            revalidate();
            repaint();
        }else if (e.getSource() == checkBalanceBtn) {
            remove(mainPanel);
            num=2;
            add(BalancePanel);
            revalidate();
            repaint();
        } else if (e.getActionCommand().equals(lang[18])) {
            if (num == 1) {
                remove(changePassPanel);
            } else if (num == 2) {
                remove(BalancePanel);

            } else if (num == 3) {
                remove(transferPanel);
            } else if (num == 4) {
                remove(withdrawPanel);
            }else if (num == 5) {
                remove(EndOPanel);
            }
            add(mainPanel);
            revalidate();
            repaint();
        }else if (e.getActionCommand().equals(lang[3])) {
                if(num==1){
                    remove(changePassPanel);
                }else if(num==2){
                    remove(BalancePanel);

                }else if(num==3){
                    remove(transferPanel);
                }else if(num==4){
                    remove(withdrawPanel);
                }

                num=5;
                add(EndOPanel);
                revalidate();
                repaint();
        }
    }
}










