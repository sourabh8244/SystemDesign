import java.util.HashSet;

public class ObservablePost implements IObservablePost {
    int Likes;
    int Comments;
    IObserverUser Author;
    HashSet<IObserverUser> userList;

    ObservablePost(IObserverUser user){
        this.Author = user;
        this.userList = new HashSet<IObserverUser>();
        addObserver(user);
    }
    
    public void addObserver(IObserverUser user){
        this.userList.add(user);
    };
    public void removeObserver(IObserverUser user){
        this.userList.remove(user);
    };
    public void notifyObserversLike(IObserverUser user){
        userList.forEach(e -> {
            System.out.print(e.getName()+" ");
        });
        System.out.println(" ");

        for (IObserverUser ObserverUser : userList) {
            if(ObserverUser.equals(this.Author))
                Author.likeUpdateAuthor(user, this);
            else if(ObserverUser.equals(user))
                ObserverUser.likeUpdateUser(this.Author, this);
            else
                ObserverUser.likeUpdateGeneral(user, this);
        }
    };

    public void notifyObserversComment(IObserverUser user){
        userList.forEach(e -> {
            System.out.print(e.getName()+" ");
        });
        System.out.println(" ");
        
        for (IObserverUser ObserverUser : userList) {
            if(ObserverUser.equals(this.Author))
                Author.commentUpdateAuthor(user, this);
            else if(ObserverUser.equals(user))
                ObserverUser.commentUpdateUser(this.Author, this);
            else
                ObserverUser.commentUpdateGeneral(user, this);
        }
    };

    public void addLike(IObserverUser user){
        if(!this.userList.contains(user)) this.userList.add(user);//System.out.println("like");
        else System.out.println(user.getName() + " already registered to this post.");
        this.Likes++;
        this.notifyObserversLike(user);
    }
    public void addComment(IObserverUser user){
        if(!this.userList.contains(user)) this.userList.add(user);//System.out.println("comment");
        else System.out.println(user.getName() + " already registered to this post.");
        this.Comments++;
        this.notifyObserversComment(user);
    }

    public IObserverUser getAuthor(){
        return this.Author;
    }

    public int getLikes(){
        return this.Likes;
    }

    public int getComments(){
        return this.Comments;
    }
}
