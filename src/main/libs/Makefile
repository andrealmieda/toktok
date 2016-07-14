URL = https://build.tox.chat/job/tox4j_build_android_$1_release/lastSuccessfulBuild/artifact/artifacts/libtox4j.so

.PHONY: arm64-v8a/libtox4j.so armeabi-v7a/libtox4j.so x86/libtox4j.so
download: arm64-v8a/libtox4j.so armeabi-v7a/libtox4j.so x86/libtox4j.so

arm64-v8a/libtox4j.so:		; curl -s -o $@ $(call URL,arm64)
armeabi-v7a/libtox4j.so:	; curl -s -o $@ $(call URL,armel)
x86/libtox4j.so:		; curl -s -o $@ $(call URL,x86)
