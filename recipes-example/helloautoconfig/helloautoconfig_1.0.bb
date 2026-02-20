DESCRIPTION="recipe .bb file for autoconfig"
LICENSE="CLOSED"
SRC_URI="file://hello.c \
	file://Makefile.am \
	file://configure.ac"

S="${WORKDIR}"

inherit autotools
