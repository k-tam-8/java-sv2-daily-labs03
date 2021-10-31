package day04;

public class Sultan {
    public static void main(String[] args) {
        Prison prison = new Prison();
        prison.openFreeCells();
        for (int i=0;i<prison.cells.length;i++){
            if (prison.cells[i]==true) System.out.println(i);
        }
    }
}
