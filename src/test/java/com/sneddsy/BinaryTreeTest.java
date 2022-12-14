package com.sneddsy;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BinaryTreeTest extends TestCase {

    BinaryNode<Integer> testTreeOne;
    BinaryNode<Integer> testTreeTwo;
    public void setUp() throws Exception {
        super.setUp();
        {
            var node7 = new BinaryNode<>(7, Optional.empty(), Optional.empty());
            var node5 = new BinaryNode<>(5, Optional.empty(), Optional.of(node7));
            var node15 = new BinaryNode<>(15, Optional.empty(), Optional.empty());
            var node10 = new BinaryNode<>(10, Optional.of(node5), Optional.of(node15));
            var node29 = new BinaryNode<>(29, Optional.empty(), Optional.empty());
            var node45 = new BinaryNode<>(45, Optional.empty(), Optional.empty());
            var node100 = new BinaryNode<>(100, Optional.empty(), Optional.empty());
            var node30 = new BinaryNode<>(30, Optional.of(node29), Optional.of(node45));
            var node50 = new BinaryNode<>(50, Optional.of(node30), Optional.of(node100));
            testTreeOne = new BinaryNode<>(20, Optional.of(node10), Optional.of(node50));
        }

        var node7 = new BinaryNode<>(7, Optional.empty(), Optional.empty());
        var node5 = new BinaryNode<>(5, Optional.empty(), Optional.of(node7));
        var node15 = new BinaryNode<>(15, Optional.empty(), Optional.empty());
        var node10 = new BinaryNode<>(10, Optional.of(node5), Optional.of(node15));
        var node21 = new BinaryNode<>(21, Optional.empty(), Optional.empty());
        var node29 = new BinaryNode<>(29, Optional.empty(), Optional.of(node21));
        var node49 = new BinaryNode<>(49, Optional.empty(), Optional.empty());
        var node45 = new BinaryNode<>(45, Optional.empty(), Optional.of(node49));
        var node30 = new BinaryNode<>(30, Optional.of(node29), Optional.of(node45));
        var node50 = new BinaryNode<>(50, Optional.of(node30), Optional.empty());
        testTreeTwo = new BinaryNode<>(20, Optional.of(node10), Optional.of(node50));
    }

    public void testPreOrderSearch() {
        List<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(10);
        expected.add(5);
        expected.add(7);
        expected.add(15);
        expected.add(50);
        expected.add(30);
        expected.add(29);
        expected.add(45);
        expected.add(100);

        var actual = BinaryTree.preOrderSearch(testTreeOne);
        assertEquals(expected, actual);
    }

    public void testInOrderSearch() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(7);
        expected.add(10);
        expected.add(15);
        expected.add(20);
        expected.add(29);
        expected.add(30);
        expected.add(45);
        expected.add(50);
        expected.add(100);

        var actual = BinaryTree.inOrderSearch(testTreeOne);
        assertEquals(expected, actual);
    }

    public void testPostOrderSearch() {
        List<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(5);
        expected.add(15);
        expected.add(10);
        expected.add(29);
        expected.add(45);
        expected.add(30);
        expected.add(100);
        expected.add(50);
        expected.add(20);

        var actual = BinaryTree.postOrderSearch(testTreeOne);
        assertEquals(expected, actual);
    }
}