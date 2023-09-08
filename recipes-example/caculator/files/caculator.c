#include <stdio.h>

extern int add(int a, int b);
extern int sub(int a, int b);

int main(){
    int num1 = 19;
    int num2 = 3;

    printf("Add: %d\n", add(num1, num2));
    printf("Sub: %d\n", sub(num1, num2));
    return 0;
}