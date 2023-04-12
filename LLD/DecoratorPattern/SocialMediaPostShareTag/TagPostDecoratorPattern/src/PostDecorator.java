public abstract class PostDecorator implements SocialMediaPost {
    protected SocialMediaPost decoratedPost;
    
    public PostDecorator(SocialMediaPost decoratedPost) {
        this.decoratedPost = decoratedPost;
    }
    
    @Override
    public String getPost() {
        return decoratedPost.getPost();
    }
}