public interface IObserverUser {
    void likeUpdateAuthor(ObserverUser user, ObservablePost post);
    void commentUpdateAuthor(ObserverUser user, ObservablePost post);
    void likeUpdateUser(ObserverUser user, ObservablePost post);
    void commentUpdateUser(ObserverUser user, ObservablePost post);
    void likeUpdateGeneral(ObserverUser user, ObservablePost post);
    void commentUpdateGeneral(ObserverUser user, ObservablePost post);
}
