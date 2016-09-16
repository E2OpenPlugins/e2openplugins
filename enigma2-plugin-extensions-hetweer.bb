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

FILES_${PN} = "${PLUGINPATH}"
