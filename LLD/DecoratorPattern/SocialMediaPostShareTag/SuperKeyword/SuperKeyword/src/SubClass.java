public class SubClass extends SuperAbstractClass{
    public SubClass(PostInterface ob){
        super(ob);
    }
    public void print(){
        System.out.println(super.getPost());
        System.out.println(ob.getPost());
    }
}