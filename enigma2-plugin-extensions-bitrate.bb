MODULE = "Bitrate"
DESCRIPTION = "Bitrate viewer"

require openplugins-replace-pli.inc
PR="r1"

require openplugins.inc

inherit autotools

EXTRA_OECONF = " \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR}"

FILES_${PN} = "${libdir} ${bindir}"

require assume-gplv2.inc

SRCREV = "edca14d4268674361f0c7cffc4bbb95f42151542"
