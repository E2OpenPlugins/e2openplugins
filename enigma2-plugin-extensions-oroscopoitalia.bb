MODULE = "OroscopoItalia"
DESCRIPTION = "Italian ppl horoscope"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

require openplugins-distutils.inc

require assume-gplv2.inc

SRCREV = "e370da9530ce840eefa64e45d139301ef28dcd53"
