import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagDecorator extends PostDecorator {
    private String tag;
    
    public TagDecorator(SocialMediaPost decoratedPost, String tag) {
        super(decoratedPost);
        this.tag = tag;
    }
    
    @Override
    public String getPost() {
        String post = decoratedPost.getPost();
        System.out.println(post);
        int count = 0;
        Pattern pattern = Pattern.compile("#" + tag + "\\b");
        Matcher matcher = pattern.matcher(post);
        while (matcher.find()) {
            count++;
        }
        return post + " #" + tag + " (" + count + ")";
    }
}