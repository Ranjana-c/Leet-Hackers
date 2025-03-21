#include <stdio.h>

int main() {
    int n;
    
    // Step 1: Read the number of elements in the array
    scanf("%d", &n);
    
    // Step 2: Declare the array
    int arr[n];
    
    // Step 3: Read the array elements
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    
    // Step 4: Reverse the array in place
    int start = 0, end = n - 1;
    while (start < end) {
        // Swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // Move the pointers
        start++;
        end--;
    }
    
    // Step 5: Print the reversed array
    for (int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if (i < n - 1) {
            printf(" "); // Print space between numbers
        }
    }
    printf("\n"); // Print a newline at the end
    
    return 0;
}
