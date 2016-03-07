DESCRIPTION = "Test cmake application"
SECTION = "examples"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"
PR = "r0"

SRC_URI = "git://github.com/calboyd/testCmake.git;protocol=git;rev=3562e127b8efbd93ca8cfa6174572f9a705db81e"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

do_install() {
	install -d ${D}/usr/bin
	install -m 0755 ${WORKDIR}/build/SquareRoot ${D}/usr/bin
}

FILES_${PN} = "/usr/bin/SquareRoot"
