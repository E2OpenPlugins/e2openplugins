MODULE = "RemoteChannelStreamConverter"
DESCRIPTION = "Fetch channels from remote bouquets and make them available locally"

RDEPENDS_${PN} = "python-shell"

PR="r0"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

require assume-gplv2.inc

SRCREV = "baaad0038e26cde4d15e67205fdcb4217ea5a749"
