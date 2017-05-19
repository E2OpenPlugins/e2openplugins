MODULE = "OggiSport"
DESCRIPTION = "Italian daily Sport Tv guide"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc

require assume-gplv2.inc

SRCREV = "1d9c9fcc925380eea1476d671c2d46be5287b633"
