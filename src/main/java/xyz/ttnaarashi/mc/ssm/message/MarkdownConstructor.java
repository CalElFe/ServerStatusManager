package xyz.ttnaarashi.mc.ssm.message;

import xyz.ttnaarashi.mc.ssm.message.markdown.basics.MD;
import xyz.ttnaarashi.mc.ssm.message.markdown.basics.Stem;
import xyz.ttnaarashi.mc.ssm.message.markdown.leafNode.HLine;
import xyz.ttnaarashi.mc.ssm.message.markdown.leafNode.NewLine;
import xyz.ttnaarashi.mc.ssm.message.markdown.leafNode.Space;
import xyz.ttnaarashi.mc.ssm.message.markdown.leafNode.Str;
import xyz.ttnaarashi.mc.ssm.message.markdown.stemNode.Code;
import xyz.ttnaarashi.mc.ssm.message.markdown.stemNode.SpecialEffect;
import xyz.ttnaarashi.mc.ssm.message.markdown.stemNode.Title;

import java.time.temporal.Temporal;

public class MarkdownConstructor {
    private Stem elements;

    public MarkdownConstructor() {
        this.elements = new Stem();
    }

    private MarkdownConstructor append(MD child) {
        this.elements.append(child);
        return this;
    }

    public MarkdownConstructor append(MarkdownConstructor child) {
        return this.append(child.elements);
    }

    public MarkdownConstructor addTitle(int level, MarkdownConstructor child) {
        return this.append(new Title(level).append(child.elements));
    }

    public MarkdownConstructor addHLine(int count) {
        return this.append(new HLine(count));
    }

    public MarkdownConstructor addNewLine(int count) {
        return this.append(new NewLine(count));
    }

    public MarkdownConstructor addSpace(int count) {
        return this.append(new Space(count));
    }

    public MarkdownConstructor addCode(String lang, String code){
        return this.append(new Code(lang).append(new Str(code)));
    }

    public MarkdownConstructor addStr(String str, Boolean isBold, Boolean isItalic, Boolean isDeleted){
        MD node = new Str(str);
        MD temp;

        if (isBold) {
            temp = new SpecialEffect("**").append(node);
            node = temp;
        }
        if (isItalic) {
            temp = new SpecialEffect("*").append(node);
            node = temp;
        }
        if (isDeleted) {
            temp = new SpecialEffect("~~").append(node);
            node = temp;
        }

        Stem stem = new Stem();
        stem.append(node).append(new NewLine(1));

        return this.append(stem);
    }

    public MarkdownConstructor addBold(MarkdownConstructor child) {
        return this.append(new SpecialEffect("**").append(child.elements)).addNewLine(1);
    }

    public MarkdownConstructor addItalic(MarkdownConstructor child) {
        return this.append(new SpecialEffect("*").append(child.elements)).addNewLine(1);
    }

    public MarkdownConstructor addDeleted(MarkdownConstructor child) {
        return this.append(new SpecialEffect("~~").append(child.elements)).addNewLine(1);
    }

    public String getText(){
        return this.elements.render();
    }

    @Override
    public String toString() {
        return this.getText();
    }
}
