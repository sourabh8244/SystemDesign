public interface IObservablePost {
    void addObserver(IObserverUser user);
    void removeObserver(IObserverUser user);
    void notifyObserversLike(IObserverUser user);
    void notifyObserversComment(IObserverUser user);
    IObserverUser getAuthor();
    int getLikes();
    int getComments();
}
