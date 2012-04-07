MODULE = "Satscan"
DESCRIPTION = "Blind scan on DVB-S"
RDEPENDS_${PN} = "virtual/satscanutils"
RDEPENDS_${PN} += "python-subprocess"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRCREV = ""

inherit gitpkgv

PV = "1.0+git${SRCPV}"
PKGV = "${PV}"
PR = "r2"

require openplugins-distutils.inc
