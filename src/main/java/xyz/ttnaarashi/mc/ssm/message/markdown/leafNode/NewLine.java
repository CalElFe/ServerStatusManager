package xyz.ttnaarashi.mc.ssm.message.markdown.leafNode;

import xyz.ttnaarashi.mc.ssm.message.markdown.basics.Leaf;

public class NewLine extends Leaf {
    int count;

    public NewLine(int count) {
        this.count = count;
    }

    @Override
    public String render() {
        switch (count){
            case 0:
                return "";
            case 1:
                return "\n";
            default:
                StringBuilder builder = new StringBuilder();
                String br = "<br />";
                for (int i = 0; i < count; i++) {
                    builder.append(br);
                }
                return builder.append("\n").toString();
        }
    }
}
