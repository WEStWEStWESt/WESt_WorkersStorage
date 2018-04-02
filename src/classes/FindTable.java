package classes;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class FindTable extends AbstractTableModel {

    public static String[] header;
    public static List<Worker> findWorkersList = new ArrayList<>();

    FindTable(List<Worker> findWorkers, String[] header) {
        this.findWorkersList = findWorkers;
        this.header = header;
    }

    public String getColumnName(int c) {
        return header[c];
    }

    public int getRowCount() {
        return findWorkersList.size();
    }

    public int getColumnCount() {
        return header.length;
    }

    public Object getValueAt(int r, int c) {
        switch (c) {
            case 0:
                return findWorkersList.get(r).getName();
            case 1:
                return findWorkersList.get(r).getSurname();
            case 2:
                return findWorkersList.get(r).getPassportNumber();
            default:
                return "";
        }
    }
}
