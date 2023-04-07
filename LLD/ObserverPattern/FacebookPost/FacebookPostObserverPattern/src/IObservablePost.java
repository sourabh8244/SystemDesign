public interface IObservablePost {
    void addObserver(ObserverUser user);
    void removeObserver(ObserverUser user);
    void notifyObserversLike(ObserverUser user);
    void notifyObserversComment(ObserverUser user);

}
