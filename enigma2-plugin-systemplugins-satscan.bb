MODULE = "Satscan"
DESCRIPTION = "Blind scan on DVB-S"
RDEPENDS_${PN} = "virtual/blindscan-dvbs"
RDEPENDS_${PN} += "python-subprocess"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRCREV = ""

inherit gitpkgv

PV = "1.1+git${SRCPV}"
PKGV = "${PV}"
PR = "r4"

require openplugins-distutils.inc

require assume-gplv2.inc
