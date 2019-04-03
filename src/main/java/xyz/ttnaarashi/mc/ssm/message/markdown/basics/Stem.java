package xyz.ttnaarashi.mc.ssm.message.markdown.basics;

import java.util.Vector;

public class Stem extends MD {
    protected Vector<MD> elements;

    @Override
    public MD append(MD m) {
        if (this.elements == null) {
            this.elements = new Vector<>();
        }
        elements.add(m);
        return this;
    }

    @Override
    public String render() {
        StringBuilder builder = new StringBuilder();
        this.elements.forEach((MD m) -> builder.append(m.render()));
        return builder.toString();
    }

    public Vector<MD> getElements(){
        return this.elements;
    }
}
