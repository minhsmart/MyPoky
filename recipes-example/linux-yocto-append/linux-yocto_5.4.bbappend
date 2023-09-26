FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append = " file://0001-first-init.patch \
                   file://0001-hello-char-dev-init.patch \
                   file://0001-hello-char-dev-ioctl-init.patch \
                   file://fragment.cfg"