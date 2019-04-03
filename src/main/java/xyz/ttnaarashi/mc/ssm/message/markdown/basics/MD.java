package xyz.ttnaarashi.mc.ssm.message.markdown.basics;

public abstract class MD {
    protected int indent = 0;

    abstract public String render();
    abstract public MD append(MD m);

    public int getIndent() {
        return indent;
    }

    protected MD setIndent(int indent) {
        this.indent = indent;
        return this;
    }
}
