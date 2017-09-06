MODULE = "AutoShutDown"
DESCRIPTION = "automated power off for STB"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit gitpkgv

PV = "0.6+git${SRCPV}"
PKGV = "0.6+git${GITPKGV}"
PR = "r0"

require openplugins.inc

inherit autotools gettext

FILES_${PN} = "/"

require assume-gplv2.inc

SRCREV = "b0ca70667886d9dd78d7adedca9913ed27a8d2a1"
