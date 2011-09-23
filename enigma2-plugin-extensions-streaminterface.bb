MODULE = "StreamInterface"
DESCRIPTION = "Stream webinterface on port 40080"

RDEPENDS = "python-twisted-web"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc
