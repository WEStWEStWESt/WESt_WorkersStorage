/*
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FindFrame extends JFrame {

    private JLabel findBy, emptyText;
    private JComboBox choise;
    private JTextField findTextField;
    private JPanel leftPanel, rightPanel;
    private JButton find, clear, back;

    private JTable result;
    private String[] findHeader = WorkersTable.header;
    private static List<Worker> findWorker = new ArrayList<>();
    protected static FindTable findTable;

    FindFrame(){

        setSize(700,400);
        setTitle("Frame to Find");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        leftPanel = new JPanel();
        leftPanel.setBackground(Color.GRAY);
        leftPanel.setLayout(new GridLayout(10,1));


    */
/*----------------------------------------------*//*

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
    */
/*----------------------------------------------*//*


        rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(1,1));

        findTable = new FindTable(findWorker, findHeader);
        findTable.fireTableDataChanged();

        result = new JTable(findTable);

        rightPanel.add(new JScrollPane(result), BorderLayout.CENTER);

        this.add(rightPanel);

        setVisible(true);

    }

}
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FindFrame extends JFrame {
    private JLabel findBy;
    private JTextField findField;
    private JButton ok;
    private JButton clear;
    private JButton back;
    private JComboBox choice;

    private JTable results;
    private String[] header = WorkersTable.header;
    private List<Worker> findWorkers = new ArrayList<>();
    public static FindTable findWorkersTable;


    public FindFrame() {
        this.setSize(600, 400);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Find worker window");
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(10, 1));


        findBy = new JLabel("Найти по");
        choice = new JComboBox();
        choice.addItem("по имени");
        choice.addItem("по фамилии");
        choice.addItem("по номеру паспорта");

        findField = new JTextField();

        ok = new JButton("Найти");
        ok.setActionCommand("Find");
        //ok.addActionListener(this);
        clear = new JButton("Очистить");
        clear.setActionCommand("Clear");
        //clear.addActionListener(this);
        back = new JButton("Назад");
        back.setActionCommand("Back");
        //back.addActionListener(this);

        leftPanel.add(findBy);
        leftPanel.add(choice);
        leftPanel.add(findField);
        leftPanel.add(ok);
        leftPanel.add(clear);
        leftPanel.add(back);

        this.add(leftPanel, BorderLayout.WEST);

        JPanel rightPanel = new JPanel();

        rightPanel.setLayout(new GridLayout(1, 1));
        findWorkersTable = new FindTable(findWorkers, header);
        findWorkersTable.fireTableDataChanged();
        results = new JTable(findWorkersTable);

        rightPanel.add(new JScrollPane(results), BorderLayout.CENTER);

        this.add(rightPanel);
        setVisible(true);
    }



}
