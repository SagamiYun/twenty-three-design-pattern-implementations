package me.sagamiyun.pattern.behavioral.state;


/**
 * @author SagamiYun
 * <p>@ClassName Review</p>
 * <p>@Description 审核 </p>
 * <p>@Date 2024/1/24</p>
 */
public class Review implements DocumentState {
    @Override
    public void handlePublish(Document document) {
        document.setState(new Published());
    }

    @Override
    public void handleReview(Document document) {
        // do nothing
    }
}
