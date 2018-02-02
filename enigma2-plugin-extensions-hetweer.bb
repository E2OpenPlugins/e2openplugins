MODULE = "HetWeer"
DESCRIPTION = "HetWeer plugin"

require openplugins-replace-pli.inc

require openplugins-distutils.inc

require assume-gplv2.inc

PLUGINPATH = "/usr/lib/enigma2/python/Plugins/Extensions/${MODULE}"
do_install() {
        install -d ${D}${PLUGINPATH}/Images
        cp -r ${S}/plugin/* ${D}${PLUGINPATH}
        chmod a+rX ${D}${PLUGINPATH}
}


pkg_postrm_${PN}() {
    rm -rf /usr/lib/enigma2/python/Plugins/Extensions/HetWeer
}

FILES_${PN} = "${PLUGINPATH}"

SRCREV = "a7e56d869213887a1c645232698d5e6b4fcb55b4"
