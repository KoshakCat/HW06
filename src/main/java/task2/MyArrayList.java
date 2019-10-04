package task2;

import java.util.Arrays;


public class MyArrayList<Integer> {
    private java.lang.Integer[] values;
    private int size = 0;


    public void add(java.lang.Integer value) {
        if (size == 0) {
            values = new java.lang.Integer[1];
            values[0] = value;
        } else {
            values = Arrays.copyOf(values,size+1);
            values[values.length - 1] = value;
        }
        size++;
    }

    public void add(java.lang.Integer value, int index) {
        if ((size == 0) && (index == 0)) {
            values = new java.lang.Integer[1];
            values[index] = value;
            size++;
        }
        if ((index < -1) || (index >= size)) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        } else {
            java.lang.Integer[] to = new java.lang.Integer[values.length + 1];
            System.arraycopy(values, 0, to, 0, index);
            System.arraycopy(values, index, to, index + 1, values.length - index);
            to[index] = value;
            size++;
            values = new java.lang.Integer[size];
            values = to;
        }
    }

    public java.lang.Integer getElement (int index) {
        if ((index < -1) || (index >= size)) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        return values[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "values=" + Arrays.toString(values) +
                ", size=" + size +
                '}';
    }
}
