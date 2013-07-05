We have a scriptable application which runs Groovy scripts
written and uploaded by clients.

Apparently the `GroovyClassLoader` used by default by the
`GroovyShell` keeps a cache of Class objects created when
compiling the source code, and this eventually exhaust the
PermGen, which is the area where Class objects are stored
by the JVM.

To launch the program:

    gradle run
	
And this should give the holy fault message

    Exception in thread "main" java.lang.OutOfMemoryError: PermGen space
	
	