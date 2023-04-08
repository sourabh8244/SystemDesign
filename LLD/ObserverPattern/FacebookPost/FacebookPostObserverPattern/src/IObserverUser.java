public interface IObserverUser {
    void likeUpdateAuthor(IObserverUser user, IObservablePost post);
    void commentUpdateAuthor(IObserverUser user, IObservablePost post);
    void likeUpdateUser(IObserverUser user, IObservablePost post);
    void commentUpdateUser(IObserverUser user, IObservablePost post);
    void likeUpdateGeneral(IObserverUser user, IObservablePost post);
    void commentUpdateGeneral(IObserverUser user, IObservablePost post);
    String getName();
}
