MODULE = "ChangeRootPassword"
DESCRIPTION = "Set/Change your box password"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc

require assume-gplv2.inc

SRCREV = "80ecfa54e4cedc794e49202e4eeae15eb469247f"
