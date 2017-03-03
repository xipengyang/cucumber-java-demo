package com.github.xipengyang.demo.holder;

/**
 * Created by davidyang on 3/03/17.
 */
public class GenericHolder<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
