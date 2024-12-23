package j08_collection;
//K : key  V: value E:element
public class GenericTest<E> {
    private E data;

    public GenericTest(){}

    public E getData(){
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

}
