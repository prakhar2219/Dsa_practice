package Linked_List;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();


        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(5);

        second.insertLast(3);
        second.insertLast(2);
        second.insertLast(4);

        first.rotate(first,3);
        first.display();
    }


    void findMiddle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.value);
    }

    void evenOddSegregation() {
        if (head == null || head.next == null) return;

        Node curr = head;
        Node prev = null;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        Node originalTail = tail;

        while (curr != null && curr != originalTail.next) {
            if (curr.value % 2 != 0) {
                Node next = curr.next;

                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    head = curr.next;
                }

                tail.next = curr;
                curr.next = null;
                tail = curr;

                curr = next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    }

    LL addTwoNumbers(LL first, LL second) {
        LL result=new LL();
        Node f = first.head;
        Node s = second.head;
        int carry=0,sum=0,val1,val2;
        while(f!=null || s!=null){
           if (f!=null){
               val1=f.value;
           }
           else {
               val1=0;
           }
            if (s!=null){
                val2=s.value;
            }
            else {
                val2=0;
            }

             sum = val1+val2+carry;
          result.insertLast(sum%10);
             carry=sum/10;
            if (f != null) f = f.next;
            if (s != null) s = s.next;
        }
        if (carry!=0){
            result.insertLast(carry);
        }
        return result;
    }
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    Node findIntersection(LL first,LL second){
      Node revFirst= first.reverse(first.head);
      Node revSecond= second.reverse(second.head);
      Node intersection=null;
      while (revFirst!=null&&revSecond!=null&&revFirst.value==revSecond.value){
          intersection=revFirst;
          revFirst=revFirst.next;
          revSecond=revSecond.next;
      }
      return intersection;
    }


    void rotate(LL list,int times){
        for (int i = 0; i < times; i++) {
            Node temp=list.head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next.next=list.head;
            list.head=temp.next;
            temp.next=null;
        }
    }
}