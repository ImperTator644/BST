package com;

import com.BSTree.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing BSTree");
        System.out.println("Expected result - output");
        System.out.println();
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("empty(getRoot()) true - " + tree.empty(tree.getRoot()));

        tree.insert(9);
        tree.insert(8);
        tree.insert(12);
        tree.insert(14);
        tree.insert(17);
        tree.insert(5);
        tree.insert(7);
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);

        // current tree
        /*
                         9
                      8     12
                    5         14
                  2   7         17
                1  3
         */

        System.out.println("                 9");
        System.out.println("             8      12");
        System.out.println("          5           14");
        System.out.println("       2   7            17");
        System.out.println("     1  3");

        System.out.print("printInorder(getRoot()) 1, 2, 3, 5, 7, 8, 9, 12, 14, 17 - ");
        System.out.println(tree);
        System.out.println();

        System.out.print("insert(10) 1, 2, 3, 5, 7, 8, 9, 10, 12, 14, 17 - ");
        tree.insert(10);
        System.out.println(tree);
        System.out.println();

        // current tree
        /*
                         9
                      8     12
                    5     10  14
                  2   7         17
                1  3
         */

        System.out.println("                 9");
        System.out.println("             8     12");
        System.out.println("         5       10   14");
        System.out.println("       2   7             17");
        System.out.println("     1  3");

        System.out.println("delete(search(7)) 1, 2, 3, 5, 8, 9, 10, 12, 14, 17 - ");
        tree.delete(tree.search(7));
        System.out.println(tree);
        System.out.println();
        System.out.println("largestNumOfEdges(getRoot) 4 - " + tree.largestNumOfEdges(tree.getRoot()));

        // current tree
        /*
                         9
                      8     12
                    5     10  14
                  2             17
                1  3
         */

        System.out.println("                 9");
        System.out.println("             8     12");
        System.out.println("         5       10   14");
        System.out.println("       2                 17");
        System.out.println("     1  3");

        System.out.println("delete(search(5)) 1, 2, 3, 8, 9, 10, 12, 14, 17 - ");
        tree.delete(tree.search(5));
        System.out.println(tree);
        System.out.println();

        // current tree
        /*
                         9
                      8     12
                    2     10  14
                  1  3          17

         */

        System.out.println("                9");
        System.out.println("             8     12");
        System.out.println("          2      10   14");
        System.out.println("        1   3            17");

        System.out.println("countLeafs(getRoot) 4 - " + tree.countLeafs(tree.getRoot()));


        System.out.println("search(1) = minimum(getRoot()) - " + tree.search(1) + " = " + tree.minimum(tree.getRoot()));
        System.out.println("successor(search(12)).getValue() 14 - " + tree.successor(tree.search(12)).getValue());

        System.out.println("delete(search(12)) 1, 2, 3, 8, 9, 10, 14, 17 - ");
        tree.delete(tree.search(12));
        System.out.println(tree);
        System.out.println();

        // current tree
        /*
                         9
                      8     14
                    2     10  17
                  1  3

         */

        System.out.println("                9");
        System.out.println("             8     12");
        System.out.println("          2      10   17");
        System.out.println("        1   3 ");

        System.out.println("delete(search(8)) 1, 2, 3, 9, 10, 14, 17 - ");
        tree.delete(tree.search(8));
        System.out.println(tree);
        System.out.println();

        // current tree
        /*
                         9
                      2     14
                    1  3  10  17

         */

        System.out.println("                 9");
        System.out.println("             2       12");
        System.out.println("          1    3   10   17");

        System.out.println("getRoot().getValue() 9 - " + tree.getRoot().getValue());
        System.out.println("size(getRoot()) 7 - " + tree.size(tree.getRoot()));
        System.out.println("clear(getRoot()  -  ");
        tree.clear(tree.getRoot());
        System.out.println(tree);
        System.out.println();
        System.out.println("countLeafs(getRoot) 0 - " + tree.countLeafs(tree.getRoot()));
        System.out.println();
        System.out.println("size(getRoot()) 0 - " + tree.size(tree.getRoot()));

        tree.insert(24);
        tree.insert(16);
        tree.insert(27);
        tree.insert(11);
        tree.insert(9);
        tree.insert(17);
        tree.insert(12);
        tree.insert(3);
        tree.insert(1);
        tree.insert(28);

        //current tree
        /*
                         24
                    16        27
                 11    17         28
               9   12
             3
            1

         */

        System.out.println("Current tree: ");
        System.out.println();
        System.out.println("               24");
        System.out.println("           16        27");
        System.out.println("       11      17         28");
        System.out.println("     9   12");
        System.out.println("   3");
        System.out.println(" 1");


        BinarySearchTree anotherTree = new BinarySearchTree();
        anotherTree.insert(24);
        anotherTree.insert(16);
        anotherTree.insert(27);
        anotherTree.insert(11);
        anotherTree.insert(9);
        anotherTree.insert(17);
        anotherTree.insert(12);
        anotherTree.insert(3);
        anotherTree.insert(1);
        anotherTree.insert(28);

        //another tree
        /*
                         24
                    16        27
                 11    17         28
               9   12
             3
            1

         */

        System.out.println("Another tree: ");
        System.out.println();
        System.out.println("               24");
        System.out.println("           16        27");
        System.out.println("       11      17         28");
        System.out.println("     9   12");
        System.out.println("   3");
        System.out.println(" 1");

        System.out.println("tree.equals(anotherTree) true - " + tree.equals(anotherTree));

        anotherTree.insert(5);

        //another tree
        /*
                         24
                    16        27
                 11    17         28
               9   12
             3
            1 5

         */

        System.out.println();
        System.out.println("Another tree: ");
        System.out.println();
        System.out.println("               24");
        System.out.println("           16        27");
        System.out.println("       11      17         28");
        System.out.println("     9   12");
        System.out.println("   3");
        System.out.println(" 1   5");

        System.out.println("tree.equals(anotherTree) false - " + tree.equals(anotherTree));
    }
}
