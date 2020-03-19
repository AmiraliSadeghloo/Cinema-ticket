public class Chair {
    private int chairIndex, row;
    public final int rowNum = 10;
    public final int indexNum = 10;

    Chair(int chairIndex, int row) {
        this.chairIndex = chairIndex;
        this.row = row;
    }

    public int getChairIndex() {
        return chairIndex;
    }

    public void setChairIndex(int chairIndex) {
        this.chairIndex = chairIndex;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}

