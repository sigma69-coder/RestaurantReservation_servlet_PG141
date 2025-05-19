package model;

public class QueueArray {
    private int maxSize;
    private Reservation[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueArray(int s) {
        maxSize = s;
        queArray = new Reservation[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(Reservation r) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (rear == maxSize - 1) rear = -1;
            queArray[++rear] = r;
            nItems++;
        }
    }

    public Reservation remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Reservation temp = queArray[front++];
            if (front == maxSize) front = 0;
            nItems--;
            return temp;
        }
    }

    public boolean isEmpty() { return nItems == 0; }
    public boolean isFull() { return nItems == maxSize; }

    public Reservation[] toArray() {
        Reservation[] result = new Reservation[nItems];
        for (int i = 0, idx = front; i < nItems; i++) {
            result[i] = queArray[idx];
            idx = (idx + 1) % maxSize;
        }
        return result;
    }

    public boolean deleteByPhone(String phone) {
        boolean deleted = false;
        Reservation[] tempArray = new Reservation[maxSize];
        int count = 0;

        for (int i = 0; i < nItems; i++) {
            Reservation res = queArray[(front + i) % maxSize];
            if (!deleted && res.getPhone().equals(phone)) {
                deleted = true;  // delete only first matching phone
                continue;        // skip adding this reservation to tempArray
            }
            tempArray[count++] = res;
        }


        // Reset the queue with updated data
        queArray = new Reservation[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
        for (int i = 0; i < count; i++) {
            insert(tempArray[i]);
        }

        return deleted;
    }
}