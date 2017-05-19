MODULE = "MeteoItalia"
DESCRIPTION = "Forecast Italy"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc

require assume-gplv2.inc

SRCREV = "c213aafe46ba520f6029828abfc12432c34f97cc"
