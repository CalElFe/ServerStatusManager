package xyz.ttnaarashi.mc.ssm.message.markdown.stemNode;

import xyz.ttnaarashi.mc.ssm.message.markdown.basics.MD;
import xyz.ttnaarashi.mc.ssm.message.markdown.basics.Stem;

public class Title extends Stem {
    private int level;

    public Title(int level) {
        this.level = level;
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            builder.append("#");
        }
        builder.append(" ").append(super.render()).append("\n");
        return builder.toString();
    }
}
