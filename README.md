We have a scriptable application which runs Groovy scripts
written and uploaded by clients.

Apparently the `GroovyClassLoader` used by default by the
`GroovyShell` keeps a cache of Class objects created when
compiling the source code, and this eventually exhaust the
PermGen, which is the area where Class objects are stored
by the JVM.

Test if it's true, and if is, how we can recover from it
