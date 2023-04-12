public class ImagePost implements PostInterface{
    String name;
    ImagePost(String name){
        this.name = name;
    }

    public String getPost(){
        return "Image Post";
    }
}
