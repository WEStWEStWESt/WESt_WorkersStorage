/*
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class FindTable extends AbstractTableModel {

    public static String[] findHeader;
    public static List<Worker> findWorker = new ArrayList<>();

    FindTable( List<Worker> findWorker, String[] findHeader ) {
        this.findWorker = findWorker;
        this.findHeader = findHeader;

    }

    public  String getColumnName(int c){
        return findHeader[c];
    }

    @Override
    public int getRowCount() {
        return findWorker.size();
    }

    @Override
    public int getColumnCount() {
        return findHeader.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return findWorker.get(rowIndex).getName();
            case 1:
                return findWorker.get(rowIndex).getSurname();
            case 2:
                return findWorker.get(rowIndex).getPassportNumber();
        }
        return "";
    }
}
*/
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class FindTable extends AbstractTableModel {

    public static String[] header;
    public static List<Worker> findWorkers = new ArrayList<>();

    FindTable(List<Worker> findWorkers, String[] header) {
        this.findWorkers = findWorkers;
        this.header = header;
    }

    public String getColumnName(int c) {
        return header[c];
    }

    public int getRowCount() {
        return findWorkers.size();
    }

    public int getColumnCount() {
        return header.length;
    }

    public Object getValueAt(int r, int c) {
        switch (c) {
            case 0:
                return findWorkers.get(r).getName();
            case 1:
                return findWorkers.get(r).getSurname();
            case 2:
                return findWorkers.get(r).getPassportNumber();
            default:
                return "";
        }
    }

}
