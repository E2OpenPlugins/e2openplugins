MODULE = "Bitrate"
DESCRIPTION = "Bitrate viewer"

require openplugins-replace-pli.inc

require openplugins.inc

inherit autotools
	
EXTRA_OECONF = "--with-boxtype=${MACHINE} \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR}"
