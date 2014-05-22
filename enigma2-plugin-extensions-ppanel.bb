MODULE = "PPanel"
DESCRIPTION = "PPanel"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

require assume-gplv2.inc

PACKAGE_ARCH = "all"

PACKAGES =+ "${PN}-example"
FILES_${PN}-example = "/etc/ppanel/PPanel_tutorial.xml"
