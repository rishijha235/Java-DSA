// Package Trees.SegmentTrees;

class Main {
  public static void main(String[] args) {
    int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
    SegmentTree tree = new SegmentTree(arr);
    tree.display();
    // tree.update(2, 7);

    System.out.println(tree.query(1, 6));
  }
}
