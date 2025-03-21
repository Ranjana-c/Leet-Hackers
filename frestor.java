#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    
    // Step 1: Read the number of elements in the array
    scanf("%d", &n);

    // Step 2: Dynamically allocate memory for the array
    int *arr = (int*)malloc(n * sizeof(int));

    // Step 3: Check if memory allocation is successful
    if (arr == NULL) {
        printf("Memory allocation failed!\n");
        return 1; // Exit if allocation fails
    }

    // Step 4: Read the elements into the array
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Step 5: Calculate the sum of the elements
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }

    // Step 6: Print the sum
    printf("%d\n", sum);

    // Step 7: Free the dynamically allocated memory
    free(arr);

    return 0;
}
