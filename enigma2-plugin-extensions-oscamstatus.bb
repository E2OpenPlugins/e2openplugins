MODULE = "OscamStatus"
DESCRIPTION = "shows status of your oscam server"

RDEPENDS_${PN} = "python-requests"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r0"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

require assume-gplv2.inc

