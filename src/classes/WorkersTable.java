package classes;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.*;

public class WorkersTable extends AbstractTableModel {

    public static String[] header ;
    public static List<Worker> workersTable = new ArrayList<>();

    WorkersTable(List<Worker> workersTable, String[] header ){

        this.workersTable = workersTable;
        this.header = header;

        workersTable.add(new Worker("qqq","yy","123"));
        workersTable.add(new Worker("aaa","ddd","444"));
        workersTable.add(new Worker("qqq","yy","1111111"));
        workersTable.add(new Worker("hhh","jjj","666"));
    }

    public String getColumnName(int c){
        return header[c];
    }

    @Override
    public int getRowCount() {
        return workersTable.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return workersTable.get(rowIndex).getName();
            case 1:
                return workersTable.get(rowIndex).getSurname();
            case 2:
                return workersTable.get(rowIndex).getPassportNumber();
            default:
                return "";
        }
    }
}
