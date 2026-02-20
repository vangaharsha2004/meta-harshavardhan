DESCRIPTION = "Recipe for static library example"
LICENSE = "CLOSED"

SRC_URI = "file://main.c \
           file://math.c \
           file://math.h"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${LDFLAGS} -fpic -c math.c -o math.o

    ${CC} ${LDFLAGS} -shared -o libmath.so math.o

    ${CC} ${LDFLAGS} main.c -L${S} -lmath -o app
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 app ${D}${bindir}
}

