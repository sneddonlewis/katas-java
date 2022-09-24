package com.sneddsy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BinaryTree {
    public static List<Integer> preOrderSearch(BinaryNode<Integer> head) {
        return walk(Optional.of(head), new ArrayList<>());
    }

    private static List<Integer> walk(
            Optional<BinaryNode<Integer>> current,
            List<Integer> path) {
        if (current.isEmpty()) {
            return path;
        }

        // recurse
        // pre
        path.add(current.get().getValue());

        // recurse
        walk(current.get().getLeft(), path);
        walk(current.get().getRight(), path);

        // post
        return path;
    }
}
