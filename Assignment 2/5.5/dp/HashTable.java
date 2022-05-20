package dp;



    class SinglyLinkedList {
        int data;
        SinglyLinkedList next;


        //Constructor
        public SinglyLinkedList(int x) {
            data = x;
            next = null;
        }
    }

    class HashTable {
        private SinglyLinkedList[] hashTable;
        private int size;

        public HashTable(int tableSize) {
            hashTable = new SinglyLinkedList[nextPrime(tableSize)];
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void clear() {
            int l = hashTable.length;
            hashTable = new SinglyLinkedList[l];
            size = 0;
        }

        public int getSize() {
            return size;
        }

        public void insert(int val) {
            size++;
            int i = hashFunction(val);
            SinglyLinkedList n = new SinglyLinkedList(val);

            if (hashTable[i] == null) {
                hashTable[i] = n;
            }
            else {
                n.next = hashTable[i];
                hashTable[i] = n;
            }
        }

        public void remove(int val) {
            int i = hashFunction(val);
            SinglyLinkedList start = hashTable[i];
            SinglyLinkedList end = start;

            if (start.data == val) {
                size--;
                hashTable[i] = start.next;
                return;
            }

            while (end.next != null && end.next.data != val) {
                end = end.next;
            }

            if (end.next == null) {
                System.out.println("\nElement not found\n");
                return;
            }

            size--;

            if (end.next.next == null) {
                end.next = null;
                return;
            }

            end.next = end.next.next;
            hashTable[i] = start;
        }

        private int hashFunction(Integer x) {
            int hashVal = x.hashCode();
            hashVal %= hashTable.length;

            if (hashVal < 0) {
                hashVal += hashTable.length;
            }
            return hashVal;
        }

        private int nextPrime (int n) {
            if (n % 2 == 0) {
                n++;
            }

            for (; !isPrime(n); n += 2);

            return n;
        }

        private boolean isPrime(int n) {
            if (n == 2 || n == 3) {
                return true;
            }
            if (n == 1 || n % 2 == 0) {
                return false;
            }

            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public void printHashTable () {
            System.out.println();

            for (int i = 0; i < hashTable.length; i++) {
                System.out.print ("Cell " + i + ": ");
                SinglyLinkedList begin = hashTable[i];

                while(begin != null) {
                    System.out.print(begin.data + " ");
                    begin = begin.next;
                }

                System.out.println();
            }
        }
    }
