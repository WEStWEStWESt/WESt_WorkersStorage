import classes.FindFrame;
import classes.GeneralFrame;
import classes.WorkersTable;

public class Main {

    public static void main(String[] args) {
          new GeneralFrame(WorkersTable.workerList);
          new classes.AddFrame();
          new FindFrame();
          new classes.DeleteFrame();
    }
}
