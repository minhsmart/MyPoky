SUMMARY = "Math library for basic arithmetic operations"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://lib-add.c \
           file://lib-subtract.c \
           file://lib-multiply.c \
           file://adv-calculator.c \
           file://Makefile \
           "

S = "${WORKDIR}"

LIBS = "lib-add.c\ lib-subtract.c\ lib-multiply.c"

EXTRA_OEMAKE:append = " DESTDIR=${D} BINDIR=${bindir}" 
EXTRA_OEMAKE:append = " TARGET=${PN} Libs=${LIBS}"

do_compile() {
    #${CC} ${CFLAGS} -c adv-math-lib.c -o adv-math-lib.o
    #${CC} ${CFLAGS} -c adv-calculator.c -o adv-calculator.o
    #${CC} ${CFLAGS} ${LDFLAGS} adv-math-lib.o adv-calculator.o -o adv-calculator -Wl,--hash-style=gnu

    #oe_runmake adv_calculator
    oe_runmake 
}

do_install() {
#install -d ${D}${bindir}
#install -m 0755 adv-calculator ${D}${bindir}

    #oe_runmake install DESTDIR=${D} BINDIR=${bindir}
    oe_runmake install 
}

#oe_runmake adv_calculator
#oe_runmake

