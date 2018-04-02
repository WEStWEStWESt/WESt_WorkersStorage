package classes;

import javax.swing.*;
import java.awt.*;

public class DeleteFrame extends JFrame {

    private JLabel nameLabel, surnameLabel, passportLabel;
    private JTextField nameTextField, surnameTextField, passportTextField;
    private JPanel buttonPanel, panelForText, panelForButton;

    private JButton OK, clear, cancel;

    public DeleteFrame(){

        this.setSize(450,300);
        this.setTitle("Frame to Delete");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

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

       /*-------------------------------------------------------------*/
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,3));

        OK = new JButton("Delete");
        //OK.setActionCommand("ADDED");
        //OK.addActionListener(this);
        clear = new JButton("Clear");
        cancel = new JButton("Cancel");
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

}
