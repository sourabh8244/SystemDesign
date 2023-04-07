public class ObserverUser implements IObserverUser {
    String name;

    ObserverUser(String name){
        this.name = name;
    }

    public void likeUpdateAuthor(ObserverUser user, ObservablePost post){
        System.out.println(this.name+", your post was just liked by "+user.name+".");
        System.out.println("Like count: "+post.Likes);
    }

    public void commentUpdateAuthor(ObserverUser user, ObservablePost post){
        System.out.println(this.name+", your post just got a comment by "+user.name+".");
        System.out.println("Comment count: "+post.Comments);
    }

    public void likeUpdateUser(ObserverUser user, ObservablePost post){
        System.out.println(this.name+", you just liked "+user.name+"'s post.");
    }

    public void commentUpdateUser(ObserverUser user, ObservablePost post){
        System.out.println(this.name+", you just commented on "+user.name+"'s post.");
    }


    public void likeUpdateGeneral(ObserverUser user, ObservablePost post){
        System.out.println(user.name+" just liked "+post.Author.name+"'s post");
    }

    public void commentUpdateGeneral(ObserverUser user, ObservablePost post){
        System.out.println(user.name+" just commented on "+post.Author.name+"'s post");
    }
}
