public class ShareDecorator extends PostDecorator {
    private String user;
    
    public ShareDecorator(SocialMediaPost decoratedPost, String user) {
        super(decoratedPost);
        this.user = user;
    }
    
    @Override
    public String getPost() {
        return decoratedPost.getPost() + " Shared by " + user;
    }
}