package me.sagamiyun.pattern.behavioral.state;

import lombok.Getter;

/**
 * @author SagamiYun
 * <p>@ClassName Document</p>
 * <p>@Description 状态模式 文档类 </p>
 * <p>@Date 2024/1/24</p>
 */
@Getter
public class Document {
    private DocumentState state;

    public Document() {
        this.state = new Draft();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void publish() {
        state.handlePublish(this);
    }

    public void review() {
        state.handleReview(this);
    }
}
