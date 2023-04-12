public class BasicPost implements SocialMediaPost {
    private String post;
    
    public BasicPost(String post) {
        this.post = post;
    }
    
    @Override
    public String getPost() {
        return post+"basic";
    }
}