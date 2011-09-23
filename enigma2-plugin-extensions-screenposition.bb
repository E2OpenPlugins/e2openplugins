MODULE = "ScreenPosition"
DESCRIPTION = "Adjust the screen position"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc
