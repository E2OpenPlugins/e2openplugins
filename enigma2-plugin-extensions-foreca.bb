MODULE = "Foreca"
DESCRIPTION = "Weather forecast"
RDEPENDS_${PN} = "python-html"

inherit gitpkgv
PV = "1.9+git${SRCPV}"
PKGV = "1.9+git${GITPKGV}"
PR = "r2"

require openplugins-distutils.inc
