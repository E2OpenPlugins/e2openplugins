DESCRIPTION = "28.2E stream bouquet downloader"
SUMMARY = "scan dvb data for automatic bouquets creation on Enigma2 STB"
MAINTAINER = "LraiZer"
HOMEPAGE = "https://github.com/LraiZer/AutoBouquets"
SECTION = "extra"
PRIORITY = "optional"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=a23a74b3f4caf9616230789d94217acb \
    file://COPYING;md5=036b9f2d884ff3a35bed6ab09bafff32 \
"

inherit gitpkgv

AUTOBOUQUETS_BRANCH ?= "release"
SRCREV = "${AUTOREV}"
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"

INHIBIT_PACKAGE_STRIP = "1"

SRC_URI="git://github.com/LraiZer/AutoBouquets.git;branch=${AUTOBOUQUETS_BRANCH}"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/lib/enigma2/python/Plugins/Extensions/AutoBouquets"
D_FILES_PN = "${D}${FILES_${PN}}"

EXTRA_OECONF = ""

do_install() {
    install -d ${D_FILES_PN}
    install -d ${D_FILES_PN}/locale
    install -m 644 ${S}/autobouquets.png ${D_FILES_PN}
    install -m 755 ${S}/autobouquets_e2.sh ${D_FILES_PN}
    install -m 755 ${S}/autobouquetsreader ${D_FILES_PN}
    install -m 755 ${S}/autopicon_convert.sh ${D_FILES_PN}
    install -m 644 ${S}/changelog.txt ${D_FILES_PN}
    install -m 644 ${S}/COPYING ${D_FILES_PN}
    install -m 644 ${S}/custom_sort_1.txt ${D_FILES_PN}
    install -m 644 ${S}/custom_sort_2.txt ${D_FILES_PN}
    install -m 644 ${S}/custom_sort_3.txt ${D_FILES_PN}
    install -m 644 ${S}/custom_swap.txt ${D_FILES_PN}
    install -m 644 ${S}/helpfile.txt ${D_FILES_PN}
    install -m 644 ${S}/__init__.py ${D_FILES_PN}
    install -m 644 ${S}/LICENSE ${D_FILES_PN}
    install -m 644 ${S}/oea-logo.png ${D_FILES_PN}
    install -m 644 ${S}/plugin.py ${D_FILES_PN}
    install -m 644 ${S}/readme.txt ${D_FILES_PN}
    install -m 644 ${S}/supplement.txt ${D_FILES_PN}
}
