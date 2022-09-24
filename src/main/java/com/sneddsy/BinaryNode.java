package com.sneddsy;

import java.util.Optional;

public class BinaryNode<T> {
    private T value;
    private Optional<BinaryNode<T>> left;
    private Optional<BinaryNode<T>> right;

    public BinaryNode(T value, Optional<BinaryNode<T>> left, Optional<BinaryNode<T>> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Optional<BinaryNode<T>> getLeft() {
        return left;
    }

    public void setLeft(Optional<BinaryNode<T>> left) {
        this.left = left;
    }

    public Optional<BinaryNode<T>> getRight() {
        return right;
    }

    public void setRight(Optional<BinaryNode<T>> right) {
        this.right = right;
    }
}
