MODULE = "EPGImportFilter"
DESCRIPTION = "EPGImport Filter"

RDEPENDS_${PN} = "\
	python-difflib \
	python-shell \
	"
require openplugins-distutils.inc

require assume-gplv2.inc
