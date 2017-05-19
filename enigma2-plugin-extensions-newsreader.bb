MODULE = "NewsReader"
DESCRIPTION = "RSS reader"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

FILES_${PN} += "/etc/feeds.xml"
CONFFILES_${PN} = "/etc/feeds.xml"

require assume-gplv2.inc

SRCREV = "a8abae039fcb67f78fdf25267997d9ff6b4fb3bf"
