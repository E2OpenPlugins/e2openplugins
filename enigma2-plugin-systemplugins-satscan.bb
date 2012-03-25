MODULE = "Satscan"
DESCRIPTION = "Blind scan on DVB-S"
RDEPENDS_${PN} = virtual/satscanutils
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRCREV = ""

inherit gitpkgv

PV = "1.0+git${SRCPV}"
PKGV = "${PV}"
PR = "r1"

require openplugins-distutils.inc

#EXTRA_OECONF = "--with-boxtype=${MACHINE}"
