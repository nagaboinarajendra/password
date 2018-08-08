package com.epam.chain;

public interface Chain {
public abstract void setNext(Chain next);
public abstract void process(String passsword);
}
