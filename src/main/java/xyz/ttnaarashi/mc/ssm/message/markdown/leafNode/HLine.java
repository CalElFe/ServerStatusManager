package xyz.ttnaarashi.mc.ssm.message.markdown.leafNode;

import xyz.ttnaarashi.mc.ssm.message.markdown.basics.Leaf;

import java.util.BitSet;

public class HLine extends Leaf {
    int count;

    public HLine(int count) {
        this.count = count;
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder("\n");
        for (int i = 0; i < count; i++) {
            builder.append("---\n");
        }
        return builder.toString();
    }
}
