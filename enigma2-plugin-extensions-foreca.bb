MODULE = "Foreca"
DESCRIPTION = "Weather forecast"
RDEPENDS_${PN} = "python-html"

inherit gitpkgv
PV = "2.1+git${SRCPV}"
PKGV = "2.1+git${GITPKGV}"
PR = "r0"

require openplugins-distutils.inc

FILES_${PN} += "/etc/enigma2/Foreca"
CONFFILES_${PN} = "/etc/enigma2/Foreca/City.cfg /etc/enigma2/Foreca/Filter.cfg"

