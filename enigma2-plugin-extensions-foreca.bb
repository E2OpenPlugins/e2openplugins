MODULE = "Foreca"
DESCRIPTION = "Weather forecast for the upcoming 10 days"
RDEPENDS_${PN} = "python-html"

inherit gitpkgv
PV = "git${SRCPV}"
PKGV = "git${GITPKGV}"
PR = "r0"

require openplugins-distutils.inc

FILES_${PN} += "/etc/enigma2/Foreca"
CONFFILES_${PN} = "/etc/enigma2/Foreca/City.cfg /etc/enigma2/Foreca/Filter.cfg"

require assume-gplv2.inc

SRCREV = "7867e1cfc8bf58bd584a97d7ad217b99cf8550ca"
