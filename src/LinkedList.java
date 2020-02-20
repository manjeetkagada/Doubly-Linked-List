public class LinkedList {
    Node head=null;
// TODO insertion at beginnning
    public void insertAtBeg(int data){

        Node node=new Node();
        node.data=data;
        node.next=null;
        node.prev=null;

        if (head==null){
            head=node;
        }else{
           node.next=head;
           head.prev=node;
           head=node;

        }

    }
//TODO insertion at particular index
    public void insertAtIndex(int data,int pos){
        if (pos==0){
            insertAtBeg(data);


        }else {
            Node node = new Node();
            node.data = data;
            node.next = null;
            node.prev = null;
            Node temp = head;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next.prev = node;
            node.next = temp.next;
            temp.next = node;
            node.prev = temp;
        }






    }
//TODO insertion at end

    public void insertAtEnd(int data){
        Node node=new Node();
        node.next=null;
        node.prev=null;
        node.data=data;
        Node temp=head;


        if (head==null){
            head=node;

        }else {
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;



        }


    }

    //TODO deletion from beginning
    public void delBeg(){

        Node temp=head;
        head=temp.next;


    }
    //TODO deletion from end:
    public void delEnd(){

        Node temp=head;

        while (temp.next!=null){
            temp=temp.next;
        }
      temp.prev.next=null;

    }
    //TODO deletion at particular index:
    public void delIndex(int pos){

        if (pos==0){
            Node temp=head;
            head=temp.next;


        }else {
            Node node=null;
            Node temp=head;
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }

            node=temp.next;
            temp.next=node.next;
            temp=node.next.prev;
            node=null;

        }

    }



//TODO traverse all elements

    public void  show(){
        Node temp=head;
        if (head==null){
            return;
        }else {
            while (temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print(temp.data+"\n");
        }

    }

    //TODO traverse all elements in reverse order

    public void reversePrint(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        head.prev=null;

        while (temp.prev!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.print(temp.data+"\n");
    }


}
