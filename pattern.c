#include <stdio.h>

void printPattern(int n) {
   
    int size = 2 * n - 1;

   
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            
            int value = n - (i < j ? (i < size - 1 - j ? i : size - 1 - j) : (j < size - 1 - i ? j : size - 1 - i));
            printf("%d ", value);
        }
        printf("\n");
    }
}

int main() {
    int n;
    
    scanf("%d", &n);

   
    printPattern(n);

    return 0;
}
