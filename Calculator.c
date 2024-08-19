#include <stdio.h>

int main() 
{
    int num1, num2, sum;

    printf("Introduce el primer número: ");
    scanf("%d", &num1);

    printf("Introduce el segundo número: ");
    scanf("%d", &num2);

    sum = num1 + num2;

    printf("La suma de %d y %d es: %d\n", num1, num2, sum);

    return 0;
}
