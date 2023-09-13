#include <stdio.h>

// extern int add(int a, int b);
// extern int sub(int a, int b);
// extern int multiply(int a, int b);

int main(){
    int num1 = 19;
    int num2 = 22;

    printf("Adv calculator\n");
    printf("Add: %d\n", add(num1, num2));
    printf("Sub: %d\n", sub(num1, num2));
    printf("Multiply: %d\n", multiply(num1, num2));
    return 0;
}