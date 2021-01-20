
package Code;

public class Queue {

    private int maxSize;
    private Order queArray[];
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {

        maxSize = s;
        queArray = new Order[s];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void insert(String p[], int q[]) {
        if (isFull()) {
            System.out.print("Queue is Full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }

            queArray[++rear] = new Order(p, q);
            nItems++;

        }
    }

    public Order remove() {
        if (isEmpty()) {
            return null;
        } else {
            if (front == maxSize) {
                front = 0;

            }

            nItems--;
            return queArray[front++];

        }
    }

    public Order peek() {
        if (isEmpty()) {
            return null;
        } else {

            return queArray[front];
        }

    }

}
