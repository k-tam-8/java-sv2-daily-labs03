package day04;

public class Prison {

    boolean[] cells = new boolean[100];

    public void openFreeCells() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i);
            for (int f = 0; f < 100; f += i +1) {
                cells[f] = !cells[f];
            }
            for (int f = 0; f < cells.length; f++) {
                if (cells[f] == true) System.out.print("+");
                if (cells[f] == false) System.out.print("-");
            }
            System.out.println();
        }
    }

    public boolean[] getCells() {
        return cells;
    }
}
