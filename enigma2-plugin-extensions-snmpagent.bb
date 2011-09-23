MODULE = "SnmpAgent"
DESCRIPTION = "SNMP Agent"

RDEPENDS = "enigma2-plugin-extensions-bitrate twistedsnmp"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc
