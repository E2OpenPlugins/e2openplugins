MODULE = "Bitrate"
DESCRIPTION = "Bitrate viewer"

inherit gitpkgv
PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"
PR = "r1"


require openplugins.inc

inherit autotools
	
EXTRA_OECONF = "--with-boxtype=${MACHINE} \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR}"
