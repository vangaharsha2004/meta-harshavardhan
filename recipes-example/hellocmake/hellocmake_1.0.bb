DESCRIPTION="recipe .bb for hellocmake"
LICENSE="CLOSED"
SRC_URI="file://hello.c \
	file://CMakeLists.txt"

S="${WORKDIR}"

do_compile(){
	
	mkdir -p build
	cd build
	cmake ..
	make
}

do_install(){

	install -d ${D}/usr/bin
	install -m 777 ${S}/build/hellocmake ${D}/usr/bin
}
