public class Runner {
    public static void main(String[] args) {
        GridTester grid = new GridTester (10,3);
        grid.loadNeighbors ();
        System.out.println (grid.cells[0][0].getNeighbors().size());
    }
}
