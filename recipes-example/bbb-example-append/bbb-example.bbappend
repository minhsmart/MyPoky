FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append = " file://0001-Changedthe-goodbye-message.patch"
do_configure:append() {
    echo "#define GOODBYE y" >> bbb-example.h
}




# * **Fetch** (do_fetch) :   Fetches the source code
# * **Unpack** (do_upack) : Unpacks the source code into a working directory
# * **Patch** (do_patch) : Locates patch files and applies them to the source code
# * **Configure** (do_configure) : Configures the source by enabling and disabling any build-time and configuration options for the software being built.
# * **Compile** (do_compile) : Compiles the source in the compilation directory
# * **Install** (do_install) : Copies files from the compilation directory to a holding area