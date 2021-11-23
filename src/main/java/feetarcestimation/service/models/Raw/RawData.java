package feetarcestimation.service.models.Raw;

import javax.validation.constraints.NotNull;

public class RawData {
    @NotNull(message = "left cannot be null")
    private RawFootData left;
    @NotNull(message = "right cannot be null")
    private RawFootData right;

    public RawData(RawFootData left, RawFootData right) {
        this.left = left;
        this.right = right;
    }

    public RawFootData getLeft() {
        return left;
    }

    public void setLeft(RawFootData lefts) {
        this.left = lefts;
    }

    public RawFootData getRight() {
        return right;
    }

    public void setRight(RawFootData rights) {
        this.right = rights;
    }
}

