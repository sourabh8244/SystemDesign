public class App {
    public static void main(String[] args) throws Exception {
        PostInterface ob = new Post("Sourabh");
        SubClass sob = new SubClass(ob);
        PostInterface ob2 = new ImagePost("Suryavo");
        SubClass sob2 = new SubClass(ob2);
        sob.print();
        sob2.print();
    }
}
