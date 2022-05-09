package com.isd;

public class WorkOrder implements Comparable {
    private int priority;
    public WorkOrder(int aPriority) {
        priority = aPriority;
    }
    public String toString() {
        return "urutan " + priority;
    }
    public int compareTo(Object otherObject) {
        WorkOrder other = (WorkOrder) otherObject;
        if (priority < other.priority) return -1;
        if (priority > other.priority) return 1;
        return 0;
    }
}
