MODULE = "StreamInterface"
DESCRIPTION = "Stream webinterface on port 40080"

RDEPENDS_${PN} = "python-twisted-web"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

require assume-gplv2.inc

SRCREV = "ba2d0620a70d1645ad4d7dbcc166b1d9cc81b37a"
