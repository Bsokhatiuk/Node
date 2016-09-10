/**
 * Created by lost on 10.09.2016.
 */
public class NodeTest {
    public static void main(String[] args) {
        Object [] t =new Integer[]{5,44,3,2,44,5,5,6,6};
        Object [] t1 =new Integer[20];
        Node n=new Node(1,null);
        Node n1=new Node(2,n);
        Node n2=new Node(3,n1);
        Node n3=new Node(4,n2);
        NodeUtils nx =new Nodex();
        nx.addToTail(n1,0);


        Node n4= nx.addToHead(n3,5);
        System.out.println(nx.toString(n4));
        System.out.println(nx.count(n4));


        Node n5=nx.createNode(t);
        Node n6=nx.createNodeR(0,t);
        System.out.println(nx.toString(n5));
        System.out.println(nx.toString(n6));

        Node n7=nx.remove(n6,2);
        System.out.println(nx.toString(n7));

        t1=nx.toArray(n3);
        System.out.println(t1[0].toString());
        System.out.println(t1[1].toString());
        System.out.println(t1[2].toString());
        System.out.println(t1[3].toString());

        Node t8=nx.reverse(n6);
        System.out.println(nx.toString(t8));
    }
}
