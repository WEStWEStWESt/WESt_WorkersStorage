import java.util.List;

public class Main {

    private static List<Worker> workerList = WorkersTable.workerList;

    public static void main(String[] args) {
        new GeneralFrame(workerList);
        /*new AddFrame();
        new FindFrame();
        new DeleteFrame();
        */
    }
}
