public class ClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        int closest = tree.value;

        return -1;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
