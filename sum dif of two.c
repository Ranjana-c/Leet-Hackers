#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int num1, num2;
    float float1, float2;

    scanf("%d %d", &num1, &num2);
    scanf("%f %f", &float1, &float2);

    int sum_int = num1 + num2;
    int diff_int = num1 - num2;

    float sum_float = float1 + float2;
    float diff_float = float1 - float2;

    printf("%d %d\n", sum_int, diff_int);
    printf("%.1f %.1f\n", sum_float, diff_float);

    return 0;
}
