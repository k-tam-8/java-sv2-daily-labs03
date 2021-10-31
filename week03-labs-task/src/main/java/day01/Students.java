package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {
    private List<Integer> heightList = new ArrayList<>();

    public void addHeight(int height) {
        heightList.add(height);
    }

    public boolean isHeightIncreasing() {
        for (int i = 1; i < heightList.size() - 1; i++) {
            if (heightList.get(i) > heightList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

