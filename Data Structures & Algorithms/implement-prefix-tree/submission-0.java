class PrefixTree {

    private  static class TreeNode {
        TreeNode[] children  = new TreeNode[26];
        Boolean isEndOfWord=false;
    }

    private TreeNode root;

    public PrefixTree() {
        this.root = new TreeNode();
    }

    public void insert(String word) {
        TreeNode curr = this.root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TreeNode();
            }

            curr=curr.children[idx];
        }

        curr.isEndOfWord=true;
    }

    public boolean search(String word) {
        TreeNode curr =  root;
        for(int i =0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }

            curr=curr.children[idx];
        }

        return curr.isEndOfWord==true;
    }

    public boolean startsWith(String prefix) {
        TreeNode curr = this.root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr=curr.children[idx];
        }

        return true;
    }

}
