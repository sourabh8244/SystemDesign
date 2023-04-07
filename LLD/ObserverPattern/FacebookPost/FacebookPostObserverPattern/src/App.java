public class App {
    public static void main(String[] args) throws Exception {
        
        ObserverUser user1 = new ObserverUser("Sourabh");
        ObservablePost post1 = new ObservablePost(user1);
        
        post1.addLike(user1);
        
        ObserverUser user2 = new ObserverUser("Suryavo");
        post1.addLike(user2);
        
        ObserverUser user3 = new ObserverUser("Shubham");
        post1.addLike(user3);

        post1.removeObserver(user2);

        post1.addLike(user1);

    }
}
