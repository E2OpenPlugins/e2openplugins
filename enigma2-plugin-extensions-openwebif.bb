MODULE = "OpenWebif"
DESCRIPTION = "Control your receiver with a browser"
DEPENDS = "python-cheetah-native"
RDEPENDS_${PN} = "python-cheetah python-json python-unixadmin python-misc"

inherit gitpkgv
PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"
PR = "r0.71"

require openplugins.inc

# Just a quick hack to "compile" it
do_compile() {
	cheetah-compile -R --nobackup ${S}/plugin
	python -O -m compileall ${S}
}

PLUGINPATH = "/usr/lib/enigma2/python/Plugins/Extensions/${MODULE}"
do_install() {
	install -d ${D}${PLUGINPATH}
	cp -rp ${S}/plugin/* ${D}${PLUGINPATH}
}

FILES_${PN} = "${PLUGINPATH}"
