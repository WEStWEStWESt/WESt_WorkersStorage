import javafx.concurrent.Worker;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class WorkersTable extends AbstractTableModel {

    private static String[] header ;
    private static List<Worker> workerList = new ArrayList<>();

    WorkersTable(String[] header, List<Worker> workerList){
        this.header = header;
        this.workerList = workerList;



    }


    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
