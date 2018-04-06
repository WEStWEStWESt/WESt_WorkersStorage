package publics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YesNoFrame extends JFrame implements ActionListener {

    private JLabel warningText;
    private JButton yes, no;
    public static boolean b;

    public YesNoFrame(String string){
        setSize(400,130);
        setTitle("Теперь выбирай...");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        setLayout(new GridLayout(2,1));

        warningText = new JLabel(string, SwingConstants.CENTER);

        JPanel panel = new JPanel();
        yes = new JButton("YES");
        yes.addActionListener(this);
        no = new JButton("NO");
        no.addActionListener(this);

        panel.add(yes);
        panel.add(no);

        add(warningText, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String str = e.getActionCommand();
        switch (str){
            case "YES":
                b = true;
                this.dispose();
                break;
            case "NO":
                b = false;
                this.dispose();
                break;

        }

    }
}
