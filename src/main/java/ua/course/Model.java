package ua.course;

import java.util.ArrayList;

public class Model {

    private ArrayList<Integer> arr = new ArrayList<>();

    public String getArr() {
        return arr.toString();
    }

    public void setArr(int arr) {
        this.arr.add(arr);
    }

    @Override
    public String toString() {
        return "Model{" +
                "arr=" + arr +
                '}';
    }
}
