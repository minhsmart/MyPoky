#include <stdio.h>

extern int add(int a, int b);
extern int sub(int a, int b);

int main(){
    int num1 = 10;
    int num2 = 5;

    printf("Add: %d\n", add(num1, num2));
    return 0;
}