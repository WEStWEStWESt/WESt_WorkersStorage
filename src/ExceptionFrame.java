import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExceptionFrame extends JFrame implements ActionListener {

    private JLabel exceptionText;
    private JButton button;

    ExceptionFrame(){
        setSize(400,130);
        setTitle("Ну что, накосячил :-) ???");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        setLayout(new GridLayout(2,1));

        exceptionText = new JLabel("Не все поля заполнены !!!");
        exceptionText.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel();
        button = new JButton(" Виноват, сейчас исправлюсь. ");
        button.addActionListener(this);
        panel.add(button);

        add(exceptionText, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
    }
}
