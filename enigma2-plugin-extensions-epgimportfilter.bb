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
