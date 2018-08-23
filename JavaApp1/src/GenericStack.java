
public class GenericStack<E> {
    
    E[] a=(E[])new Object[1];
    public int getSize(){
        for(int i=0;i<a.length;i++)
            if(a[i]==null) return i;
        return a.length;
    }
    public E peek(){
        return a[getSize()-1];
    }
    public E pop(){
        E o=peek();
        a[getSize()-1]=null;
        return o;
    }
    public void push(E o){
        if (getSize()!=a.length){
            a[getSize()]=o;
        }
        else{
            E[]t=a.clone();
            a=(E[])new Object[t.length*2];
            System.arraycopy(t, 0, a, 0, t.length);
            a[getSize()]=o;
        }

    }
    public boolean isEmpty(){
        return a[0]==null;
    }
    public String toString(){
        String s="Stack: [";
        for(int i=0;i<getSize();i++)
            s+=a[i].toString()+" ";
        return s+"]";
    }
}

