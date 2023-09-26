#include <sys/ioctl.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

#define MAJOR_NUM 248

#define IOCTL_SET_MIXED _IO(MAJOR_NUM, 0)
#define IOCTL_SET_UPPER _IO(MAJOR_NUM, 1)

int main(int argc, char **argv)
{
    if(argc != 2){
        printf("ERROR: need to specify mode.\n");
    }

    int fd = open("/dev/hello", O_RDWR);
    if(fd < 0){
        printf("can't open\n");
        exit(0);
    }

    int rc;
    switch(atoi(argv[1])){
        case 0:
            rc = ioctl(fd, IOCTL_SET_MIXED, 0);
            break;

        case 1:
            rc = ioctl(fd, IOCTL_SET_UPPER, 0);
            break;
    }

    close(fd);

    printf("%d\n", rc);
    return 0;
}