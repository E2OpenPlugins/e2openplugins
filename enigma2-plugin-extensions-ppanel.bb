MODULE = "PPanel"
DESCRIPTION = "PPanel"

require openplugins-replace-pli.inc
require openplugins-distutils.inc
require assume-gplv2.inc

PACKAGES =+ "${PN}-example"
FILES_${PN}-example = "/etc/ppanel/PPanel_tutorial.xml"

SRCREV = "4ce6ca5915f2f7449f6945046f772169ccaefab6"
