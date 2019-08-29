package AchmeaTraining.CreatingTables;

/**
 * Created by WSteinle on 23.03.2017.
 */
public abstract class FaktorTable {

    private int columnCount, rowCount;
    protected double [][] table;

    //Creating table
    protected FaktorTable(int column, int row) {
        this.columnCount = column;
        this.rowCount = row;
        table = new double[column][row];
    }

    //Create (Wrap) a table. over existing table
    protected FaktorTable(double [][] table) {
        rowCount = table.length;
        columnCount = table[0].length;
    }

    //Loading a table
    public void load(double [][] table) {
        this.table = table;
    }

    //Return factor from table by index
    public double getFactor (int x, int y) {
        return table[x][y];
    }

    public double[][] getTable() {
        return table;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    //Check if a table is an Array
    public boolean isAnArray() {
        return rowCount == 1;
    }

    //If a table is an array
    public double[] getAsArray() {
        double[] result =  isAnArray() ? table[0] : null;
        return result;
    }
}
