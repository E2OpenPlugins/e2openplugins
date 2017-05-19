MODULE = "SnmpAgent"
DESCRIPTION = "SNMP Agent"

RDEPENDS_${PN} = "enigma2-plugin-extensions-bitrate twistedsnmp"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

require assume-gplv2.inc

SRCREV = "461b207bb79f79640db813a974601d4637d17b09"
