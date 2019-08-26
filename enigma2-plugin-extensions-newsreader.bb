MODULE = "NewsReader"
DESCRIPTION = "RSS reader"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

FILES_${PN} += "${sysconfdir}/feeds.xml"
CONFFILES_${PN} = "${sysconfdir}/feeds.xml"

require assume-gplv2.inc
