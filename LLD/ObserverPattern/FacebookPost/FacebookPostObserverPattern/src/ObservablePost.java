import java.util.HashSet;

public class ObservablePost implements IObservablePost {
    int Likes;
    int Comments;
    ObserverUser Author;

    ObservablePost(ObserverUser user){
        this.Author = user;
    }

    HashSet<ObserverUser> userList = new HashSet<ObserverUser>();
    public void addObserver(ObserverUser user){
        this.userList.add(user);
    };
    public void removeObserver(ObserverUser user){
        this.userList.remove(user);
    };
    public void notifyObserversLike(ObserverUser user){
        userList.forEach(e -> {
            System.out.print(e.name+" ");
        });
        System.out.println(" ");

        for (ObserverUser ObserverUser : userList) {
            if(ObserverUser.equals(this.Author))
                Author.likeUpdateAuthor(user, this);
            else if(ObserverUser.equals(user))
                ObserverUser.likeUpdateUser(this.Author, this);
            else
                ObserverUser.likeUpdateGeneral(user, this);
        }
    };

    public void notifyObserversComment(ObserverUser user){
        userList.forEach(e -> {
            System.out.print(e.name+" ");
        });
        System.out.println(" ");
        
        for (ObserverUser ObserverUser : userList) {
            if(ObserverUser.equals(this.Author))
                Author.commentUpdateAuthor(user, this);
            else if(ObserverUser.equals(user))
                ObserverUser.commentUpdateUser(this.Author, this);
            else
                ObserverUser.commentUpdateGeneral(user, this);
        }
    };

    public void addLike(ObserverUser user){
        if(!this.userList.contains(user)) this.userList.add(user);//System.out.println("like");
        else System.out.println(user.name + " already registered to this post.");
        this.Likes++;
        this.notifyObserversLike(user);
    }
    public void addComment(ObserverUser user){
        if(!this.userList.contains(user)) this.userList.add(user);//System.out.println("comment");
        else System.out.println(user.name + " already registered to this post.");
        this.Comments++;
        this.notifyObserversComment(user);
    }
}
