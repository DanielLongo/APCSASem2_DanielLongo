import java.util.ArrayList;

public class Cell {
    private boolean occupied;
    private int id;
    private ArrayList<Cell> neighbors;

    public Cell() {
        neighbors = new ArrayList<Cell> ();
        occupied = false;
        id = 1;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNeighbors(ArrayList<Cell> n) {
        for (Cell c : n) {
            this.neighbors.add (c);
        }
//        this.neighbors = neighbors;
    }
    public ArrayList<Cell> getNeighbors() {return neighbors;}
}
