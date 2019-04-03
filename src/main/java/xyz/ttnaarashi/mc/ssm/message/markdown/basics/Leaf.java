package xyz.ttnaarashi.mc.ssm.message.markdown.basics;

import xyz.ttnaarashi.mc.ssm.message.markdown.exception.EndOfChainException;

public abstract class Leaf extends MD {
    @Override
    public MD append(MD m) {
        try {
            throw new EndOfChainException("You are trying to append node to a end point, which is unavailable.");
        } catch (EndOfChainException e){
            e.printStackTrace();
        }
        return null;
    }
}
