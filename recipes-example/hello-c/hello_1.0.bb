DESCRIPTION="recipe .bb file for hello"
LICENSE="CLOSED"
SRC_URI="file://hello.c"

S = "${WORKDIR}"

do_compile(){

	cd ${S}
	${CC} ${LDFLAGS} hello.c -o hello
}

do_install(){

	install -d ${D}/usr/bin
	install -m 777 ${S}/hello ${D}/usr/bin
}
