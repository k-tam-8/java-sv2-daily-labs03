package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    List<String> names = new ArrayList<>();

    public boolean addStudent(String studentName) {
        for (int i = 1; i < studentName.length(); i++) {
            if (Character.toString(studentName.charAt(i)).equals(" ")) {
                names.add(studentName);
                return true;
            }
        }
        return false;
    }
}
