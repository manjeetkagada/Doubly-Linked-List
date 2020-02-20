public class Main {

    public static void main(String[] args) {
         LinkedList list=new LinkedList();
         list.insertAtEnd(21);
         list.insertAtBeg(12);
         list.insertAtBeg(13);
         list.insertAtBeg(14);
         list.insertAtBeg(15);
         list.insertAtEnd(20);
         list.insertAtIndex(34,2);
         list.delBeg();
         list.delEnd();
         list.show();
         list.delIndex(0);



         list.show();
         list.reversePrint();



    }
}
