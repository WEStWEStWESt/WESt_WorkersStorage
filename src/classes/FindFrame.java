package classes;

import publics.ExceptionFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FindFrame extends JFrame implements ActionListener {

    private JLabel findBy, emptyText;
    private JComboBox choise;
    private JTextField findTextField;
    private JPanel leftPanel, rightPanel;
    private JButton find, clear, back;

    private JTable results;
    private String[] header = GeneralFrame.header;
    private List<Worker> findWorkers = new ArrayList<>();
    public static FindTable findWorkersTable;

    public FindFrame(){

        setSize(700,400);
        setTitle("Frame to Find");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        leftPanel = new JPanel();
        //leftPanel.setBackground(Color.GRAY);
        leftPanel.setLayout(new GridLayout(9,1));

//----------------------------------------------

        findBy = new JLabel();
        findBy.setText("Find by: ");

        choise = new JComboBox();
        choise.addItem("by NAME");
        choise.addItem("by SURNAME");
        choise.addItem("by PASSPORT NUMBER");

        findTextField = new JTextField();
        findTextField.setBackground(Color.ORANGE);

        //emptyText = new JLabel();
       // emptyText.setText("");

        find = new JButton();
        find.setText("Find");
        find.setActionCommand("Find");
        find.addActionListener(this);
        clear = new JButton();
        clear.setText("Clear");
        clear.setActionCommand("Clear");
        clear.addActionListener(this);
        back = new JButton();
        back.setText("Back");
        back.setActionCommand("Back");
        back.addActionListener(this);


        leftPanel.add(findBy);
        leftPanel.add(choise);
        leftPanel.add(findTextField);
       // leftPanel.add(emptyText);
        leftPanel.add(find);

        leftPanel.add(clear);
        leftPanel.add(back);

//----------------------------------------------

       this.add(leftPanel, BorderLayout.WEST);

        rightPanel = new JPanel();

        rightPanel.setLayout(new GridLayout(1, 1));
        findWorkersTable = new FindTable(findWorkers, header);
        findWorkersTable.fireTableDataChanged();
        results = new JTable(findWorkersTable);

        rightPanel.add(new JScrollPane(results), BorderLayout.CENTER);

        this.add(rightPanel);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int choiceIndex = choise.getSelectedIndex();
        String temp = e.getActionCommand();
        switch (temp){
            case "Find":
                if(choiceIndex == 0 ){
                    findByName();
                }
                if(choiceIndex == 1){
                    findBySurname();
                }
                if(choiceIndex == 2){

                }
                break;
            case "Clear":
                findTextField.setText("");
                findWorkers.clear();
                findWorkersTable.fireTableDataChanged();
                break;
            case "Back":
                this.dispose();
                break;
            default:
                this.dispose();
                break;
        }
    }

    private void findByName() {
        if (!findWorkers.isEmpty()) {
            findWorkers = new ArrayList<>();
            System.out.println("newArray");
        }

        String name = findTextField.getText();
        System.out.println(name);

        for (int i = 0; i < WorkersTable.workersTable.size(); i++) {
            if (WorkersTable.workersTable.get(i).getName().equals(name)) {
                findWorkers.add(WorkersTable.workersTable.get(i));
                System.out.println("22222");
            }
        }

        if ( findTextField.getText().equals("") ) {
            new ExceptionFrame("Пустое поле!\n" + "Введите ИМЯ для поиска.");
            System.out.println("textField");
        }

        findWorkersTable.fireTableDataChanged();

    }
    private void findBySurname() {
        if (!findWorkers.isEmpty()) {
            findWorkers = new ArrayList<>();
        }
        String surname = findTextField.getText();
        for (int i = 0; i < WorkersTable.workersTable.size(); i++) {
            if (WorkersTable.workersTable.get(i).getSurname().equals(surname)) {
                findWorkers.add(WorkersTable.workersTable.get(i));
            }
        }
        findWorkersTable.fireTableDataChanged();
        /*if (findTextField.getText().equals("") ) {
            new ExceptionFrame("Введите ФАМИЛИЮ для поиска.");
        }else if(findWorkers.isEmpty()){
            new ExceptionFrame("Рабочего с такой фамилией НЕ НАЙДЕНО.");
        }*/
    }
}
