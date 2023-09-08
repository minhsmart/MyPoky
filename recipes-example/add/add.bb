SUMMARY = "Math library for basic arithmetic operations"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://math_lib.c \
           file://add.c "

S = "${WORKDIR}"

PROVIDES = "libmath"

do_compile() {
    ${CC} ${CFLAGS} -c math_lib.c -o math_lib.o
    ar rcs libmath.a math_lib.o

    ${CC} ${CFLAGS} -c add.c -o add_inter.o
    ${CC} ${CFLAGS} ${LDFLAGS} math_lib.o add_inter.o -o add -Wl,--hash-style=gnu

}

do_install() {

install -d ${D}${libdir}
install -m 0644 libmath.a ${D}${libdir}

install -d ${D}${bindir}
install -m 0755 add ${D}${bindir}
}

FILES:${PN} += "${libdir}/libmath.a"

