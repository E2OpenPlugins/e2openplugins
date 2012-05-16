DESCRIPTION = "Handle your EPG on enigma2 from various sources (opentv, mhw, xmltv, custom sources)"
HOMEPAGE = "https://github.com/E2OpenPlugins/e2openplugin-CrossEPG"
DEPENDS += "libxml2 zlib python"
LICENSE = "LGPLv2"
MODULE = "CrossEPG"

inherit gitpkgv
SRCREV = ""
PV = "0.6.2+git${SRCPV}"
PKGV = "0.6.2+git${GITPKGV}"
PR = "r0"

require openplugins.inc

FILES_${PN} = "/usr/*"

CFLAGS_append = " -I${STAGING_INCDIR}/libxml2/ -I${STAGING_INCDIR}/python2.6/"

do_compile() {
	echo ${PKGV} > ${S}/VERSION
	oe_runmake SWIG="swig"
}

do_install() {
	oe_runmake 'D=${D}' install
}
