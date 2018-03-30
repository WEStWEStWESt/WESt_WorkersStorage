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
    private JButton find, clearText, clearTable, back;

    private JTable results;
    private String[] header = GeneralFrame.header;
    private List<Worker> findWorkers = new ArrayList<>();
    public static FindTable findWorkersTable;

    FindFrame(){

        setSize(700,400);
        setTitle("Frame to Find");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        leftPanel = new JPanel();
        //leftPanel.setBackground(Color.GRAY);
        leftPanel.setLayout(new GridLayout(10,1));

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
        clearText = new JButton();
        clearText.setText("Clear Text");
        clearText.setActionCommand("ClearText");
        clearText.addActionListener(this);
        clearTable = new JButton();
        clearTable.setText("Clear Table");
        clearTable.setActionCommand("ClearTable");
        clearTable.addActionListener(this);
        back = new JButton();
        back.setText("Back");
        back.setActionCommand("Back");
        back.addActionListener(this);


        leftPanel.add(findBy);
        leftPanel.add(choise);
        leftPanel.add(findTextField);
       // leftPanel.add(emptyText);
        leftPanel.add(find);
        leftPanel.add(clearText);
        leftPanel.add(clearTable);
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

                }
                if(choiceIndex == 2){

                }
                break;
            case "ClearText":
                findTextField.setText("");
                break;
            case "ClearTable":
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

    private void findByName(){
        if (!findWorkers.isEmpty()){
            findWorkers = new ArrayList<>();
        }
        String name = findTextField.getText();
        if (!findTextField.getText().equals("")){
            for (int i = 0; i < WorkersTable.workerList.size(); i++){
                if (WorkersTable.workerList.get(i).getName().equals(name)){
                    findWorkers.add(WorkersTable.workerList.get(i));
                }else {
                   throw new IllegalArgumentException("Рабочего с таким именем в базе нет");
                }
            }
                findWorkersTable.fireTableDataChanged();
        }else{
            try {
                new ExceptionFrame();
            } catch (Exception e) {
                new Exception(e.getMessage());
            }
        }

    }
}
