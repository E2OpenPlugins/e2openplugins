MODULE = "RemoteChannelStreamConverter"
DESCRIPTION = "Fetch channels from remote bouquets and make them available locally"
#RDEPENDS_${PN} = 
#PACKAGE_ARCH = "${MACHINE_ARCH}"

SRCREV = ""

inherit gitpkgv

PV = "1.0+git${SRCPV}"
PKGV = "${PV}"
PR = "r3"

require openplugins-distutils.inc
