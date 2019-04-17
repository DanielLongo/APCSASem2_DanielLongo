import java.util.ArrayList;

public class GridTester {
    public Cell[][] cells;

    public GridTester(int a, int b) {
        cells = new Cell[a][b];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell ();

            }

        }
    }

    public void loadOccupied() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                if (Math.random () > .7) cells[i][j].setOccupied(true);
                else {
                    cells[i][j].setOccupied (false);
                }
            }
        }
    }

    public  ArrayList<Cell> addNeighbor(int a, int b, ArrayList<Cell> n) {
        if (!cells[a][b].isOccupied ()) n.add (cells[a][b]);
        return n;
    }

    public void loadNeighbors() {
        ArrayList<Cell> neighbors = new ArrayList<Cell> ();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                if (i != 0) neighbors = addNeighbor(i-1,j,neighbors);
                if (i != cells.length-1) neighbors = addNeighbor(i+1,j,neighbors);
                if (j != 0) neighbors = addNeighbor(i,j-1,neighbors);
                if (j != cells[0].length-1) neighbors = addNeighbor(i,j+1,neighbors);
                cells[i][j].setNeighbors (neighbors);
                neighbors.clear ();
            }
        }
    }
}
