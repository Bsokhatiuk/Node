/**
 * Created by lost on 10.09.2016.
 */
public class Nodex implements NodeUtils {
    @Override
    public void addToTail(Node first, Object val) {
        if (first.next != null) {
            addToTail(first.next, val);
        } else {
            Node newNode = new Node(val, null);
            first.next = newNode;
        }
    }

    @Override
    public Node addToHead(Node chain, Object val) {
        Node node = new Node(val, chain);
        return node;
    }

    @Override
    public String toString(Node chain) {
        StringBuilder result = new StringBuilder();

        result.append("{" + chain.value + "} ");
        if (chain.next != null) {
            result.append(toString(chain.next));
        }
        return result.toString();
    }

    @Override
    public Node createNode(Object... mas) {
        Node node = new Node();
        node = new Node(mas[0], node.next);
        for (int i = mas.length - 1; i >= 1; i--) {
            node.next = new Node(mas[i], node.next);
        }
        return node;
    }

    @Override
    public Node createNodeR(int index, Object... mas) {
        Node node = new Node();
        if (mas.length - 1 != index) {
            node = new Node(mas[index], node.next);
            node.next = createNodeR(++index, mas);
        } else {
            node = new Node(mas[index], null);
        }

        return node;
    }

    @Override
    public int count(Node chain) {
        int result = 1;

        if (chain.next != null) {
            result += (count(chain.next));
        }
        return result;
    }

    @Override
    public Node remove(Node chain, Object val) {
        if (chain.next != null) {
            if (chain.next.value == val) {
                chain = new Node(chain.value, chain.next.next);
                remove(chain.next.next, val);
            } else remove(chain.next, val);
        }
        return chain;
    }

    @Override
    public Object[] toArray(Node chain) {
        int count = count(chain);
        if (count != 0) {
            int i = 0;
            Object[] object = new Object[count];
            while ((chain.next != null) && (i != count)) {
                object[i] = chain.value;
                chain = chain.next;
                i++;
            }
            return object;
        } else {
            return null;
        }
    }

    @Override
    public Node reverse(Node curr) {
        Node node = new Node();
        int count = count(curr);
        for (int i = 0; i < count; i++) {

            for (int j = 0; j < count - i; j++) {
                if (j == count - i - 1) {
                    node.next = new Node(curr.value, node.next);
                }

            }
            curr = curr.next;
        }
        return node;
    }

    @Override
    public Node reverse(Node curr, Node next, Node prev) {

        return null;
    }
}
