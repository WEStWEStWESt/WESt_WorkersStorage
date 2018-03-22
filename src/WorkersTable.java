
import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.*;

public class WorkersTable extends AbstractTableModel {

    public static String[] header ;
    public static List<Worker> workerList = new ArrayList<>();

    WorkersTable(List<Worker> workerList, String[] header ){

        this.workerList = workerList;
        this.header = header;

        workerList.add(new Worker("qqq","yy","123"));
        workerList.add(new Worker("aaa","ddd","444"));
        workerList.add(new Worker("hhh","jjj","666"));
    }


    public  String getColumnName(int c){
        return header[c];
    }

    @Override
    public int getRowCount() {
        return workerList.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return workerList.get(rowIndex).getName();
            case 1:
                return workerList.get(rowIndex).getSurname();
            case 2:
                return workerList.get(rowIndex).getPassportNumber();
        }
        return "";
    }
}
