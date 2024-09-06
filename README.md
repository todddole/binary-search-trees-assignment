# Binary Search Trees

### Assignment by Todd Dole for CSCI-3323 at Hardin-Simmons University.

This assignment requires the student to implement code for a binary search tree class (BinarySearchTree).

Junit5 unit tests are included for each method in the BinarySearchTree class.  Students must get all the tests to pass.  Tests can be run using the Gradle command:  
  
```./gradlew build```

BinarySearchTree is used by the BibleTree class to store the text of the Bible, with each verse of the Bible being stored as one node in the tree.



The project includes two applications:

```./gradlew runVerseLookup  ```
  
  Accepts a verse reference from Standard Input, and displays the text of the verse.  

```./gradlew runBibleTree  ```
  
  Recursively searches the tree and prints each node, producing the entire text of the Bible as output.
