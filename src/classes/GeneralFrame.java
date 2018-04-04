package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GeneralFrame extends JFrame implements ActionListener {

    private JPanel buttonPanel, tablePanel;
    private JButton addWorker, findWorker, changeWorker, deleteWorker , close;

    private JTable table;
    public final static String[] header =  {"NAME","SURNAME","PASSPORT"};
    public static WorkersTable workersTable;

    public GeneralFrame(List<Worker> all){

        this.setSize(800,400);
        this.setTitle("General Window");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6,1));

        addWorker = new JButton("ADD worker");
        addWorker.setActionCommand("add");
        addWorker.addActionListener(this);
        //addWorker.setBackground(Color.ORANGE);
        findWorker = new JButton("FIND worker");
        findWorker.setActionCommand("find");
        findWorker.addActionListener(this);
        //findWorker.setBackground(Color.PINK);
        changeWorker = new JButton("CHANGE worker");
        changeWorker.setActionCommand("change");
        changeWorker.addActionListener(this);
        //changeWorker.setBackground(Color.YELLOW);
        deleteWorker = new JButton("DELETE worker");
        deleteWorker.setActionCommand("delete");
        deleteWorker.addActionListener(this);
        //deleteWorker.setBackground(Color.RED);
        close = new JButton("<<< CLOSE >>>");
        close.setActionCommand("close");
        close.addActionListener(this);

        buttonPanel.add(addWorker);
        buttonPanel.add(findWorker);
        buttonPanel.add(changeWorker);
        buttonPanel.add(deleteWorker);
        buttonPanel.add(close);
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
/*----------------------------------------------------------*/
    @Override
    public void actionPerformed(ActionEvent e) {
        String act = e.getActionCommand();
        switch (act){
            case "add":
                new AddFrame();
                break;
            case "find":
                new FindFrame();
                break;
            case "change":
                /*int changed = table.getSelectedRow();
                if (changed > -1){
                    Worker.class.getConstructors();
                }else {

                }*/
                break;
            case "delete":
                int selRow = table.getSelectedRow();
                if (selRow > -1){
                    WorkersTable.workersTable.remove(selRow);
                    workersTable.fireTableDataChanged();
                }else {
                    new DeleteFrame();
                }
                break;
            case "close":
                this.dispose();
                break;
                default:
                    this.dispose();
                    System.out.println("default " +  "\"" + "GENERAL FRAME" + "\"");
                break;
        }
    }
}
