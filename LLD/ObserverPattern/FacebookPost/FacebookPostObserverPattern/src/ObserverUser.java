public class ObserverUser implements IObserverUser {
    String name;

    ObserverUser(String name){
        this.name = name;
    }

    public void likeUpdateAuthor(IObserverUser user, IObservablePost post){
        System.out.println(this.getName()+", your post was just liked by "+user.getName()+".");
        System.out.println("Like count: "+post.getLikes());
    }

    public void commentUpdateAuthor(IObserverUser user, IObservablePost post){
        System.out.println(this.getName()+", your post just got a comment by "+user.getName()+".");
        System.out.println("Comment count: "+post.getComments());
    }

    public void likeUpdateUser(IObserverUser user, IObservablePost post){
        System.out.println(this.getName()+", you just liked "+user.getName()+"'s post.");
    }

    public void commentUpdateUser(IObserverUser user, IObservablePost post){
        System.out.println(this.getName()+", you just commented on "+user.getName()+"'s post.");
    }


    public void likeUpdateGeneral(IObserverUser user, IObservablePost post){
        System.out.println(user.getName()+" just liked "+post.getAuthor().getName()+"'s post");
    }

    public void commentUpdateGeneral(IObserverUser user, IObservablePost post){
        System.out.println(user.getName()+" just commented on "+post.getAuthor().getName()+"'s post");
    }

    public String getName(){
        return this.name;
    }
}
