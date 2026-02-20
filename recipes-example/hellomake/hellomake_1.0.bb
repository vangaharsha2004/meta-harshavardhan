DESCRIPTION="recipe .bb file for hellomake"
LICENSE="CLOSED"
SRC_URI="file://hello.c \
	file://Makefile"

S="${WORKDIR}"

do_compile(){

	cd ${S}
	make

}

do_install(){
	
	install -d ${D}/usr/bin
	install -m 777 ${S}/hellomake ${D}/usr/bin
}
