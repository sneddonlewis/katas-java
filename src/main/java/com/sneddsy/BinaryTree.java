package com.sneddsy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BinaryTree {
    public static List<Integer> preOrderSearch(BinaryNode<Integer> head) {
        return walkPreOrder(Optional.of(head), new ArrayList<>());
    }

    private static List<Integer> walkPreOrder(
            Optional<BinaryNode<Integer>> current,
            List<Integer> path) {
        if (current.isEmpty()) {
            return path;
        }

        // recurse
        // pre
        path.add(current.get().getValue());

        // recurse
        walkPreOrder(current.get().getLeft(), path);
        walkPreOrder(current.get().getRight(), path);

        // post
        return path;
    }

    public static List<Integer> inOrderSearch(BinaryNode<Integer> head) {
        return walkInOrder(Optional.of(head), new ArrayList<>());
    }

    private static List<Integer> walkInOrder(
            Optional<BinaryNode<Integer>> current,
            List<Integer> path) {
        if (current.isEmpty()) {
            return path;
        }

        // recurse
        // pre

        // recurse
        walkInOrder(current.get().getLeft(), path);
        path.add(current.get().getValue());
        walkInOrder(current.get().getRight(), path);

        // post
        return path;
    }

    public static List<Integer> postOrderSearch(BinaryNode<Integer> head) {
        return walkPostOrder(Optional.of(head), new ArrayList<>());
    }

    private static List<Integer> walkPostOrder(
            Optional<BinaryNode<Integer>> current,
            List<Integer> path) {
        if (current.isEmpty()) {
            return path;
        }

        // recurse
        // pre

        // recurse
        walkPostOrder(current.get().getLeft(), path);
        path.add(current.get().getValue());
        walkPostOrder(current.get().getRight(), path);

        // post
        return path;
    }
}
