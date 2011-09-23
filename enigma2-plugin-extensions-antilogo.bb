MODULE = "AntiLogo"
DESCRIPTION = "Prevent logo retention"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc
