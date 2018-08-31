public class NumbersStack {
    int[] numbers;
    int count =0;
    public NumbersStack() {
    }

    public int getCount() {
        return count;
    }

    public void push(int number) {
        numbers[count] = number;
        count++;
    }

    public int pop() {
        int top = numbers[count - 1];
        count--;
        return top;
    }

    public void empty() {

    }
}

