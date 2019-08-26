MODULE = "PPanel"
DESCRIPTION = "PPanel"

require openplugins-replace-pli.inc
require openplugins-distutils.inc
require assume-gplv2.inc

PACKAGES =+ "${PN}-example"
FILES_${PN}-example = "${sysconfdir}/ppanel/PPanel_tutorial.xml"
