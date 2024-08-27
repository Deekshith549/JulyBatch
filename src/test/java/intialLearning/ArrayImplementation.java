package intialLearning;

public class ArrayImplementation {

    public static void main(String[] args) {
        int[] N = {5, 10, 20, 21, 25, 25, 30, 31, 24, 34, 45, 30};
        
        String [] s= {"Dee","Kar","Poo","Sri","Pri","Dee","Kar","Dee","Kar","Poo","Sri","Dee","Kar","Poo","Sri","Pri","Dee","Kar"};

        System.out.println("The value at index 6 is: " + N[6]);

        int[] visited = new int[N.length];  // Array to keep track of visited elements
        int visitedFlag = -1;

        System.out.println("\nFrequency of each number:");

        for (int i = 0; i < N.length; i++) {
            if (visited[i] == visitedFlag) {
                continue;  // Skip already counted elements
            }

            int count = 1;  // Start counting this element

            for (int j = i + 1; j < N.length; j++) {
                if (N[i] == N[j]) {
                    count++;
                    visited[j] = visitedFlag;  // Mark this element as counted
                }
            }

            System.out.println(N[i] + " is repeated " + count + " times");
        }
    }
}

