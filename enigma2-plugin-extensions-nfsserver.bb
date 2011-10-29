MODULE = "NfsServer"
DESCRIPTION = "NFS server configuration"

RDEPENDS_${PN} = "nfs-utils"

require openplugins-replace-pli.inc

require openplugins-distutils.inc
