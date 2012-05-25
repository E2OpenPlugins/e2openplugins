MODULE = "ShootYourScreen"
DESCRIPTION = "create screenshots with remote control of your STB"
PACKAGE_ARCH = "${MACHINE_ARCH}"
RDEPENDS_${PN} = "aio-grab"

inherit gitpkgv
SRCREV = ""
PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"
PR = "r5"

require openplugins.inc

inherit autotools

FILES_${PN} = "/"

require assume-gplv2.inc
