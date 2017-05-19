MODULE = "EPGImportFilter"
DESCRIPTION = "EPGImport Filter"

RDEPENDS_${PN} = "\
	python-difflib \
	python-shell \
	"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

require openplugins-distutils.inc

require assume-gplv2.inc

SRCREV = "911e8bb92a9c4082a0fe6fa5526200abbb283390"
