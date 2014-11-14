MODULE = "SeriesPlugin"
DESCRIPTION = "Find and rename series"
RDEPENDS_${PN} = "python-difflib, python-html, python-json, python-shell, python-re, python-xml, python-ctypes"

require openplugins-distutils.inc

require assume-gplv2.inc
