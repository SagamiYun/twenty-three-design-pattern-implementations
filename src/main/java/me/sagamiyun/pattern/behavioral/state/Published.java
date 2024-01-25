package me.sagamiyun.pattern.behavioral.state;

/**
 * @author SagamiYun
 * <p>@ClassName Published</p>
 * <p>@Description 发布 </p>
 * <p>@Date 2024/1/24</p>
 */
public class Published implements DocumentState {
    @Override
    public void handlePublish(Document document) {
        // do nothing
    }

    @Override
    public void handleReview(Document document) {
        // do nothing
    }
}

