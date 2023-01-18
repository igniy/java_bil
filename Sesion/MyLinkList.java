package Sesion;

import java.util.LinkedList;

public class MyLinkList{
    LinkedList<ListNode> list=new LinkedList<>();
    ListNode first=null;


    public MyLinkList(LinkedList<Integer> list) {

        for (int c:list){
            this.list.add(new ListNode(c));
        }
        for (int i=0;i<this.list.size()-1;i++){
            this.list.get(i).next=this.list.get(i+1);
        }
        first=this.list.get(0);
    }

    public void remove(ListNode a){
        ListNode p=first;
        ListNode prev;
        while(p.next!=null){
            prev=p;
            p=p.next;
            if(p!=null && p.data==a.data){
                prev.next=p.next;
            }
            p=p.next;
        }
    }

    public void remove(int k){
        if(k!=0 && k!=list.size()-1){
            list.get(k-1).next=list.get(k).next;

        }
        else if(k==list.size()-1){
            list.get(k-1).next=null;
        }
        else if(k==0){
            list.get(k).next=null;
            first=this.list.get(1);
        }
    }
    public void removeAllDuplicates(){
        for(int i=0;i<list.size()-1;i++){
            ListNode c=list.get(i);
            int cl= list.size();
            for (int j = i+1; j < list.size(); j++) {
                if(c.data==list.get(j).data){
                    System.out.println(i+" "+j+ " "+list.get(j));
                    remove(j);
                }
            }

        }
    }
    public void removeDuplicates() {
        ListNode current = first; // Текущий элемент
        while (current != null) { // Пока не дошли до конца списка
            ListNode next = current.next; // Следующий элемент
            ListNode prev = current; // Предыдущий элемент
            while (next != null) {
                if (current.data == next.data) { // Если текущий элемент равен следующему
                    prev.next = next.next; // To пропускаем следующий элемент } else {
                    prev = next; // Иначе переходим к следующему элементу
                    next = next.next; // Переходим к следующему элементу
                }
                current = current.next;
            }
        }
    }
        public void firstLast(){
        int sz= this.list.size();
        list.get(sz-1).next=list.get(0).next;
        list.get(sz-2).next=list.get(0);
        list.get(0).next=null;
        first=list.get(sz-1);

    }

    public void to() {
        while (first!=null){
            System.out.print(first.data+" ");
            first=first.next;
        }
    }
}
