package minheapchecker;

import java.util.Scanner;

public class MinHeapChecker {
  public static void main(String[] args) {
      String input;
      // Get input from the user
      try (Scanner sc = new Scanner(System.in)) {
          // Get input from the user
          System.out.print("Enter a list of numbers, separated by commas: ");
          input = sc.nextLine();
      }

    // Split the input string into an array of numbers
    String[] nums = input.split(",");
    int[] array = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      array[i] = Integer.parseInt(nums[i]);
    }

    // Check if the array is a min heap
    boolean isMinHeap = isMinHeap(array);
    if (isMinHeap) {
      System.out.println("Yes, this is a min heap.");
    } else {
      System.out.println("No, this is not a min heap.");
    }

    // Convert the array to a min heap
    array = makeMinHeap(array);

    // Print the min heap
    System.out.print("Min heap: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  // Returns true if the given array is a min heap, false otherwise
  public static boolean isMinHeap(int[] array) {
    // Check if each parent node is less than or equal to its children
    for (int i = 0; i < array.length / 2; i++) {
      int leftChild = 2 * i + 1;
      int rightChild = 2 * i + 2;

      if (leftChild < array.length && array[i] > array[leftChild]) {
        return false;
      }
      if (rightChild < array.length && array[i] > array[rightChild]) {
        return false;
      }
    }
    return true;
  }

  // Converts the given array to a min heap
  public static int[] makeMinHeap(int[] array) {
    // Convert the array to a min heap using the bottom-up heap construction algorithm
    for (int i = array.length / 2 - 1; i >= 0; i--) {
      heapify(array, array.length, i);
    }
    return array;
  }

  // Helper function for makeMinHeap
  // Repairs the heap property at the given node in the given heap
  public static void heapify(int[] heap, int heapSize, int node) {
    int leftChild = 2 * node + 1;
    int rightChild = 2 * node + 2;
    int smallest = node;

    if (leftChild < heapSize && heap[leftChild] < heap[smallest]) {
      smallest = leftChild;
    }
    if (rightChild < heapSize && heap[rightChild] < heap[smallest]) {
      smallest = rightChild;
    }
    if (smallest != node) {
      // Swap the node with
    }
  }
}
