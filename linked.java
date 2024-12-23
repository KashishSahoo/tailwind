class LL {
    Node head;
    int size;

    LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public  int search(String ele){
        Node temp=head;
        while(temp!=null){
            if(temp.data.equals(ele)){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;

        }
        lastNode.next = newNode;

    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public int length(){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    
}


public class linked {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.addLast("7");
        list.addLast("8");
        list.addLast("9");
        list.printList();
        System.out.println(list.length());
        // System.out.println(list.search("5"));
    }
}
