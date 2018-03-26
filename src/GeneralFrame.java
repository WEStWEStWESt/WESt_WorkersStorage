import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GeneralFrame extends JFrame implements ActionListener {

    private JPanel buttonPanel, tablePanel;
    private JButton addWorker, findWorker, changeWorker, deleteWorker ;

    private JTable table;
    public final static String[] header =  {"NAME","SURNAME","PASSPORT"};
    public static WorkersTable workersTable;

    GeneralFrame(List<Worker> all){

        this.setSize(800,400);
        this.setTitle("General Window");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        //this.setLocationRelativeTo(null);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,1));

        addWorker = new JButton("ADD worker");
        //addWorker.setBackground(Color.ORANGE);
        findWorker = new JButton("FIND worker");
        //findWorker.setBackground(Color.PINK);
        changeWorker = new JButton("CHANGE worker");
        //changeWorker.setBackground(Color.YELLOW);
        deleteWorker = new JButton("DELETE worker");
        //deleteWorker.setBackground(Color.RED);

        buttonPanel.add(addWorker);
        buttonPanel.add(findWorker);
        buttonPanel.add(changeWorker);
        buttonPanel.add(deleteWorker);
/*----------------------------------------------------------*/
        tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(1, 1));
        this.tablePanel.setBackground(Color.GRAY);
        workersTable = new WorkersTable(all , header);
        workersTable.fireTableDataChanged();

        table = new JTable(workersTable);

        tablePanel.add(new JScrollPane(table)/*, BorderLayout.CENTER*/);
/*----------------------------------------------------------*/

        this.add(buttonPanel, BorderLayout.EAST);
        this.add(tablePanel, BorderLayout.CENTER);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
