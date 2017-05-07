MODULE = "PPanel"
DESCRIPTION = "PPanel"

require openplugins-replace-pli.inc
require openplugins-distutils.inc
require assume-gplv2.inc

inherit allarch

PACKAGES =+ "${PN}-example"
FILES_${PN}-example = "/etc/ppanel/PPanel_tutorial.xml"
