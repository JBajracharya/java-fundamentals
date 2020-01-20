package stacksandqueues;

public class Queue {
    Node front;
    Node rear;

    public void enqueue(int value) {
        if(this.front == null) {
            this.front = new Node(value);
            this.rear = this.front;
        } else {
            this.rear.next = new Node(value, null);
            this.rear = this.rear.next;
        }
    }

    public int dequeue() {
        Node temp = front;
        front = front.next;
        temp.next = null;
        return temp.value;
    }

    public int peek() {
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public String toString() {
        Node currentNode = front;
        StringBuilder listValues = new StringBuilder();
        while (currentNode != null) {
            listValues.append(currentNode.value).append("->");
            currentNode = currentNode.next;
        }
        return listValues + "NULL";
    }

}
