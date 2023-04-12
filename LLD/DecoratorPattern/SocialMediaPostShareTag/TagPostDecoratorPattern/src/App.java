public class App {
    public static void main(String[] args) {
        SocialMediaPost post = new BasicPost("Hello world!");
        System.out.println(post.getPost());
        
        post = new TagDecorator(post, "java");
        System.out.println(post.getPost());
        
        // post = new ShareDecorator(post, "user1");
        // System.out.println(post.getPost());
        
        // post = new TagDecorator(post, "java");
        // System.out.println(post.getPost());

        // // decorate post with another java tag
        // post = new TagDecorator(post, "asia");
        // System.out.println(post.getPost());

        
    }
}
