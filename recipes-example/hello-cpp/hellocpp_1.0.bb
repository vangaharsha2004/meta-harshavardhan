DESCRIPTION="receipe file for hellocpp"
LICENSE="CLOSED"
SRC_URI="file://hellocpp.cpp"

S="${WORKDIR}"

do_compile(){
	
	cd ${S}
	${CXX} ${LDFLAGS} hellocpp.cpp -o hellocpp
}

do_install(){

	install -d ${D}/usr/bin
	install -m 777 ${S}/hellocpp ${D}/usr/bin
}
