package xyz.ttnaarashi.mc.ssm.message.markdown.leafNode;

import xyz.ttnaarashi.mc.ssm.message.markdown.basics.Leaf;

public class Str extends Leaf {
    private String str;

    public Str(String str) {
        this.str = str;
    }

    @Override
    public String render() {
        return this.str;
    }
}
