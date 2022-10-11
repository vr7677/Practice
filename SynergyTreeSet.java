import java.util.*;
public class SynergyTreeSet {

    /**     SYNERGYTREESET PRESENTS:
     *      TREESETS
     *      Tree Sets are "self-balancing binary search trees"
     *      What does that mean?
     *      Tree Sets, as an implementation of the Set Interface, sift through
     *      elements and order them by their natural ordering (ascending)
     *      even if a comparator is or is not provided. TreeSets also do not
     *      allow duplicates.
     *
     *      TreeSets are different from HashSets as HashSets don't order any
     *      of the elements it sifts through while TreeSet does.
     **/

    /**
     *      HONOURABLE MENTIONS
     *
     *      Red-Black Tree
     *      An amazing implementation of the TreeSet library used for
     *      optimization and time complexity for complex algorithms
     *
     *      SortedSet and NavigableSet
     *      Allows for easier ways to partition the data set based on
     *      certain arguments (comparators) that you pass through
     *
     *      Iterator
     *      Can change the order of the elements in ascending and descending
     */


    // The TreeAdding function would replace the treeSet.add method
    //Which allows for a new node to be created within the tree
    public static void TreeAdding(){
        int[] tree = new int[10];
        for(int i = 0; i <= tree.length; i++){
            tree[i] = i + 1;
            System.out.println(tree[i]);
        }
    }

     //Logical model of .isEmpty()
     //This method is used to determine whether the given set has any remaining elements
    public static boolean EmptyTree(){
        int[] tree2 = new int[10];
        if(tree2.length > 0){
            System.out.println("Array is empty.");
        }
        return false;
    }

    //Logical Model of the Remove Method found in Tree Set
    public static void TrimTree(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr_new = new int[arr.length - 1];
        int nodes=3;
        for(int noders=0, moders=0; noders<arr.length; i++){
            int j;
            if(noders!=j){
                arr_new[moders]=arr[noders];
                moders++;
            }
        }
        System.out.println("Before: " + Arrays.toString(arr));
        System.out.println("After: " + Arrays.toString(arr_new));
    }

    //Logical Model of Navigable Set


}
