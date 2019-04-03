package xyz.ttnaarashi.mc.ssm.message.markdown.stemNode;

import xyz.ttnaarashi.mc.ssm.message.markdown.basics.Stem;

public class SpecialEffect extends Stem {
    private String sign;

    public SpecialEffect(String sign) {
        this.sign = sign;
    }

    @Override
    public String render() {
        String child = super.render();
        return sign + child + sign;
    }
}
