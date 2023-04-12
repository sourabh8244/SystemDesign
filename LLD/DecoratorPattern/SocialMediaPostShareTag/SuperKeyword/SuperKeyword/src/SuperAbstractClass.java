public abstract class SuperAbstractClass {
    PostInterface ob;
    SuperAbstractClass(PostInterface ob){
        this.ob = ob;
    }

    public String getPost(){
        String str = "SuperClass";
        return str;
    }
}
