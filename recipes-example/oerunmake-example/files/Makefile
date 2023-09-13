# Complier and flags
CC := ${CC}
CFLAGS := ${CFLAGS}

#TARGET ?= adv-calculator
#Libs ?= lib*.c #lib-add.c lib-subtract.c lib-multiply.c
TARGET ?= ''
Libs ?= ''

MAIN_SRC ?= adv-calculator.c # $(TARGET).c

# Source files
SRCS := $(MAIN_SRC) $(Libs)

# Object files
OBJS := $(SRCS:.c = .o)

# Binary output

all: $(TARGET)

$(TARGET) : $(OBJS) 
	$(CC) $(CFLAGS) $(LDFLAGS) $^ -o $@ -Wl,--hash-style=gnu

%.o : %.c
	$(CC) $(CFLAGS) -c $< -o $@
install:
	install -d ${DESTDIR}${BINDIR}
	install -m 0755 $(TARGET) ${DESTDIR}${BINDIR}

clean:
	rm -f $(MATH_LIB_OBJ) $(CALC_OBJ) $(TARGET)


