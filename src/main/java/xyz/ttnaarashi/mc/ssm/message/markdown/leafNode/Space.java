package xyz.ttnaarashi.mc.ssm.message.markdown.leafNode;

import xyz.ttnaarashi.mc.ssm.message.markdown.basics.Leaf;

public class Space extends Leaf {
    int count;

    public Space(int count) {
        this.count = count;
    }

    @Override
    public String render() {
        switch (count){
            case 0:
                return "";
            case 1:
                return " ";
            default:
                StringBuilder builder = new StringBuilder();
                String blk = "&nbsp;";
                for (int i = 0; i < count; i++) {
                    builder.append(blk);
                }
                return builder.toString();
        }
    }
}
