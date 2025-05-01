package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueArray {
    private static Queue<Reservation> queue = new LinkedList<>();

    public static void enqueue(Reservation r) {
        queue.add(r);
    }

    public static Reservation dequeue() {
        return queue.poll();
    }

    public static Queue<Reservation> getQueue() {
        return queue;
    }

}