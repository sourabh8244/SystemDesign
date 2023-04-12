public class Post implements PostInterface{
    String name;
    Post(String name){
        this.name = name;
    }

    public String getPost(){
        return "Simple Post";
    }
}
