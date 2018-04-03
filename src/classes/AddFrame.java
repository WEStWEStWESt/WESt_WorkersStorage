package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFrame extends JFrame implements ActionListener{

    private JLabel nameLabel, surnameLabel, passportLabel;
    private JTextField nameTextField, surnameTextField, passportTextField;
    private JPanel buttonPanel;
    private JCheckBox toTXT, toBinary, toXML;
    private JButton OK, clear, cancel;

    public AddFrame(){

        this.setSize(450,300);
        this.setTitle("Frame to Add");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel panelForText = new JPanel();
        panelForText.setLayout(new GridLayout(6,1));

        nameLabel = new JLabel("ENTER NAME");
        nameTextField = new JTextField();
        surnameLabel = new JLabel("ENTER SURNAME");
        surnameTextField = new JTextField();
        passportLabel = new JLabel("ENTER PASSPORT NUMBER");
        passportTextField = new JTextField();

        panelForText.add(nameLabel);
        panelForText.add(nameTextField);
        panelForText.add(surnameLabel);
        panelForText.add(surnameTextField);
        panelForText.add(passportLabel);
        panelForText.add(passportTextField);
/*-------------------------------------------------------------*/
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(2,1));
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setLayout(new GridLayout(1,3));

        toTXT = new JCheckBox("save to TXT");
        toBinary = new JCheckBox("save to BINARY");
        toXML = new JCheckBox("save to XML");

        checkBoxPanel.add(toTXT);
        checkBoxPanel.add(toBinary);
        checkBoxPanel.add(toXML);

/*-------------------------------------------------------------*/
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,3));

        OK = new JButton("Add");
        OK.setActionCommand("Add");
        OK.addActionListener(this);
        clear = new JButton("Clear");
        clear.setActionCommand("Clear");
        clear.addActionListener(this);
        cancel = new JButton("Cancel");
        cancel.setActionCommand("Cancel");
        cancel.addActionListener(this);
        buttonPanel.add(OK);
        buttonPanel.add(clear);
        buttonPanel.add(cancel);

/*-------------------------------------------------------------*/
        add(panelForText, BorderLayout.CENTER);
        container.add(checkBoxPanel);
        container.add(buttonPanel);
        add(container, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)  {

        String command = e.getActionCommand();

        switch (command){
            case "Add":
                try{
                    if (!nameTextField.getText().equals("") ||
                            !surnameTextField.getText().equals("") ||
                            !passportTextField.getText().equals("")) {
                        WorkersTable.workersTable.add(
                                new Worker(nameTextField.getText(),
                                        surnameTextField.getText(),
                                        passportTextField.getText()));
                    }else {

                    }
                }catch(Exception e1){
                    System.out.println("11111111111111111111111111");
                }
                break;

            case "Clear":
                nameTextField.setText("");
                surnameTextField.setText("");
                passportTextField.setText("");
                break;
            case "Cancel":
                this.dispose();
                break;
        }
    }
}
