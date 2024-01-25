package me.sagamiyun.pattern.behavioral.state;

/**
 * @author SagamiYun
 * <p>@ClassName Draft</p>
 * <p>@Description 草稿 </p>
 * <p>@Date 2024/1/24</p>
 */
public class Draft implements DocumentState {
    @Override
    public void handlePublish(Document document) {
        document.setState(new Published());
    }

    @Override
    public void handleReview(Document document) {
        document.setState(new Review());
    }
}
