#include <stdio.h>

extern int sub(int a, int b);

int main(){
    int num1 = 10;
    int num2 = 5;

    printf("Subtract: %d\n", sub(num1, num2));
    return 0;
}