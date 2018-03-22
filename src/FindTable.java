import java.util.List;

public class FindTable extends WorkersTable {


    FindTable(List<Worker> workerList, String[] header) {
        super(workerList, header);
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
