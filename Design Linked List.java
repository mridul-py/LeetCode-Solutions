class MyLinkedList {
    List<Integer> L;

    public MyLinkedList() {
        L = new LinkedList<>();
    }

    public int get(int index) {
        if (index < 0 || index >= L.size()) {
            return -1; // Return -1 if index is invalid
        }
        return L.get(index);
    }

    public void addAtHead(int val) {
        L.addFirst(val);
    }

    public void addAtTail(int val) {
        L.addLast(val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > L.size()) {
            return; // Invalid index, do nothing
        }
        L.add(index, val);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= L.size()) {
            return; // Invalid index, do nothing
        }
        L.remove(index);
    }
}
