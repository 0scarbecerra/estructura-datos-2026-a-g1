public class Main {
    // We use a static nested class for the Node to ensure single-file execution
    static class Node {
        String name;
        Node next; // The link to the next element

        Node(String name) {
            this.name = name;
            this.next = null; // Ends in null by default
        }
    }

    public static void main(String[] args) {
        // 1. Creating the 4 student nodes
        Node student1 = new Node("Ana");
        Node student2 = new Node("Betto");
        Node student3 = new Node("Carla");
        Node student4 = new Node("David");

        // 2. Establishing links (Drawing the pointers)
        Node head = student1; // Clearly indicating the first node
        student1.next = student2;
        student2.next = student3;
        student3.next = student4;

        // student4.next remains null, signaling the end of the list

        // 3. Traversal to verify the structure
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print("[" + current.name + "] -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}