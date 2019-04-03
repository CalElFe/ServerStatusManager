package xyz.ttnaarashi.mc.ssm.message.markdown.stemNode;

import xyz.ttnaarashi.mc.ssm.message.markdown.basics.Stem;

public class Code extends Stem {
    private String lang;

    public Code(String lang) {
        this.lang = lang;
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder("\n```");
        builder.append(lang).append("\n");
        builder.append(super.render());
        builder.append("\n```\n");
        return builder.toString();
    }
}
