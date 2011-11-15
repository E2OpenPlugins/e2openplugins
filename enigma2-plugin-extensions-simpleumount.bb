MODULE = "SimpleUmount"
DESCRIPTION = "Unmounter for mass storage devices"
MAINTAINTER = "ambrosa"

inherit gitpkgv
PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"
PR = "r0"

require openplugins-distutils.inc
SRC_URI = "git://github.com/ambrosa/e2openplugin-SimpleUmount.git;protocol=git"

