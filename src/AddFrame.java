import javax.swing.*;
import java.awt.*;

public class AddFrame extends JFrame {

    //private JLabel nameLabel, surnameLabel, passportLabel;
    //private JTextField nameTextField, surnameTextField, passportTextField;
   // private JPanel panelForText, panelForButton;
    private JCheckBox toTXT, toBinary, toXML;
    private JButton OK, clear, cancel;

    AddFrame(){

        this.setSize(450,300);
        this.setTitle("Frame to Add");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel panelForText = new JPanel();
        panelForText.setLayout(new GridLayout(6,1));

        JLabel nameLabel = new JLabel("ENTER NAME");
        JTextField nameTextField = new JTextField();
        JLabel surnameLabel = new JLabel("ENTER SURNAME");
        JTextField surnameTextField = new JTextField();
        JLabel passportLabel = new JLabel("ENTER PASSPORT NUMBER");
        JTextField passportTextField = new JTextField();

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
        JButton buttonPanel = new JButton();
        buttonPanel.setLayout(new GridLayout(1,3));

        OK = new JButton("Add");
        //OK.setActionCommand("ADDED");
        //OK.addActionListener(this);
        clear = new JButton("Clear");
        cancel = new JButton("Cancel");
        buttonPanel.setText("---------!!!!!!!!!!------------");
        buttonPanel.add(OK);
        buttonPanel.add(clear);
        buttonPanel.add(cancel);


/*-------------------------------------------------------------*/
        add(panelForText, BorderLayout.CENTER);
        container.add(checkBoxPanel);
        container.add(buttonPanel);
        add(container, BorderLayout.SOUTH);
      //  add(buttonPanel, BorderLayout.SOUTH);


        setVisible(true);
    }

}
