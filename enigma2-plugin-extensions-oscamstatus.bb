MODULE = "OscamStatus"
DESCRIPTION = "shows status of your oscam server"

RDEPENDS_${PN} = "python-requests"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

require assume-gplv2.inc

