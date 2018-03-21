import javax.swing.*;
import java.awt.*;

public class FindFrame extends JFrame {

    private JLabel findBy, emptyText;
    private JComboBox choise;
    private JTextField findTextField;
    private JPanel leftPanel, rightPanel;
    private JButton find, clear, back;

    FindFrame(){

        setSize(700,400);
        setTitle("Frame to Find");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

        leftPanel = new JPanel();
        leftPanel.setBackground(Color.GRAY);
        leftPanel.setLayout(new GridLayout(10,1));


    /*----------------------------------------------*/
        findBy = new JLabel();
        findBy.setText("Find by: ");

        choise = new JComboBox();
        choise.addItem("by NAME");
        choise.addItem("by SURNAME");
        choise.addItem("by PASSPORT NUMBER");

        findTextField = new JTextField();
        findTextField.setBackground(Color.PINK);

        emptyText = new JLabel();
        emptyText.setText("");

        find = new JButton();
        find.setText("Find");
        clear = new JButton();
        clear.setText("Clear");
        back = new JButton();
        back.setText("Back");


        leftPanel.add(findBy);
        leftPanel.add(choise);
        leftPanel.add(findTextField);
        leftPanel.add(emptyText);
        leftPanel.add(find);
        leftPanel.add(clear);
        leftPanel.add(back);
    /*----------------------------------------------*/


        this.add(leftPanel, BorderLayout.WEST);

        setVisible(true);

    }

}
