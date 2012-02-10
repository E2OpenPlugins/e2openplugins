MODULE = "Bh_Tuner-Server"
DESCRIPTION = "Allow stream from current box tuners"

SRCREV = ""

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc
