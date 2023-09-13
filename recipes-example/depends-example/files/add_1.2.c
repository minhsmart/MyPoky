#include <stdio.h>

extern int add(int a, int b);

int main(){
    int num1 = 10;
    int num2 = 5;
    int num3 = 7;

    printf("Add v1.2: %d\n", add(add(num1, num2), num3));
    return 0;
}