import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class GeneralFrame extends JFrame {

    private JPanel buttonPanel, tablePanel;
    private JButton addWorker, findWorker, changeWorker, deleteWorker ;

    private JTable table;
    //private final static String[] header =  {"NAME","SURNAME","PASSPORT"};

    GeneralFrame(){

        this.setSize(800,400);
        this.setTitle("General Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        tablePanel = new JPanel();
        this.tablePanel.setBackground(Color.GRAY);






        this.add(buttonPanel, BorderLayout.EAST);
        this.add(tablePanel, BorderLayout.CENTER);

        setVisible(true);


    }


}
